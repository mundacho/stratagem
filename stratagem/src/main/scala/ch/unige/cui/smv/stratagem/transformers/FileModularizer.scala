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

import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import com.typesafe.scalalogging.slf4j.Logging
import java.io.File
import scala.io.Source
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.PTModule
import ch.unige.cui.smv.stratagem.petrinets.PetriNet
import ch.unige.cui.smv.stratagem.petrinets.Place

/**
 * Modularizes a Petri net based on a file.
 * @author mundacho
 *
 */
class FileModularizer(file: File) extends Logging with ((PetriNet) => List[PTModule]) {

  def apply(net: PetriNet) = {
    var clusteredPlaces: Set[Place] = Set.empty
    if (!file.exists()) {
      logger.error(s"The file ${file.getName()} does not exist")
      System.exit(-1)
    }
    val res = (for (line <- Source.fromFile(file).getLines) yield {
      val placeIDs = line.toString.split(",\\s+").toList
      val placeNameToPlace = Map(net.places.map(p => (p.id -> p)).toArray: _*)
      val placesForModule = (for (id <- placeIDs) yield {
        if (!placeNameToPlace.isDefinedAt(id)) {
          logger.error(s"Place $id is not a valid place in the model, please fix the clustering file")
          System.exit(-1)
        }
        if (clusteredPlaces.contains(placeNameToPlace(id))) {
          logger.error(s"Place $id has been added to two clusters, please fix the clustering file")
          System.exit(-1)
        }
        placeNameToPlace(id)
      }).toSet
      clusteredPlaces ++= placesForModule
      PTModule(new PetriNet("", placesForModule, Set.empty), Set.empty, Set.empty, placesForModule)
    }).toList
    // we validate the result
    val result = if (clusteredPlaces != net.places) {
      logger.warn("Some places where not clustered in the clustering file, they are being put in a default cluster")
      val placesForExtraCluster = net.places -- clusteredPlaces
      PTModule(new PetriNet("", placesForExtraCluster, Set.empty), Set.empty, Set.empty, placesForExtraCluster) :: res
    } else res
    result
  }

}