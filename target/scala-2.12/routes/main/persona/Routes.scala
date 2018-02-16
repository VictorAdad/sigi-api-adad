
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/persona.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package persona

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:10
  AdiccionController_10: controllers.AdiccionController,
  // @LINE:21
  AlfabetismoController_6: controllers.AlfabetismoController,
  // @LINE:31
  EscolaridadController_0: controllers.EscolaridadController,
  // @LINE:41
  EstadoCivilController_3: controllers.EstadoCivilController,
  // @LINE:51
  GrupoEtnicoController_5: controllers.GrupoEtnicoController,
  // @LINE:61
  IdiomaController_4: controllers.IdiomaController,
  // @LINE:71
  InterpreteController_8: controllers.InterpreteController,
  // @LINE:81
  NacionalidadesReligionController_9: controllers.NacionalidadesReligionController,
  // @LINE:91
  OcupacionController_7: controllers.OcupacionController,
  // @LINE:101
  SexoController_1: controllers.SexoController,
  // @LINE:110
  TiposDetenidosController_2: controllers.TiposDetenidosController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:10
    AdiccionController_10: controllers.AdiccionController,
    // @LINE:21
    AlfabetismoController_6: controllers.AlfabetismoController,
    // @LINE:31
    EscolaridadController_0: controllers.EscolaridadController,
    // @LINE:41
    EstadoCivilController_3: controllers.EstadoCivilController,
    // @LINE:51
    GrupoEtnicoController_5: controllers.GrupoEtnicoController,
    // @LINE:61
    IdiomaController_4: controllers.IdiomaController,
    // @LINE:71
    InterpreteController_8: controllers.InterpreteController,
    // @LINE:81
    NacionalidadesReligionController_9: controllers.NacionalidadesReligionController,
    // @LINE:91
    OcupacionController_7: controllers.OcupacionController,
    // @LINE:101
    SexoController_1: controllers.SexoController,
    // @LINE:110
    TiposDetenidosController_2: controllers.TiposDetenidosController
  ) = this(errorHandler, AdiccionController_10, AlfabetismoController_6, EscolaridadController_0, EstadoCivilController_3, GrupoEtnicoController_5, IdiomaController_4, InterpreteController_8, NacionalidadesReligionController_9, OcupacionController_7, SexoController_1, TiposDetenidosController_2, "/")

  def withPrefix(prefix: String): Routes = {
    persona.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, AdiccionController_10, AlfabetismoController_6, EscolaridadController_0, EstadoCivilController_3, GrupoEtnicoController_5, IdiomaController_4, InterpreteController_8, NacionalidadesReligionController_9, OcupacionController_7, SexoController_1, TiposDetenidosController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adiccion/page""", """controllers.AdiccionController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adiccion/options""", """controllers.AdiccionController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adiccion/""" + "$" + """id<[^/]+>""", """controllers.AdiccionController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adiccion/""" + "$" + """id<[^/]+>""", """controllers.AdiccionController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adiccion""", """controllers.AdiccionController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adiccion/""" + "$" + """id<[^/]+>""", """controllers.AdiccionController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alfabetismo/page""", """controllers.AlfabetismoController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alfabetismo/options""", """controllers.AlfabetismoController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alfabetismo/""" + "$" + """id<[^/]+>""", """controllers.AlfabetismoController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alfabetismo/""" + "$" + """id<[^/]+>""", """controllers.AlfabetismoController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alfabetismo""", """controllers.AlfabetismoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alfabetismo/""" + "$" + """id<[^/]+>""", """controllers.AlfabetismoController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """escolaridad/page""", """controllers.EscolaridadController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """escolaridad/options""", """controllers.EscolaridadController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """escolaridad/""" + "$" + """id<[^/]+>""", """controllers.EscolaridadController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """escolaridad/""" + "$" + """id<[^/]+>""", """controllers.EscolaridadController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """escolaridad""", """controllers.EscolaridadController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """escolaridad/""" + "$" + """id<[^/]+>""", """controllers.EscolaridadController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estado-civil/page""", """controllers.EstadoCivilController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estado-civil/options""", """controllers.EstadoCivilController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estado-civil/""" + "$" + """id<[^/]+>""", """controllers.EstadoCivilController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estado-civil/""" + "$" + """id<[^/]+>""", """controllers.EstadoCivilController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estado-civil""", """controllers.EstadoCivilController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estado-civil/""" + "$" + """id<[^/]+>""", """controllers.EstadoCivilController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grupo-etnico/page""", """controllers.GrupoEtnicoController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grupo-etnico/options""", """controllers.GrupoEtnicoController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grupo-etnico/""" + "$" + """id<[^/]+>""", """controllers.GrupoEtnicoController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grupo-etnico/""" + "$" + """id<[^/]+>""", """controllers.GrupoEtnicoController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grupo-etnico""", """controllers.GrupoEtnicoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grupo-etnico/""" + "$" + """id<[^/]+>""", """controllers.GrupoEtnicoController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """idioma/page""", """controllers.IdiomaController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """idioma""", """controllers.IdiomaController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """idioma/""" + "$" + """id<[^/]+>""", """controllers.IdiomaController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """idioma/""" + "$" + """id<[^/]+>""", """controllers.IdiomaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """idioma""", """controllers.IdiomaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """idioma/""" + "$" + """id<[^/]+>""", """controllers.IdiomaController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """interprete/page""", """controllers.InterpreteController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """interprete/options""", """controllers.InterpreteController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """interprete/""" + "$" + """id<[^/]+>""", """controllers.InterpreteController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """interprete/""" + "$" + """id<[^/]+>""", """controllers.InterpreteController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """interprete""", """controllers.InterpreteController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """interprete/""" + "$" + """id<[^/]+>""", """controllers.InterpreteController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nacionalidad/page""", """controllers.NacionalidadesReligionController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nacionalidad/options""", """controllers.NacionalidadesReligionController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nacionalidad/""" + "$" + """id<[^/]+>""", """controllers.NacionalidadesReligionController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nacionalidad/""" + "$" + """id<[^/]+>""", """controllers.NacionalidadesReligionController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nacionalidad""", """controllers.NacionalidadesReligionController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nacionalidad/""" + "$" + """id<[^/]+>""", """controllers.NacionalidadesReligionController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ocupacion/page""", """controllers.OcupacionController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ocupacion/options""", """controllers.OcupacionController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ocupacion/""" + "$" + """id<[^/]+>""", """controllers.OcupacionController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ocupacion/""" + "$" + """id<[^/]+>""", """controllers.OcupacionController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ocupacion""", """controllers.OcupacionController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ocupacion/""" + "$" + """id<[^/]+>""", """controllers.OcupacionController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sexo/page""", """controllers.SexoController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sexo/options""", """controllers.SexoController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sexo/""" + "$" + """id<[^/]+>""", """controllers.SexoController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sexo/""" + "$" + """id<[^/]+>""", """controllers.SexoController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sexo""", """controllers.SexoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sexo/""" + "$" + """id<[^/]+>""", """controllers.SexoController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-detenido/page""", """controllers.TiposDetenidosController.page(p:Int ?= 0, s:String ?= "tipo_detencion", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-detenido/options""", """controllers.TiposDetenidosController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-detenido""", """controllers.TiposDetenidosController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-detenido/""" + "$" + """id<[^/]+>""", """controllers.TiposDetenidosController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-detenido/""" + "$" + """id<[^/]+>""", """controllers.TiposDetenidosController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-detenido""", """controllers.TiposDetenidosController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-detenido/""" + "$" + """id<[^/]+>""", """controllers.TiposDetenidosController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_AdiccionController_page0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adiccion/page")))
  )
  private[this] lazy val controllers_AdiccionController_page0_invoker = createInvoker(
    AdiccionController_10.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.AdiccionController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """adiccion/page""",
      """Adiccion
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AdiccionController_options1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adiccion/options")))
  )
  private[this] lazy val controllers_AdiccionController_options1_invoker = createInvoker(
    AdiccionController_10.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.AdiccionController",
      "options",
      Nil,
      "GET",
      this.prefix + """adiccion/options""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AdiccionController_get2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adiccion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdiccionController_get2_invoker = createInvoker(
    AdiccionController_10.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.AdiccionController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """adiccion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_AdiccionController_update3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adiccion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdiccionController_update3_invoker = createInvoker(
    AdiccionController_10.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.AdiccionController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """adiccion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_AdiccionController_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adiccion")))
  )
  private[this] lazy val controllers_AdiccionController_save4_invoker = createInvoker(
    AdiccionController_10.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.AdiccionController",
      "save",
      Nil,
      "POST",
      this.prefix + """adiccion""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_AdiccionController_delete5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adiccion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdiccionController_delete5_invoker = createInvoker(
    AdiccionController_10.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.AdiccionController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """adiccion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_AlfabetismoController_page6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alfabetismo/page")))
  )
  private[this] lazy val controllers_AlfabetismoController_page6_invoker = createInvoker(
    AlfabetismoController_6.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.AlfabetismoController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """alfabetismo/page""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_AlfabetismoController_options7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alfabetismo/options")))
  )
  private[this] lazy val controllers_AlfabetismoController_options7_invoker = createInvoker(
    AlfabetismoController_6.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.AlfabetismoController",
      "options",
      Nil,
      "GET",
      this.prefix + """alfabetismo/options""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_AlfabetismoController_get8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alfabetismo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AlfabetismoController_get8_invoker = createInvoker(
    AlfabetismoController_6.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.AlfabetismoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """alfabetismo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_AlfabetismoController_update9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alfabetismo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AlfabetismoController_update9_invoker = createInvoker(
    AlfabetismoController_6.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.AlfabetismoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """alfabetismo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_AlfabetismoController_save10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alfabetismo")))
  )
  private[this] lazy val controllers_AlfabetismoController_save10_invoker = createInvoker(
    AlfabetismoController_6.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.AlfabetismoController",
      "save",
      Nil,
      "POST",
      this.prefix + """alfabetismo""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_AlfabetismoController_delete11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alfabetismo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AlfabetismoController_delete11_invoker = createInvoker(
    AlfabetismoController_6.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.AlfabetismoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """alfabetismo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_EscolaridadController_page12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("escolaridad/page")))
  )
  private[this] lazy val controllers_EscolaridadController_page12_invoker = createInvoker(
    EscolaridadController_0.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.EscolaridadController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """escolaridad/page""",
      """Escolaridad
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_EscolaridadController_options13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("escolaridad/options")))
  )
  private[this] lazy val controllers_EscolaridadController_options13_invoker = createInvoker(
    EscolaridadController_0.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.EscolaridadController",
      "options",
      Nil,
      "GET",
      this.prefix + """escolaridad/options""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_EscolaridadController_get14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("escolaridad/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EscolaridadController_get14_invoker = createInvoker(
    EscolaridadController_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.EscolaridadController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """escolaridad/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_EscolaridadController_update15_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("escolaridad/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EscolaridadController_update15_invoker = createInvoker(
    EscolaridadController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.EscolaridadController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """escolaridad/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_EscolaridadController_save16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("escolaridad")))
  )
  private[this] lazy val controllers_EscolaridadController_save16_invoker = createInvoker(
    EscolaridadController_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.EscolaridadController",
      "save",
      Nil,
      "POST",
      this.prefix + """escolaridad""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_EscolaridadController_delete17_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("escolaridad/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EscolaridadController_delete17_invoker = createInvoker(
    EscolaridadController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.EscolaridadController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """escolaridad/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_EstadoCivilController_page18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estado-civil/page")))
  )
  private[this] lazy val controllers_EstadoCivilController_page18_invoker = createInvoker(
    EstadoCivilController_3.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.EstadoCivilController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """estado-civil/page""",
      """Estado Civil
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_EstadoCivilController_options19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estado-civil/options")))
  )
  private[this] lazy val controllers_EstadoCivilController_options19_invoker = createInvoker(
    EstadoCivilController_3.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.EstadoCivilController",
      "options",
      Nil,
      "GET",
      this.prefix + """estado-civil/options""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_EstadoCivilController_get20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estado-civil/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstadoCivilController_get20_invoker = createInvoker(
    EstadoCivilController_3.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.EstadoCivilController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """estado-civil/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_EstadoCivilController_update21_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estado-civil/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstadoCivilController_update21_invoker = createInvoker(
    EstadoCivilController_3.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.EstadoCivilController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """estado-civil/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_EstadoCivilController_save22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estado-civil")))
  )
  private[this] lazy val controllers_EstadoCivilController_save22_invoker = createInvoker(
    EstadoCivilController_3.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.EstadoCivilController",
      "save",
      Nil,
      "POST",
      this.prefix + """estado-civil""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_EstadoCivilController_delete23_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estado-civil/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstadoCivilController_delete23_invoker = createInvoker(
    EstadoCivilController_3.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.EstadoCivilController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """estado-civil/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_GrupoEtnicoController_page24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo-etnico/page")))
  )
  private[this] lazy val controllers_GrupoEtnicoController_page24_invoker = createInvoker(
    GrupoEtnicoController_5.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.GrupoEtnicoController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """grupo-etnico/page""",
      """Grupo etnico
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_GrupoEtnicoController_options25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo-etnico/options")))
  )
  private[this] lazy val controllers_GrupoEtnicoController_options25_invoker = createInvoker(
    GrupoEtnicoController_5.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.GrupoEtnicoController",
      "options",
      Nil,
      "GET",
      this.prefix + """grupo-etnico/options""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_GrupoEtnicoController_get26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo-etnico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GrupoEtnicoController_get26_invoker = createInvoker(
    GrupoEtnicoController_5.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.GrupoEtnicoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """grupo-etnico/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_GrupoEtnicoController_update27_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo-etnico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GrupoEtnicoController_update27_invoker = createInvoker(
    GrupoEtnicoController_5.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.GrupoEtnicoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """grupo-etnico/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_GrupoEtnicoController_save28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo-etnico")))
  )
  private[this] lazy val controllers_GrupoEtnicoController_save28_invoker = createInvoker(
    GrupoEtnicoController_5.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.GrupoEtnicoController",
      "save",
      Nil,
      "POST",
      this.prefix + """grupo-etnico""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_GrupoEtnicoController_delete29_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo-etnico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GrupoEtnicoController_delete29_invoker = createInvoker(
    GrupoEtnicoController_5.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.GrupoEtnicoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """grupo-etnico/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_IdiomaController_page30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("idioma/page")))
  )
  private[this] lazy val controllers_IdiomaController_page30_invoker = createInvoker(
    IdiomaController_4.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.IdiomaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """idioma/page""",
      """Idioma
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_IdiomaController_list31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("idioma")))
  )
  private[this] lazy val controllers_IdiomaController_list31_invoker = createInvoker(
    IdiomaController_4.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.IdiomaController",
      "list",
      Nil,
      "GET",
      this.prefix + """idioma""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_IdiomaController_get32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("idioma/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IdiomaController_get32_invoker = createInvoker(
    IdiomaController_4.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.IdiomaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """idioma/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_IdiomaController_update33_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("idioma/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IdiomaController_update33_invoker = createInvoker(
    IdiomaController_4.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.IdiomaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """idioma/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_IdiomaController_save34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("idioma")))
  )
  private[this] lazy val controllers_IdiomaController_save34_invoker = createInvoker(
    IdiomaController_4.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.IdiomaController",
      "save",
      Nil,
      "POST",
      this.prefix + """idioma""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_IdiomaController_delete35_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("idioma/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IdiomaController_delete35_invoker = createInvoker(
    IdiomaController_4.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.IdiomaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """idioma/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_InterpreteController_page36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("interprete/page")))
  )
  private[this] lazy val controllers_InterpreteController_page36_invoker = createInvoker(
    InterpreteController_8.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.InterpreteController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """interprete/page""",
      """Interprete
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val controllers_InterpreteController_options37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("interprete/options")))
  )
  private[this] lazy val controllers_InterpreteController_options37_invoker = createInvoker(
    InterpreteController_8.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.InterpreteController",
      "options",
      Nil,
      "GET",
      this.prefix + """interprete/options""",
      """""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_InterpreteController_get38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("interprete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_InterpreteController_get38_invoker = createInvoker(
    InterpreteController_8.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.InterpreteController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """interprete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_InterpreteController_update39_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("interprete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_InterpreteController_update39_invoker = createInvoker(
    InterpreteController_8.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.InterpreteController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """interprete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:75
  private[this] lazy val controllers_InterpreteController_save40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("interprete")))
  )
  private[this] lazy val controllers_InterpreteController_save40_invoker = createInvoker(
    InterpreteController_8.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.InterpreteController",
      "save",
      Nil,
      "POST",
      this.prefix + """interprete""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_InterpreteController_delete41_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("interprete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_InterpreteController_delete41_invoker = createInvoker(
    InterpreteController_8.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.InterpreteController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """interprete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val controllers_NacionalidadesReligionController_page42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nacionalidad/page")))
  )
  private[this] lazy val controllers_NacionalidadesReligionController_page42_invoker = createInvoker(
    NacionalidadesReligionController_9.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.NacionalidadesReligionController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """nacionalidad/page""",
      """NacionalidadesReligion
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:82
  private[this] lazy val controllers_NacionalidadesReligionController_options43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nacionalidad/options")))
  )
  private[this] lazy val controllers_NacionalidadesReligionController_options43_invoker = createInvoker(
    NacionalidadesReligionController_9.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.NacionalidadesReligionController",
      "options",
      Nil,
      "GET",
      this.prefix + """nacionalidad/options""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_NacionalidadesReligionController_get44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nacionalidad/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NacionalidadesReligionController_get44_invoker = createInvoker(
    NacionalidadesReligionController_9.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.NacionalidadesReligionController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """nacionalidad/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:84
  private[this] lazy val controllers_NacionalidadesReligionController_update45_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nacionalidad/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NacionalidadesReligionController_update45_invoker = createInvoker(
    NacionalidadesReligionController_9.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.NacionalidadesReligionController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """nacionalidad/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_NacionalidadesReligionController_save46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nacionalidad")))
  )
  private[this] lazy val controllers_NacionalidadesReligionController_save46_invoker = createInvoker(
    NacionalidadesReligionController_9.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.NacionalidadesReligionController",
      "save",
      Nil,
      "POST",
      this.prefix + """nacionalidad""",
      """""",
      Seq()
    )
  )

  // @LINE:86
  private[this] lazy val controllers_NacionalidadesReligionController_delete47_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nacionalidad/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NacionalidadesReligionController_delete47_invoker = createInvoker(
    NacionalidadesReligionController_9.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.NacionalidadesReligionController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """nacionalidad/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_OcupacionController_page48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ocupacion/page")))
  )
  private[this] lazy val controllers_OcupacionController_page48_invoker = createInvoker(
    OcupacionController_7.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.OcupacionController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """ocupacion/page""",
      """ocupacion
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val controllers_OcupacionController_options49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ocupacion/options")))
  )
  private[this] lazy val controllers_OcupacionController_options49_invoker = createInvoker(
    OcupacionController_7.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.OcupacionController",
      "options",
      Nil,
      "GET",
      this.prefix + """ocupacion/options""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] lazy val controllers_OcupacionController_get50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ocupacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OcupacionController_get50_invoker = createInvoker(
    OcupacionController_7.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.OcupacionController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """ocupacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:94
  private[this] lazy val controllers_OcupacionController_update51_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ocupacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OcupacionController_update51_invoker = createInvoker(
    OcupacionController_7.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.OcupacionController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """ocupacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:95
  private[this] lazy val controllers_OcupacionController_save52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ocupacion")))
  )
  private[this] lazy val controllers_OcupacionController_save52_invoker = createInvoker(
    OcupacionController_7.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.OcupacionController",
      "save",
      Nil,
      "POST",
      this.prefix + """ocupacion""",
      """""",
      Seq()
    )
  )

  // @LINE:96
  private[this] lazy val controllers_OcupacionController_delete53_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ocupacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OcupacionController_delete53_invoker = createInvoker(
    OcupacionController_7.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.OcupacionController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """ocupacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_SexoController_page54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sexo/page")))
  )
  private[this] lazy val controllers_SexoController_page54_invoker = createInvoker(
    SexoController_1.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.SexoController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """sexo/page""",
      """sexo
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:102
  private[this] lazy val controllers_SexoController_options55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sexo/options")))
  )
  private[this] lazy val controllers_SexoController_options55_invoker = createInvoker(
    SexoController_1.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.SexoController",
      "options",
      Nil,
      "GET",
      this.prefix + """sexo/options""",
      """""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_SexoController_get56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sexo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SexoController_get56_invoker = createInvoker(
    SexoController_1.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.SexoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """sexo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:104
  private[this] lazy val controllers_SexoController_update57_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sexo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SexoController_update57_invoker = createInvoker(
    SexoController_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.SexoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """sexo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:105
  private[this] lazy val controllers_SexoController_save58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sexo")))
  )
  private[this] lazy val controllers_SexoController_save58_invoker = createInvoker(
    SexoController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.SexoController",
      "save",
      Nil,
      "POST",
      this.prefix + """sexo""",
      """""",
      Seq()
    )
  )

  // @LINE:106
  private[this] lazy val controllers_SexoController_delete59_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sexo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SexoController_delete59_invoker = createInvoker(
    SexoController_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.SexoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """sexo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:110
  private[this] lazy val controllers_TiposDetenidosController_page60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-detenido/page")))
  )
  private[this] lazy val controllers_TiposDetenidosController_page60_invoker = createInvoker(
    TiposDetenidosController_2.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.TiposDetenidosController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """tipo-detenido/page""",
      """TipoDetenido
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:111
  private[this] lazy val controllers_TiposDetenidosController_options61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-detenido/options")))
  )
  private[this] lazy val controllers_TiposDetenidosController_options61_invoker = createInvoker(
    TiposDetenidosController_2.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.TiposDetenidosController",
      "options",
      Nil,
      "GET",
      this.prefix + """tipo-detenido/options""",
      """""",
      Seq()
    )
  )

  // @LINE:112
  private[this] lazy val controllers_TiposDetenidosController_list62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-detenido")))
  )
  private[this] lazy val controllers_TiposDetenidosController_list62_invoker = createInvoker(
    TiposDetenidosController_2.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.TiposDetenidosController",
      "list",
      Nil,
      "GET",
      this.prefix + """tipo-detenido""",
      """""",
      Seq()
    )
  )

  // @LINE:113
  private[this] lazy val controllers_TiposDetenidosController_get63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-detenido/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TiposDetenidosController_get63_invoker = createInvoker(
    TiposDetenidosController_2.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.TiposDetenidosController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tipo-detenido/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:114
  private[this] lazy val controllers_TiposDetenidosController_update64_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-detenido/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TiposDetenidosController_update64_invoker = createInvoker(
    TiposDetenidosController_2.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.TiposDetenidosController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """tipo-detenido/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:115
  private[this] lazy val controllers_TiposDetenidosController_save65_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-detenido")))
  )
  private[this] lazy val controllers_TiposDetenidosController_save65_invoker = createInvoker(
    TiposDetenidosController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.TiposDetenidosController",
      "save",
      Nil,
      "POST",
      this.prefix + """tipo-detenido""",
      """""",
      Seq()
    )
  )

  // @LINE:116
  private[this] lazy val controllers_TiposDetenidosController_delete66_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-detenido/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TiposDetenidosController_delete66_invoker = createInvoker(
    TiposDetenidosController_2.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "persona",
      "controllers.TiposDetenidosController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """tipo-detenido/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:10
    case controllers_AdiccionController_page0_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_AdiccionController_page0_invoker.call(AdiccionController_10.page(p, s, o, f, tr))
      }
  
    // @LINE:11
    case controllers_AdiccionController_options1_route(params@_) =>
      call { 
        controllers_AdiccionController_options1_invoker.call(AdiccionController_10.options())
      }
  
    // @LINE:12
    case controllers_AdiccionController_get2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdiccionController_get2_invoker.call(AdiccionController_10.get(id))
      }
  
    // @LINE:13
    case controllers_AdiccionController_update3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdiccionController_update3_invoker.call(AdiccionController_10.update(id))
      }
  
    // @LINE:14
    case controllers_AdiccionController_save4_route(params@_) =>
      call { 
        controllers_AdiccionController_save4_invoker.call(AdiccionController_10.save())
      }
  
    // @LINE:15
    case controllers_AdiccionController_delete5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdiccionController_delete5_invoker.call(AdiccionController_10.delete(id))
      }
  
    // @LINE:21
    case controllers_AlfabetismoController_page6_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_AlfabetismoController_page6_invoker.call(AlfabetismoController_6.page(p, s, o, f, tr))
      }
  
    // @LINE:22
    case controllers_AlfabetismoController_options7_route(params@_) =>
      call { 
        controllers_AlfabetismoController_options7_invoker.call(AlfabetismoController_6.options())
      }
  
    // @LINE:23
    case controllers_AlfabetismoController_get8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AlfabetismoController_get8_invoker.call(AlfabetismoController_6.get(id))
      }
  
    // @LINE:24
    case controllers_AlfabetismoController_update9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AlfabetismoController_update9_invoker.call(AlfabetismoController_6.update(id))
      }
  
    // @LINE:25
    case controllers_AlfabetismoController_save10_route(params@_) =>
      call { 
        controllers_AlfabetismoController_save10_invoker.call(AlfabetismoController_6.save())
      }
  
    // @LINE:26
    case controllers_AlfabetismoController_delete11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AlfabetismoController_delete11_invoker.call(AlfabetismoController_6.delete(id))
      }
  
    // @LINE:31
    case controllers_EscolaridadController_page12_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_EscolaridadController_page12_invoker.call(EscolaridadController_0.page(p, s, o, f, tr))
      }
  
    // @LINE:32
    case controllers_EscolaridadController_options13_route(params@_) =>
      call { 
        controllers_EscolaridadController_options13_invoker.call(EscolaridadController_0.options())
      }
  
    // @LINE:33
    case controllers_EscolaridadController_get14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EscolaridadController_get14_invoker.call(EscolaridadController_0.get(id))
      }
  
    // @LINE:34
    case controllers_EscolaridadController_update15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EscolaridadController_update15_invoker.call(EscolaridadController_0.update(id))
      }
  
    // @LINE:35
    case controllers_EscolaridadController_save16_route(params@_) =>
      call { 
        controllers_EscolaridadController_save16_invoker.call(EscolaridadController_0.save())
      }
  
    // @LINE:36
    case controllers_EscolaridadController_delete17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EscolaridadController_delete17_invoker.call(EscolaridadController_0.delete(id))
      }
  
    // @LINE:41
    case controllers_EstadoCivilController_page18_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_EstadoCivilController_page18_invoker.call(EstadoCivilController_3.page(p, s, o, f, tr))
      }
  
    // @LINE:42
    case controllers_EstadoCivilController_options19_route(params@_) =>
      call { 
        controllers_EstadoCivilController_options19_invoker.call(EstadoCivilController_3.options())
      }
  
    // @LINE:43
    case controllers_EstadoCivilController_get20_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstadoCivilController_get20_invoker.call(EstadoCivilController_3.get(id))
      }
  
    // @LINE:44
    case controllers_EstadoCivilController_update21_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstadoCivilController_update21_invoker.call(EstadoCivilController_3.update(id))
      }
  
    // @LINE:45
    case controllers_EstadoCivilController_save22_route(params@_) =>
      call { 
        controllers_EstadoCivilController_save22_invoker.call(EstadoCivilController_3.save())
      }
  
    // @LINE:46
    case controllers_EstadoCivilController_delete23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstadoCivilController_delete23_invoker.call(EstadoCivilController_3.delete(id))
      }
  
    // @LINE:51
    case controllers_GrupoEtnicoController_page24_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_GrupoEtnicoController_page24_invoker.call(GrupoEtnicoController_5.page(p, s, o, f, tr))
      }
  
    // @LINE:52
    case controllers_GrupoEtnicoController_options25_route(params@_) =>
      call { 
        controllers_GrupoEtnicoController_options25_invoker.call(GrupoEtnicoController_5.options())
      }
  
    // @LINE:53
    case controllers_GrupoEtnicoController_get26_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GrupoEtnicoController_get26_invoker.call(GrupoEtnicoController_5.get(id))
      }
  
    // @LINE:54
    case controllers_GrupoEtnicoController_update27_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GrupoEtnicoController_update27_invoker.call(GrupoEtnicoController_5.update(id))
      }
  
    // @LINE:55
    case controllers_GrupoEtnicoController_save28_route(params@_) =>
      call { 
        controllers_GrupoEtnicoController_save28_invoker.call(GrupoEtnicoController_5.save())
      }
  
    // @LINE:56
    case controllers_GrupoEtnicoController_delete29_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GrupoEtnicoController_delete29_invoker.call(GrupoEtnicoController_5.delete(id))
      }
  
    // @LINE:61
    case controllers_IdiomaController_page30_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_IdiomaController_page30_invoker.call(IdiomaController_4.page(p, s, o, f, tr))
      }
  
    // @LINE:62
    case controllers_IdiomaController_list31_route(params@_) =>
      call { 
        controllers_IdiomaController_list31_invoker.call(IdiomaController_4.list)
      }
  
    // @LINE:63
    case controllers_IdiomaController_get32_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_IdiomaController_get32_invoker.call(IdiomaController_4.get(id))
      }
  
    // @LINE:64
    case controllers_IdiomaController_update33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_IdiomaController_update33_invoker.call(IdiomaController_4.update(id))
      }
  
    // @LINE:65
    case controllers_IdiomaController_save34_route(params@_) =>
      call { 
        controllers_IdiomaController_save34_invoker.call(IdiomaController_4.save())
      }
  
    // @LINE:66
    case controllers_IdiomaController_delete35_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_IdiomaController_delete35_invoker.call(IdiomaController_4.delete(id))
      }
  
    // @LINE:71
    case controllers_InterpreteController_page36_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_InterpreteController_page36_invoker.call(InterpreteController_8.page(p, s, o, f, tr))
      }
  
    // @LINE:72
    case controllers_InterpreteController_options37_route(params@_) =>
      call { 
        controllers_InterpreteController_options37_invoker.call(InterpreteController_8.options())
      }
  
    // @LINE:73
    case controllers_InterpreteController_get38_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InterpreteController_get38_invoker.call(InterpreteController_8.get(id))
      }
  
    // @LINE:74
    case controllers_InterpreteController_update39_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InterpreteController_update39_invoker.call(InterpreteController_8.update(id))
      }
  
    // @LINE:75
    case controllers_InterpreteController_save40_route(params@_) =>
      call { 
        controllers_InterpreteController_save40_invoker.call(InterpreteController_8.save())
      }
  
    // @LINE:76
    case controllers_InterpreteController_delete41_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InterpreteController_delete41_invoker.call(InterpreteController_8.delete(id))
      }
  
    // @LINE:81
    case controllers_NacionalidadesReligionController_page42_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_NacionalidadesReligionController_page42_invoker.call(NacionalidadesReligionController_9.page(p, s, o, f, tr))
      }
  
    // @LINE:82
    case controllers_NacionalidadesReligionController_options43_route(params@_) =>
      call { 
        controllers_NacionalidadesReligionController_options43_invoker.call(NacionalidadesReligionController_9.options())
      }
  
    // @LINE:83
    case controllers_NacionalidadesReligionController_get44_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NacionalidadesReligionController_get44_invoker.call(NacionalidadesReligionController_9.get(id))
      }
  
    // @LINE:84
    case controllers_NacionalidadesReligionController_update45_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NacionalidadesReligionController_update45_invoker.call(NacionalidadesReligionController_9.update(id))
      }
  
    // @LINE:85
    case controllers_NacionalidadesReligionController_save46_route(params@_) =>
      call { 
        controllers_NacionalidadesReligionController_save46_invoker.call(NacionalidadesReligionController_9.save())
      }
  
    // @LINE:86
    case controllers_NacionalidadesReligionController_delete47_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NacionalidadesReligionController_delete47_invoker.call(NacionalidadesReligionController_9.delete(id))
      }
  
    // @LINE:91
    case controllers_OcupacionController_page48_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_OcupacionController_page48_invoker.call(OcupacionController_7.page(p, s, o, f, tr))
      }
  
    // @LINE:92
    case controllers_OcupacionController_options49_route(params@_) =>
      call { 
        controllers_OcupacionController_options49_invoker.call(OcupacionController_7.options())
      }
  
    // @LINE:93
    case controllers_OcupacionController_get50_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OcupacionController_get50_invoker.call(OcupacionController_7.get(id))
      }
  
    // @LINE:94
    case controllers_OcupacionController_update51_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OcupacionController_update51_invoker.call(OcupacionController_7.update(id))
      }
  
    // @LINE:95
    case controllers_OcupacionController_save52_route(params@_) =>
      call { 
        controllers_OcupacionController_save52_invoker.call(OcupacionController_7.save())
      }
  
    // @LINE:96
    case controllers_OcupacionController_delete53_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OcupacionController_delete53_invoker.call(OcupacionController_7.delete(id))
      }
  
    // @LINE:101
    case controllers_SexoController_page54_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_SexoController_page54_invoker.call(SexoController_1.page(p, s, o, f, tr))
      }
  
    // @LINE:102
    case controllers_SexoController_options55_route(params@_) =>
      call { 
        controllers_SexoController_options55_invoker.call(SexoController_1.options())
      }
  
    // @LINE:103
    case controllers_SexoController_get56_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SexoController_get56_invoker.call(SexoController_1.get(id))
      }
  
    // @LINE:104
    case controllers_SexoController_update57_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SexoController_update57_invoker.call(SexoController_1.update(id))
      }
  
    // @LINE:105
    case controllers_SexoController_save58_route(params@_) =>
      call { 
        controllers_SexoController_save58_invoker.call(SexoController_1.save())
      }
  
    // @LINE:106
    case controllers_SexoController_delete59_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SexoController_delete59_invoker.call(SexoController_1.delete(id))
      }
  
    // @LINE:110
    case controllers_TiposDetenidosController_page60_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("tipo_detencion")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_TiposDetenidosController_page60_invoker.call(TiposDetenidosController_2.page(p, s, o, f, tr))
      }
  
    // @LINE:111
    case controllers_TiposDetenidosController_options61_route(params@_) =>
      call { 
        controllers_TiposDetenidosController_options61_invoker.call(TiposDetenidosController_2.options())
      }
  
    // @LINE:112
    case controllers_TiposDetenidosController_list62_route(params@_) =>
      call { 
        controllers_TiposDetenidosController_list62_invoker.call(TiposDetenidosController_2.list)
      }
  
    // @LINE:113
    case controllers_TiposDetenidosController_get63_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TiposDetenidosController_get63_invoker.call(TiposDetenidosController_2.get(id))
      }
  
    // @LINE:114
    case controllers_TiposDetenidosController_update64_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TiposDetenidosController_update64_invoker.call(TiposDetenidosController_2.update(id))
      }
  
    // @LINE:115
    case controllers_TiposDetenidosController_save65_route(params@_) =>
      call { 
        controllers_TiposDetenidosController_save65_invoker.call(TiposDetenidosController_2.save())
      }
  
    // @LINE:116
    case controllers_TiposDetenidosController_delete66_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TiposDetenidosController_delete66_invoker.call(TiposDetenidosController_2.delete(id))
      }
  }
}
