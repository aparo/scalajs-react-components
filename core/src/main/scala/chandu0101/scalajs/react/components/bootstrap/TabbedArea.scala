
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object TabbedArea /* mixins: BootstrapMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("TabbedArea")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var activeKey = P.activeKey != null ? P.activeKey : this.state.activeKey
      function renderTabIfSet(child) {
        return child.props.tab != null ? this.renderTab(child) : null
      }
      var nav = (React.createElement(Nav, React.__spread(Map(), P, {activeKey: activeKey, onSelect: this.handleSelect, ref: "tabs"}), ValidComponentChildren.map(C, renderTabIfSet, this)))
      return (React.createElement("div", null, nav, React.createElement("div", {id: P.id, className: "tab-content", ref: "panes"}, ValidComponentChildren.map(C, this.renderPane))))
    }
*/
  }
    )
    .build
    /*
  def componentWillReceiveProps(
    function(nextProps) {
      if (nextProps.activeKey != null && nextProps.activeKey !== P.activeKey) 
      {
        this.setState({previousActiveKey: P.activeKey})
      }
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
  def getInitialState(
    function() {
      var defaultActiveKey = P.defaultActiveKey != null ? P.defaultActiveKey : getDefaultActiveKeyFromChildren(C)
      return {activeKey: defaultActiveKey, previousActiveKey: null}
    }
  )
*/
/*
  def handlePaneAnimateOutEnd(
    function() {
      this.setState({previousActiveKey: null})
    }
  )
*/
/*
  def getActiveKey(
    function() {
      return P.activeKey != null ? P.activeKey : this.state.activeKey
    }
  )
*/
/*
  def renderTab(
    function(child) {
      var key = child.props.eventKey
      return (React.createElement(NavItem, {ref: "tab" + key, eventKey: key}, child.props.tab))
    }
  )
*/
/*
  def handleSelect(
    function(key) {
      if (P.onSelect) 
      {
        this._isChanging = true
        P.onSelect(key)
        this._isChanging = false
      } else if (key !== this.getActiveKey()) 
      {
        this.setState({activeKey: key, previousActiveKey: this.getActiveKey()})
      }
    }
  )
*/
/*
  def renderPane(
    function(child, index) {
      var activeKey = this.getActiveKey()
      return cloneWithProps(child, {active: (child.props.eventKey === activeKey && (this.state.previousActiveKey == null || !P.animation)), ref: child.ref, key: child.key ? child.key : index, animation: P.animation, onAnimateOutEnd: (this.state.previousActiveKey != null && child.props.eventKey === this.state.previousActiveKey) ? this.handlePaneAnimateOutEnd : null})
    }
  )
*/case class Props(animation:Boolean=true, bsClass:String="", bsSize:String="",
  bsStyle:String="tabs", onSelect:REventIAny=null) extends BoostrapMixinProps
def apply(animation:Boolean=true, bsClass:String="", bsSize:String="",
  bsStyle:String="tabs", onSelect:REventIAny=null, ref: js.UndefOr[String] = "",
  key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(animation = animation, bsClass = bsClass, bsSize = bsSize,
  bsStyle = bsStyle, onSelect = onSelect),children)
}

}
