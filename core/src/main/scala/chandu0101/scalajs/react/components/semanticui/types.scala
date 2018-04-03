package chandu0101.scalajs.react.components.semanticui

import chandu0101.macros.tojs.JSMacro
import scala.scalajs.js

case class ButtonAnimatedType private (value: String) extends AnyVal
object ButtonAnimatedType {
  val fade     = ButtonAnimatedType("fade")
  val vertical = ButtonAnimatedType("vertical")
  val values   = List(fade, vertical)
}

case class SuiIconType(value: String) extends AnyVal

case class SuiCountry(value: String) extends AnyVal

@js.native
trait SuiRateObject extends js.Object {
  def rating: Int = js.native
  def maxRating: Int = js.native
}

@js.native
trait PaginationEventData extends js.Object {
  def activePage: Int = js.native
}

@js.native
trait SuiDropDownOption extends js.Object {
  def key: String = js.native
  def text: String = js.native
  def value: String = js.native
}

object SuiDropDownOption {
  def apply(key: String, text: String, value: String): SuiDropDownOption = {
    js.Dynamic.literal(key = key, text = text, value = value).asInstanceOf[SuiDropDownOption]
  }
}
