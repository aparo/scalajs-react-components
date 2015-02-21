
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Table /* mixins: */{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Table")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = {"table": true, "table-striped": P.striped, "table-bordered": P.bordered, "table-condensed": P.condensed, "table-hover": P.hover}
      var table = (React.createElement("table", React.__spread(Map(), P, ^.cls := ^.classSet1(P.className, classes.toList:_*)), C))
      return P.responsive ? (React.createElement("div", {className: "table-responsive"}, table)) : table
    }
*/
  }
    )
    .build
    case class Props(bordered:Boolean=false, condensed:Boolean=false, hover:Boolean=false,
  responsive:Boolean=false, striped:Boolean=false) extends BoostrapMixinProps
def apply(bordered:Boolean=false, condensed:Boolean=false, hover:Boolean=false,
  responsive:Boolean=false, striped:Boolean=false, ref: js.UndefOr[String] = "",
  key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(bordered = bordered, condensed = condensed, hover = hover,
  responsive = responsive, striped = striped),children)
}

}
