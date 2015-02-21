
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Affix /* mixins: AffixMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Affix")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var holderStyle = {top: this.state.affixPositionTop}
      return (React.createElement("div", React.__spread(Map(), P, {className: joinClasses(P.className, this.state.affixClass), style: holderStyle}), C))
    }
*/
  }
    )
    .build
    /*
  def statics(
    {domUtils: domUtils}
  )
*/case class Props() extends BoostrapMixinProps
def apply(ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(),children)
}

}
