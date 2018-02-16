
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/determinacionCatalog.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package determinacionCatalog

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  HipotesisAmbitoController_0: controllers.HipotesisAmbitoController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    HipotesisAmbitoController_0: controllers.HipotesisAmbitoController
  ) = this(errorHandler, HipotesisAmbitoController_0, "/")

  def withPrefix(prefix: String): Routes = {
    determinacionCatalog.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HipotesisAmbitoController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hipotesis-ambito/""" + "$" + """id<[^/]+>""", """controllers.HipotesisAmbitoController.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hipotesis-ambito""", """controllers.HipotesisAmbitoController.list()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hipotesis-ambito/""" + "$" + """id<[^/]+>""", """controllers.HipotesisAmbitoController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hipotesis-ambito""", """controllers.HipotesisAmbitoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hipotesis-ambito/""" + "$" + """id<[^/]+>""", """controllers.HipotesisAmbitoController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_HipotesisAmbitoController_get0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hipotesis-ambito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HipotesisAmbitoController_get0_invoker = createInvoker(
    HipotesisAmbitoController_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "determinacionCatalog",
      "controllers.HipotesisAmbitoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """hipotesis-ambito/""" + "$" + """id<[^/]+>""",
      """HiptesisAmbito
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HipotesisAmbitoController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hipotesis-ambito")))
  )
  private[this] lazy val controllers_HipotesisAmbitoController_list1_invoker = createInvoker(
    HipotesisAmbitoController_0.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "determinacionCatalog",
      "controllers.HipotesisAmbitoController",
      "list",
      Nil,
      "GET",
      this.prefix + """hipotesis-ambito""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HipotesisAmbitoController_update2_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hipotesis-ambito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HipotesisAmbitoController_update2_invoker = createInvoker(
    HipotesisAmbitoController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "determinacionCatalog",
      "controllers.HipotesisAmbitoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """hipotesis-ambito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HipotesisAmbitoController_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hipotesis-ambito")))
  )
  private[this] lazy val controllers_HipotesisAmbitoController_save3_invoker = createInvoker(
    HipotesisAmbitoController_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "determinacionCatalog",
      "controllers.HipotesisAmbitoController",
      "save",
      Nil,
      "POST",
      this.prefix + """hipotesis-ambito""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HipotesisAmbitoController_delete4_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hipotesis-ambito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HipotesisAmbitoController_delete4_invoker = createInvoker(
    HipotesisAmbitoController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "determinacionCatalog",
      "controllers.HipotesisAmbitoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """hipotesis-ambito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_HipotesisAmbitoController_get0_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HipotesisAmbitoController_get0_invoker.call(HipotesisAmbitoController_0.get(id))
      }
  
    // @LINE:10
    case controllers_HipotesisAmbitoController_list1_route(params@_) =>
      call { 
        controllers_HipotesisAmbitoController_list1_invoker.call(HipotesisAmbitoController_0.list())
      }
  
    // @LINE:11
    case controllers_HipotesisAmbitoController_update2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HipotesisAmbitoController_update2_invoker.call(HipotesisAmbitoController_0.update(id))
      }
  
    // @LINE:12
    case controllers_HipotesisAmbitoController_save3_route(params@_) =>
      call { 
        controllers_HipotesisAmbitoController_save3_invoker.call(HipotesisAmbitoController_0.save())
      }
  
    // @LINE:13
    case controllers_HipotesisAmbitoController_delete4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HipotesisAmbitoController_delete4_invoker.call(HipotesisAmbitoController_0.delete(id))
      }
  }
}
