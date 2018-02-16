
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/lugar.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package lugar

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:11
  DetalleLugarController_0: controllers.DetalleLugarController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:11
    DetalleLugarController_0: controllers.DetalleLugarController
  ) = this(errorHandler, DetalleLugarController_0, "/")

  def withPrefix(prefix: String): Routes = {
    lugar.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, DetalleLugarController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """detalle-lugar""", """controllers.DetalleLugarController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """detalle-lugar/page""", """controllers.DetalleLugarController.page(p:Int ?= 0, s:String ?= "tipo_lugar", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """detalle-lugar/options""", """controllers.DetalleLugarController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """detalle-lugar/""" + "$" + """id<[^/]+>""", """controllers.DetalleLugarController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """detalle-lugar/""" + "$" + """id<[^/]+>""", """controllers.DetalleLugarController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """detalle-lugar""", """controllers.DetalleLugarController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """detalle-lugar/""" + "$" + """id<[^/]+>""", """controllers.DetalleLugarController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:11
  private[this] lazy val controllers_DetalleLugarController_list0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("detalle-lugar")))
  )
  private[this] lazy val controllers_DetalleLugarController_list0_invoker = createInvoker(
    DetalleLugarController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "lugar",
      "controllers.DetalleLugarController",
      "list",
      Nil,
      "GET",
      this.prefix + """detalle-lugar""",
      """DetalleLugar
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_DetalleLugarController_page1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("detalle-lugar/page")))
  )
  private[this] lazy val controllers_DetalleLugarController_page1_invoker = createInvoker(
    DetalleLugarController_0.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "lugar",
      "controllers.DetalleLugarController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """detalle-lugar/page""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_DetalleLugarController_options2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("detalle-lugar/options")))
  )
  private[this] lazy val controllers_DetalleLugarController_options2_invoker = createInvoker(
    DetalleLugarController_0.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "lugar",
      "controllers.DetalleLugarController",
      "options",
      Nil,
      "GET",
      this.prefix + """detalle-lugar/options""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_DetalleLugarController_get3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("detalle-lugar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DetalleLugarController_get3_invoker = createInvoker(
    DetalleLugarController_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "lugar",
      "controllers.DetalleLugarController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """detalle-lugar/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_DetalleLugarController_update4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("detalle-lugar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DetalleLugarController_update4_invoker = createInvoker(
    DetalleLugarController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "lugar",
      "controllers.DetalleLugarController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """detalle-lugar/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_DetalleLugarController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("detalle-lugar")))
  )
  private[this] lazy val controllers_DetalleLugarController_save5_invoker = createInvoker(
    DetalleLugarController_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "lugar",
      "controllers.DetalleLugarController",
      "save",
      Nil,
      "POST",
      this.prefix + """detalle-lugar""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_DetalleLugarController_delete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("detalle-lugar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DetalleLugarController_delete6_invoker = createInvoker(
    DetalleLugarController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "lugar",
      "controllers.DetalleLugarController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """detalle-lugar/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:11
    case controllers_DetalleLugarController_list0_route(params@_) =>
      call { 
        controllers_DetalleLugarController_list0_invoker.call(DetalleLugarController_0.list)
      }
  
    // @LINE:12
    case controllers_DetalleLugarController_page1_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("tipo_lugar")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_DetalleLugarController_page1_invoker.call(DetalleLugarController_0.page(p, s, o, f, tr))
      }
  
    // @LINE:13
    case controllers_DetalleLugarController_options2_route(params@_) =>
      call { 
        controllers_DetalleLugarController_options2_invoker.call(DetalleLugarController_0.options())
      }
  
    // @LINE:14
    case controllers_DetalleLugarController_get3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DetalleLugarController_get3_invoker.call(DetalleLugarController_0.get(id))
      }
  
    // @LINE:15
    case controllers_DetalleLugarController_update4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DetalleLugarController_update4_invoker.call(DetalleLugarController_0.update(id))
      }
  
    // @LINE:16
    case controllers_DetalleLugarController_save5_route(params@_) =>
      call { 
        controllers_DetalleLugarController_save5_invoker.call(DetalleLugarController_0.save())
      }
  
    // @LINE:17
    case controllers_DetalleLugarController_delete6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DetalleLugarController_delete6_invoker.call(DetalleLugarController_0.delete(id))
      }
  }
}
