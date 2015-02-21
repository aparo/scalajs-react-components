
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object DropdownButton /* mixins: BootstrapMixin with DropdownStateMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("DropdownButton")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var renderMethod = P.navItem ? "renderNavItem" : "renderButtonGroup"
      var caret = P.noCaret ? null : (React.createElement("span", {className: "caret"}))
      return this[renderMethod]([React.createElement(Button, React.__spread(Map(), P, {ref: "dropdownButton", className: "dropdown-toggle", onClick: this.handleDropdownClick, key: 0, navDropdown: P.navItem, navItem: null, title: null, pullRight: null, dropup: null}), P.title, " ", caret), React.createElement(DropdownMenu, {ref: "menu", "aria-labelledby": P.id, pullRight: P.pullRight, key: 1}, ValidComponentChildren.map(C, this.renderMenuItem))])
    }
*/
  }
    )
    .build
    /*
  def handleOptionSelect(
    function(key) {
      if (P.onSelect) 
      {
        P.onSelect(key)
      }
      this.setDropdownState(false)
    }
  )
*/
/*
  def renderMenuItem(
    function(child, index) {
      var handleOptionSelect = P.onSelect || child.props.onSelect ? this.handleOptionSelect : null
      return cloneWithProps(child, {onSelect: createChainedFunction(child.props.onSelect, handleOptionSelect), key: child.key ? child.key : index, ref: child.ref})
    }
  )
*/
/*
  def renderButtonGroup(
    function(children) {
      var groupClasses = {"open": this.state.open, "dropup": P.dropup}
      return (React.createElement(ButtonGroup, {bsSize: P.bsSize, className: joinClasses(P.className, classSet(groupClasses))}, children))
    }
  )
*/
/*
  def renderNavItem(
    function(children) {
      var classes = {"dropdown": true, "open": this.state.open, "dropup": P.dropup}
      return (React.createElement("li", ^.cls := ^.classSet1(P.className, classes.toList:_*), children))
    }
  )
*/
/*
  def handleDropdownClick(
    function(e) {
      e.preventDefault()
      this.setDropdownState(!this.state.open)
    }
  )
*/case class Props(bsClass:String="", bsSize:String="", bsStyle:String="",
  dropup:Boolean=false, href:String="", navItem:Boolean=false,
  noCaret:Boolean=false, onClick:REventIAny=null, onSelect:REventIAny=null,
  pullRight:Boolean=false, title:ReactElement=null) extends BoostrapMixinProps
def apply(bsClass:String="", bsSize:String="", bsStyle:String="",
  dropup:Boolean=false, href:String="", navItem:Boolean=false,
  noCaret:Boolean=false, onClick:REventIAny=null, onSelect:REventIAny=null,
  pullRight:Boolean=false, title:ReactElement=null, ref: js.UndefOr[String] = "",
  key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(bsClass = bsClass, bsSize = bsSize, bsStyle = bsStyle,
  dropup = dropup, href = href, navItem = navItem,
  noCaret = noCaret, onClick = onClick, onSelect = onSelect,
  pullRight = pullRight, title = title),children)
}

}
