
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object TabPane /* mixins: */{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("TabPane")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = {"tab-pane": true, "fade": true, "active": P.active || this.state.animateOut, "in": P.active && !this.state.animateIn}
      return (React.createElement("div", React.__spread(Map(), P, ^.cls := ^.classSet1(P.className, classes.toList:_*)), C))
    }
*/
  }
    )
    .build
    /*
  def startAnimateIn(
    function() {
      if (this.isMounted()) 
      {
        this.setState({animateIn: false})
      }
    }
  )
*/
/*
  def componentWillReceiveProps(
    function(nextProps) {
      if (P.animation) 
      {
        if (!this.state.animateIn && nextProps.active && !P.active) 
        {
          this.setState({animateIn: true})
        } else if (!this.state.animateOut && !nextProps.active && P.active) 
        {
          this.setState({animateOut: true})
        }
      }
    }
  )
*/
/*
  def stopAnimateOut(
    function() {
      if (this.isMounted()) 
      {
        this.setState({animateOut: false})
        if (typeof P.onAnimateOutEnd === "function") 
        {
          P.onAnimateOutEnd()
        }
      }
    }
  )
*/
/*
  def getInitialState(
    function() {
      return {animateIn: false, animateOut: false}
    }
  )
*/
/*
  def componentDidUpdate(
    function() {
      if (this.state.animateIn) 
      {
        setTimeout(this.startAnimateIn, 0)
      }
      if (this.state.animateOut) 
      {
        TransitionEvents.addEndEventListener(this.getDOMNode(), this.stopAnimateOut)
      }
    }
  )
*/case class Props(animation:Boolean=true) extends BoostrapMixinProps
def apply(animation:Boolean=true, ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(animation = animation),children)
}

}
