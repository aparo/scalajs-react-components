
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Panel /* mixins: BootstrapMixin with CollapsableMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Panel")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = P.getBsClassSet()
      classes += ("panel" -> true)
      return (React.createElement("div", React.__spread(Map(), P, {className: joinClasses(P.className, classSet(classes)), id: P.collapsable ? null : P.id, onSelect: null}), this.renderHeading(), P.collapsable ? this.renderCollapsableBody() : this.renderBody(), this.renderFooter()))
    }
*/
  }
    )
    .build
    /*
  def getCollapsableDimensionValue(
    function() {
      return this.refs.panel.getDOMNode().scrollHeight
    }
  )
*/
/*
  def renderFooter(
    function() {
      if (!P.footer) 
      {
        return null
      }
      return (React.createElement("div", {className: "panel-footer"}, P.footer))
    }
  )
*/
/*
  def renderAnchor(
    function(header) {
      return (React.createElement("a", {href: "#" + (P.id || ""), className: this.isExpanded() ? null : "collapsed", onClick: this.handleSelect}, header))
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
  def getCollapsableDOMNode(
    function() {
      if (!this.isMounted() || !this.refs || !this.refs.panel) 
      {
        return null
      }
      return this.refs.panel.getDOMNode()
    }
  )
*/
/*
  def renderCollapsableTitle(
    function(header) {
      return (React.createElement("h4", {className: "panel-title"}, this.renderAnchor(header)))
    }
  )
*/
/*
  def renderBody(
    function() {
      var allChildren = C
      var bodyElements = []
      function getProps() {
        return {key: bodyElements.length}
      }
      function addPanelChild(child) {
        bodyElements.push(cloneWithProps(child, getProps()))
      }
      function addPanelBody(children) {
        bodyElements.push(React.createElement("div", React.__spread({className: "panel-body"}, getProps()), children))
      }
      if (!Array.isArray(allChildren) || allChildren.length == 0) 
      {
        if (this.shouldRenderFill(allChildren)) 
        {
          addPanelChild(allChildren)
        } else {
          addPanelBody(allChildren)
        }
      } else {
        var panelBodyChildren = []
        function maybeRenderPanelBody() {
          if (panelBodyChildren.length == 0) 
          {
            return
          }
          addPanelBody(panelBodyChildren)
          panelBodyChildren = []
        }        allChildren.forEach(function(child) {
  if (this.shouldRenderFill(child)) 
  {
    maybeRenderPanelBody()
    addPanelChild(child)
  } else {
    panelBodyChildren.push(child)
  }
}.bind(this))
        maybeRenderPanelBody()
      }
      return bodyElements
    }
  )
*/
/*
  def renderCollapsableBody(
    function() {
      return (React.createElement("div", {className: classSet(this.getCollapsableClassSet("panel-collapse")), id: P.id, ref: "panel"}, this.renderBody()))
    }
  )
*/
/*
  def renderHeading(
    function() {
      var header = P.header
      if (!header) 
      {
        return null
      }
      if (!React.isValidElement(header) || Array.isArray(header)) 
      {
        header = P.collapsable ? this.renderCollapsableTitle(header) : header
      } else if (P.collapsable) 
      {
        header = cloneWithProps(header, {className: "panel-title", children: this.renderAnchor(header.props.children)})
      } else {
        header = cloneWithProps(header, {className: "panel-title"})
      }
      return (React.createElement("div", {className: "panel-heading"}, header))
    }
  )
*/
/*
  def handleSelect(
    function(e) {
      if (P.onSelect) 
      {
        this._isChanging = true
        P.onSelect(P.eventKey)
        this._isChanging = false
      }
      e.preventDefault()
      this.setState({expanded: !this.state.expanded})
    }
  )
*/
/*
  def shouldRenderFill(
    function(child) {
      return React.isValidElement(child) && child.props.fill != null
    }
  )
*/case class Props(bsClass:String="panel", bsSize:String="", bsStyle:String="default",
  eventKey:Any=null, footer:ReactElement=null, header:ReactElement=null,
  onSelect:REventIAny=null) extends BoostrapMixinProps
def apply(bsClass:String="panel", bsSize:String="", bsStyle:String="default",
  eventKey:Any=null, footer:ReactElement=null, header:ReactElement=null,
  onSelect:REventIAny=null, ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(bsClass = bsClass, bsSize = bsSize, bsStyle = bsStyle,
  eventKey = eventKey, footer = footer, header = header,
  onSelect = onSelect),children)
}

}
