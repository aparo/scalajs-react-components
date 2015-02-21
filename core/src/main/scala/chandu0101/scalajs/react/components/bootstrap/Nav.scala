
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Nav /* mixins: BootstrapMixin with CollapsableMixin*/{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Nav")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var classes = P.collapsable ? this.getCollapsableClassSet() : Map()
      classes += ("navbar-collapse" -> P.collapsable)
      if (P.navbar && !P.collapsable) 
      {
        return (this.renderUl())
      }
      return (React.createElement("nav", React.__spread(Map(), P, ^.cls := ^.classSet1(P.className, classes.toList:_*)), this.renderUl()))
    }
*/
  }
    )
    .build
    /*
  def getCollapsableDimensionValue(
    function() {
      var node = this.refs.ul.getDOMNode(), height = node.offsetHeight, computedStyles = domUtils.getComputedStyles(node)
      return height + parseInt(computedStyles.marginTop, 10) + parseInt(computedStyles.marginBottom, 10)
    }
  )
*/
/*
  def getChildActiveProp(
    function(child) {
      if (child.props.active) 
      {
        return true
      }
      if (P.activeKey != null) 
      {
        if (child.props.eventKey == P.activeKey) 
        {
          return true
        }
      }
      if (P.activeHref != null) 
      {
        if (child.props.href === P.activeHref) 
        {
          return true
        }
      }
      return child.props.active
    }
  )
*/
/*
  def getCollapsableDOMNode(
    function() {
      return this.getDOMNode()
    }
  )
*/
/*
  def renderNavItem(
    function(child, index) {
      return cloneWithProps(child, {active: this.getChildActiveProp(child), activeKey: P.activeKey, activeHref: P.activeHref, onSelect: createChainedFunction(child.props.onSelect, P.onSelect), ref: child.ref, key: child.key ? child.key : index, navItem: true})
    }
  )
*/
/*
  def renderUl(
    function() {
      var classes = P.getBsClassSet()
      classes += ("nav-stacked" -> P.stacked)
      classes += ("nav-justified" -> P.justified)
      classes += ("navbar-nav" -> P.navbar)
      classes += ("pull-right" -> P.pullRight)
      classes += ("navbar-right" -> P.right)
      return (React.createElement("ul", React.__spread(Map(), P, {className: joinClasses(P.className, classSet(classes)), ref: "ul"}), ValidComponentChildren.map(C, this.renderNavItem)))
    }
  )
*/case class Props(bsStyle:String, bsClass:String="nav", bsSize:String="",
  collapsable:Boolean=false, eventKey:Any=null, expanded:Boolean=false,
  justified:Boolean=false, navbar:Boolean=false, onSelect:REventIAny=null,
  right:Boolean=false, stacked:Boolean=false) extends BoostrapMixinProps
def apply(bsStyle:String, bsClass:String="nav", bsSize:String="",
  collapsable:Boolean=false, eventKey:Any=null, expanded:Boolean=false,
  justified:Boolean=false, navbar:Boolean=false, onSelect:REventIAny=null,
  right:Boolean=false, stacked:Boolean=false, ref: js.UndefOr[String] = "",
  key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(bsStyle = bsStyle, bsClass = bsClass, bsSize = bsSize,
  collapsable = collapsable, eventKey = eventKey, expanded = expanded,
  justified = justified, navbar = navbar, onSelect = onSelect,
  right = right, stacked = stacked),children)
}

}
