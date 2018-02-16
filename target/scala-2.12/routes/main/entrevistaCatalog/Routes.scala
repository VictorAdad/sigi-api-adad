
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/entrevistaCatalog.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package entrevistaCatalog

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  PresentoLlamadaController_0: controllers.PresentoLlamadaController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    PresentoLlamadaController_0: controllers.PresentoLlamadaController
  ) = this(errorHandler, PresentoLlamadaController_0, "/")

  def withPrefix(prefix: String): Routes = {
    entrevistaCatalog.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PresentoLlamadaController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """presento-llamadas/page""", """controllers.PresentoLlamadaController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """presento-llamadas/options""", """controllers.PresentoLlamadaController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """presento-llamadas/""" + "$" + """id<[^/]+>""", """controllers.PresentoLlamadaController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """presento-llamadas/""" + "$" + """id<[^/]+>""", """controllers.PresentoLlamadaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """presento-llamadas""", """controllers.PresentoLlamadaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """presento-llamadas/""" + "$" + """id<[^/]+>""", """controllers.PresentoLlamadaController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_PresentoLlamadaController_page0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("presento-llamadas/page")))
  )
  private[this] lazy val controllers_PresentoLlamadaController_page0_invoker = createInvoker(
    PresentoLlamadaController_0.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "entrevistaCatalog",
      "controllers.PresentoLlamadaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """presento-llamadas/page""",
      """PresentoLlamada
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_PresentoLlamadaController_options1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("presento-llamadas/options")))
  )
  private[this] lazy val controllers_PresentoLlamadaController_options1_invoker = createInvoker(
    PresentoLlamadaController_0.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "entrevistaCatalog",
      "controllers.PresentoLlamadaController",
      "options",
      Nil,
      "GET",
      this.prefix + """presento-llamadas/options""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_PresentoLlamadaController_get2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("presento-llamadas/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PresentoLlamadaController_get2_invoker = createInvoker(
    PresentoLlamadaController_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "entrevistaCatalog",
      "controllers.PresentoLlamadaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """presento-llamadas/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PresentoLlamadaController_update3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("presento-llamadas/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PresentoLlamadaController_update3_invoker = createInvoker(
    PresentoLlamadaController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "entrevistaCatalog",
      "controllers.PresentoLlamadaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """presento-llamadas/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_PresentoLlamadaController_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("presento-llamadas")))
  )
  private[this] lazy val controllers_PresentoLlamadaController_save4_invoker = createInvoker(
    PresentoLlamadaController_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "entrevistaCatalog",
      "controllers.PresentoLlamadaController",
      "save",
      Nil,
      "POST",
      this.prefix + """presento-llamadas""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_PresentoLlamadaController_delete5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("presento-llamadas/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PresentoLlamadaController_delete5_invoker = createInvoker(
    PresentoLlamadaController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "entrevistaCatalog",
      "controllers.PresentoLlamadaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """presento-llamadas/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_PresentoLlamadaController_page0_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_PresentoLlamadaController_page0_invoker.call(PresentoLlamadaController_0.page(p, s, o, f, tr))
      }
  
    // @LINE:10
    case controllers_PresentoLlamadaController_options1_route(params@_) =>
      call { 
        controllers_PresentoLlamadaController_options1_invoker.call(PresentoLlamadaController_0.options())
      }
  
    // @LINE:11
    case controllers_PresentoLlamadaController_get2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PresentoLlamadaController_get2_invoker.call(PresentoLlamadaController_0.get(id))
      }
  
    // @LINE:12
    case controllers_PresentoLlamadaController_update3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PresentoLlamadaController_update3_invoker.call(PresentoLlamadaController_0.update(id))
      }
  
    // @LINE:13
    case controllers_PresentoLlamadaController_save4_route(params@_) =>
      call { 
        controllers_PresentoLlamadaController_save4_invoker.call(PresentoLlamadaController_0.save())
      }
  
    // @LINE:14
    case controllers_PresentoLlamadaController_delete5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PresentoLlamadaController_delete5_invoker.call(PresentoLlamadaController_0.delete(id))
      }
  }
}
