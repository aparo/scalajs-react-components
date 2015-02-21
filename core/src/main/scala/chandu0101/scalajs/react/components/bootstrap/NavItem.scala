
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object NavItem /* mixins: BootstrapMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("NavItem")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var $__0 = P, disabled = $__0.disabled, active = $__0.active, href = $__0.href, title = $__0.title, target = $__0.target, children = $__0.children, props = (function(source, exclusion) {
  var rest = Map()
  var hasOwn = Object.prototype.hasOwnProperty
  if (source == null) 
  {
    throw new TypeError()
  }
  for (var key in source) 
    {
      if (hasOwn.call(source, key) && !hasOwn.call(exclusion, key)) 
      {
        rest[key] = source[key]
      }
    }
  return rest
})($__0, {disabled: 1, active: 1, href: 1, title: 1, target: 1, children: 1}), classes = {"active": active, "disabled": disabled}
      return (React.createElement("li", React.__spread(Map(), props, {className: joinClasses(props.className, classSet(classes))}), React.createElement("a", {href: href, title: title, target: target, onClick: this.handleClick, ref: "anchor"}, children)))
    }
*/
  }
    )
    .build
    /*
  def handleClick(
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
*/case class Props(active:Boolean=false, bsClass:String="", bsSize:String="",
  bsStyle:String="", disabled:Boolean=false, eventKey:Any=null,
  href:String="#", onSelect:REventIAny=null, target:String="",
  title:String="") extends BoostrapMixinProps
def apply(active:Boolean=false, bsClass:String="", bsSize:String="",
  bsStyle:String="", disabled:Boolean=false, eventKey:Any=null,
  href:String="#", onSelect:REventIAny=null, target:String="",
  title:String="", ref: js.UndefOr[String] = "", key: js.Any = {})= {
   component.set(key, ref)(Props(active = active, bsClass = bsClass, bsSize = bsSize,
  bsStyle = bsStyle, disabled = disabled, eventKey = eventKey,
  href = href, onSelect = onSelect, target = target,
  title = title))
}

}
