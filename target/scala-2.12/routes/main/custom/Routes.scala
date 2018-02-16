
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/custom.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package custom

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  CustomFinderController_0: controllers.CustomFinderController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    CustomFinderController_0: controllers.CustomFinderController
  ) = this(errorHandler, CustomFinderController_0, "/")

  def withPrefix(prefix: String): Routes = {
    custom.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, CustomFinderController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """finder""", """controllers.CustomFinderController.finder(model:String ?= "", expr:java.util.List[String], select:String ?= "")"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_CustomFinderController_finder0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finder")))
  )
  private[this] lazy val controllers_CustomFinderController_finder0_invoker = createInvoker(
    CustomFinderController_0.finder(fakeValue[String], fakeValue[java.util.List[String]], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "custom",
      "controllers.CustomFinderController",
      "finder",
      Seq(classOf[String], classOf[java.util.List[String]], classOf[String]),
      "GET",
      this.prefix + """finder""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_CustomFinderController_finder0_route(params@_) =>
      call(params.fromQuery[String]("model", Some("")), params.fromQuery[java.util.List[String]]("expr", None), params.fromQuery[String]("select", Some(""))) { (model, expr, select) =>
        controllers_CustomFinderController_finder0_invoker.call(CustomFinderController_0.finder(model, expr, select))
      }
  }
}
