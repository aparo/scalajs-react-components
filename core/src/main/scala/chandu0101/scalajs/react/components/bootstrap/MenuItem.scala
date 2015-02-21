
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object MenuItem /* mixins: */{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("MenuItem")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = {"dropdown-header": P.header, "divider": P.divider}
      var children = null
      if (P.header) 
      {
        children = C
      } else if (!P.divider) 
      {
        children = this.renderAnchor()
      }
      return (React.createElement("li", React.__spread(Map(), P, {role: "presentation", title: null, href: null, className: joinClasses(P.className, classSet(classes))}), children))
    }
*/
  }
    )
    .build
    /*
  def renderAnchor(
    function() {
      return (React.createElement("a", {onClick: this.handleClick, href: P.href, target: P.target, title: P.title, tabIndex: "-1"}, C))
    }
  )
*/
/*
  def handleClick(
    function(e) {
      if (P.onSelect) 
      {
        e.preventDefault()
        P.onSelect(P.eventKey, P.href, P.target)
      }
    }
  )
*/case class Props(divider:Boolean=false, eventKey:Any=null, header:Boolean=false,
  href:String="#", onSelect:REventIAny=null, target:String="",
  title:String="") extends BoostrapMixinProps
def apply(divider:Boolean=false, eventKey:Any=null, header:Boolean=false,
  href:String="#", onSelect:REventIAny=null, target:String="",
  title:String="", ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(divider = divider, eventKey = eventKey, header = header,
  href = href, onSelect = onSelect, target = target,
  title = title),children)
}

}
