
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object PageHeader /* mixins: */{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("PageHeader")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      return (React.createElement("div", React.__spread(Map(), P, {className: joinClasses(P.className, "page-header")}), React.createElement("h1", null, C)))
    }
*/
  }
    )
    .build
    case class Props() extends BoostrapMixinProps
def apply(ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(),children)
}

}
