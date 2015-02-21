package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._

/**
active:   React.PropTypes.bool,
    disabled: React.PropTypes.bool,
    block:    React.PropTypes.bool,
    navItem:    React.PropTypes.bool,
    navDropdown: React.PropTypes.bool,
    componentClass: React.PropTypes.node,
    href: React.PropTypes.string,
    target: React.PropTypes.string
  */
object BSButton {

  case class State()

  class Backend(t: BackendScope[Props, _]) {
    //    def onTouchTap(e: ReactEventI) = {
    //      if (t.props.onTouchTap != null) t.props.onTouchTap(e)
    //    }

  }

  //  val theToolTipRef = Ref.to(MuiTooltip.component, "theToolTipRef")
  val component = ReactComponentB[Props]("BSButton")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    var classes: Map[String, Boolean] = if (P.navDropdown) Map() else P.getBsClassSet

    classes +=("active" -> P.active, "btn-block" -> P.block)

    def renderAnchor(classes: Map[String, Boolean]) = {
      val comp = if (P.componentClass != null) P.componentClass else a
      val href = if (P.href.nonEmpty) P.href else "#"
      var cClasses = classes + ("disabled" -> P.disabled)
      if (P.className.nonEmpty)
        cClasses += (P.className -> true)

      <.a(^.href := href, ^.classSet(cClasses.toSeq: _*), ^.role := "button", P, C)
    }

    def renderButton(classes: Map[String, Boolean]) = {
      val comp = if (P.componentClass != null) P.componentClass else a
      val href = if (P.href.nonEmpty) P.href else "#"
      var cClasses = classes + ("disabled" -> P.disabled)
      if (P.className.nonEmpty)
        cClasses += (P.className -> true)
      <.button(^.classSet(cClasses.toSeq: _*), P, C)
    }

    def renderNavItem(classes: Map[String, Boolean]) = {
      <.li(^.classSet("active" -> P.active), renderAnchor(classes))
    }

    if (P.navItem) {
      renderNavItem(classes)
    } else if (P.href.nonEmpty || P.target.nonEmpty || P.navDropdown) {
      renderAnchor(classes)
    } else {
      renderButton(classes)
    }
  }
    )
    .build


  case class Props(active: Boolean,
                   disabled: Boolean,
                   block: Boolean,
                   navItem: Boolean,
                   navDropdown: Boolean,
                   componentClass: ReactNode,
                   href: String,
                   target: String,
                   className: String = "",
                   bsClass: String = "", bsStyle: String = "", bsSize: String = ""
                   //                   ,ref: js.UndefOr[String], key: js.Any
                    ) extends BoostrapMixinProps

  def apply(active: Boolean,
            disabled: Boolean,
            block: Boolean,
            navItem: Boolean,
            navDropdown: Boolean,
            componentClass: ReactNode = null,
            href: String = "",
            target: String = "",
            className: String = "",
            bsClass: String = "", bsStyle: String = "", bsSize: String = "",
            ref: js.UndefOr[String] = "", key: js.Any = {})(children: ReactNode*) = {
    component.set(key, ref)(Props(active = active, disabled = disabled, block = block,
      navItem = navItem, navDropdown = navDropdown,
      componentClass = componentClass, href = href, target = target, className = className,
      bsClass = bsClass, bsStyle = bsStyle, bsSize = bsSize
    ), children)
  }

  //  case class Props(
  //                    iconClassName: String, onBlur: REventIUnit, touch: Boolean, url: String, clsNames: CssClassType,

  //                   onMouseOver: REventIUnit, linkButton: Boolean, onTouchTap: REventIUnit,
  //                   className: String, onMouseOut: REventIUnit, onFocus: REventIUnit, disabled: Boolean, tooltip: String) extends BoostrapMixinProps

  /**
  active:   React.PropTypes.bool,
    disabled: React.PropTypes.bool,
    block:    React.PropTypes.bool,
    navItem:    React.PropTypes.bool,
    navDropdown: React.PropTypes.bool,
    componentClass: React.PropTypes.node,
    href: React.PropTypes.string,
    target: React.PropTypes.string
    */

}
