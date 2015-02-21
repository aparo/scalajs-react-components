
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object ListGroup /* mixins: */{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("ListGroup")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      return (React.createElement("div", {className: "list-group"}, ValidComponentChildren.map(C, this.renderListItem)))
    }
*/
  }
    )
    .build
    /*
  def renderListItem(
    function(child, index) {
      return cloneWithProps(child, {onClick: createChainedFunction(child.props.onClick, P.onClick), ref: child.ref, key: child.key ? child.key : index})
    }
  )
*/case class Props(onClick:REventIAny=null) extends BoostrapMixinProps
def apply(onClick:REventIAny=null, ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(onClick = onClick),children)
}

}
