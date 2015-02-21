
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object DropdownMenu /* mixins: */{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("DropdownMenu")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = {"dropdown-menu": true, "dropdown-menu-right": P.pullRight}
      return (React.createElement("ul", React.__spread(Map(), P, {className: joinClasses(P.className, classSet(classes)), role: "menu"}), ValidComponentChildren.map(C, this.renderMenuItem)))
    }
*/
  }
    )
    .build
    /*
  def renderMenuItem(
    function(child, index) {
      return cloneWithProps(child, {onSelect: createChainedFunction(child.props.onSelect, P.onSelect), key: child.key ? child.key : index, ref: child.ref})
    }
  )
*/case class Props(onSelect:REventIAny=null, pullRight:Boolean=false) extends BoostrapMixinProps
def apply(onSelect:REventIAny=null, pullRight:Boolean=false, ref: js.UndefOr[String] = "",
  key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(onSelect = onSelect, pullRight = pullRight),children)
}

}
