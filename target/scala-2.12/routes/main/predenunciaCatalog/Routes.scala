
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/predenunciaCatalog.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package predenunciaCatalog

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  TipoLineaController_0: controllers.TipoLineaController,
  // @LINE:18
  TipoPersonaController_1: controllers.TipoPersonaController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    TipoLineaController_0: controllers.TipoLineaController,
    // @LINE:18
    TipoPersonaController_1: controllers.TipoPersonaController
  ) = this(errorHandler, TipoLineaController_0, TipoPersonaController_1, "/")

  def withPrefix(prefix: String): Routes = {
    predenunciaCatalog.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, TipoLineaController_0, TipoPersonaController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-linea/page""", """controllers.TipoLineaController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-linea/options""", """controllers.TipoLineaController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-linea/""" + "$" + """id<[^/]+>""", """controllers.TipoLineaController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-linea/""" + "$" + """id<[^/]+>""", """controllers.TipoLineaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-linea""", """controllers.TipoLineaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-linea/""" + "$" + """id<[^/]+>""", """controllers.TipoLineaController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-persona/page""", """controllers.TipoPersonaController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-persona/options""", """controllers.TipoPersonaController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-persona/""" + "$" + """id<[^/]+>""", """controllers.TipoPersonaController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-persona/""" + "$" + """id<[^/]+>""", """controllers.TipoPersonaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-persona""", """controllers.TipoPersonaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-persona/""" + "$" + """id<[^/]+>""", """controllers.TipoPersonaController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_TipoLineaController_page0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-linea/page")))
  )
  private[this] lazy val controllers_TipoLineaController_page0_invoker = createInvoker(
    TipoLineaController_0.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "predenunciaCatalog",
      "controllers.TipoLineaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """tipo-linea/page""",
      """TipoLinea
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_TipoLineaController_options1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-linea/options")))
  )
  private[this] lazy val controllers_TipoLineaController_options1_invoker = createInvoker(
    TipoLineaController_0.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "predenunciaCatalog",
      "controllers.TipoLineaController",
      "options",
      Nil,
      "GET",
      this.prefix + """tipo-linea/options""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_TipoLineaController_get2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-linea/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoLineaController_get2_invoker = createInvoker(
    TipoLineaController_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "predenunciaCatalog",
      "controllers.TipoLineaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tipo-linea/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_TipoLineaController_update3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-linea/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoLineaController_update3_invoker = createInvoker(
    TipoLineaController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "predenunciaCatalog",
      "controllers.TipoLineaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """tipo-linea/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_TipoLineaController_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-linea")))
  )
  private[this] lazy val controllers_TipoLineaController_save4_invoker = createInvoker(
    TipoLineaController_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "predenunciaCatalog",
      "controllers.TipoLineaController",
      "save",
      Nil,
      "POST",
      this.prefix + """tipo-linea""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_TipoLineaController_delete5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-linea/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoLineaController_delete5_invoker = createInvoker(
    TipoLineaController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "predenunciaCatalog",
      "controllers.TipoLineaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """tipo-linea/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_TipoPersonaController_page6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-persona/page")))
  )
  private[this] lazy val controllers_TipoPersonaController_page6_invoker = createInvoker(
    TipoPersonaController_1.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "predenunciaCatalog",
      "controllers.TipoPersonaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """tipo-persona/page""",
      """TipoPersona
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_TipoPersonaController_options7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-persona/options")))
  )
  private[this] lazy val controllers_TipoPersonaController_options7_invoker = createInvoker(
    TipoPersonaController_1.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "predenunciaCatalog",
      "controllers.TipoPersonaController",
      "options",
      Nil,
      "GET",
      this.prefix + """tipo-persona/options""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_TipoPersonaController_get8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-persona/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoPersonaController_get8_invoker = createInvoker(
    TipoPersonaController_1.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "predenunciaCatalog",
      "controllers.TipoPersonaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tipo-persona/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_TipoPersonaController_update9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-persona/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoPersonaController_update9_invoker = createInvoker(
    TipoPersonaController_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "predenunciaCatalog",
      "controllers.TipoPersonaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """tipo-persona/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_TipoPersonaController_save10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-persona")))
  )
  private[this] lazy val controllers_TipoPersonaController_save10_invoker = createInvoker(
    TipoPersonaController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "predenunciaCatalog",
      "controllers.TipoPersonaController",
      "save",
      Nil,
      "POST",
      this.prefix + """tipo-persona""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_TipoPersonaController_delete11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-persona/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoPersonaController_delete11_invoker = createInvoker(
    TipoPersonaController_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "predenunciaCatalog",
      "controllers.TipoPersonaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """tipo-persona/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_TipoLineaController_page0_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_TipoLineaController_page0_invoker.call(TipoLineaController_0.page(p, s, o, f, tr))
      }
  
    // @LINE:10
    case controllers_TipoLineaController_options1_route(params@_) =>
      call { 
        controllers_TipoLineaController_options1_invoker.call(TipoLineaController_0.options())
      }
  
    // @LINE:11
    case controllers_TipoLineaController_get2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoLineaController_get2_invoker.call(TipoLineaController_0.get(id))
      }
  
    // @LINE:12
    case controllers_TipoLineaController_update3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoLineaController_update3_invoker.call(TipoLineaController_0.update(id))
      }
  
    // @LINE:13
    case controllers_TipoLineaController_save4_route(params@_) =>
      call { 
        controllers_TipoLineaController_save4_invoker.call(TipoLineaController_0.save())
      }
  
    // @LINE:14
    case controllers_TipoLineaController_delete5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoLineaController_delete5_invoker.call(TipoLineaController_0.delete(id))
      }
  
    // @LINE:18
    case controllers_TipoPersonaController_page6_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_TipoPersonaController_page6_invoker.call(TipoPersonaController_1.page(p, s, o, f, tr))
      }
  
    // @LINE:19
    case controllers_TipoPersonaController_options7_route(params@_) =>
      call { 
        controllers_TipoPersonaController_options7_invoker.call(TipoPersonaController_1.options())
      }
  
    // @LINE:20
    case controllers_TipoPersonaController_get8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoPersonaController_get8_invoker.call(TipoPersonaController_1.get(id))
      }
  
    // @LINE:21
    case controllers_TipoPersonaController_update9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoPersonaController_update9_invoker.call(TipoPersonaController_1.update(id))
      }
  
    // @LINE:22
    case controllers_TipoPersonaController_save10_route(params@_) =>
      call { 
        controllers_TipoPersonaController_save10_invoker.call(TipoPersonaController_1.save())
      }
  
    // @LINE:23
    case controllers_TipoPersonaController_delete11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoPersonaController_delete11_invoker.call(TipoPersonaController_1.delete(id))
      }
  }
}
