
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object PageItem /* mixins: */{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("PageItem")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = {"disabled": P.disabled, "previous": P.previous, "next": P.next}
      return (React.createElement("li", React.__spread(Map(), P, ^.cls := ^.classSet1(P.className, classes.toList:_*)), React.createElement("a", {href: P.href, title: P.title, target: P.target, onClick: this.handleSelect, ref: "anchor"}, C)))
    }
*/
  }
    )
    .build
    /*
  def handleSelect(
    function(e) {
      if (P.onSelect) 
      {
        e.preventDefault()
        if (!P.disabled) 
        {
          P.onSelect(P.eventKey, P.href, P.target)
        }
      }
    }
  )
*/case class Props(disabled:Boolean=false, eventKey:Any=null, href:String="#",
  next:Boolean=false, onSelect:REventIAny=null, previous:Boolean=false,
  target:String="") extends BoostrapMixinProps
def apply(disabled:Boolean=false, eventKey:Any=null, href:String="#",
  next:Boolean=false, onSelect:REventIAny=null, previous:Boolean=false,
  target:String="", ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(disabled = disabled, eventKey = eventKey, href = href,
  next = next, onSelect = onSelect, previous = previous,
  target = target),children)
}

}
