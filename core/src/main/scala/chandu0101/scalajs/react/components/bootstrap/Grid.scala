
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Grid /* mixins: */{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Grid")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var ComponentClass = P.componentClass
      var className = P.fluid ? "container-fluid" : "container"
      return (React.createElement(ComponentClass, React.__spread(Map(), P, {className: joinClasses(P.className, className)}), C))
    }
*/
  }
    )
    .build
    case class Props(componentClass:ReactElement="div", fluid:Boolean=false) extends BoostrapMixinProps
def apply(componentClass:ReactElement="div", fluid:Boolean=false, ref: js.UndefOr[String] = "",
  key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(componentClass = componentClass, fluid = fluid),children)
}

}
