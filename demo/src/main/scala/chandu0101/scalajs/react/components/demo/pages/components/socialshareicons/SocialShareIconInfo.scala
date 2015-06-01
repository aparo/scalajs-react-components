package chandu0101.scalajs.react.components.demo.pages.components.socialshareicons

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object SocialShareIconInfo {

  val component = ReactComponentB[Unit]("SocialShareIconsInfo").render(
      P => {
        <.div(^.cls := "full-width-section")(
          <.h3("Social Share Icons :"), <.p(
            "Sharing buttons for social sites twitter , facebook ,google plus , linked in etc  "
          )
        )
      }
    ).buildU

  def apply() = component()

}
