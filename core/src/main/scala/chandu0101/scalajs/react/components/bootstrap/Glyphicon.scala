
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Glyphicon /* mixins: BootstrapMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Glyphicon")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = P.getBsClassSet()
      classes["glyphicon-" + P.glyph] = true
      return (React.createElement("span", React.__spread(Map(), P, ^.cls := ^.classSet1(P.className, classes.toList:_*)), C))
    }
*/
  }
    )
    .build
    case class Props(glyph:Double, bsClass:String="glyphicon", bsSize:String="",
  bsStyle:String="") extends BoostrapMixinProps
def apply(glyph:Double, bsClass:String="glyphicon", bsSize:String="",
  bsStyle:String="", ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(glyph = glyph, bsClass = bsClass, bsSize = bsSize,
  bsStyle = bsStyle),children)
}

}
