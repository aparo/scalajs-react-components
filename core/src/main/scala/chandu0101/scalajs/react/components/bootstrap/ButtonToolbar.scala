
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object ButtonToolbar /* mixins: BootstrapMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("ButtonToolbar")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = P.getBsClassSet()
      return (React.createElement("div", React.__spread(Map(), P, {role: "toolbar", className: joinClasses(P.className, classSet(classes))}), C))
    }
*/
  }
    )
    .build
    case class Props(bsClass:String="button-toolbar", bsSize:String="", bsStyle:String="") extends BoostrapMixinProps
def apply(bsClass:String="button-toolbar", bsSize:String="", bsStyle:String="",
  ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(bsClass = bsClass, bsSize = bsSize, bsStyle = bsStyle),children)
}

}
