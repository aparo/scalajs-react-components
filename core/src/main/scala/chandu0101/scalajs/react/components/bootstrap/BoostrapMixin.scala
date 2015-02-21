package chandu0101.scalajs.react.components.bootstrap

/**
 * Created by alberto on 18/02/15.
 */
trait BoostrapMixinProps {

  def bsClass: String
  def bsStyle: String
  def bsSize: String

  def getBsClassSet: Map[String, Boolean] ={
    var classes= Map.empty[String, Boolean]
    if(bsClass.nonEmpty ){
      classes += (bsClass -> true)
      val prefix= bsClass+"-"
      if(bsSize.nonEmpty){
        classes += (prefix+bsSize -> true)
      }
      if(bsStyle){
        classes += (prefix+bsStyle -> true)
      }
    }
    classes
  }

}
