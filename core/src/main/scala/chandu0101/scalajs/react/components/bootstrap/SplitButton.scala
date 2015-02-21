
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object SplitButton /* mixins: BootstrapMixin with DropdownStateMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("SplitButton")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var groupClasses = {"open": this.state.open, "dropup": P.dropup}
      var button = (React.createElement(Button, React.__spread(Map(), P, {ref: "button", onClick: this.handleButtonClick, title: null, id: null}), P.title))
      var dropdownButton = (React.createElement(Button, React.__spread(Map(), P, {ref: "dropdownButton", className: joinClasses(P.className, "dropdown-toggle"), onClick: this.handleDropdownClick, title: null, href: null, target: null, id: null}), React.createElement("span", {className: "sr-only"}, P.dropdownTitle), React.createElement("span", {className: "caret"})))
      return (React.createElement(ButtonGroup, {bsSize: P.bsSize, className: classSet(groupClasses), id: P.id}, button, dropdownButton, React.createElement(DropdownMenu, {ref: "menu", onSelect: this.handleOptionSelect, "aria-labelledby": P.id, pullRight: P.pullRight}, C)))
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
  def handleButtonClick(
    function(e) {
      if (this.state.open) 
      {
        this.setDropdownState(false)
      }
      if (P.onClick) 
      {
        P.onClick(e, P.href, P.target)
      }
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
  disabled:Boolean=false, dropdownTitle:ReactElement="Toggle dropdown", href:String="",
  onClick:REventIAny=null, onSelect:REventIAny=null, pullRight:Boolean=false,
  target:String="", title:ReactElement=null) extends BoostrapMixinProps
def apply(bsClass:String="", bsSize:String="", bsStyle:String="",
  disabled:Boolean=false, dropdownTitle:ReactElement="Toggle dropdown", href:String="",
  onClick:REventIAny=null, onSelect:REventIAny=null, pullRight:Boolean=false,
  target:String="", title:ReactElement=null, ref: js.UndefOr[String] = "",
  key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(bsClass = bsClass, bsSize = bsSize, bsStyle = bsStyle,
  disabled = disabled, dropdownTitle = dropdownTitle, href = href,
  onClick = onClick, onSelect = onSelect, pullRight = pullRight,
  target = target, title = title),children)
}

}
