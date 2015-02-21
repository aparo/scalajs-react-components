
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Modal /* mixins: BootstrapMixin with FadeMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Modal")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var modalStyle = {display: "block"}
      var dialogClasses = P.getBsClassSet()
      delete dialogClasses.modal
      dialogClasses["modal-dialog"] = true
      var classes = {modal: true, fade: P.animation, "in": !P.animation || !document.querySelectorAll}
      var modal = (React.createElement("div", React.__spread(Map(), P, {title: null, tabIndex: "-1", role: "dialog", style: modalStyle, className: joinClasses(P.className, classSet(classes)), onClick: P.backdrop === true ? this.handleBackdropClick : null, ref: "modal"}), React.createElement("div", {className: classSet(dialogClasses)}, React.createElement("div", {className: "modal-content"}, P.title ? this.renderHeader() : null, C))))
      return P.backdrop ? this.renderBackdrop(modal) : modal
    }
*/
  }
    )
    .build
    /*
  def componentDidMount(
    function() {
      this._onDocumentKeyupListener = EventListener.listen(document, "keyup", this.handleDocumentKeyUp)
      var container = (P.container && P.container.getDOMNode()) || document.body
      container.className += container.className.length ? " modal-open" : "modal-open"
      if (P.backdrop) 
      {
        this.iosClickHack()
      }
    }
  )
*/
/*
  def renderHeader(
    function() {
      var closeButton
      if (P.closeButton) 
      {
        closeButton = (React.createElement("button", {type: "button", className: "close", "aria-hidden": "true", onClick: P.onRequestHide}, "\xd7"))
      }
      return (React.createElement("div", {className: "modal-header"}, closeButton, this.renderTitle()))
    }
  )
*/
/*
  def iosClickHack(
    function() {
      this.refs.modal.getDOMNode().onclick = function() {
}
      this.refs.backdrop.getDOMNode().onclick = function() {
}
    }
  )
*/
/*
  def componentDidUpdate(
    function(prevProps) {
      if (P.backdrop && P.backdrop !== prevProps.backdrop) 
      {
        this.iosClickHack()
      }
    }
  )
*/
/*
  def renderBackdrop(
    function(modal) {
      var classes = {"modal-backdrop": true, "fade": P.animation}
      classes += ("in" -> !P.animation || !document.querySelectorAll)
      var onClick = P.backdrop === true ? this.handleBackdropClick : null
      return (React.createElement("div", null, React.createElement("div", {className: classSet(classes), ref: "backdrop", onClick: onClick}), modal))
    }
  )
*/
/*
  def handleBackdropClick(
    function(e) {
      if (e.target !== e.currentTarget) 
      {
        return
      }
      P.onRequestHide()
    }
  )
*/
/*
  def handleDocumentKeyUp(
    function(e) {
      if (P.keyboard && e.keyCode === 27) 
      {
        P.onRequestHide()
      }
    }
  )
*/
/*
  def componentWillUnmount(
    function() {
      this._onDocumentKeyupListener.remove()
      var container = (P.container && P.container.getDOMNode()) || document.body
      container.className = container.className.replace(/ ?modal-open/, "")
    }
  )
*/
/*
  def renderTitle(
    function() {
      return (React.isValidElement(P.title) ? P.title : React.createElement("h4", {className: "modal-title"}, P.title))
    }
  )
*/case class Props(onRequestHide:REventIUnit, animation:Boolean=true, backdrop:String=true,
  bsClass:String="modal", bsSize:String="", bsStyle:String="",
  closeButton:Boolean=true, keyboard:Boolean=true, title:ReactElement=null) extends BoostrapMixinProps
def apply(onRequestHide:REventIUnit, animation:Boolean=true, backdrop:String=true,
  bsClass:String="modal", bsSize:String="", bsStyle:String="",
  closeButton:Boolean=true, keyboard:Boolean=true, title:ReactElement=null,
  ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(onRequestHide = onRequestHide, animation = animation, backdrop = backdrop,
  bsClass = bsClass, bsSize = bsSize, bsStyle = bsStyle,
  closeButton = closeButton, keyboard = keyboard, title = title),children)
}

}
