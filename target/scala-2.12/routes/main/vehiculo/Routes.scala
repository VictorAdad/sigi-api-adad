
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/vehiculo.routes
// @DATE:Thu Feb 15 10:13:36 CST 2018

package vehiculo

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:12
  MarcaSubMarcaController_0: controllers.MarcaSubMarcaController,
  // @LINE:23
  MotivoColorClaseController_2: controllers.MotivoColorClaseController,
  // @LINE:33
  ProcedenciaAseguradoraController_1: controllers.ProcedenciaAseguradoraController,
  // @LINE:44
  TipoUsoTipoVehiculoController_3: controllers.TipoUsoTipoVehiculoController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:12
    MarcaSubMarcaController_0: controllers.MarcaSubMarcaController,
    // @LINE:23
    MotivoColorClaseController_2: controllers.MotivoColorClaseController,
    // @LINE:33
    ProcedenciaAseguradoraController_1: controllers.ProcedenciaAseguradoraController,
    // @LINE:44
    TipoUsoTipoVehiculoController_3: controllers.TipoUsoTipoVehiculoController
  ) = this(errorHandler, MarcaSubMarcaController_0, MotivoColorClaseController_2, ProcedenciaAseguradoraController_1, TipoUsoTipoVehiculoController_3, "/")

  def withPrefix(prefix: String): Routes = {
    vehiculo.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MarcaSubMarcaController_0, MotivoColorClaseController_2, ProcedenciaAseguradoraController_1, TipoUsoTipoVehiculoController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """marca-submarca""", """controllers.MarcaSubMarcaController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """marca-submarca/page""", """controllers.MarcaSubMarcaController.page(p:Int ?= 0, s:String ?= "marca", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """marca-submarca/options""", """controllers.MarcaSubMarcaController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """marca-submarca/""" + "$" + """id<[^/]+>""", """controllers.MarcaSubMarcaController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """marca-submarca/""" + "$" + """id<[^/]+>""", """controllers.MarcaSubMarcaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """marca-submarca""", """controllers.MarcaSubMarcaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """marca-submarca/""" + "$" + """id<[^/]+>""", """controllers.MarcaSubMarcaController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """motivo-color-clase/options""", """controllers.MotivoColorClaseController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """motivo-color-clase""", """controllers.MotivoColorClaseController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """motivo-color-clase/""" + "$" + """id<[^/]+>""", """controllers.MotivoColorClaseController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """motivo-color-clase/""" + "$" + """id<[^/]+>""", """controllers.MotivoColorClaseController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """motivo-color-clase""", """controllers.MotivoColorClaseController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """motivo-color-clase/""" + "$" + """id<[^/]+>""", """controllers.MotivoColorClaseController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """procedencia-aseguradora""", """controllers.ProcedenciaAseguradoraController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """procedencia-aseguradora/page""", """controllers.ProcedenciaAseguradoraController.page(p:Int ?= 0, s:String ?= "aseguradora", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """procedencia-aseguradora/options""", """controllers.ProcedenciaAseguradoraController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """procedencia-aseguradora/""" + "$" + """id<[^/]+>""", """controllers.ProcedenciaAseguradoraController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """procedencia-aseguradora/""" + "$" + """id<[^/]+>""", """controllers.ProcedenciaAseguradoraController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """procedencia-aseguradora""", """controllers.ProcedenciaAseguradoraController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """procedencia-aseguradora/""" + "$" + """id<[^/]+>""", """controllers.ProcedenciaAseguradoraController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-uso-vehiculo""", """controllers.TipoUsoTipoVehiculoController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-uso-vehiculo/options""", """controllers.TipoUsoTipoVehiculoController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-uso-vehiculo/""" + "$" + """id<[^/]+>""", """controllers.TipoUsoTipoVehiculoController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-uso-vehiculo/""" + "$" + """id<[^/]+>""", """controllers.TipoUsoTipoVehiculoController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-uso-vehiculo""", """controllers.TipoUsoTipoVehiculoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-uso-vehiculo/""" + "$" + """id<[^/]+>""", """controllers.TipoUsoTipoVehiculoController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:12
  private[this] lazy val controllers_MarcaSubMarcaController_list0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marca-submarca")))
  )
  private[this] lazy val controllers_MarcaSubMarcaController_list0_invoker = createInvoker(
    MarcaSubMarcaController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.MarcaSubMarcaController",
      "list",
      Nil,
      "GET",
      this.prefix + """marca-submarca""",
      """MarcaSubMarca
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_MarcaSubMarcaController_page1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marca-submarca/page")))
  )
  private[this] lazy val controllers_MarcaSubMarcaController_page1_invoker = createInvoker(
    MarcaSubMarcaController_0.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.MarcaSubMarcaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """marca-submarca/page""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_MarcaSubMarcaController_options2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marca-submarca/options")))
  )
  private[this] lazy val controllers_MarcaSubMarcaController_options2_invoker = createInvoker(
    MarcaSubMarcaController_0.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.MarcaSubMarcaController",
      "options",
      Nil,
      "GET",
      this.prefix + """marca-submarca/options""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_MarcaSubMarcaController_get3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marca-submarca/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MarcaSubMarcaController_get3_invoker = createInvoker(
    MarcaSubMarcaController_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.MarcaSubMarcaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """marca-submarca/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_MarcaSubMarcaController_update4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marca-submarca/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MarcaSubMarcaController_update4_invoker = createInvoker(
    MarcaSubMarcaController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.MarcaSubMarcaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """marca-submarca/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_MarcaSubMarcaController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marca-submarca")))
  )
  private[this] lazy val controllers_MarcaSubMarcaController_save5_invoker = createInvoker(
    MarcaSubMarcaController_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.MarcaSubMarcaController",
      "save",
      Nil,
      "POST",
      this.prefix + """marca-submarca""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_MarcaSubMarcaController_delete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marca-submarca/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MarcaSubMarcaController_delete6_invoker = createInvoker(
    MarcaSubMarcaController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.MarcaSubMarcaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """marca-submarca/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_MotivoColorClaseController_options7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("motivo-color-clase/options")))
  )
  private[this] lazy val controllers_MotivoColorClaseController_options7_invoker = createInvoker(
    MotivoColorClaseController_2.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.MotivoColorClaseController",
      "options",
      Nil,
      "GET",
      this.prefix + """motivo-color-clase/options""",
      """MotivoColorClase
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_MotivoColorClaseController_list8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("motivo-color-clase")))
  )
  private[this] lazy val controllers_MotivoColorClaseController_list8_invoker = createInvoker(
    MotivoColorClaseController_2.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.MotivoColorClaseController",
      "list",
      Nil,
      "GET",
      this.prefix + """motivo-color-clase""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_MotivoColorClaseController_get9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("motivo-color-clase/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MotivoColorClaseController_get9_invoker = createInvoker(
    MotivoColorClaseController_2.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.MotivoColorClaseController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """motivo-color-clase/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_MotivoColorClaseController_update10_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("motivo-color-clase/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MotivoColorClaseController_update10_invoker = createInvoker(
    MotivoColorClaseController_2.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.MotivoColorClaseController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """motivo-color-clase/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_MotivoColorClaseController_save11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("motivo-color-clase")))
  )
  private[this] lazy val controllers_MotivoColorClaseController_save11_invoker = createInvoker(
    MotivoColorClaseController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.MotivoColorClaseController",
      "save",
      Nil,
      "POST",
      this.prefix + """motivo-color-clase""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_MotivoColorClaseController_delete12_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("motivo-color-clase/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MotivoColorClaseController_delete12_invoker = createInvoker(
    MotivoColorClaseController_2.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.MotivoColorClaseController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """motivo-color-clase/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ProcedenciaAseguradoraController_list13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("procedencia-aseguradora")))
  )
  private[this] lazy val controllers_ProcedenciaAseguradoraController_list13_invoker = createInvoker(
    ProcedenciaAseguradoraController_1.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.ProcedenciaAseguradoraController",
      "list",
      Nil,
      "GET",
      this.prefix + """procedencia-aseguradora""",
      """ProcedenciaAseguradora
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ProcedenciaAseguradoraController_page14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("procedencia-aseguradora/page")))
  )
  private[this] lazy val controllers_ProcedenciaAseguradoraController_page14_invoker = createInvoker(
    ProcedenciaAseguradoraController_1.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.ProcedenciaAseguradoraController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """procedencia-aseguradora/page""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ProcedenciaAseguradoraController_options15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("procedencia-aseguradora/options")))
  )
  private[this] lazy val controllers_ProcedenciaAseguradoraController_options15_invoker = createInvoker(
    ProcedenciaAseguradoraController_1.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.ProcedenciaAseguradoraController",
      "options",
      Nil,
      "GET",
      this.prefix + """procedencia-aseguradora/options""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ProcedenciaAseguradoraController_get16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("procedencia-aseguradora/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProcedenciaAseguradoraController_get16_invoker = createInvoker(
    ProcedenciaAseguradoraController_1.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.ProcedenciaAseguradoraController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """procedencia-aseguradora/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_ProcedenciaAseguradoraController_update17_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("procedencia-aseguradora/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProcedenciaAseguradoraController_update17_invoker = createInvoker(
    ProcedenciaAseguradoraController_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.ProcedenciaAseguradoraController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """procedencia-aseguradora/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ProcedenciaAseguradoraController_save18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("procedencia-aseguradora")))
  )
  private[this] lazy val controllers_ProcedenciaAseguradoraController_save18_invoker = createInvoker(
    ProcedenciaAseguradoraController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.ProcedenciaAseguradoraController",
      "save",
      Nil,
      "POST",
      this.prefix + """procedencia-aseguradora""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ProcedenciaAseguradoraController_delete19_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("procedencia-aseguradora/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProcedenciaAseguradoraController_delete19_invoker = createInvoker(
    ProcedenciaAseguradoraController_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.ProcedenciaAseguradoraController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """procedencia-aseguradora/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_TipoUsoTipoVehiculoController_list20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-uso-vehiculo")))
  )
  private[this] lazy val controllers_TipoUsoTipoVehiculoController_list20_invoker = createInvoker(
    TipoUsoTipoVehiculoController_3.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.TipoUsoTipoVehiculoController",
      "list",
      Nil,
      "GET",
      this.prefix + """tipo-uso-vehiculo""",
      """TipoUsoTipoVehiculo
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_TipoUsoTipoVehiculoController_options21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-uso-vehiculo/options")))
  )
  private[this] lazy val controllers_TipoUsoTipoVehiculoController_options21_invoker = createInvoker(
    TipoUsoTipoVehiculoController_3.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.TipoUsoTipoVehiculoController",
      "options",
      Nil,
      "GET",
      this.prefix + """tipo-uso-vehiculo/options""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_TipoUsoTipoVehiculoController_get22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-uso-vehiculo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoUsoTipoVehiculoController_get22_invoker = createInvoker(
    TipoUsoTipoVehiculoController_3.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.TipoUsoTipoVehiculoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tipo-uso-vehiculo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_TipoUsoTipoVehiculoController_update23_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-uso-vehiculo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoUsoTipoVehiculoController_update23_invoker = createInvoker(
    TipoUsoTipoVehiculoController_3.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.TipoUsoTipoVehiculoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """tipo-uso-vehiculo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_TipoUsoTipoVehiculoController_save24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-uso-vehiculo")))
  )
  private[this] lazy val controllers_TipoUsoTipoVehiculoController_save24_invoker = createInvoker(
    TipoUsoTipoVehiculoController_3.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.TipoUsoTipoVehiculoController",
      "save",
      Nil,
      "POST",
      this.prefix + """tipo-uso-vehiculo""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_TipoUsoTipoVehiculoController_delete25_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-uso-vehiculo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoUsoTipoVehiculoController_delete25_invoker = createInvoker(
    TipoUsoTipoVehiculoController_3.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "vehiculo",
      "controllers.TipoUsoTipoVehiculoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """tipo-uso-vehiculo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:12
    case controllers_MarcaSubMarcaController_list0_route(params@_) =>
      call { 
        controllers_MarcaSubMarcaController_list0_invoker.call(MarcaSubMarcaController_0.list)
      }
  
    // @LINE:13
    case controllers_MarcaSubMarcaController_page1_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("marca")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_MarcaSubMarcaController_page1_invoker.call(MarcaSubMarcaController_0.page(p, s, o, f, tr))
      }
  
    // @LINE:14
    case controllers_MarcaSubMarcaController_options2_route(params@_) =>
      call { 
        controllers_MarcaSubMarcaController_options2_invoker.call(MarcaSubMarcaController_0.options())
      }
  
    // @LINE:15
    case controllers_MarcaSubMarcaController_get3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MarcaSubMarcaController_get3_invoker.call(MarcaSubMarcaController_0.get(id))
      }
  
    // @LINE:16
    case controllers_MarcaSubMarcaController_update4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MarcaSubMarcaController_update4_invoker.call(MarcaSubMarcaController_0.update(id))
      }
  
    // @LINE:17
    case controllers_MarcaSubMarcaController_save5_route(params@_) =>
      call { 
        controllers_MarcaSubMarcaController_save5_invoker.call(MarcaSubMarcaController_0.save())
      }
  
    // @LINE:18
    case controllers_MarcaSubMarcaController_delete6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MarcaSubMarcaController_delete6_invoker.call(MarcaSubMarcaController_0.delete(id))
      }
  
    // @LINE:23
    case controllers_MotivoColorClaseController_options7_route(params@_) =>
      call { 
        controllers_MotivoColorClaseController_options7_invoker.call(MotivoColorClaseController_2.options())
      }
  
    // @LINE:24
    case controllers_MotivoColorClaseController_list8_route(params@_) =>
      call { 
        controllers_MotivoColorClaseController_list8_invoker.call(MotivoColorClaseController_2.list)
      }
  
    // @LINE:25
    case controllers_MotivoColorClaseController_get9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MotivoColorClaseController_get9_invoker.call(MotivoColorClaseController_2.get(id))
      }
  
    // @LINE:26
    case controllers_MotivoColorClaseController_update10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MotivoColorClaseController_update10_invoker.call(MotivoColorClaseController_2.update(id))
      }
  
    // @LINE:27
    case controllers_MotivoColorClaseController_save11_route(params@_) =>
      call { 
        controllers_MotivoColorClaseController_save11_invoker.call(MotivoColorClaseController_2.save())
      }
  
    // @LINE:28
    case controllers_MotivoColorClaseController_delete12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MotivoColorClaseController_delete12_invoker.call(MotivoColorClaseController_2.delete(id))
      }
  
    // @LINE:33
    case controllers_ProcedenciaAseguradoraController_list13_route(params@_) =>
      call { 
        controllers_ProcedenciaAseguradoraController_list13_invoker.call(ProcedenciaAseguradoraController_1.list)
      }
  
    // @LINE:34
    case controllers_ProcedenciaAseguradoraController_page14_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("aseguradora")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_ProcedenciaAseguradoraController_page14_invoker.call(ProcedenciaAseguradoraController_1.page(p, s, o, f, tr))
      }
  
    // @LINE:35
    case controllers_ProcedenciaAseguradoraController_options15_route(params@_) =>
      call { 
        controllers_ProcedenciaAseguradoraController_options15_invoker.call(ProcedenciaAseguradoraController_1.options())
      }
  
    // @LINE:36
    case controllers_ProcedenciaAseguradoraController_get16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProcedenciaAseguradoraController_get16_invoker.call(ProcedenciaAseguradoraController_1.get(id))
      }
  
    // @LINE:37
    case controllers_ProcedenciaAseguradoraController_update17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProcedenciaAseguradoraController_update17_invoker.call(ProcedenciaAseguradoraController_1.update(id))
      }
  
    // @LINE:38
    case controllers_ProcedenciaAseguradoraController_save18_route(params@_) =>
      call { 
        controllers_ProcedenciaAseguradoraController_save18_invoker.call(ProcedenciaAseguradoraController_1.save())
      }
  
    // @LINE:39
    case controllers_ProcedenciaAseguradoraController_delete19_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProcedenciaAseguradoraController_delete19_invoker.call(ProcedenciaAseguradoraController_1.delete(id))
      }
  
    // @LINE:44
    case controllers_TipoUsoTipoVehiculoController_list20_route(params@_) =>
      call { 
        controllers_TipoUsoTipoVehiculoController_list20_invoker.call(TipoUsoTipoVehiculoController_3.list)
      }
  
    // @LINE:45
    case controllers_TipoUsoTipoVehiculoController_options21_route(params@_) =>
      call { 
        controllers_TipoUsoTipoVehiculoController_options21_invoker.call(TipoUsoTipoVehiculoController_3.options())
      }
  
    // @LINE:46
    case controllers_TipoUsoTipoVehiculoController_get22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoUsoTipoVehiculoController_get22_invoker.call(TipoUsoTipoVehiculoController_3.get(id))
      }
  
    // @LINE:47
    case controllers_TipoUsoTipoVehiculoController_update23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoUsoTipoVehiculoController_update23_invoker.call(TipoUsoTipoVehiculoController_3.update(id))
      }
  
    // @LINE:48
    case controllers_TipoUsoTipoVehiculoController_save24_route(params@_) =>
      call { 
        controllers_TipoUsoTipoVehiculoController_save24_invoker.call(TipoUsoTipoVehiculoController_3.save())
      }
  
    // @LINE:49
    case controllers_TipoUsoTipoVehiculoController_delete25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoUsoTipoVehiculoController_delete25_invoker.call(TipoUsoTipoVehiculoController_3.delete(id))
      }
  }
}
