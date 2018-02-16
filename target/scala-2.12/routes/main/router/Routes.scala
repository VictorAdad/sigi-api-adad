
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_1: controllers.HomeController,
  // @LINE:3
  WebsocketController_0: controllers.WebsocketController,
  // @LINE:5
  base_Routes_1: base.Routes,
  // @LINE:6
  catalogos_Routes_0: catalogos.Routes,
  // @LINE:7
  documentos_Routes_4: documentos.Routes,
  // @LINE:8
  custom_Routes_2: custom.Routes,
  // @LINE:10
  adminControl_Routes_3: adminControl.Routes,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_1: controllers.HomeController,
    // @LINE:3
    WebsocketController_0: controllers.WebsocketController,
    // @LINE:5
    base_Routes_1: base.Routes,
    // @LINE:6
    catalogos_Routes_0: catalogos.Routes,
    // @LINE:7
    documentos_Routes_4: documentos.Routes,
    // @LINE:8
    custom_Routes_2: custom.Routes,
    // @LINE:10
    adminControl_Routes_3: adminControl.Routes
  ) = this(errorHandler, HomeController_1, WebsocketController_0, base_Routes_1, catalogos_Routes_0, documentos_Routes_4, custom_Routes_2, adminControl_Routes_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, WebsocketController_0, base_Routes_1, catalogos_Routes_0, documentos_Routes_4, custom_Routes_2, adminControl_Routes_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notification/transferir""", """controllers.WebsocketController.transferir"""),
    prefixed_base_Routes_1_2.router.documentation,
    prefixed_catalogos_Routes_0_3.router.documentation,
    prefixed_documentos_Routes_4_4.router.documentation,
    prefixed_custom_Routes_2_5.router.documentation,
    prefixed_adminControl_Routes_3_6.router.documentation,
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_WebsocketController_transferir1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notification/transferir")))
  )
  private[this] lazy val controllers_WebsocketController_transferir1_invoker = createInvoker(
    WebsocketController_0.transferir,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebsocketController",
      "transferir",
      Nil,
      "GET",
      this.prefix + """notification/transferir""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] val prefixed_base_Routes_1_2 = Include(base_Routes_1.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v1/base/"))

  // @LINE:6
  private[this] val prefixed_catalogos_Routes_0_3 = Include(catalogos_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v1/catalogos/"))

  // @LINE:7
  private[this] val prefixed_documentos_Routes_4_4 = Include(documentos_Routes_4.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v1/documentos/"))

  // @LINE:8
  private[this] val prefixed_custom_Routes_2_5 = Include(custom_Routes_2.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v1/custom/"))

  // @LINE:10
  private[this] val prefixed_adminControl_Routes_3_6 = Include(adminControl_Routes_3.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v1/administration/"))


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:3
    case controllers_WebsocketController_transferir1_route(params@_) =>
      call { 
        controllers_WebsocketController_transferir1_invoker.call(WebsocketController_0.transferir)
      }
  
    // @LINE:5
    case prefixed_base_Routes_1_2(handler) => handler
  
    // @LINE:6
    case prefixed_catalogos_Routes_0_3(handler) => handler
  
    // @LINE:7
    case prefixed_documentos_Routes_4_4(handler) => handler
  
    // @LINE:8
    case prefixed_custom_Routes_2_5(handler) => handler
  
    // @LINE:10
    case prefixed_adminControl_Routes_3_6(handler) => handler
  }
}
