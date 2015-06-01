package chandu0101.scalajs.react.components.demo.pages

import chandu0101.scalajs.react.components.demo.pages.components.demo.DemoLeftNav
import chandu0101.scalajs.react.components.demo.pages.util.LeftnavPage
import chandu0101.scalajs.react.components.demo.routes.AppRouter.AppPage._
import japgolly.scalajs.react.{BackendScope, ReactComponentB, ReactElement}

object ReactPopoverPage {
  lazy val menus = List(
    DemoLeftNav.Menu(route = reactPopoverInfo.path.value, text = "Info"),
    DemoLeftNav.Menu(route = reactPopoverDemo.path.value, text = "Demo")
  )

  case class State(checked: Boolean)

  class Backend(t: BackendScope[Props, State]) {

  }

  val component = ReactComponentB[Props]("ReactPopoverPage").initialState(State(checked = false)).backend(new Backend(_)).render(
      (P, S, B) => {
        LeftnavPage(menus, P.content)
      }
    ).build

  case class Props(content: ReactElement)

  def apply(content: ReactElement) = component(Props(content))

}
