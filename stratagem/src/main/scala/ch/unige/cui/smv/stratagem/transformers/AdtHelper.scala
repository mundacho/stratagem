/*
Stratagem is a model checker for transition systems described using rewriting
rules and strategies.
Copyright (C) 2013 - SMV@Geneva University.
Program written by Edmundo Lopez Bobeda <edmundo [at] lopezbobeda.net>.
This program is free software; you can redistribute it and/or modify
it under the  terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package ch.unige.cui.smv.stratagem.transformers

import ch.unige.cui.smv.metamodel.ts.TransitionSystem
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.util.StrategyMapKeyWrapper
import ch.unige.cui.smv.stratagem.petrinets.Place
import ch.unige.cui.smv.stratagem.util.StrategyDSL._
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT
import ch.unige.cui.smv.metamodel.ts.Strategy
import ch.unige.cui.smv.stratagem.transformers.SetOfModules2TransitionSystem.CLUSTER_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.SetOfModules2TransitionSystem.ENDCLUSTER
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT
import ch.unige.cui.smv.stratagem.petrinets.PetriNetADT.PLACE_SORT_NAME
import ch.unige.smv.cui.metamodel.adt.Operation
import ch.unige.smv.cui.metamodel.adt.AdtFactory
import ch.unige.smv.cui.metamodel.adt.Signature
import ch.unige.cui.smv.stratagem.adt.PredefADT.NAT_SORT_NAME
import ch.unige.smv.cui.metamodel.adt.ADT
import ch.unige.cui.smv.metamodel.ts.TsFactory
import ch.unige.smv.cui.metamodel.adt.ATerm
import ch.unige.cui.smv.stratagem.adt.PredefADT
import ch.unige.cui.smv.metamodel.ts.VariableStrategy
import ch.unige.cui.smv.metamodel.ts.NonVariableStrategy
import scala.collection.JavaConversions._
import ch.unige.cui.smv.stratagem.transformers.ListOfModules2TransitionSystem.SUPER_CLUSTER_SORT_NAME
import ch.unige.cui.smv.stratagem.transformers.ListOfModules2TransitionSystem.END_SUPERCLUSTER
import ch.unige.cui.smv.stratagem.transformers.ListOfModules2TransitionSystem.ClusterType
import ch.unige.cui.smv.stratagem.transformers.ListOfModules2TransitionSystem.SuperClusterType

/**
 * @author mundacho
 *
 */
object AdtHelper {

  /**
   * The signature we use for clustered petri nets.
   */
  def basicSignature = PetriNetADT.basicPetriNetSignature
    .withSort(CLUSTER_SORT_NAME)
    .withSort(SUPER_CLUSTER_SORT_NAME, CLUSTER_SORT_NAME)
    .withGenerator(ENDCLUSTER, CLUSTER_SORT_NAME)
    .withGenerator(END_SUPERCLUSTER, SUPER_CLUSTER_SORT_NAME)

  /**
   * Adds a generator to the signature. Has side effects.
   */
  def addGeneratorWithName(name: String, returnType: String, paramsSorts: String*)(implicit s: Signature) {
    val gen = AdtFactory.eINSTANCE.createOperation();
    gen.setName(name)
    gen.setReturnType(s.getSortByName(returnType))
    for (paramSort <- paramsSorts) gen.getFormalParameters().add(s.getSortByName(paramSort))
    s.getGenerators().add(gen)
  }

  def addVariable(name: String, returnType: String)(implicit adt: ADT) {
    val vd = AdtFactory.eINSTANCE.createVariableDeclaration()
    vd.setName(name)
    assert(adt.getSignature().getSortByName(returnType) != null)
    vd.setSort(adt.getSignature().getSortByName(returnType))
    adt.getVariables().add(vd)
  }

