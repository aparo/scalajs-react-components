
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Alert /* mixins: BootstrapMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Alert")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = P.getBsClassSet()
      var isDismissable = !!P.onDismiss
      classes += ("alert-dismissable" -> isDismissable)
      return (React.createElement("div", React.__spread(Map(), P, ^.cls := ^.classSet1(P.className, classes.toList:_*)), isDismissable ? this.renderDismissButton() : null, C))
    }
*/
  }
    )
    .build
    /*
  def componentDidMount(
    function() {
      if (P.dismissAfter && P.onDismiss) 
      {
        this.dismissTimer = setTimeout(P.onDismiss, P.dismissAfter)
      }
    }
  )
*/
/*
  def renderDismissButton(
    function() {
      return (React.createElement("button", {type: "button", className: "close", onClick: P.onDismiss, "aria-hidden": "true"}, "\xd7"))
    }
  )
*/
/*
  def componentWillUnmount(
    function() {
      clearTimeout(this.dismissTimer)
    }
  )
*/case class Props(bsClass:String="alert", bsSize:String="", bsStyle:String="info",
  dismissAfter:Int=0, onDismiss:REventIAny=null) extends BoostrapMixinProps
def apply(bsClass:String="alert", bsSize:String="", bsStyle:String="info",
  dismissAfter:Int=0, onDismiss:REventIAny=null, ref: js.UndefOr[String] = "",
  key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(bsClass = bsClass, bsSize = bsSize, bsStyle = bsStyle,
  dismissAfter = dismissAfter, onDismiss = onDismiss),children)
}

}
