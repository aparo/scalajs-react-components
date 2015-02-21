
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Navbar /* mixins: BootstrapMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Navbar")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = P.getBsClassSet()
      var ComponentClass = P.componentClass
      classes += ("navbar-fixed-top" -> P.fixedTop)
      classes += ("navbar-fixed-bottom" -> P.fixedBottom)
      classes += ("navbar-static-top" -> P.staticTop)
      classes += ("navbar-inverse" -> P.inverse)
      return (React.createElement(ComponentClass, React.__spread(Map(), P, ^.cls := ^.classSet1(P.className, classes.toList:_*)), React.createElement("div", {className: P.fluid ? "container-fluid" : "container"}, (P.brand || P.toggleButton || P.toggleNavKey) ? this.renderHeader() : null, ValidComponentChildren.map(C, this.renderChild))))
    }
*/
  }
    )
    .build
    /*
  def handleToggle(
    function() {
      if (P.onToggle) 
      {
        this._isChanging = true
        P.onToggle()
        this._isChanging = false
      }
      this.setState({navExpanded: !this.state.navExpanded})
    }
  )
*/
/*
  def renderToggleButton(
    function() {
      var children
      if (React.isValidElement(P.toggleButton)) 
      {
        return cloneWithProps(P.toggleButton, {className: "navbar-toggle", onClick: createChainedFunction(this.handleToggle, P.toggleButton.props.onClick)})
      }
      children = (P.toggleButton != null) ? P.toggleButton : [React.createElement("span", {className: "sr-only", key: 0}, "Toggle navigation"), React.createElement("span", {className: "icon-bar", key: 1}), React.createElement("span", {className: "icon-bar", key: 2}), React.createElement("span", {className: "icon-bar", key: 3})]
      return (React.createElement("button", {className: "navbar-toggle", type: "button", onClick: this.handleToggle}, children))
    }
  )
*/
/*
  def renderChild(
    function(child, index) {
      return cloneWithProps(child, {navbar: true, collapsable: P.toggleNavKey != null && P.toggleNavKey === child.props.eventKey, expanded: P.toggleNavKey != null && P.toggleNavKey === child.props.eventKey && this.isNavExpanded(), key: child.key ? child.key : index, ref: child.ref})
    }
  )
*/
/*
  def shouldComponentUpdate(
    function() {
      return !this._isChanging
    }
  )
*/
/*
  def renderHeader(
    function() {
      var brand
      if (P.brand) 
      {
        brand = React.isValidElement(P.brand) ? cloneWithProps(P.brand, {className: "navbar-brand"}) : React.createElement("span", {className: "navbar-brand"}, P.brand)
      }
      return (React.createElement("div", {className: "navbar-header"}, brand, (P.toggleButton || P.toggleNavKey != null) ? this.renderToggleButton() : null))
    }
  )
*/
/*
  def getInitialState(
    function() {
      return {navExpanded: P.defaultNavExpanded}
    }
  )
*/
/*
  def isNavExpanded(
    function() {
      return P.navExpanded != null ? P.navExpanded : this.state.navExpanded
    }
  )
*/case class Props(brand:ReactElement=null, bsClass:String="navbar", bsSize:String="",
  bsStyle:String="default", componentClass:ReactElement="Nav", defaultNavExpanded:Boolean=false,
  fixedBottom:Boolean=false, fixedTop:Boolean=false, fluid:Boolean=false,
  inverse:Boolean=false, navExpanded:Boolean=false, onToggle:REventIAny=null,
  role:String="navigation", staticTop:Boolean=false, toggleButton:ReactElement=null) extends BoostrapMixinProps
def apply(brand:ReactElement=null, bsClass:String="navbar", bsSize:String="",
  bsStyle:String="default", componentClass:ReactElement="Nav", defaultNavExpanded:Boolean=false,
  fixedBottom:Boolean=false, fixedTop:Boolean=false, fluid:Boolean=false,
  inverse:Boolean=false, navExpanded:Boolean=false, onToggle:REventIAny=null,
  role:String="navigation", staticTop:Boolean=false, toggleButton:ReactElement=null,
  ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(brand = brand, bsClass = bsClass, bsSize = bsSize,
  bsStyle = bsStyle, componentClass = componentClass, defaultNavExpanded = defaultNavExpanded,
  fixedBottom = fixedBottom, fixedTop = fixedTop, fluid = fluid,
  inverse = inverse, navExpanded = navExpanded, onToggle = onToggle,
  role = role, staticTop = staticTop, toggleButton = toggleButton),children)
}

}
