
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Pager /* mixins: */{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Pager")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      return (React.createElement("ul", React.__spread(Map(), P, {className: joinClasses(P.className, "pager")}), ValidComponentChildren.map(C, this.renderPageItem)))
    }
*/
  }
    )
    .build
    /*
  def renderPageItem(
    function(child, index) {
      return cloneWithProps(child, {onSelect: createChainedFunction(child.props.onSelect, P.onSelect), ref: child.ref, key: child.key ? child.key : index})
    }
  )
*/case class Props(onSelect:REventIAny=null) extends BoostrapMixinProps
def apply(onSelect:REventIAny=null, ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(onSelect = onSelect),children)
}

}
