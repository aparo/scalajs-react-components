
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Tooltip /* mixins: BootstrapMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Tooltip")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = Map()
      classes += ("tooltip" -> true)
      classes[P.placement] = true
      classes += ("in" -> P.positionLeft != null || P.positionTop != null)
      var style = Map()
      style["left"] = P.positionLeft
      style["top"] = P.positionTop
      var arrowStyle = Map()
      arrowStyle["left"] = P.arrowOffsetLeft
      arrowStyle["top"] = P.arrowOffsetTop
      return (React.createElement("div", React.__spread(Map(), P, {className: joinClasses(P.className, classSet(classes)), style: style}), React.createElement("div", {className: "tooltip-arrow", style: arrowStyle}), React.createElement("div", {className: "tooltip-inner"}, C)))
    }
*/
  }
    )
    .build
    case class Props(arrowOffsetLeft:Int=0, arrowOffsetTop:Int=0, bsClass:String="",
  bsSize:String="", bsStyle:String="", placement:String="right",
  positionLeft:Int=0, positionTop:Int=0) extends BoostrapMixinProps
def apply(arrowOffsetLeft:Int=0, arrowOffsetTop:Int=0, bsClass:String="",
  bsSize:String="", bsStyle:String="", placement:String="right",
  positionLeft:Int=0, positionTop:Int=0, ref: js.UndefOr[String] = "",
  key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(arrowOffsetLeft = arrowOffsetLeft, arrowOffsetTop = arrowOffsetTop, bsClass = bsClass,
  bsSize = bsSize, bsStyle = bsStyle, placement = placement,
  positionLeft = positionLeft, positionTop = positionTop),children)
}

}
