
package chandu0101.scalajs.react.components.bootstrap

import japgolly.scalajs.react._

import scala.scalajs.js
import japgolly.scalajs.react.vdom.prefix_<^._


    
object Col /* mixins: */{

  case class State()

  class Backend(t: BackendScope[Props, State]) {
  }

  val component = ReactComponentB[Props]("Col")
    .initialState(State())
    .backend(new Backend(_))
    .render((P, C, S, B) => {
    /*
    function() {
      var ComponentClass = P.componentClass
      var classes = Map()
      Object.keys(constants.SIZES).forEach(function(key) {
  var size = constants.SIZES[key]
  var prop = size
  var classPart = size + "-"
  if (P[prop])
  {
    classes["col-" + classPart + P[prop]] = true
  }
  prop = size + "Offset"
  classPart = size + "-offset-"
  if (P[prop])
  {
    classes["col-" + classPart + P[prop]] = true
  }
  prop = size + "Push"
  classPart = size + "-push-"
  if (P[prop])
  {
    classes["col-" + classPart + P[prop]] = true
  }
  prop = size + "Pull"
  classPart = size + "-pull-"
  if (P[prop])
  {
    classes["col-" + classPart + P[prop]] = true
  }
}, this)
      return (React.createElement(ComponentClass, React.__spread(Map(), P, ^.cls := ^.classSet1(P.className, classes.toList:_*)), C))
    }
*/
  }
    )
    .build
    case class Props(componentClass:ReactElement="div", lg:Int=0, lgOffset:Int=0,
  lgPull:Int=0, lgPush:Int=0, md:Int=0,
  mdOffset:Int=0, mdPull:Int=0, mdPush:Int=0,
  sm:Int=0, smOffset:Int=0, smPull:Int=0,
  smPush:Int=0, xs:Int=0, xsOffset:Int=0,
  xsPull:Int=0, xsPush:Int=0) extends BoostrapMixinProps
def apply(componentClass:ReactElement="div", lg:Int=0, lgOffset:Int=0,
  lgPull:Int=0, lgPush:Int=0, md:Int=0,
  mdOffset:Int=0, mdPull:Int=0, mdPush:Int=0,
  sm:Int=0, smOffset:Int=0, smPull:Int=0,
  smPush:Int=0, xs:Int=0, xsOffset:Int=0,
  xsPull:Int=0, xsPush:Int=0, ref: js.UndefOr[String] = "",
  key: js.Any = {})(children: ReactNode*)= {
   component.set(key, ref)(Props(componentClass = componentClass, lg = lg, lgOffset = lgOffset,
  lgPull = lgPull, lgPush = lgPush, md = md,
  mdOffset = mdOffset, mdPull = mdPull, mdPush = mdPush,
  sm = sm, smOffset = smOffset, smPull = smPull,
  smPush = smPush, xs = xs, xsOffset = xsOffset,
  xsPull = xsPull, xsPush = xsPush),children)
}

}
