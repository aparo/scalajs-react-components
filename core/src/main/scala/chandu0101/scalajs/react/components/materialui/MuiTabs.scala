package chandu0101.scalajs.react.components
package materialui
import chandu0101.macros.tojs.JSMacro
import japgolly.scalajs.react._
import scala.scalajs.js
import scala.scalajs.js.`|`
/**
 * This file is generated - submit issues instead of PR against it
 */
case class MuiTabs[T](
  key:                       js.UndefOr[String]                                     = js.undefined,
  ref:                       js.UndefOr[String]                                     = js.undefined,
  /* The css class name of the root element.*/
  className:                 js.UndefOr[String]                                     = js.undefined,
  /* The css class name of the content's container.*/
  contentContainerClassName: js.UndefOr[String]                                     = js.undefined,
  /* Override the inline-styles of the content's container.*/
  contentContainerStyle:     js.UndefOr[CssProperties]                              = js.undefined,
  /* Specify initial visible tab index.
  If `initialSelectedIndex` is set but larger than the total amount of specified tabs,
  `initialSelectedIndex` will revert back to default.
  If `initialSlectedIndex` is set to any negative value, no tab will be selected intially.*/
  initialSelectedIndex:      js.UndefOr[Int]                                        = js.undefined,
  /* Override the inline-styles of the InkBar.*/
  inkBarStyle:               js.UndefOr[CssProperties]                              = js.undefined,
  /* Called when the selected value change.*/
  onChange:                  js.UndefOr[(T, ReactEventH, ReactElement) => Callback] = js.undefined,
  /* Override the inline-styles of the root element.*/
  style:                     js.UndefOr[CssProperties]                              = js.undefined,
  /* Override the inline-styles of the tab-labels container.*/
  tabItemContainerStyle:     js.UndefOr[CssProperties]                              = js.undefined,
  /* Override the default tab template used to wrap the content of each tab element.*/
  tabTemplate:               js.UndefOr[js.Any]                                     = js.undefined,
  /* Override the inline-styles of the tab template.*/
  tabTemplateStyle:          js.UndefOr[CssProperties]                              = js.undefined,
  /* Makes Tabs controllable and selects the tab whose value prop matches this prop.*/
  value:                     js.UndefOr[T]                                          = js.undefined){
  /**
   * @param children Should be used to pass `Tab` components.
   */
  def apply(children: ReactNode*) = {
    implicit def evT(t: T): js.Any = t.asInstanceOf[js.Any]
    val props = JSMacro[MuiTabs[T]](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.Tabs)
    if (children.isEmpty)
      f(props).asInstanceOf[ReactComponentU_]
    else if (children.size == 1)
      f(props, children.head).asInstanceOf[ReactComponentU_]
    else
      f(props, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}
