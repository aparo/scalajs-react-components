
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object ListGroupItem /* mixins: BootstrapMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("ListGroupItem")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = P.getBsClassSet()
      classes += ("active" -> P.active)
      classes += ("disabled" -> P.disabled)
      if (P.href || P.target || P.onClick) 
      {
        return this.renderAnchor(classes)
      } else {
        return this.renderSpan(classes)
      }
    }
*/
  }
    )
    .build
    /*
  def renderAnchor(
    function(classes) {
      return (React.createElement("a", React.__spread(Map(), P, {className: joinClasses(P.className, classSet(classes)), onClick: this.handleClick}), P.header ? this.renderStructuredContent() : C))
    }
  )
*/
/*
  def renderSpan(
    function(classes) {
      return (React.createElement("span", React.__spread(Map(), P, ^.cls := ^.classSet1(P.className, classes.toList:_*)), P.header ? this.renderStructuredContent() : C))
    }
  )
*/
/*
  def renderStructuredContent(
    function() {
      var header
      if (React.isValidElement(P.header)) 
      {
        header = cloneWithProps(P.header, {className: "list-group-item-heading"})
      } else {
        header = (React.createElement("h4", {className: "list-group-item-heading"}, P.header))
      }
      var content = (React.createElement("p", {className: "list-group-item-text"}, C))
      return {header: header, content: content}
    }
  )
*/
/*
  def handleClick(
    function(e) {
      if (P.onClick) 
      {
        e.preventDefault()
        P.onClick(P.eventKey, P.href, P.target)
      }
    }
  )
*/case class Props(bsStyle:String, active:Any=null, bsClass:String="list-group-item",
  bsSize:String="", disabled:Any=null, eventKey:Any=null,
  header:ReactElement=null, href:String="", onClick:REventIAny=null,
  target:String="") extends BoostrapMixinProps
def apply(bsStyle:String, active:Any=null, bsClass:String="list-group-item",
  bsSize:String="", disabled:Any=null, eventKey:Any=null,
  header:ReactElement=null, href:String="", onClick:REventIAny=null,
  target:String="", ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(bsStyle = bsStyle, active = active, bsClass = bsClass,
  bsSize = bsSize, disabled = disabled, eventKey = eventKey,
  header = header, href = href, onClick = onClick,
  target = target),children)
}

}
