
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object OverlayTrigger /* mixins: OverlayMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("OverlayTrigger")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      if (P.trigger === "manual") 
      {
        return React.Children.only(C)
      }
      var props = Map()
      if (isOneOf("click", P.trigger)) 
      {
        props.onClick = createChainedFunction(this.toggle, P.onClick)
      }
      if (isOneOf("hover", P.trigger)) 
      {
        props.onMouseOver = createChainedFunction(this.handleDelayedShow, P.onMouseOver)
        props.onMouseOut = createChainedFunction(this.handleDelayedHide, P.onMouseOut)
      }
      if (isOneOf("focus", P.trigger)) 
      {
        props.onFocus = createChainedFunction(this.handleDelayedShow, P.onFocus)
        props.onBlur = createChainedFunction(this.handleDelayedHide, P.onBlur)
      }
      return cloneWithProps(React.Children.only(C), props)
    }
*/
  }
    )
    .build
    /*
  def componentDidMount(
    function() {
      this.updateOverlayPosition()
    }
  )
*/
/*
  def updateOverlayPosition(
    function() {
      if (!this.isMounted()) 
      {
        return
      }
      var pos = this.calcOverlayPosition()
      this.setState({overlayLeft: pos.left, overlayTop: pos.top})
    }
  )
*/
/*
  def show(
    function() {
      this.setState({isOverlayShown: true}, function() {
  this.updateOverlayPosition()
})
    }
  )
*/
/*
  def getInitialState(
    function() {
      return {isOverlayShown: P.defaultOverlayShown == null ? false : P.defaultOverlayShown, overlayLeft: null, overlayTop: null}
    }
  )
*/
/*
  def toggle(
    function() {
            this.state.isOverlayShown ? this.hide() : this.show()
    }
  )
*/
/*
  def handleDelayedHide(
    function() {
      if (this._hoverDelay != null) 
      {
        clearTimeout(this._hoverDelay)
        this._hoverDelay = null
        return
      }
      var delay = P.delayHide != null ? P.delayHide : P.delay
      if (!delay) 
      {
        this.hide()
        return
      }
      this._hoverDelay = setTimeout(function() {
  this._hoverDelay = null
  this.hide()
}.bind(this), delay)
    }
  )
*/
/*
  def calcOverlayPosition(
    function() {
      var childOffset = this.getPosition()
      var overlayNode = this.getOverlayDOMNode()
      var overlayHeight = overlayNode.offsetHeight
      var overlayWidth = overlayNode.offsetWidth
      switch (P.placement) {
        case "right":
          return {top: childOffset.top + childOffset.height / 2 - overlayHeight / 2, left: childOffset.left + childOffset.width}
        case "left":
          return {top: childOffset.top + childOffset.height / 2 - overlayHeight / 2, left: childOffset.left - overlayWidth}
        case "top":
          return {top: childOffset.top - overlayHeight, left: childOffset.left + childOffset.width / 2 - overlayWidth / 2}
        case "bottom":
          return {top: childOffset.top + childOffset.height, left: childOffset.left + childOffset.width / 2 - overlayWidth / 2}
        default:
          throw new Error("calcOverlayPosition(): No such placement of "" + P.placement + "" found.")
      }
    }
  )
*/
/*
  def getPosition(
    function() {
      var node = this.getDOMNode()
      var container = this.getContainerDOMNode()
      var offset = container.tagName == "BODY" ? domUtils.getOffset(node) : domUtils.getPosition(node, container)
      return assign(Map(), offset, {height: node.offsetHeight, width: node.offsetWidth})
    }
  )
*/
/*
  def hide(
    function() {
      this.setState({isOverlayShown: false})
    }
  )
*/
/*
  def handleDelayedShow(
    function() {
      if (this._hoverDelay != null) 
      {
        clearTimeout(this._hoverDelay)
        this._hoverDelay = null
        return
      }
      var delay = P.delayShow != null ? P.delayShow : P.delay
      if (!delay) 
      {
        this.show()
        return
      }
      this._hoverDelay = setTimeout(function() {
  this._hoverDelay = null
  this.show()
}.bind(this), delay)
    }
  )
*/
/*
  def renderOverlay(
    function() {
      if (!this.state.isOverlayShown) 
      {
        return React.createElement("span", null)
      }
      return cloneWithProps(P.overlay, {onRequestHide: this.hide, placement: P.placement, positionLeft: this.state.overlayLeft, positionTop: this.state.overlayTop})
    }
  )
*/
/*
  def componentWillUnmount(
    function() {
      clearTimeout(this._hoverDelay)
    }
  )
*/case class Props(overlay:ReactElement, defaultOverlayShown:Boolean=false, delay:Int=0,
  delayHide:Int=0, delayShow:Int=0, placement:String="right",
  trigger:Double=["hover", "focus"]) extends BoostrapMixinProps
def apply(overlay:ReactElement, defaultOverlayShown:Boolean=false, delay:Int=0,
  delayHide:Int=0, delayShow:Int=0, placement:String="right",
  trigger:Double=["hover", "focus"], ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(overlay = overlay, defaultOverlayShown = defaultOverlayShown, delay = delay,
  delayHide = delayHide, delayShow = delayShow, placement = placement,
  trigger = trigger),children)
}

}
