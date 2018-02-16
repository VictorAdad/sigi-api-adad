
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/catalogos.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package catalogos

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  arma_Routes_6: arma.Routes,
  // @LINE:8
  lugar_Routes_9: lugar.Routes,
  // @LINE:9
  mediaFiliacion_Routes_0: mediaFiliacion.Routes,
  // @LINE:10
  persona_Routes_8: persona.Routes,
  // @LINE:11
  relacion_Routes_3: relacion.Routes,
  // @LINE:12
  vehiculo_Routes_1: vehiculo.Routes,
  // @LINE:13
  usuario_Routes_10: usuario.Routes,
  // @LINE:14
  solicitudPreliminarCatalog_Routes_7: solicitudPreliminarCatalog.Routes,
  // @LINE:15
  entrevistaCatalog_Routes_2: entrevistaCatalog.Routes,
  // @LINE:16
  predenunciaCatalog_Routes_5: predenunciaCatalog.Routes,
  // @LINE:17
  determinacionCatalog_Routes_4: determinacionCatalog.Routes,
  // @LINE:23
  ColoniaController_9: controllers.ColoniaController,
  // @LINE:35
  EstadoController_4: controllers.EstadoController,
  // @LINE:46
  MunicipioController_5: controllers.MunicipioController,
  // @LINE:57
  PaisController_3: controllers.PaisController,
  // @LINE:67
  LocalidadController_2: controllers.LocalidadController,
  // @LINE:78
  NacionalidadesReligionController_8: controllers.NacionalidadesReligionController,
  // @LINE:87
  Delitos_0: controllers.Delitos,
  // @LINE:97
  TiposDomiciliosController_1: controllers.TiposDomiciliosController,
  // @LINE:107
  TipoIntervinienteController_7: controllers.TipoIntervinienteController,
  // @LINE:116
  CatalogosSincronizacion_6: controllers.CatalogosSincronizacion,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    arma_Routes_6: arma.Routes,
    // @LINE:8
    lugar_Routes_9: lugar.Routes,
    // @LINE:9
    mediaFiliacion_Routes_0: mediaFiliacion.Routes,
    // @LINE:10
    persona_Routes_8: persona.Routes,
    // @LINE:11
    relacion_Routes_3: relacion.Routes,
    // @LINE:12
    vehiculo_Routes_1: vehiculo.Routes,
    // @LINE:13
    usuario_Routes_10: usuario.Routes,
    // @LINE:14
    solicitudPreliminarCatalog_Routes_7: solicitudPreliminarCatalog.Routes,
    // @LINE:15
    entrevistaCatalog_Routes_2: entrevistaCatalog.Routes,
    // @LINE:16
    predenunciaCatalog_Routes_5: predenunciaCatalog.Routes,
    // @LINE:17
    determinacionCatalog_Routes_4: determinacionCatalog.Routes,
    // @LINE:23
    ColoniaController_9: controllers.ColoniaController,
    // @LINE:35
    EstadoController_4: controllers.EstadoController,
    // @LINE:46
    MunicipioController_5: controllers.MunicipioController,
    // @LINE:57
    PaisController_3: controllers.PaisController,
    // @LINE:67
    LocalidadController_2: controllers.LocalidadController,
    // @LINE:78
    NacionalidadesReligionController_8: controllers.NacionalidadesReligionController,
    // @LINE:87
    Delitos_0: controllers.Delitos,
    // @LINE:97
    TiposDomiciliosController_1: controllers.TiposDomiciliosController,
    // @LINE:107
    TipoIntervinienteController_7: controllers.TipoIntervinienteController,
    // @LINE:116
    CatalogosSincronizacion_6: controllers.CatalogosSincronizacion
  ) = this(errorHandler, arma_Routes_6, lugar_Routes_9, mediaFiliacion_Routes_0, persona_Routes_8, relacion_Routes_3, vehiculo_Routes_1, usuario_Routes_10, solicitudPreliminarCatalog_Routes_7, entrevistaCatalog_Routes_2, predenunciaCatalog_Routes_5, determinacionCatalog_Routes_4, ColoniaController_9, EstadoController_4, MunicipioController_5, PaisController_3, LocalidadController_2, NacionalidadesReligionController_8, Delitos_0, TiposDomiciliosController_1, TipoIntervinienteController_7, CatalogosSincronizacion_6, "/")

  def withPrefix(prefix: String): Routes = {
    catalogos.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, arma_Routes_6, lugar_Routes_9, mediaFiliacion_Routes_0, persona_Routes_8, relacion_Routes_3, vehiculo_Routes_1, usuario_Routes_10, solicitudPreliminarCatalog_Routes_7, entrevistaCatalog_Routes_2, predenunciaCatalog_Routes_5, determinacionCatalog_Routes_4, ColoniaController_9, EstadoController_4, MunicipioController_5, PaisController_3, LocalidadController_2, NacionalidadesReligionController_8, Delitos_0, TiposDomiciliosController_1, TipoIntervinienteController_7, CatalogosSincronizacion_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    prefixed_arma_Routes_6_0.router.documentation,
    prefixed_lugar_Routes_9_1.router.documentation,
    prefixed_mediaFiliacion_Routes_0_2.router.documentation,
    prefixed_persona_Routes_8_3.router.documentation,
    prefixed_relacion_Routes_3_4.router.documentation,
    prefixed_vehiculo_Routes_1_5.router.documentation,
    prefixed_usuario_Routes_10_6.router.documentation,
    prefixed_solicitudPreliminarCatalog_Routes_7_7.router.documentation,
    prefixed_entrevistaCatalog_Routes_2_8.router.documentation,
    prefixed_predenunciaCatalog_Routes_5_9.router.documentation,
    prefixed_determinacionCatalog_Routes_4_10.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """colonia/municipio/""" + "$" + """idMunicipio<[^/]+>/options""", """controllers.ColoniaController.options(idMunicipio:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """colonia/page""", """controllers.ColoniaController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """colonia/""" + "$" + """id<[^/]+>""", """controllers.ColoniaController.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """colonia""", """controllers.ColoniaController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """colonia/municipio/""" + "$" + """idMunicipio<[^/]+>""", """controllers.ColoniaController.listByMunicipio(idMunicipio:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """colonia/""" + "$" + """id<[^/]+>""", """controllers.ColoniaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """colonia""", """controllers.ColoniaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """colonia/""" + "$" + """id<[^/]+>""", """controllers.ColoniaController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estado/page""", """controllers.EstadoController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estado/pais/""" + "$" + """idPais<[^/]+>/options""", """controllers.EstadoController.options(idPais:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estado/""" + "$" + """id<[^/]+>""", """controllers.EstadoController.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estado""", """controllers.EstadoController.list()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estado/""" + "$" + """id<[^/]+>""", """controllers.EstadoController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estado""", """controllers.EstadoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estado/""" + "$" + """id<[^/]+>""", """controllers.EstadoController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """municipio/page""", """controllers.MunicipioController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """municipio/estado/""" + "$" + """idEstado<[^/]+>/options""", """controllers.MunicipioController.options(idEstado:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """municipio/""" + "$" + """id<[^/]+>""", """controllers.MunicipioController.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """municipio""", """controllers.MunicipioController.list()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """municipio/""" + "$" + """id<[^/]+>""", """controllers.MunicipioController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """municipio""", """controllers.MunicipioController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """municipio/""" + "$" + """id<[^/]+>""", """controllers.MunicipioController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pais/page""", """controllers.PaisController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pais/options""", """controllers.PaisController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pais/""" + "$" + """id<[^/]+>""", """controllers.PaisController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pais/""" + "$" + """id<[^/]+>""", """controllers.PaisController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pais""", """controllers.PaisController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pais/""" + "$" + """id<[^/]+>""", """controllers.PaisController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """localidad/page""", """controllers.LocalidadController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """localidad/pais/""" + "$" + """idPais<[^/]+>/options""", """controllers.LocalidadController.options(idPais:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """localidad/municipio/""" + "$" + """idMunicipio<[^/]+>/options""", """controllers.LocalidadController.optionsByMunicipio(idMunicipio:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """localidad/""" + "$" + """id<[^/]+>""", """controllers.LocalidadController.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """localidad""", """controllers.LocalidadController.list()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """localidad/""" + "$" + """id<[^/]+>""", """controllers.LocalidadController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """localidad""", """controllers.LocalidadController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """localidad/""" + "$" + """id<[^/]+>""", """controllers.LocalidadController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nacionalidad-religion""", """controllers.NacionalidadesReligionController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nacionalidad-religion/""" + "$" + """id<[^/]+>""", """controllers.NacionalidadesReligionController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nacionalidad-religion/""" + "$" + """id<[^/]+>""", """controllers.NacionalidadesReligionController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nacionalidad-religion""", """controllers.NacionalidadesReligionController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nacionalidad-religion/""" + "$" + """id<[^/]+>""", """controllers.NacionalidadesReligionController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos/search""", """controllers.Delitos.getByName(name:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos/page""", """controllers.Delitos.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos/""" + "$" + """id<[^/]+>""", """controllers.Delitos.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos""", """controllers.Delitos.list()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos/""" + "$" + """id<[^/]+>""", """controllers.Delitos.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos""", """controllers.Delitos.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos/""" + "$" + """id<[^/]+>""", """controllers.Delitos.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-domicilio/page""", """controllers.TiposDomiciliosController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-domicilio/options""", """controllers.TiposDomiciliosController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-domicilio""", """controllers.TiposDomiciliosController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-domicilio/""" + "$" + """id<[^/]+>""", """controllers.TiposDomiciliosController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-domicilio/""" + "$" + """id<[^/]+>""", """controllers.TiposDomiciliosController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-domicilio""", """controllers.TiposDomiciliosController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-domicilio/""" + "$" + """id<[^/]+>""", """controllers.TiposDomiciliosController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipos-intervinientes/page""", """controllers.TipoIntervinienteController.page(p:Int ?= 0, s:String ?= "tipo", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipos-intervinientes/options""", """controllers.TipoIntervinienteController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipos-intervinientes/""" + "$" + """id<[^/]+>""", """controllers.TipoIntervinienteController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipos-intervinientes/""" + "$" + """id<[^/]+>""", """controllers.TipoIntervinienteController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipos-intervinientes""", """controllers.TipoIntervinienteController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipos-intervinientes/""" + "$" + """id<[^/]+>""", """controllers.TipoIntervinienteController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sincronizacion""", """controllers.CatalogosSincronizacion.list"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] val prefixed_arma_Routes_6_0 = Include(arma_Routes_6.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "arma/"))

  // @LINE:8
  private[this] val prefixed_lugar_Routes_9_1 = Include(lugar_Routes_9.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "lugar/"))

  // @LINE:9
  private[this] val prefixed_mediaFiliacion_Routes_0_2 = Include(mediaFiliacion_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "media-filiacion/"))

  // @LINE:10
  private[this] val prefixed_persona_Routes_8_3 = Include(persona_Routes_8.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "persona/"))

  // @LINE:11
  private[this] val prefixed_relacion_Routes_3_4 = Include(relacion_Routes_3.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "relacion/"))

  // @LINE:12
  private[this] val prefixed_vehiculo_Routes_1_5 = Include(vehiculo_Routes_1.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "vehiculo/"))

  // @LINE:13
  private[this] val prefixed_usuario_Routes_10_6 = Include(usuario_Routes_10.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "usuario/"))

  // @LINE:14
  private[this] val prefixed_solicitudPreliminarCatalog_Routes_7_7 = Include(solicitudPreliminarCatalog_Routes_7.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "solicitud-preliminar/"))

  // @LINE:15
  private[this] val prefixed_entrevistaCatalog_Routes_2_8 = Include(entrevistaCatalog_Routes_2.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "entrevista/"))

  // @LINE:16
  private[this] val prefixed_predenunciaCatalog_Routes_5_9 = Include(predenunciaCatalog_Routes_5.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "predenuncia/"))

  // @LINE:17
  private[this] val prefixed_determinacionCatalog_Routes_4_10 = Include(determinacionCatalog_Routes_4.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "determinacion/"))

  // @LINE:23
  private[this] lazy val controllers_ColoniaController_options11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("colonia/municipio/"), DynamicPart("idMunicipio", """[^/]+""",true), StaticPart("/options")))
  )
  private[this] lazy val controllers_ColoniaController_options11_invoker = createInvoker(
    ColoniaController_9.options(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.ColoniaController",
      "options",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """colonia/municipio/""" + "$" + """idMunicipio<[^/]+>/options""",
      """Colonia
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ColoniaController_page12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("colonia/page")))
  )
  private[this] lazy val controllers_ColoniaController_page12_invoker = createInvoker(
    ColoniaController_9.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.ColoniaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """colonia/page""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ColoniaController_get13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("colonia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ColoniaController_get13_invoker = createInvoker(
    ColoniaController_9.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.ColoniaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """colonia/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ColoniaController_list14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("colonia")))
  )
  private[this] lazy val controllers_ColoniaController_list14_invoker = createInvoker(
    ColoniaController_9.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.ColoniaController",
      "list",
      Nil,
      "GET",
      this.prefix + """colonia""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ColoniaController_listByMunicipio15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("colonia/municipio/"), DynamicPart("idMunicipio", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ColoniaController_listByMunicipio15_invoker = createInvoker(
    ColoniaController_9.listByMunicipio(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.ColoniaController",
      "listByMunicipio",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """colonia/municipio/""" + "$" + """idMunicipio<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ColoniaController_update16_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("colonia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ColoniaController_update16_invoker = createInvoker(
    ColoniaController_9.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.ColoniaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """colonia/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ColoniaController_save17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("colonia")))
  )
  private[this] lazy val controllers_ColoniaController_save17_invoker = createInvoker(
    ColoniaController_9.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.ColoniaController",
      "save",
      Nil,
      "POST",
      this.prefix + """colonia""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ColoniaController_delete18_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("colonia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ColoniaController_delete18_invoker = createInvoker(
    ColoniaController_9.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.ColoniaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """colonia/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_EstadoController_page19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estado/page")))
  )
  private[this] lazy val controllers_EstadoController_page19_invoker = createInvoker(
    EstadoController_4.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.EstadoController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """estado/page""",
      """Estado
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_EstadoController_options20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estado/pais/"), DynamicPart("idPais", """[^/]+""",true), StaticPart("/options")))
  )
  private[this] lazy val controllers_EstadoController_options20_invoker = createInvoker(
    EstadoController_4.options(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.EstadoController",
      "options",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """estado/pais/""" + "$" + """idPais<[^/]+>/options""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_EstadoController_get21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estado/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstadoController_get21_invoker = createInvoker(
    EstadoController_4.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.EstadoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """estado/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_EstadoController_list22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estado")))
  )
  private[this] lazy val controllers_EstadoController_list22_invoker = createInvoker(
    EstadoController_4.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.EstadoController",
      "list",
      Nil,
      "GET",
      this.prefix + """estado""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_EstadoController_update23_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estado/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstadoController_update23_invoker = createInvoker(
    EstadoController_4.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.EstadoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """estado/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_EstadoController_save24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estado")))
  )
  private[this] lazy val controllers_EstadoController_save24_invoker = createInvoker(
    EstadoController_4.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.EstadoController",
      "save",
      Nil,
      "POST",
      this.prefix + """estado""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_EstadoController_delete25_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estado/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstadoController_delete25_invoker = createInvoker(
    EstadoController_4.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.EstadoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """estado/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_MunicipioController_page26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("municipio/page")))
  )
  private[this] lazy val controllers_MunicipioController_page26_invoker = createInvoker(
    MunicipioController_5.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.MunicipioController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """municipio/page""",
      """Municipio
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_MunicipioController_options27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("municipio/estado/"), DynamicPart("idEstado", """[^/]+""",true), StaticPart("/options")))
  )
  private[this] lazy val controllers_MunicipioController_options27_invoker = createInvoker(
    MunicipioController_5.options(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.MunicipioController",
      "options",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """municipio/estado/""" + "$" + """idEstado<[^/]+>/options""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_MunicipioController_get28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("municipio/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MunicipioController_get28_invoker = createInvoker(
    MunicipioController_5.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.MunicipioController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """municipio/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_MunicipioController_list29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("municipio")))
  )
  private[this] lazy val controllers_MunicipioController_list29_invoker = createInvoker(
    MunicipioController_5.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.MunicipioController",
      "list",
      Nil,
      "GET",
      this.prefix + """municipio""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_MunicipioController_update30_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("municipio/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MunicipioController_update30_invoker = createInvoker(
    MunicipioController_5.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.MunicipioController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """municipio/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_MunicipioController_save31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("municipio")))
  )
  private[this] lazy val controllers_MunicipioController_save31_invoker = createInvoker(
    MunicipioController_5.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.MunicipioController",
      "save",
      Nil,
      "POST",
      this.prefix + """municipio""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_MunicipioController_delete32_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("municipio/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MunicipioController_delete32_invoker = createInvoker(
    MunicipioController_5.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.MunicipioController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """municipio/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_PaisController_page33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pais/page")))
  )
  private[this] lazy val controllers_PaisController_page33_invoker = createInvoker(
    PaisController_3.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.PaisController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """pais/page""",
      """Pais
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_PaisController_options34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pais/options")))
  )
  private[this] lazy val controllers_PaisController_options34_invoker = createInvoker(
    PaisController_3.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.PaisController",
      "options",
      Nil,
      "GET",
      this.prefix + """pais/options""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_PaisController_get35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pais/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaisController_get35_invoker = createInvoker(
    PaisController_3.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.PaisController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """pais/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_PaisController_update36_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pais/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaisController_update36_invoker = createInvoker(
    PaisController_3.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.PaisController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """pais/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_PaisController_save37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pais")))
  )
  private[this] lazy val controllers_PaisController_save37_invoker = createInvoker(
    PaisController_3.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.PaisController",
      "save",
      Nil,
      "POST",
      this.prefix + """pais""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_PaisController_delete38_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pais/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaisController_delete38_invoker = createInvoker(
    PaisController_3.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.PaisController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """pais/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_LocalidadController_page39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("localidad/page")))
  )
  private[this] lazy val controllers_LocalidadController_page39_invoker = createInvoker(
    LocalidadController_2.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.LocalidadController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """localidad/page""",
      """Localidad
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val controllers_LocalidadController_options40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("localidad/pais/"), DynamicPart("idPais", """[^/]+""",true), StaticPart("/options")))
  )
  private[this] lazy val controllers_LocalidadController_options40_invoker = createInvoker(
    LocalidadController_2.options(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.LocalidadController",
      "options",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """localidad/pais/""" + "$" + """idPais<[^/]+>/options""",
      """""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_LocalidadController_optionsByMunicipio41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("localidad/municipio/"), DynamicPart("idMunicipio", """[^/]+""",true), StaticPart("/options")))
  )
  private[this] lazy val controllers_LocalidadController_optionsByMunicipio41_invoker = createInvoker(
    LocalidadController_2.optionsByMunicipio(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.LocalidadController",
      "optionsByMunicipio",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """localidad/municipio/""" + "$" + """idMunicipio<[^/]+>/options""",
      """""",
      Seq()
    )
  )

  // @LINE:70
  private[this] lazy val controllers_LocalidadController_get42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("localidad/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocalidadController_get42_invoker = createInvoker(
    LocalidadController_2.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.LocalidadController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """localidad/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_LocalidadController_list43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("localidad")))
  )
  private[this] lazy val controllers_LocalidadController_list43_invoker = createInvoker(
    LocalidadController_2.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.LocalidadController",
      "list",
      Nil,
      "GET",
      this.prefix + """localidad""",
      """""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val controllers_LocalidadController_update44_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("localidad/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocalidadController_update44_invoker = createInvoker(
    LocalidadController_2.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.LocalidadController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """localidad/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_LocalidadController_save45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("localidad")))
  )
  private[this] lazy val controllers_LocalidadController_save45_invoker = createInvoker(
    LocalidadController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.LocalidadController",
      "save",
      Nil,
      "POST",
      this.prefix + """localidad""",
      """""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_LocalidadController_delete46_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("localidad/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocalidadController_delete46_invoker = createInvoker(
    LocalidadController_2.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.LocalidadController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """localidad/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val controllers_NacionalidadesReligionController_list47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nacionalidad-religion")))
  )
  private[this] lazy val controllers_NacionalidadesReligionController_list47_invoker = createInvoker(
    NacionalidadesReligionController_8.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.NacionalidadesReligionController",
      "list",
      Nil,
      "GET",
      this.prefix + """nacionalidad-religion""",
      """NacionalidadesReligion
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_NacionalidadesReligionController_get48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nacionalidad-religion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NacionalidadesReligionController_get48_invoker = createInvoker(
    NacionalidadesReligionController_8.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.NacionalidadesReligionController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """nacionalidad-religion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val controllers_NacionalidadesReligionController_update49_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nacionalidad-religion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NacionalidadesReligionController_update49_invoker = createInvoker(
    NacionalidadesReligionController_8.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.NacionalidadesReligionController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """nacionalidad-religion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val controllers_NacionalidadesReligionController_save50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nacionalidad-religion")))
  )
  private[this] lazy val controllers_NacionalidadesReligionController_save50_invoker = createInvoker(
    NacionalidadesReligionController_8.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.NacionalidadesReligionController",
      "save",
      Nil,
      "POST",
      this.prefix + """nacionalidad-religion""",
      """""",
      Seq()
    )
  )

  // @LINE:82
  private[this] lazy val controllers_NacionalidadesReligionController_delete51_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nacionalidad-religion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NacionalidadesReligionController_delete51_invoker = createInvoker(
    NacionalidadesReligionController_8.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.NacionalidadesReligionController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """nacionalidad-religion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:87
  private[this] lazy val controllers_Delitos_getByName52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos/search")))
  )
  private[this] lazy val controllers_Delitos_getByName52_invoker = createInvoker(
    Delitos_0.getByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.Delitos",
      "getByName",
      Seq(classOf[String]),
      "GET",
      this.prefix + """delitos/search""",
      """Delitos
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:88
  private[this] lazy val controllers_Delitos_page53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos/page")))
  )
  private[this] lazy val controllers_Delitos_page53_invoker = createInvoker(
    Delitos_0.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.Delitos",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """delitos/page""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_Delitos_get54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Delitos_get54_invoker = createInvoker(
    Delitos_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.Delitos",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delitos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val controllers_Delitos_list55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos")))
  )
  private[this] lazy val controllers_Delitos_list55_invoker = createInvoker(
    Delitos_0.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.Delitos",
      "list",
      Nil,
      "GET",
      this.prefix + """delitos""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_Delitos_update56_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Delitos_update56_invoker = createInvoker(
    Delitos_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.Delitos",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """delitos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val controllers_Delitos_save57_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos")))
  )
  private[this] lazy val controllers_Delitos_save57_invoker = createInvoker(
    Delitos_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.Delitos",
      "save",
      Nil,
      "POST",
      this.prefix + """delitos""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] lazy val controllers_Delitos_delete58_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Delitos_delete58_invoker = createInvoker(
    Delitos_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.Delitos",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """delitos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val controllers_TiposDomiciliosController_page59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-domicilio/page")))
  )
  private[this] lazy val controllers_TiposDomiciliosController_page59_invoker = createInvoker(
    TiposDomiciliosController_1.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.TiposDomiciliosController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """tipo-domicilio/page""",
      """TiposDomicilios
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:98
  private[this] lazy val controllers_TiposDomiciliosController_options60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-domicilio/options")))
  )
  private[this] lazy val controllers_TiposDomiciliosController_options60_invoker = createInvoker(
    TiposDomiciliosController_1.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.TiposDomiciliosController",
      "options",
      Nil,
      "GET",
      this.prefix + """tipo-domicilio/options""",
      """""",
      Seq()
    )
  )

  // @LINE:99
  private[this] lazy val controllers_TiposDomiciliosController_list61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-domicilio")))
  )
  private[this] lazy val controllers_TiposDomiciliosController_list61_invoker = createInvoker(
    TiposDomiciliosController_1.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.TiposDomiciliosController",
      "list",
      Nil,
      "GET",
      this.prefix + """tipo-domicilio""",
      """""",
      Seq()
    )
  )

  // @LINE:100
  private[this] lazy val controllers_TiposDomiciliosController_get62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-domicilio/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TiposDomiciliosController_get62_invoker = createInvoker(
    TiposDomiciliosController_1.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.TiposDomiciliosController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tipo-domicilio/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_TiposDomiciliosController_update63_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-domicilio/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TiposDomiciliosController_update63_invoker = createInvoker(
    TiposDomiciliosController_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.TiposDomiciliosController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """tipo-domicilio/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:102
  private[this] lazy val controllers_TiposDomiciliosController_save64_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-domicilio")))
  )
  private[this] lazy val controllers_TiposDomiciliosController_save64_invoker = createInvoker(
    TiposDomiciliosController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.TiposDomiciliosController",
      "save",
      Nil,
      "POST",
      this.prefix + """tipo-domicilio""",
      """""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_TiposDomiciliosController_delete65_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-domicilio/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TiposDomiciliosController_delete65_invoker = createInvoker(
    TiposDomiciliosController_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.TiposDomiciliosController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """tipo-domicilio/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:107
  private[this] lazy val controllers_TipoIntervinienteController_page66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipos-intervinientes/page")))
  )
  private[this] lazy val controllers_TipoIntervinienteController_page66_invoker = createInvoker(
    TipoIntervinienteController_7.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.TipoIntervinienteController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """tipos-intervinientes/page""",
      """TipoInterviniente
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:108
  private[this] lazy val controllers_TipoIntervinienteController_options67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipos-intervinientes/options")))
  )
  private[this] lazy val controllers_TipoIntervinienteController_options67_invoker = createInvoker(
    TipoIntervinienteController_7.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.TipoIntervinienteController",
      "options",
      Nil,
      "GET",
      this.prefix + """tipos-intervinientes/options""",
      """""",
      Seq()
    )
  )

  // @LINE:109
  private[this] lazy val controllers_TipoIntervinienteController_get68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipos-intervinientes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoIntervinienteController_get68_invoker = createInvoker(
    TipoIntervinienteController_7.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.TipoIntervinienteController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tipos-intervinientes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:110
  private[this] lazy val controllers_TipoIntervinienteController_update69_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipos-intervinientes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoIntervinienteController_update69_invoker = createInvoker(
    TipoIntervinienteController_7.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.TipoIntervinienteController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """tipos-intervinientes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:111
  private[this] lazy val controllers_TipoIntervinienteController_save70_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipos-intervinientes")))
  )
  private[this] lazy val controllers_TipoIntervinienteController_save70_invoker = createInvoker(
    TipoIntervinienteController_7.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.TipoIntervinienteController",
      "save",
      Nil,
      "POST",
      this.prefix + """tipos-intervinientes""",
      """""",
      Seq()
    )
  )

  // @LINE:112
  private[this] lazy val controllers_TipoIntervinienteController_delete71_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipos-intervinientes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoIntervinienteController_delete71_invoker = createInvoker(
    TipoIntervinienteController_7.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.TipoIntervinienteController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """tipos-intervinientes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:116
  private[this] lazy val controllers_CatalogosSincronizacion_list72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sincronizacion")))
  )
  private[this] lazy val controllers_CatalogosSincronizacion_list72_invoker = createInvoker(
    CatalogosSincronizacion_6.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "catalogos",
      "controllers.CatalogosSincronizacion",
      "list",
      Nil,
      "GET",
      this.prefix + """sincronizacion""",
      """TiposDomicilios
##############################################################################################################""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case prefixed_arma_Routes_6_0(handler) => handler
  
    // @LINE:8
    case prefixed_lugar_Routes_9_1(handler) => handler
  
    // @LINE:9
    case prefixed_mediaFiliacion_Routes_0_2(handler) => handler
  
    // @LINE:10
    case prefixed_persona_Routes_8_3(handler) => handler
  
    // @LINE:11
    case prefixed_relacion_Routes_3_4(handler) => handler
  
    // @LINE:12
    case prefixed_vehiculo_Routes_1_5(handler) => handler
  
    // @LINE:13
    case prefixed_usuario_Routes_10_6(handler) => handler
  
    // @LINE:14
    case prefixed_solicitudPreliminarCatalog_Routes_7_7(handler) => handler
  
    // @LINE:15
    case prefixed_entrevistaCatalog_Routes_2_8(handler) => handler
  
    // @LINE:16
    case prefixed_predenunciaCatalog_Routes_5_9(handler) => handler
  
    // @LINE:17
    case prefixed_determinacionCatalog_Routes_4_10(handler) => handler
  
    // @LINE:23
    case controllers_ColoniaController_options11_route(params@_) =>
      call(params.fromPath[Long]("idMunicipio", None)) { (idMunicipio) =>
        controllers_ColoniaController_options11_invoker.call(ColoniaController_9.options(idMunicipio))
      }
  
    // @LINE:24
    case controllers_ColoniaController_page12_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_ColoniaController_page12_invoker.call(ColoniaController_9.page(p, s, o, f, tr))
      }
  
    // @LINE:25
    case controllers_ColoniaController_get13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ColoniaController_get13_invoker.call(ColoniaController_9.get(id))
      }
  
    // @LINE:26
    case controllers_ColoniaController_list14_route(params@_) =>
      call { 
        controllers_ColoniaController_list14_invoker.call(ColoniaController_9.list())
      }
  
    // @LINE:27
    case controllers_ColoniaController_listByMunicipio15_route(params@_) =>
      call(params.fromPath[Long]("idMunicipio", None)) { (idMunicipio) =>
        controllers_ColoniaController_listByMunicipio15_invoker.call(ColoniaController_9.listByMunicipio(idMunicipio))
      }
  
    // @LINE:28
    case controllers_ColoniaController_update16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ColoniaController_update16_invoker.call(ColoniaController_9.update(id))
      }
  
    // @LINE:29
    case controllers_ColoniaController_save17_route(params@_) =>
      call { 
        controllers_ColoniaController_save17_invoker.call(ColoniaController_9.save())
      }
  
    // @LINE:30
    case controllers_ColoniaController_delete18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ColoniaController_delete18_invoker.call(ColoniaController_9.delete(id))
      }
  
    // @LINE:35
    case controllers_EstadoController_page19_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_EstadoController_page19_invoker.call(EstadoController_4.page(p, s, o, f, tr))
      }
  
    // @LINE:36
    case controllers_EstadoController_options20_route(params@_) =>
      call(params.fromPath[Long]("idPais", None)) { (idPais) =>
        controllers_EstadoController_options20_invoker.call(EstadoController_4.options(idPais))
      }
  
    // @LINE:37
    case controllers_EstadoController_get21_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstadoController_get21_invoker.call(EstadoController_4.get(id))
      }
  
    // @LINE:38
    case controllers_EstadoController_list22_route(params@_) =>
      call { 
        controllers_EstadoController_list22_invoker.call(EstadoController_4.list())
      }
  
    // @LINE:39
    case controllers_EstadoController_update23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstadoController_update23_invoker.call(EstadoController_4.update(id))
      }
  
    // @LINE:40
    case controllers_EstadoController_save24_route(params@_) =>
      call { 
        controllers_EstadoController_save24_invoker.call(EstadoController_4.save())
      }
  
    // @LINE:41
    case controllers_EstadoController_delete25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstadoController_delete25_invoker.call(EstadoController_4.delete(id))
      }
  
    // @LINE:46
    case controllers_MunicipioController_page26_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_MunicipioController_page26_invoker.call(MunicipioController_5.page(p, s, o, f, tr))
      }
  
    // @LINE:47
    case controllers_MunicipioController_options27_route(params@_) =>
      call(params.fromPath[Long]("idEstado", None)) { (idEstado) =>
        controllers_MunicipioController_options27_invoker.call(MunicipioController_5.options(idEstado))
      }
  
    // @LINE:48
    case controllers_MunicipioController_get28_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MunicipioController_get28_invoker.call(MunicipioController_5.get(id))
      }
  
    // @LINE:49
    case controllers_MunicipioController_list29_route(params@_) =>
      call { 
        controllers_MunicipioController_list29_invoker.call(MunicipioController_5.list())
      }
  
    // @LINE:50
    case controllers_MunicipioController_update30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MunicipioController_update30_invoker.call(MunicipioController_5.update(id))
      }
  
    // @LINE:51
    case controllers_MunicipioController_save31_route(params@_) =>
      call { 
        controllers_MunicipioController_save31_invoker.call(MunicipioController_5.save())
      }
  
    // @LINE:52
    case controllers_MunicipioController_delete32_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MunicipioController_delete32_invoker.call(MunicipioController_5.delete(id))
      }
  
    // @LINE:57
    case controllers_PaisController_page33_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_PaisController_page33_invoker.call(PaisController_3.page(p, s, o, f, tr))
      }
  
    // @LINE:58
    case controllers_PaisController_options34_route(params@_) =>
      call { 
        controllers_PaisController_options34_invoker.call(PaisController_3.options())
      }
  
    // @LINE:59
    case controllers_PaisController_get35_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaisController_get35_invoker.call(PaisController_3.get(id))
      }
  
    // @LINE:60
    case controllers_PaisController_update36_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaisController_update36_invoker.call(PaisController_3.update(id))
      }
  
    // @LINE:61
    case controllers_PaisController_save37_route(params@_) =>
      call { 
        controllers_PaisController_save37_invoker.call(PaisController_3.save())
      }
  
    // @LINE:62
    case controllers_PaisController_delete38_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaisController_delete38_invoker.call(PaisController_3.delete(id))
      }
  
    // @LINE:67
    case controllers_LocalidadController_page39_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_LocalidadController_page39_invoker.call(LocalidadController_2.page(p, s, o, f, tr))
      }
  
    // @LINE:68
    case controllers_LocalidadController_options40_route(params@_) =>
      call(params.fromPath[Long]("idPais", None)) { (idPais) =>
        controllers_LocalidadController_options40_invoker.call(LocalidadController_2.options(idPais))
      }
  
    // @LINE:69
    case controllers_LocalidadController_optionsByMunicipio41_route(params@_) =>
      call(params.fromPath[Long]("idMunicipio", None)) { (idMunicipio) =>
        controllers_LocalidadController_optionsByMunicipio41_invoker.call(LocalidadController_2.optionsByMunicipio(idMunicipio))
      }
  
    // @LINE:70
    case controllers_LocalidadController_get42_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LocalidadController_get42_invoker.call(LocalidadController_2.get(id))
      }
  
    // @LINE:71
    case controllers_LocalidadController_list43_route(params@_) =>
      call { 
        controllers_LocalidadController_list43_invoker.call(LocalidadController_2.list())
      }
  
    // @LINE:72
    case controllers_LocalidadController_update44_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LocalidadController_update44_invoker.call(LocalidadController_2.update(id))
      }
  
    // @LINE:73
    case controllers_LocalidadController_save45_route(params@_) =>
      call { 
        controllers_LocalidadController_save45_invoker.call(LocalidadController_2.save())
      }
  
    // @LINE:74
    case controllers_LocalidadController_delete46_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LocalidadController_delete46_invoker.call(LocalidadController_2.delete(id))
      }
  
    // @LINE:78
    case controllers_NacionalidadesReligionController_list47_route(params@_) =>
      call { 
        controllers_NacionalidadesReligionController_list47_invoker.call(NacionalidadesReligionController_8.list)
      }
  
    // @LINE:79
    case controllers_NacionalidadesReligionController_get48_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NacionalidadesReligionController_get48_invoker.call(NacionalidadesReligionController_8.get(id))
      }
  
    // @LINE:80
    case controllers_NacionalidadesReligionController_update49_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NacionalidadesReligionController_update49_invoker.call(NacionalidadesReligionController_8.update(id))
      }
  
    // @LINE:81
    case controllers_NacionalidadesReligionController_save50_route(params@_) =>
      call { 
        controllers_NacionalidadesReligionController_save50_invoker.call(NacionalidadesReligionController_8.save())
      }
  
    // @LINE:82
    case controllers_NacionalidadesReligionController_delete51_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NacionalidadesReligionController_delete51_invoker.call(NacionalidadesReligionController_8.delete(id))
      }
  
    // @LINE:87
    case controllers_Delitos_getByName52_route(params@_) =>
      call(params.fromQuery[String]("name", Some(""))) { (name) =>
        controllers_Delitos_getByName52_invoker.call(Delitos_0.getByName(name))
      }
  
    // @LINE:88
    case controllers_Delitos_page53_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_Delitos_page53_invoker.call(Delitos_0.page(p, s, o, f, tr))
      }
  
    // @LINE:89
    case controllers_Delitos_get54_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Delitos_get54_invoker.call(Delitos_0.get(id))
      }
  
    // @LINE:90
    case controllers_Delitos_list55_route(params@_) =>
      call { 
        controllers_Delitos_list55_invoker.call(Delitos_0.list())
      }
  
    // @LINE:91
    case controllers_Delitos_update56_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Delitos_update56_invoker.call(Delitos_0.update(id))
      }
  
    // @LINE:92
    case controllers_Delitos_save57_route(params@_) =>
      call { 
        controllers_Delitos_save57_invoker.call(Delitos_0.save())
      }
  
    // @LINE:93
    case controllers_Delitos_delete58_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Delitos_delete58_invoker.call(Delitos_0.delete(id))
      }
  
    // @LINE:97
    case controllers_TiposDomiciliosController_page59_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_TiposDomiciliosController_page59_invoker.call(TiposDomiciliosController_1.page(p, s, o, f, tr))
      }
  
    // @LINE:98
    case controllers_TiposDomiciliosController_options60_route(params@_) =>
      call { 
        controllers_TiposDomiciliosController_options60_invoker.call(TiposDomiciliosController_1.options())
      }
  
    // @LINE:99
    case controllers_TiposDomiciliosController_list61_route(params@_) =>
      call { 
        controllers_TiposDomiciliosController_list61_invoker.call(TiposDomiciliosController_1.list)
      }
  
    // @LINE:100
    case controllers_TiposDomiciliosController_get62_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TiposDomiciliosController_get62_invoker.call(TiposDomiciliosController_1.get(id))
      }
  
    // @LINE:101
    case controllers_TiposDomiciliosController_update63_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TiposDomiciliosController_update63_invoker.call(TiposDomiciliosController_1.update(id))
      }
  
    // @LINE:102
    case controllers_TiposDomiciliosController_save64_route(params@_) =>
      call { 
        controllers_TiposDomiciliosController_save64_invoker.call(TiposDomiciliosController_1.save())
      }
  
    // @LINE:103
    case controllers_TiposDomiciliosController_delete65_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TiposDomiciliosController_delete65_invoker.call(TiposDomiciliosController_1.delete(id))
      }
  
    // @LINE:107
    case controllers_TipoIntervinienteController_page66_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("tipo")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_TipoIntervinienteController_page66_invoker.call(TipoIntervinienteController_7.page(p, s, o, f, tr))
      }
  
    // @LINE:108
    case controllers_TipoIntervinienteController_options67_route(params@_) =>
      call { 
        controllers_TipoIntervinienteController_options67_invoker.call(TipoIntervinienteController_7.options())
      }
  
    // @LINE:109
    case controllers_TipoIntervinienteController_get68_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoIntervinienteController_get68_invoker.call(TipoIntervinienteController_7.get(id))
      }
  
    // @LINE:110
    case controllers_TipoIntervinienteController_update69_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoIntervinienteController_update69_invoker.call(TipoIntervinienteController_7.update(id))
      }
  
    // @LINE:111
    case controllers_TipoIntervinienteController_save70_route(params@_) =>
      call { 
        controllers_TipoIntervinienteController_save70_invoker.call(TipoIntervinienteController_7.save())
      }
  
    // @LINE:112
    case controllers_TipoIntervinienteController_delete71_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoIntervinienteController_delete71_invoker.call(TipoIntervinienteController_7.delete(id))
      }
  
    // @LINE:116
    case controllers_CatalogosSincronizacion_list72_route(params@_) =>
      call { 
        controllers_CatalogosSincronizacion_list72_invoker.call(CatalogosSincronizacion_6.list)
      }
  }
}
