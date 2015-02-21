
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object ButtonGroup /* mixins: BootstrapMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("ButtonGroup")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = P.getBsClassSet()
      classes += ("btn-group" -> !P.vertical)
      classes += ("btn-group-vertical" -> P.vertical)
      classes += ("btn-group-justified" -> P.justified)
      return (React.createElement("div", React.__spread(Map(), P, ^.cls := ^.classSet1(P.className, classes.toList:_*)), C))
    }
*/
  }
    )
    .build
    case class Props(bsClass:String="button-group", bsSize:String="", bsStyle:String="",
  justified:Boolean=false, vertical:Boolean=false) extends BoostrapMixinProps
def apply(bsClass:String="button-group", bsSize:String="", bsStyle:String="",
  justified:Boolean=false, vertical:Boolean=false, ref: js.UndefOr[String] = "",
  key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(bsClass = bsClass, bsSize = bsSize, bsStyle = bsStyle,
  justified = justified, vertical = vertical),children)
}

}