  def createAdt(modules: List[SuperClusterType], net: PetriNet) = {
    val placeToSClusterClusterPosition = Map((
      for {
        scWithIndex <- modules.zipWithIndex // for each scluster
        (_, sClusterIndex) = scWithIndex
        cWithIndex <- scWithIndex._1.zipWithIndex // each cluster
        (_, clusterIndex) = cWithIndex
        pWithIndex <- cWithIndex._1.zipWithIndex // and each place
        (place, placeIndex) = pWithIndex
      } yield (place -> (sClusterIndex, clusterIndex, placeIndex)) // we create a tuple
      ).toArray: _*)
    implicit val signature = basicSignature
    // we add the the generators for sclusters
    val maxSClusters = if (modules.size > 1) (modules.size - 1) else 2
    for (sClusterIndex <- 0 to maxSClusters) {
      addGeneratorWithName(s"sc$sClusterIndex", SUPER_CLUSTER_SORT_NAME, CLUSTER_SORT_NAME, SUPER_CLUSTER_SORT_NAME)
    }
    // we add the the generators for clusters
    val maxClusters = (modules.map(_.size).max - 1)
    for (clusterIndex <- 0 to maxClusters) {
      addGeneratorWithName(s"c$clusterIndex", CLUSTER_SORT_NAME, PLACE_SORT_NAME, CLUSTER_SORT_NAME)
    }
    // add generators for clusters
    val maxPlaces = ((for (cluster <- modules; places <- cluster) yield places.size).max - 1)
    for (placeIndex <- 0 to maxPlaces) {
      addGeneratorWithName(s"p$placeIndex", PLACE_SORT_NAME, NAT_SORT_NAME, PLACE_SORT_NAME)
    }
    // now the adt
    implicit val adt = { val a = AdtFactory.eINSTANCE.createADT(); a.setName(net.name.replaceAll("[^a-zA-Z_0-9]", "_")); a.setSignature(signature); a }
    addVariable("p", PLACE_SORT_NAME)
    addVariable("x", NAT_SORT_NAME)
    addVariable("c", CLUSTER_SORT_NAME)
    addVariable("sc", SUPER_CLUSTER_SORT_NAME)
    (adt, (placeToSClusterClusterPosition, maxSClusters, maxClusters, maxPlaces))
  }

  def createInitialState(modules: List[SuperClusterType], recursiveList: Set[Int])(endTerm: ATerm)(implicit adt: ADT) =
    ((for (clustersWithIndex <- modules.zipWithIndex) yield (t: ATerm) => term(s"sc${clustersWithIndex._2}",
      if (recursiveList.contains(clustersWithIndex._2)) {
        createRecursiveInitialState(clustersWithIndex._1)(term(END_SUPERCLUSTER))
      } else
        createInitialStateClusters(clustersWithIndex._1)(term(ENDCLUSTER)), t)).reduceLeft(_ compose _))(endTerm)

  def createInitialStatePlaces(places: ClusterType)(endTerm: ATerm)(implicit adt: ADT) =
    ((for (placesWithIndex <- places.zipWithIndex) yield (t: ATerm) => term(s"p${placesWithIndex._2}", PredefADT.define(placesWithIndex._1.initialMarking, term(PredefADT.ZERO), adt), t)).reduceLeft(_ compose _))(endTerm)

  def createInitialStateClusters(clusters: List[ClusterType])(endTerm: ATerm)(implicit adt: ADT) =
    ((for (clustersWithIndex <- clusters.zipWithIndex) yield (t: ATerm) => term(s"c${clustersWithIndex._2}", createInitialStatePlaces(clustersWithIndex._1)(term(PetriNetADT.ENDPLACE)), t)).reduceLeft(_ compose _))(endTerm)

  // n > 0
  private def closestPowerOfTwo(n: Int): Int = {
    assert(n > 0)
    if (n == 1) 1 else if (n == 2) 2 else {
      2 * closestPowerOfTwo(n / 2)
    }
  }

  def term(op: String, subterms: ATerm*)(implicit adt: ADT) = {
    val t = AdtFactory.eINSTANCE.createTerm();
    t.setAdt(adt);
    val termOp = adt.getSignature().getOperationByName(op)
    if (termOp == null) { // might be a variable
      val vd = adt.getVariables().find(_.getName() == op).get
      val v = AdtFactory.eINSTANCE.createVariable()
      v.setDeclaration(vd)
      v.setAdt(adt)
      v
    } else {
      t.setOperationSymbol(termOp);
      for (subterm <- subterms) t.getSubterms().add(subterm);
      t
    }
  }

  def createRecursiveInitialState(clusters: List[ClusterType])(endTerm: ATerm)(implicit adt: ADT): ATerm = {
    require(clusters.size >= 1)
    if (clusters.size == 1) {
      createInitialStateClusters(clusters)(term(ENDCLUSTER))
    } else {
      val splitNumber = if (closestPowerOfTwo(clusters.size) == clusters.size) clusters.size / 2 else closestPowerOfTwo(clusters.size)
      val (list1, list2) = clusters splitAt splitNumber
      term("sc0", createRecursiveInitialState(list1)(term(END_SUPERCLUSTER)), term("sc1", createRecursiveInitialState(list2)(term(END_SUPERCLUSTER)), endTerm))
    }
  }
}