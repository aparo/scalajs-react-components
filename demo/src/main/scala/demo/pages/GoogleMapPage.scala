package demo
package pages

import demo.components.LeftNavPage
import demo.routes.{GoogleMapRouteModule, LeftRoute}
import japgolly.scalajs.react.ReactComponentB
import japgolly.scalajs.react.extra.router2.RouterCtl

object GoogleMapPage {

  val component = ReactComponentB[Props]("GoogleMapPage")
    .render((P) => {
    LeftNavPage(GoogleMapRouteModule.menu, P.selectedPage, P.ctrl)
  })
    .build

  case class Props(selectedPage: LeftRoute, ctrl: RouterCtl[LeftRoute])

  def apply(selectedPage: LeftRoute, ctrl: RouterCtl[LeftRoute]) = component(Props(selectedPage, ctrl))

}