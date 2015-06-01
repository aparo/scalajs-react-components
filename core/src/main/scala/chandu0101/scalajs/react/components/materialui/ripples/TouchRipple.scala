package chandu0101.scalajs.react.components.materialui.ripples

import chandu0101.scalajs.react.components.all._
import chandu0101.scalajs.react.components.materialui.styles.MaterialUICss._
import chandu0101.scalajs.react.components.util.DomUtil
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._
import org.scalajs.dom
import org.scalajs.dom.{MouseEvent, html}

import scala.collection.mutable.ListBuffer
import scala.scalajs.js
import scala.scalajs.js.Math

/**
 * Created by chandrasekharkode .
 * centerRipple: React.PropTypes.bool
 */
object TouchRipple {

  case class Ripple(key: Int = 0, started: Boolean = false, ending: Boolean = false, style: TagMod = Seq[TagMod]())

  case class State(ripples: ListBuffer[Ripple])

  class Backend(t: BackendScope[Props, State]) {

    def getRippleStyle(e: ReactEventI): TagMod = {
      val el = t.getDOMNode().asInstanceOf[html.Element]
      val elHeight = el.offsetHeight
      val elWidth = el.offsetWidth
      val offset = DomUtil.offset(el)
      val mouseEvent = e.asInstanceOf[MouseEvent]
      val pageX = mouseEvent.pageX
      val pageY = mouseEvent.pageY
      val pointerX = pageX - offset.left
      val pointerY = pageY - offset.top
      val topLeftDiag = calcDiag(pointerX, pointerY)
      val topRightDiag = calcDiag(elWidth - pointerX, pointerY)
      val botRightDiag = calcDiag(elWidth - pointerX, elHeight - pointerY)
      val botLeftDiag = calcDiag(pointerX, elHeight - pointerY)
      val rippleRadius = Math.max(
        topLeftDiag, topRightDiag, botRightDiag, botLeftDiag
      )
      val rippleSize = rippleRadius * 2
      val leftValue = pointerX - rippleRadius
      val topValue = pointerY - rippleRadius

      Seq(
        ^.height := s"${rippleSize }px",
        ^.width := s"${rippleSize }px",
        ^.top := s"${topValue }px",
        ^.left := s"${leftValue }px"
      )
    }

    def calcDiag(a: Double, b: Double) = Math.sqrt((a * a) + (b * b))

    def start(e: ReactEventI) = {
      val ripples = t.state.ripples
      val nextKey = ripples.last.key + 1
      val rippleAndIndex = ripples.zipWithIndex.view.filter { case (r, index) => !r.started }.head
      val style: TagMod = if (!t.props.centerRipple) getRippleStyle(e) else Seq[TagMod]()
      ripples.update(rippleAndIndex._2, rippleAndIndex._1.copy(started = true))
      ripples += Ripple(nextKey, started = false, ending = false, style)
      t.modState(_.copy(ripples = ripples))
    }

    def end = {
      val ripples = t.state.ripples
      //Only update if a ripple was found
      if (ripples.view.exists(r => r.started && !r.ending)) {
        val rippleAndIndex = ripples.zipWithIndex.view.filter { case (r, index) => r.started && !r.ending }.head
        ripples.update(rippleAndIndex._2, rippleAndIndex._1.copy(ending = true))
        t.modState(_.copy(ripples = ripples))
        //Wait 2 seconds and remove the ripple from DOM
        dom.window.setTimeout(
          () => {
            if (t.isMounted()) {
              t.modState(_.copy(ripples = ripples.tail))
            }
          }, 2000
        )
      }
    }

    def handleMouseDown(e: ReactEventI) = {
      if (DomUtil.isLeftClick(e.nativeEvent)) start(e)
    }

    def handleMouseUp(e: ReactEventI): Unit = end

    def handleMouseOut(e: ReactEventI): Unit = end

    def handleTouchStart(e: ReactEventI): Unit = start(e)

    def handleTouchEnd(e: ReactEventI): Unit = end

    def getRippleElements = t.state.ripples.map(
      r => RippleCircle(
        key = r.key,
        started = r.started,
        ending = r.ending
      )(r.style)
    )

  }

  val component = ReactComponentB[Props]("TouchRipple").initialState(State(ListBuffer(Ripple()))).backend(new Backend(_)).render(
      (P, C, S, B) => {
        val classes = ^.classSet1M(mui_touch_ripple, P.clsNames)
        <.div(
          ^.onMouseDown ==> B.handleMouseDown,
          ^.onMouseUp ==> B.handleMouseUp,
          ^.onMouseOut ==> B.handleMouseOut,
          ^.onTouchStart ==> B.handleTouchStart,
          ^.onTouchEnd ==> B.handleTouchEnd
        )(
            <.div(classes)(B.getRippleElements), C
          )
      }
    ).build

  case class Props(clsNames: CssClassType, key: js.Any, ref: js.UndefOr[String], centerRipple: Boolean)

  def withChildren(clsNames: CssClassType = Map(),
                   key: js.Any = {},
                   ref: js.UndefOr[String] = "",
                   centerRipple: Boolean = false)(children: ReactNode*) =
    component.set(key, ref)(Props(clsNames, key, ref, centerRipple), children)

  def apply(clsNames: CssClassType = Map(),
            key: js.Any = {},
            ref: js.UndefOr[String] = "",
            centerRipple: Boolean = false) =
    component.set(key, ref)(Props(clsNames, key, ref, centerRipple))

}
