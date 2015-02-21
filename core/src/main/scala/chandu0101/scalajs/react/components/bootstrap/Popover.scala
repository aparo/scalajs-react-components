
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Popover /* mixins: BootstrapMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Popover")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = Map()
      classes += ("popover" -> true)
      classes[P.placement] = true
      classes += ("in" -> P.positionLeft != null || P.positionTop != null)
      var style = Map()
      style["left"] = P.positionLeft
      style["top"] = P.positionTop
      style["display"] = "block"
      var arrowStyle = Map()
      arrowStyle["left"] = P.arrowOffsetLeft
      arrowStyle["top"] = P.arrowOffsetTop
      return (React.createElement("div", React.__spread(Map(), P, {className: joinClasses(P.className, classSet(classes)), style: style, title: null}), React.createElement("div", {className: "arrow", style: arrowStyle}), P.title ? this.renderTitle() : null, React.createElement("div", {className: "popover-content"}, C)))
    }
*/
  }
    )
    .build
    /*
  def renderTitle(
    function() {
      return (React.createElement("h3", {className: "popover-title"}, P.title))
    }
  )
*/case class Props(arrowOffsetLeft:Int=0, arrowOffsetTop:Int=0, bsClass:String="",
  bsSize:String="", bsStyle:String="", placement:String="right",
  positionLeft:Int=0, positionTop:Int=0, title:ReactElement=null) extends BoostrapMixinProps
def apply(arrowOffsetLeft:Int=0, arrowOffsetTop:Int=0, bsClass:String="",
  bsSize:String="", bsStyle:String="", placement:String="right",
  positionLeft:Int=0, positionTop:Int=0, title:ReactElement=null,
  ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(arrowOffsetLeft = arrowOffsetLeft, arrowOffsetTop = arrowOffsetTop, bsClass = bsClass,
  bsSize = bsSize, bsStyle = bsStyle, placement = placement,
  positionLeft = positionLeft, positionTop = positionTop, title = title),children)
}

}
