package chandu0101.scalajs.react.components
package textfields

import japgolly.scalajs.react._
import scala.scalajs.js
import scala.scalajs.js.{Array => JArray}
import chandu0101.macros.tojs.JSMacro

case class ReactTagsInput(onBlur: js.UndefOr[Callback] = js.undefined,
                          onKeyDown: js.UndefOr[ReactEventI => Callback] = js.undefined,
                          onTagRemove: js.UndefOr[String => Callback] = js.undefined,
                          onChange: js.UndefOr[(JArray[String], String) => Callback] = js.undefined,
                          removeKeys: js.UndefOr[JArray[Int]] = js.undefined,
                          validate: js.UndefOr[String => Boolean] = js.undefined,
                          classNamespace: js.UndefOr[String] = js.undefined,
                          ref: js.UndefOr[ReactTagsInputM => Unit] = js.undefined,
                          addOnBlur: js.UndefOr[Boolean] = js.undefined,
                          placeholder: js.UndefOr[String] = js.undefined,
                          valueLink: js.UndefOr[js.Object] = js.undefined,
                          onKeyUp: js.UndefOr[ReactEventI => Callback] = js.undefined,
                          key: js.UndefOr[String] = js.undefined,
                          addKeys: js.UndefOr[JArray[Int]] = js.undefined,
                          onTagAdd: js.UndefOr[String => Callback] = js.undefined,
                          validateAsync: js.UndefOr[js.Function] = js.undefined,
                          onChangeInput: js.UndefOr[String => Callback] = js.undefined,
                          defaultValue: js.UndefOr[JArray[String]] = js.undefined,
                          transform: js.UndefOr[String => Callback] = js.undefined,
                          value: js.UndefOr[JArray[String]] = js.undefined) {

  def apply() = {
    val props = JSMacro[ReactTagsInput](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.ReactTagsInput)
    f(props).asInstanceOf[ReactComponentU_]
  }

}

@js.native
trait ReactTagsInputM extends js.Object {

  def focus(): Unit = js.native

  def clear(): Unit = js.native

  def getTags(): JArray[String] = js.native

  def addTag(tag: String): Unit = js.native

  def removeTag(tag: String): Unit = js.native

}
