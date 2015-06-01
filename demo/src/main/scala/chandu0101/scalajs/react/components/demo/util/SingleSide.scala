package chandu0101.scalajs.react.components.demo.util

import japgolly.scalajs.react.ReactComponentB
import japgolly.scalajs.react.vdom.prefix_<^._
import org.scalajs.dom
import org.scalajs.dom.ext.PimpedNodeList

object SingleSide {

  val singleSideComponent = ReactComponentB[(String, TagMod)]("singleSideComponent").render(
      P => {
        val (scalaCode, component) = P
        <.div(^.`class` := "row")(
          <.div(^.`class` := "col-md-7")(
            component
          ), <.div(^.`class` := "col-md-5")(
            <.pre(<.code(scalaCode))
          )
        )
      }
    ).componentDidMount(
      _ => {
        applySyntaxHighlight()
      }
    ).componentDidUpdate(
      (_, _, _) => {
        applySyntaxHighlight()
      }
    ).build

  def component(scalaCode: String, demo: TagMod) = {
    singleSideComponent((scalaCode, demo))
  }

  def applySyntaxHighlight() = {
    import scala.scalajs.js.Dynamic.{global ⇒ g}
    val nodeList = dom.document.querySelectorAll("pre code").toArray
    nodeList.foreach(n => g.hljs.highlightBlock(n))
  }
}
