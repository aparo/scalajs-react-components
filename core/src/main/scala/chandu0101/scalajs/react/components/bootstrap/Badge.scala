
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Badge /* mixins: */{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Badge")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = {"pull-right": P.pullRight, "badge": this.hasContent()}
      return (React.createElement("span", React.__spread(Map(), P, ^.cls := ^.classSet1(P.className, classes.toList:_*)), C))
    }
*/
  }
    )
    .build
    /*
  def hasContent(
    function() {
      return ValidComponentChildren.hasValidComponent(C) || (typeof C === "string") || (typeof C === "number")
    }
  )
*/case class Props(pullRight:Boolean=false) extends BoostrapMixinProps
def apply(pullRight:Boolean=false, ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(pullRight = pullRight),children)
}

}
