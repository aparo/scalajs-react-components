package chandu0101.scalajs.react.components.demo.pages

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

/**
 * Created by chandrasekharkode on 2/8/15.
 */
object ContributePage {

  object Style {

    val content: TagMod = Seq(^.padding := "80px", ^.minHeight := "820px")

    val rules = Seq(^.padding := "20px auto")

  }

  val component = ReactComponentB[Unit]("ContributePage").render(
      P => {
        <.div(Style.content)(
          <.h3("Welcome Mama(friend,mate,amigo,dosth,...)"), <.hr(), <.div(Style.rules)(
            <.h4("Users : "), <.p(
              "Go a head play with the toys ,report issues and send PR(Pull Request)'s if possible :) "
            )
          ), <.div(Style.rules)(
            <.h4("Contributors :"), <.ul(
              <.li("There are no global rules for this project ,follow what ever works for you."), <.li(
                "If you're working on new component please create an issue in ",
                <.a(
                  ^.href := "https://github.com/chandu0101/scalajs-react-components/issues",
                  ^.textDecoration := "none",
                  ^.target := "_blank"
                )("Github"),
                " so that we can minimize duplicate works, and you may find other awesome contributors ."
              )
            )
          )
        )
      }
    ).buildU

  def apply() = component()

}
