
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/usuario.routes
// @DATE:Thu Feb 15 10:13:36 CST 2018

package usuario

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:12
  AgenciaController_2: controllers.AgenciaController,
  // @LINE:21
  FiscaliaController_4: controllers.FiscaliaController,
  // @LINE:30
  DistritoController_5: controllers.DistritoController,
  // @LINE:40
  BasesController_3: controllers.BasesController,
  // @LINE:49
  SubdireccionController_0: controllers.SubdireccionController,
  // @LINE:58
  TurnoController_1: controllers.TurnoController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:12
    AgenciaController_2: controllers.AgenciaController,
    // @LINE:21
    FiscaliaController_4: controllers.FiscaliaController,
    // @LINE:30
    DistritoController_5: controllers.DistritoController,
    // @LINE:40
    BasesController_3: controllers.BasesController,
    // @LINE:49
    SubdireccionController_0: controllers.SubdireccionController,
    // @LINE:58
    TurnoController_1: controllers.TurnoController
  ) = this(errorHandler, AgenciaController_2, FiscaliaController_4, DistritoController_5, BasesController_3, SubdireccionController_0, TurnoController_1, "/")

  def withPrefix(prefix: String): Routes = {
    usuario.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, AgenciaController_2, FiscaliaController_4, DistritoController_5, BasesController_3, SubdireccionController_0, TurnoController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agencia/page""", """controllers.AgenciaController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agencia/options""", """controllers.AgenciaController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agencia/""" + "$" + """id<[^/]+>""", """controllers.AgenciaController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agencia/""" + "$" + """id<[^/]+>""", """controllers.AgenciaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agencia""", """controllers.AgenciaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agencia/""" + "$" + """id<[^/]+>""", """controllers.AgenciaController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fiscalia/page""", """controllers.FiscaliaController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fiscalia/options""", """controllers.FiscaliaController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fiscalia/""" + "$" + """id<[^/]+>""", """controllers.FiscaliaController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fiscalia/""" + "$" + """id<[^/]+>""", """controllers.FiscaliaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fiscalia""", """controllers.FiscaliaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fiscalia/""" + "$" + """id<[^/]+>""", """controllers.FiscaliaController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """distrito/page""", """controllers.DistritoController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """distrito/options""", """controllers.DistritoController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """distrito/""" + "$" + """id<[^/]+>""", """controllers.DistritoController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """distrito/""" + "$" + """id<[^/]+>""", """controllers.DistritoController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """distrito""", """controllers.DistritoController.list()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """distrito""", """controllers.DistritoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """distrito/""" + "$" + """id<[^/]+>""", """controllers.DistritoController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """base/page""", """controllers.BasesController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """base/options""", """controllers.BasesController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """base/""" + "$" + """id<[^/]+>""", """controllers.BasesController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """base/""" + "$" + """id<[^/]+>""", """controllers.BasesController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """base""", """controllers.BasesController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """base/""" + "$" + """id<[^/]+>""", """controllers.BasesController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subdireccion/page""", """controllers.SubdireccionController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subdireccion/options""", """controllers.SubdireccionController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subdireccion/""" + "$" + """id<[^/]+>""", """controllers.SubdireccionController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subdireccion/""" + "$" + """id<[^/]+>""", """controllers.SubdireccionController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subdireccion""", """controllers.SubdireccionController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subdireccion/""" + "$" + """id<[^/]+>""", """controllers.SubdireccionController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """turno/page""", """controllers.TurnoController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """turno/options""", """controllers.TurnoController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """turno/""" + "$" + """id<[^/]+>""", """controllers.TurnoController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """turno/""" + "$" + """id<[^/]+>""", """controllers.TurnoController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """turno""", """controllers.TurnoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """turno/""" + "$" + """id<[^/]+>""", """controllers.TurnoController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:12
  private[this] lazy val controllers_AgenciaController_page0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agencia/page")))
  )
  private[this] lazy val controllers_AgenciaController_page0_invoker = createInvoker(
    AgenciaController_2.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.AgenciaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """agencia/page""",
      """Agencia
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_AgenciaController_options1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agencia/options")))
  )
  private[this] lazy val controllers_AgenciaController_options1_invoker = createInvoker(
    AgenciaController_2.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.AgenciaController",
      "options",
      Nil,
      "GET",
      this.prefix + """agencia/options""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_AgenciaController_get2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agencia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AgenciaController_get2_invoker = createInvoker(
    AgenciaController_2.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.AgenciaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """agencia/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_AgenciaController_update3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agencia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AgenciaController_update3_invoker = createInvoker(
    AgenciaController_2.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.AgenciaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """agencia/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AgenciaController_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agencia")))
  )
  private[this] lazy val controllers_AgenciaController_save4_invoker = createInvoker(
    AgenciaController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.AgenciaController",
      "save",
      Nil,
      "POST",
      this.prefix + """agencia""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_AgenciaController_delete5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agencia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AgenciaController_delete5_invoker = createInvoker(
    AgenciaController_2.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.AgenciaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """agencia/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_FiscaliaController_page6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fiscalia/page")))
  )
  private[this] lazy val controllers_FiscaliaController_page6_invoker = createInvoker(
    FiscaliaController_4.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.FiscaliaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """fiscalia/page""",
      """Fiscalia
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_FiscaliaController_options7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fiscalia/options")))
  )
  private[this] lazy val controllers_FiscaliaController_options7_invoker = createInvoker(
    FiscaliaController_4.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.FiscaliaController",
      "options",
      Nil,
      "GET",
      this.prefix + """fiscalia/options""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_FiscaliaController_get8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fiscalia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FiscaliaController_get8_invoker = createInvoker(
    FiscaliaController_4.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.FiscaliaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """fiscalia/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_FiscaliaController_update9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fiscalia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FiscaliaController_update9_invoker = createInvoker(
    FiscaliaController_4.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.FiscaliaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """fiscalia/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_FiscaliaController_save10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fiscalia")))
  )
  private[this] lazy val controllers_FiscaliaController_save10_invoker = createInvoker(
    FiscaliaController_4.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.FiscaliaController",
      "save",
      Nil,
      "POST",
      this.prefix + """fiscalia""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_FiscaliaController_delete11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fiscalia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FiscaliaController_delete11_invoker = createInvoker(
    FiscaliaController_4.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.FiscaliaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """fiscalia/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_DistritoController_page12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/page")))
  )
  private[this] lazy val controllers_DistritoController_page12_invoker = createInvoker(
    DistritoController_5.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.DistritoController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """distrito/page""",
      """Distrito
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_DistritoController_options13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/options")))
  )
  private[this] lazy val controllers_DistritoController_options13_invoker = createInvoker(
    DistritoController_5.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.DistritoController",
      "options",
      Nil,
      "GET",
      this.prefix + """distrito/options""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_DistritoController_get14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DistritoController_get14_invoker = createInvoker(
    DistritoController_5.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.DistritoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """distrito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_DistritoController_update15_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DistritoController_update15_invoker = createInvoker(
    DistritoController_5.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.DistritoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """distrito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_DistritoController_list16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito")))
  )
  private[this] lazy val controllers_DistritoController_list16_invoker = createInvoker(
    DistritoController_5.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.DistritoController",
      "list",
      Nil,
      "GET",
      this.prefix + """distrito""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_DistritoController_save17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito")))
  )
  private[this] lazy val controllers_DistritoController_save17_invoker = createInvoker(
    DistritoController_5.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.DistritoController",
      "save",
      Nil,
      "POST",
      this.prefix + """distrito""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_DistritoController_delete18_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DistritoController_delete18_invoker = createInvoker(
    DistritoController_5.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.DistritoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """distrito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_BasesController_page19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("base/page")))
  )
  private[this] lazy val controllers_BasesController_page19_invoker = createInvoker(
    BasesController_3.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.BasesController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """base/page""",
      """Bases
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_BasesController_options20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("base/options")))
  )
  private[this] lazy val controllers_BasesController_options20_invoker = createInvoker(
    BasesController_3.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.BasesController",
      "options",
      Nil,
      "GET",
      this.prefix + """base/options""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_BasesController_get21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("base/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BasesController_get21_invoker = createInvoker(
    BasesController_3.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.BasesController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """base/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_BasesController_update22_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("base/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BasesController_update22_invoker = createInvoker(
    BasesController_3.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.BasesController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """base/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_BasesController_save23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("base")))
  )
  private[this] lazy val controllers_BasesController_save23_invoker = createInvoker(
    BasesController_3.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.BasesController",
      "save",
      Nil,
      "POST",
      this.prefix + """base""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_BasesController_delete24_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("base/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BasesController_delete24_invoker = createInvoker(
    BasesController_3.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.BasesController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """base/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_SubdireccionController_page25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subdireccion/page")))
  )
  private[this] lazy val controllers_SubdireccionController_page25_invoker = createInvoker(
    SubdireccionController_0.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.SubdireccionController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """subdireccion/page""",
      """Subdireccion
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_SubdireccionController_options26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subdireccion/options")))
  )
  private[this] lazy val controllers_SubdireccionController_options26_invoker = createInvoker(
    SubdireccionController_0.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.SubdireccionController",
      "options",
      Nil,
      "GET",
      this.prefix + """subdireccion/options""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_SubdireccionController_get27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subdireccion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SubdireccionController_get27_invoker = createInvoker(
    SubdireccionController_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.SubdireccionController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """subdireccion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_SubdireccionController_update28_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subdireccion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SubdireccionController_update28_invoker = createInvoker(
    SubdireccionController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.SubdireccionController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """subdireccion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_SubdireccionController_save29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subdireccion")))
  )
  private[this] lazy val controllers_SubdireccionController_save29_invoker = createInvoker(
    SubdireccionController_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.SubdireccionController",
      "save",
      Nil,
      "POST",
      this.prefix + """subdireccion""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_SubdireccionController_delete30_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subdireccion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SubdireccionController_delete30_invoker = createInvoker(
    SubdireccionController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.SubdireccionController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """subdireccion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_TurnoController_page31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("turno/page")))
  )
  private[this] lazy val controllers_TurnoController_page31_invoker = createInvoker(
    TurnoController_1.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.TurnoController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """turno/page""",
      """Turno
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_TurnoController_options32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("turno/options")))
  )
  private[this] lazy val controllers_TurnoController_options32_invoker = createInvoker(
    TurnoController_1.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.TurnoController",
      "options",
      Nil,
      "GET",
      this.prefix + """turno/options""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_TurnoController_get33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("turno/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TurnoController_get33_invoker = createInvoker(
    TurnoController_1.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.TurnoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """turno/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_TurnoController_update34_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("turno/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TurnoController_update34_invoker = createInvoker(
    TurnoController_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.TurnoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """turno/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_TurnoController_save35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("turno")))
  )
  private[this] lazy val controllers_TurnoController_save35_invoker = createInvoker(
    TurnoController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.TurnoController",
      "save",
      Nil,
      "POST",
      this.prefix + """turno""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_TurnoController_delete36_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("turno/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TurnoController_delete36_invoker = createInvoker(
    TurnoController_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "usuario",
      "controllers.TurnoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """turno/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:12
    case controllers_AgenciaController_page0_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_AgenciaController_page0_invoker.call(AgenciaController_2.page(p, s, o, f, tr))
      }
  
    // @LINE:13
    case controllers_AgenciaController_options1_route(params@_) =>
      call { 
        controllers_AgenciaController_options1_invoker.call(AgenciaController_2.options())
      }
  
    // @LINE:14
    case controllers_AgenciaController_get2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AgenciaController_get2_invoker.call(AgenciaController_2.get(id))
      }
  
    // @LINE:15
    case controllers_AgenciaController_update3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AgenciaController_update3_invoker.call(AgenciaController_2.update(id))
      }
  
    // @LINE:16
    case controllers_AgenciaController_save4_route(params@_) =>
      call { 
        controllers_AgenciaController_save4_invoker.call(AgenciaController_2.save())
      }
  
    // @LINE:17
    case controllers_AgenciaController_delete5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AgenciaController_delete5_invoker.call(AgenciaController_2.delete(id))
      }
  
    // @LINE:21
    case controllers_FiscaliaController_page6_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_FiscaliaController_page6_invoker.call(FiscaliaController_4.page(p, s, o, f, tr))
      }
  
    // @LINE:22
    case controllers_FiscaliaController_options7_route(params@_) =>
      call { 
        controllers_FiscaliaController_options7_invoker.call(FiscaliaController_4.options())
      }
  
    // @LINE:23
    case controllers_FiscaliaController_get8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FiscaliaController_get8_invoker.call(FiscaliaController_4.get(id))
      }
  
    // @LINE:24
    case controllers_FiscaliaController_update9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FiscaliaController_update9_invoker.call(FiscaliaController_4.update(id))
      }
  
    // @LINE:25
    case controllers_FiscaliaController_save10_route(params@_) =>
      call { 
        controllers_FiscaliaController_save10_invoker.call(FiscaliaController_4.save())
      }
  
    // @LINE:26
    case controllers_FiscaliaController_delete11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FiscaliaController_delete11_invoker.call(FiscaliaController_4.delete(id))
      }
  
    // @LINE:30
    case controllers_DistritoController_page12_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_DistritoController_page12_invoker.call(DistritoController_5.page(p, s, o, f, tr))
      }
  
    // @LINE:31
    case controllers_DistritoController_options13_route(params@_) =>
      call { 
        controllers_DistritoController_options13_invoker.call(DistritoController_5.options())
      }
  
    // @LINE:32
    case controllers_DistritoController_get14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DistritoController_get14_invoker.call(DistritoController_5.get(id))
      }
  
    // @LINE:33
    case controllers_DistritoController_update15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DistritoController_update15_invoker.call(DistritoController_5.update(id))
      }
  
    // @LINE:34
    case controllers_DistritoController_list16_route(params@_) =>
      call { 
        controllers_DistritoController_list16_invoker.call(DistritoController_5.list())
      }
  
    // @LINE:35
    case controllers_DistritoController_save17_route(params@_) =>
      call { 
        controllers_DistritoController_save17_invoker.call(DistritoController_5.save())
      }
  
    // @LINE:36
    case controllers_DistritoController_delete18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DistritoController_delete18_invoker.call(DistritoController_5.delete(id))
      }
  
    // @LINE:40
    case controllers_BasesController_page19_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_BasesController_page19_invoker.call(BasesController_3.page(p, s, o, f, tr))
      }
  
    // @LINE:41
    case controllers_BasesController_options20_route(params@_) =>
      call { 
        controllers_BasesController_options20_invoker.call(BasesController_3.options())
      }
  
    // @LINE:42
    case controllers_BasesController_get21_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BasesController_get21_invoker.call(BasesController_3.get(id))
      }
  
    // @LINE:43
    case controllers_BasesController_update22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BasesController_update22_invoker.call(BasesController_3.update(id))
      }
  
    // @LINE:44
    case controllers_BasesController_save23_route(params@_) =>
      call { 
        controllers_BasesController_save23_invoker.call(BasesController_3.save())
      }
  
    // @LINE:45
    case controllers_BasesController_delete24_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BasesController_delete24_invoker.call(BasesController_3.delete(id))
      }
  
    // @LINE:49
    case controllers_SubdireccionController_page25_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_SubdireccionController_page25_invoker.call(SubdireccionController_0.page(p, s, o, f, tr))
      }
  
    // @LINE:50
    case controllers_SubdireccionController_options26_route(params@_) =>
      call { 
        controllers_SubdireccionController_options26_invoker.call(SubdireccionController_0.options())
      }
  
    // @LINE:51
    case controllers_SubdireccionController_get27_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SubdireccionController_get27_invoker.call(SubdireccionController_0.get(id))
      }
  
    // @LINE:52
    case controllers_SubdireccionController_update28_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SubdireccionController_update28_invoker.call(SubdireccionController_0.update(id))
      }
  
    // @LINE:53
    case controllers_SubdireccionController_save29_route(params@_) =>
      call { 
        controllers_SubdireccionController_save29_invoker.call(SubdireccionController_0.save())
      }
  
    // @LINE:54
    case controllers_SubdireccionController_delete30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SubdireccionController_delete30_invoker.call(SubdireccionController_0.delete(id))
      }
  
    // @LINE:58
    case controllers_TurnoController_page31_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_TurnoController_page31_invoker.call(TurnoController_1.page(p, s, o, f, tr))
      }
  
    // @LINE:59
    case controllers_TurnoController_options32_route(params@_) =>
      call { 
        controllers_TurnoController_options32_invoker.call(TurnoController_1.options())
      }
  
    // @LINE:60
    case controllers_TurnoController_get33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TurnoController_get33_invoker.call(TurnoController_1.get(id))
      }
  
    // @LINE:61
    case controllers_TurnoController_update34_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TurnoController_update34_invoker.call(TurnoController_1.update(id))
      }
  
    // @LINE:62
    case controllers_TurnoController_save35_route(params@_) =>
      call { 
        controllers_TurnoController_save35_invoker.call(TurnoController_1.save())
      }
  
    // @LINE:63
    case controllers_TurnoController_delete36_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TurnoController_delete36_invoker.call(TurnoController_1.delete(id))
      }
  }
}
