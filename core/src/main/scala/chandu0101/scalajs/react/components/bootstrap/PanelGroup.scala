
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object PanelGroup /* mixins: BootstrapMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("PanelGroup")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = P.getBsClassSet()
      return (React.createElement("div", React.__spread(Map(), P, {className: joinClasses(P.className, classSet(classes)), onSelect: null}), ValidComponentChildren.map(C, this.renderPanel)))
    }
*/
  }
    )
    .build
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
      var defaultActiveKey = P.defaultActiveKey
      return {activeKey: defaultActiveKey}
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
      }
      if (this.state.activeKey === key) 
      {
        key = null
      }
      this.setState({activeKey: key})
    }
  )
*/
/*
  def renderPanel(
    function(child, index) {
      var activeKey = P.activeKey != null ? P.activeKey : this.state.activeKey
      var props = {bsStyle: child.props.bsStyle || P.bsStyle, key: child.key ? child.key : index, ref: child.ref}
      if (P.accordion) 
      {
        props.collapsable = true
        props.expanded = (child.props.eventKey === activeKey)
        props.onSelect = this.handleSelect
      }
      return cloneWithProps(child, props)
    }
  )
*/case class Props(activeKey:Any=null, bsClass:String="panel-group", bsSize:String="",
  bsStyle:String="", collapsable:Boolean=false, defaultActiveKey:Any=null,
  onSelect:REventIAny=null) extends BoostrapMixinProps
def apply(activeKey:Any=null, bsClass:String="panel-group", bsSize:String="",
  bsStyle:String="", collapsable:Boolean=false, defaultActiveKey:Any=null,
  onSelect:REventIAny=null, ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(activeKey = activeKey, bsClass = bsClass, bsSize = bsSize,
  bsStyle = bsStyle, collapsable = collapsable, defaultActiveKey = defaultActiveKey,
  onSelect = onSelect),children)
}

}
