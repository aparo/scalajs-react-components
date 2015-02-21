
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Input /* mixins: */{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Input")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      if (this.isCheckboxOrRadio()) 
      {
        return this.renderFormGroup(this.renderWrapper([this.renderCheckboxandRadioWrapper(this.renderLabel(this.renderInput())), this.renderHelp()]))
      } else {
        return this.renderFormGroup([this.renderLabel(), this.renderWrapper([this.renderInputGroup(this.renderInput()), this.renderIcon(), this.renderHelp()])])
      }
    }
*/
  }
    )
    .build
    /*
  def renderCheckboxandRadioWrapper(
    function(children) {
      var classes = {"checkbox": P.type === "checkbox", "radio": P.type === "radio"}
      return (React.createElement("div", {className: classSet(classes), key: "checkboxRadioWrapper"}, children))
    }
  )
*/
/*
  def renderLabel(
    function(children) {
      var classes = {"control-label": !this.isCheckboxOrRadio()}
      classes[P.labelClassName] = P.labelClassName
      return P.label ? (React.createElement("label", {htmlFor: P.id, className: classSet(classes), key: "label"}, children, P.label)) : children
    }
  )
*/
/*
  def renderWrapper(
    function(children) {
      return P.wrapperClassName ? (React.createElement("div", {className: P.wrapperClassName, key: "wrapper"}, children)) : children
    }
  )
*/
/*
  def renderIcon(
    function() {
      var classes = {"glyphicon": true, "form-control-feedback": true, "glyphicon-ok": P.bsStyle === "success", "glyphicon-warning-sign": P.bsStyle === "warning", "glyphicon-remove": P.bsStyle === "error"}
      return P.hasFeedback ? (React.createElement("span", {className: classSet(classes), key: "icon"})) : null
    }
  )
*/
/*
  def renderFormGroup(
    function(children) {
      var classes = {"form-group": true, "has-feedback": P.hasFeedback, "has-success": P.bsStyle === "success", "has-warning": P.bsStyle === "warning", "has-error": P.bsStyle === "error"}
      classes[P.groupClassName] = P.groupClassName
      return (React.createElement("div", {className: classSet(classes)}, children))
    }
  )
*/
/*
  def renderHelp(
    function() {
      return P.help ? (React.createElement("span", {className: "help-block", key: "help"}, P.help)) : null
    }
  )
*/
/*
  def renderInputGroup(
    function(children) {
      var addonBefore = P.addonBefore ? (React.createElement("span", {className: "input-group-addon", key: "addonBefore"}, P.addonBefore)) : null
      var addonAfter = P.addonAfter ? (React.createElement("span", {className: "input-group-addon", key: "addonAfter"}, P.addonAfter)) : null
      var buttonBefore = P.buttonBefore ? (React.createElement("span", {className: "input-group-btn"}, P.buttonBefore)) : null
      var buttonAfter = P.buttonAfter ? (React.createElement("span", {className: "input-group-btn"}, P.buttonAfter)) : null
      return addonBefore || addonAfter || buttonBefore || buttonAfter ? (React.createElement("div", {className: "input-group", key: "input-group"}, addonBefore, buttonBefore, children, addonAfter, buttonAfter)) : children
    }
  )
*/
/*
  def getChecked(
    function() {
      return this.getInputDOMNode().checked
    }
  )
*/
/*
  def isFile(
    function() {
      return P.type === "file"
    }
  )
*/
/*
  def renderInput(
    function() {
      var input = null
      if (!P.type) 
      {
        return C
      }
      switch (P.type) {
        case "select":
          input = (React.createElement("select", React.__spread(Map(), P, {className: joinClasses(P.className, "form-control"), ref: "input", key: "input"}), C))
          break
        case "textarea":
          input = React.createElement("textarea", React.__spread(Map(), P, {className: joinClasses(P.className, "form-control"), ref: "input", key: "input"}))
          break
        case "static":
          input = (React.createElement("p", React.__spread(Map(), P, {className: joinClasses(P.className, "form-control-static"), ref: "input", key: "input"}), P.value))
          break
        case "submit":
          input = (React.createElement(Button, React.__spread(Map(), P, {componentClass: "input", ref: "input", key: "input"})))
          break
        default:
          var className = this.isCheckboxOrRadio() || this.isFile() ? "" : "form-control"
          input = React.createElement("input", React.__spread(Map(), P, {className: joinClasses(P.className, className), ref: "input", key: "input"}))
      }
      return input
    }
  )
*/
/*
  def getValue(
    function() {
      if (P.type === "static") 
      {
        return P.value
      } else if (P.type) 
      {
        if (P.type == "select" && P.multiple) 
        {
          return this.getSelectedOptions()
        } else {
          return this.getInputDOMNode().value
        }
      } else {
        throw Error("Cannot use getValue without specifying input type.")
      }
    }
  )
*/
/*
  def getSelectedOptions(
    function() {
      var values = []
      Array.prototype.forEach.call(this.getInputDOMNode().getElementsByTagName("option"), function(option) {
  if (option.selected) 
  {
    var value = option.getAttribute("value") || option.innerHTML
    values.push(value)
  }
})
      return values
    }
  )
*/
/*
  def isCheckboxOrRadio(
    function() {
      return P.type === "radio" || P.type === "checkbox"
    }
  )
*/
/*
  def getInputDOMNode(
    function() {
      return this.refs.input.getDOMNode()
    }
  )
*/case class Props(bsStyle:Double, addonAfter:ReactElement=null, addonBefore:ReactElement=null,
  buttonAfter:ReactElement=null, buttonBefore:ReactElement=null, disabled:Boolean=false,
  groupClassName:String="", hasFeedback:Boolean=false, help:ReactElement=null,
  label:ReactElement=null, labelClassName:String="", type:String="",
  wrapperClassName:String="") extends BoostrapMixinProps
def apply(bsStyle:Double, addonAfter:ReactElement=null, addonBefore:ReactElement=null,
  buttonAfter:ReactElement=null, buttonBefore:ReactElement=null, disabled:Boolean=false,
  groupClassName:String="", hasFeedback:Boolean=false, help:ReactElement=null,
  label:ReactElement=null, labelClassName:String="", type:String="",
  wrapperClassName:String="", ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(bsStyle = bsStyle, addonAfter = addonAfter, addonBefore = addonBefore,
  buttonAfter = buttonAfter, buttonBefore = buttonBefore, disabled = disabled,
  groupClassName = groupClassName, hasFeedback = hasFeedback, help = help,
  label = label, labelClassName = labelClassName, type = type,
  wrapperClassName = wrapperClassName),children)
}

}
