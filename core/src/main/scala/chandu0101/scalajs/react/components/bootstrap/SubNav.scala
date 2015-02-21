
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object SubNav /* mixins: BootstrapMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("SubNav")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = {"active": this.isActive(), "disabled": P.disabled}
      return (React.createElement("li", React.__spread(Map(), P, ^.cls := ^.classSet1(P.className, classes.toList:_*)), React.createElement("a", {href: P.href, title: P.title, target: P.target, onClick: this.handleClick, ref: "anchor"}, P.text), React.createElement("ul", {className: "nav"}, ValidComponentChildren.map(C, this.renderNavItem))))
    }
*/
  }
    )
    .build
    /*
  def getChildActiveProp(
    function(child) {
      if (child.props.active) 
      {
        return true
      }
      if (P.activeKey != null) 
      {
        if (child.props.eventKey == P.activeKey) 
        {
          return true
        }
      }
      if (P.activeHref != null) 
      {
        if (child.props.href === P.activeHref) 
        {
          return true
        }
      }
      return child.props.active
    }
  )
*/
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
*/
/*
  def isActive(
    function() {
      return this.isChildActive(this)
    }
  )
*/
/*
  def renderNavItem(
    function(child, index) {
      return cloneWithProps(child, {active: this.getChildActiveProp(child), onSelect: createChainedFunction(child.props.onSelect, P.onSelect), ref: child.ref, key: child.key ? child.key : index})
    }
  )
*/
/*
  def isChildActive(
    function(child) {
      if (child.props.active) 
      {
        return true
      }
      if (P.activeKey != null && P.activeKey === child.props.eventKey) 
      {
        return true
      }
      if (P.activeHref != null && P.activeHref === child.props.href) 
      {
        return true
      }
      if (child.props.children) 
      {
        var isActive = false
        ValidComponentChildren.forEach(child.props.children, function(child) {
  if (this.isChildActive(child)) 
  {
    isActive = true
  }
}, this)
        return isActive
      }
      return false
    }
  )
*/case class Props(active:Boolean=false, bsClass:String="nav", bsSize:String="",
  bsStyle:String="", disabled:Boolean=false, href:String="",
  onSelect:REventIAny=null, target:String="", text:ReactElement=null,
  title:String="") extends BoostrapMixinProps
def apply(active:Boolean=false, bsClass:String="nav", bsSize:String="",
  bsStyle:String="", disabled:Boolean=false, href:String="",
  onSelect:REventIAny=null, target:String="", text:ReactElement=null,
  title:String="", ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(active = active, bsClass = bsClass, bsSize = bsSize,
  bsStyle = bsStyle, disabled = disabled, href = href,
  onSelect = onSelect, target = target, text = text,
  title = title),children)
}

}
