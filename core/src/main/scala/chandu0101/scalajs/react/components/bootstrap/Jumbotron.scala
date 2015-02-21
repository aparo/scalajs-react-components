
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Jumbotron {


  val component = ReactComponentB[Props]("Jumbotron")
    .render((P, C) => {
    <.div(P, ^.className := BootstrapCommon.joinClasses(P.className, "jumbotron"), C)
  }
    )
    .build
    case class Props(className: String = "", bsClass: String = "", bsSize: String = "",
                     bsStyle: String = "") extends BoostrapMixinProps
def apply(ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(),children)
}

}
