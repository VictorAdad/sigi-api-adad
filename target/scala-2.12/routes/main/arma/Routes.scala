
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/arma.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package arma

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:11
  CalibreMecanismoController_1: controllers.CalibreMecanismoController,
  // @LINE:23
  ClaseArmaController_0: controllers.ClaseArmaController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:11
    CalibreMecanismoController_1: controllers.CalibreMecanismoController,
    // @LINE:23
    ClaseArmaController_0: controllers.ClaseArmaController
  ) = this(errorHandler, CalibreMecanismoController_1, ClaseArmaController_0, "/")

  def withPrefix(prefix: String): Routes = {
    arma.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, CalibreMecanismoController_1, ClaseArmaController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calibre-mecanismo/page""", """controllers.CalibreMecanismoController.page(p:Int ?= 0, s:String ?= "mecanismo", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calibre-mecanismo/options""", """controllers.CalibreMecanismoController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calibre-mecanismo""", """controllers.CalibreMecanismoController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calibre-mecanismo/""" + "$" + """id<[^/]+>""", """controllers.CalibreMecanismoController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calibre-mecanismo/""" + "$" + """id<[^/]+>""", """controllers.CalibreMecanismoController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calibre-mecanismo""", """controllers.CalibreMecanismoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calibre-mecanismo/""" + "$" + """id<[^/]+>""", """controllers.CalibreMecanismoController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clase-arma/page""", """controllers.ClaseArmaController.page(p:Int ?= 0, s:String ?= "clase_arma", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clase-arma/options""", """controllers.ClaseArmaController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clase-arma""", """controllers.ClaseArmaController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clase-arma/""" + "$" + """id<[^/]+>""", """controllers.ClaseArmaController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clase-arma/""" + "$" + """id<[^/]+>""", """controllers.ClaseArmaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clase-arma""", """controllers.ClaseArmaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clase-arma/""" + "$" + """id<[^/]+>""", """controllers.ClaseArmaController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:11
  private[this] lazy val controllers_CalibreMecanismoController_page0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calibre-mecanismo/page")))
  )
  private[this] lazy val controllers_CalibreMecanismoController_page0_invoker = createInvoker(
    CalibreMecanismoController_1.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.CalibreMecanismoController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """calibre-mecanismo/page""",
      """CalibreMecanismo
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CalibreMecanismoController_options1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calibre-mecanismo/options")))
  )
  private[this] lazy val controllers_CalibreMecanismoController_options1_invoker = createInvoker(
    CalibreMecanismoController_1.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.CalibreMecanismoController",
      "options",
      Nil,
      "GET",
      this.prefix + """calibre-mecanismo/options""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_CalibreMecanismoController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calibre-mecanismo")))
  )
  private[this] lazy val controllers_CalibreMecanismoController_list2_invoker = createInvoker(
    CalibreMecanismoController_1.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.CalibreMecanismoController",
      "list",
      Nil,
      "GET",
      this.prefix + """calibre-mecanismo""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_CalibreMecanismoController_get3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calibre-mecanismo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CalibreMecanismoController_get3_invoker = createInvoker(
    CalibreMecanismoController_1.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.CalibreMecanismoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """calibre-mecanismo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_CalibreMecanismoController_update4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calibre-mecanismo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CalibreMecanismoController_update4_invoker = createInvoker(
    CalibreMecanismoController_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.CalibreMecanismoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """calibre-mecanismo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_CalibreMecanismoController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calibre-mecanismo")))
  )
  private[this] lazy val controllers_CalibreMecanismoController_save5_invoker = createInvoker(
    CalibreMecanismoController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.CalibreMecanismoController",
      "save",
      Nil,
      "POST",
      this.prefix + """calibre-mecanismo""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_CalibreMecanismoController_delete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calibre-mecanismo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CalibreMecanismoController_delete6_invoker = createInvoker(
    CalibreMecanismoController_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.CalibreMecanismoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """calibre-mecanismo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ClaseArmaController_page7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clase-arma/page")))
  )
  private[this] lazy val controllers_ClaseArmaController_page7_invoker = createInvoker(
    ClaseArmaController_0.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.ClaseArmaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """clase-arma/page""",
      """ClaseArma
#############################################################################################################""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ClaseArmaController_options8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clase-arma/options")))
  )
  private[this] lazy val controllers_ClaseArmaController_options8_invoker = createInvoker(
    ClaseArmaController_0.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.ClaseArmaController",
      "options",
      Nil,
      "GET",
      this.prefix + """clase-arma/options""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ClaseArmaController_list9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clase-arma")))
  )
  private[this] lazy val controllers_ClaseArmaController_list9_invoker = createInvoker(
    ClaseArmaController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.ClaseArmaController",
      "list",
      Nil,
      "GET",
      this.prefix + """clase-arma""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ClaseArmaController_get10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clase-arma/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClaseArmaController_get10_invoker = createInvoker(
    ClaseArmaController_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.ClaseArmaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """clase-arma/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ClaseArmaController_update11_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clase-arma/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClaseArmaController_update11_invoker = createInvoker(
    ClaseArmaController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.ClaseArmaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """clase-arma/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ClaseArmaController_save12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clase-arma")))
  )
  private[this] lazy val controllers_ClaseArmaController_save12_invoker = createInvoker(
    ClaseArmaController_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.ClaseArmaController",
      "save",
      Nil,
      "POST",
      this.prefix + """clase-arma""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ClaseArmaController_delete13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clase-arma/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClaseArmaController_delete13_invoker = createInvoker(
    ClaseArmaController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "arma",
      "controllers.ClaseArmaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """clase-arma/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:11
    case controllers_CalibreMecanismoController_page0_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("mecanismo")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_CalibreMecanismoController_page0_invoker.call(CalibreMecanismoController_1.page(p, s, o, f, tr))
      }
  
    // @LINE:12
    case controllers_CalibreMecanismoController_options1_route(params@_) =>
      call { 
        controllers_CalibreMecanismoController_options1_invoker.call(CalibreMecanismoController_1.options())
      }
  
    // @LINE:13
    case controllers_CalibreMecanismoController_list2_route(params@_) =>
      call { 
        controllers_CalibreMecanismoController_list2_invoker.call(CalibreMecanismoController_1.list)
      }
  
    // @LINE:14
    case controllers_CalibreMecanismoController_get3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CalibreMecanismoController_get3_invoker.call(CalibreMecanismoController_1.get(id))
      }
  
    // @LINE:15
    case controllers_CalibreMecanismoController_update4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CalibreMecanismoController_update4_invoker.call(CalibreMecanismoController_1.update(id))
      }
  
    // @LINE:16
    case controllers_CalibreMecanismoController_save5_route(params@_) =>
      call { 
        controllers_CalibreMecanismoController_save5_invoker.call(CalibreMecanismoController_1.save())
      }
  
    // @LINE:17
    case controllers_CalibreMecanismoController_delete6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CalibreMecanismoController_delete6_invoker.call(CalibreMecanismoController_1.delete(id))
      }
  
    // @LINE:23
    case controllers_ClaseArmaController_page7_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("clase_arma")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_ClaseArmaController_page7_invoker.call(ClaseArmaController_0.page(p, s, o, f, tr))
      }
  
    // @LINE:24
    case controllers_ClaseArmaController_options8_route(params@_) =>
      call { 
        controllers_ClaseArmaController_options8_invoker.call(ClaseArmaController_0.options())
      }
  
    // @LINE:25
    case controllers_ClaseArmaController_list9_route(params@_) =>
      call { 
        controllers_ClaseArmaController_list9_invoker.call(ClaseArmaController_0.list)
      }
  
    // @LINE:26
    case controllers_ClaseArmaController_get10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClaseArmaController_get10_invoker.call(ClaseArmaController_0.get(id))
      }
  
    // @LINE:27
    case controllers_ClaseArmaController_update11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClaseArmaController_update11_invoker.call(ClaseArmaController_0.update(id))
      }
  
    // @LINE:28
    case controllers_ClaseArmaController_save12_route(params@_) =>
      call { 
        controllers_ClaseArmaController_save12_invoker.call(ClaseArmaController_0.save())
      }
  
    // @LINE:29
    case controllers_ClaseArmaController_delete13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClaseArmaController_delete13_invoker.call(ClaseArmaController_0.delete(id))
      }
  }
}
