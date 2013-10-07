package ch.unige.cui.smv.stratagem.sigmadd

class FixpointRewriter(val rewriter: SigmaDDRewriter) extends SigmaDDRewriter {

  def apply(sigmaDD: SigmaDDImplType): Option[SigmaDDImplType] = {
    var result = rewriter(sigmaDD)
    if (result == None) None // no fixpoint
    else {
      var newResult = rewriter(result.get)
      while ((result != newResult) && (newResult != None)) {
    	  result = newResult
    	  newResult = rewriter(result.get)
      }
      // if we arrive here either: result == newResult or newResult == None
      newResult
    }
  }
}