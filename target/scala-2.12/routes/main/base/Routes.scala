
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/base.routes
// @DATE:Thu Feb 15 10:13:36 CST 2018

package base

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:10
  Casos_14: controllers.Casos,
  // @LINE:23
  Titulares_2: controllers.Titulares,
  // @LINE:32
  PersonasCasos_5: controllers.PersonasCasos,
  // @LINE:43
  DelitosCasos_13: controllers.DelitosCasos,
  // @LINE:53
  Armas_9: controllers.Armas,
  // @LINE:63
  Relaciones_22: controllers.Relaciones,
  // @LINE:71
  Vehiculos_4: controllers.Vehiculos,
  // @LINE:80
  Lugares_1: controllers.Lugares,
  // @LINE:90
  Personas_3: controllers.Personas,
  // @LINE:97
  TipoRelacionesPersonas_16: controllers.TipoRelacionesPersonas,
  // @LINE:116
  Predenuncias_20: controllers.Predenuncias,
  // @LINE:133
  SolicitudesPreAcuerdos_15: controllers.SolicitudesPreAcuerdos,
  // @LINE:141
  SolicitudesPreInspecciones_7: controllers.SolicitudesPreInspecciones,
  // @LINE:149
  SolicitudesPreRegistros_11: controllers.SolicitudesPreRegistros,
  // @LINE:157
  SolicitudesPrePericiales_23: controllers.SolicitudesPrePericiales,
  // @LINE:165
  SolicitudesPrePolicias_17: controllers.SolicitudesPrePolicias,
  // @LINE:173
  SolicitudesPreReqInfo_8: controllers.SolicitudesPreReqInfo,
  // @LINE:188
  Acuerdos_10: controllers.Acuerdos,
  // @LINE:197
  ArchivosTemporales_12: controllers.ArchivosTemporales,
  // @LINE:205
  FacultadesNoInvestigar_24: controllers.FacultadesNoInvestigar,
  // @LINE:213
  NoEjerciciosAccionPenal_18: controllers.NoEjerciciosAccionPenal,
  // @LINE:228
  Entrevistas_21: controllers.Entrevistas,
  // @LINE:243
  Usuarios_0: controllers.Usuarios,
  // @LINE:259
  DetalleDelitos_19: controllers.DetalleDelitos,
  // @LINE:273
  NotificacionesController_6: controllers.NotificacionesController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:10
    Casos_14: controllers.Casos,
    // @LINE:23
    Titulares_2: controllers.Titulares,
    // @LINE:32
    PersonasCasos_5: controllers.PersonasCasos,
    // @LINE:43
    DelitosCasos_13: controllers.DelitosCasos,
    // @LINE:53
    Armas_9: controllers.Armas,
    // @LINE:63
    Relaciones_22: controllers.Relaciones,
    // @LINE:71
    Vehiculos_4: controllers.Vehiculos,
    // @LINE:80
    Lugares_1: controllers.Lugares,
    // @LINE:90
    Personas_3: controllers.Personas,
    // @LINE:97
    TipoRelacionesPersonas_16: controllers.TipoRelacionesPersonas,
    // @LINE:116
    Predenuncias_20: controllers.Predenuncias,
    // @LINE:133
    SolicitudesPreAcuerdos_15: controllers.SolicitudesPreAcuerdos,
    // @LINE:141
    SolicitudesPreInspecciones_7: controllers.SolicitudesPreInspecciones,
    // @LINE:149
    SolicitudesPreRegistros_11: controllers.SolicitudesPreRegistros,
    // @LINE:157
    SolicitudesPrePericiales_23: controllers.SolicitudesPrePericiales,
    // @LINE:165
    SolicitudesPrePolicias_17: controllers.SolicitudesPrePolicias,
    // @LINE:173
    SolicitudesPreReqInfo_8: controllers.SolicitudesPreReqInfo,
    // @LINE:188
    Acuerdos_10: controllers.Acuerdos,
    // @LINE:197
    ArchivosTemporales_12: controllers.ArchivosTemporales,
    // @LINE:205
    FacultadesNoInvestigar_24: controllers.FacultadesNoInvestigar,
    // @LINE:213
    NoEjerciciosAccionPenal_18: controllers.NoEjerciciosAccionPenal,
    // @LINE:228
    Entrevistas_21: controllers.Entrevistas,
    // @LINE:243
    Usuarios_0: controllers.Usuarios,
    // @LINE:259
    DetalleDelitos_19: controllers.DetalleDelitos,
    // @LINE:273
    NotificacionesController_6: controllers.NotificacionesController
  ) = this(errorHandler, Casos_14, Titulares_2, PersonasCasos_5, DelitosCasos_13, Armas_9, Relaciones_22, Vehiculos_4, Lugares_1, Personas_3, TipoRelacionesPersonas_16, Predenuncias_20, SolicitudesPreAcuerdos_15, SolicitudesPreInspecciones_7, SolicitudesPreRegistros_11, SolicitudesPrePericiales_23, SolicitudesPrePolicias_17, SolicitudesPreReqInfo_8, Acuerdos_10, ArchivosTemporales_12, FacultadesNoInvestigar_24, NoEjerciciosAccionPenal_18, Entrevistas_21, Usuarios_0, DetalleDelitos_19, NotificacionesController_6, "/")

  def withPrefix(prefix: String): Routes = {
    base.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Casos_14, Titulares_2, PersonasCasos_5, DelitosCasos_13, Armas_9, Relaciones_22, Vehiculos_4, Lugares_1, Personas_3, TipoRelacionesPersonas_16, Predenuncias_20, SolicitudesPreAcuerdos_15, SolicitudesPreInspecciones_7, SolicitudesPreRegistros_11, SolicitudesPrePericiales_23, SolicitudesPrePolicias_17, SolicitudesPreReqInfo_8, Acuerdos_10, ArchivosTemporales_12, FacultadesNoInvestigar_24, NoEjerciciosAccionPenal_18, Entrevistas_21, Usuarios_0, DetalleDelitos_19, NotificacionesController_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """casos/""" + "$" + """id<[^/]+>""", """controllers.Casos.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """casos/propietario/""" + "$" + """id<[^/]+>""", """controllers.Casos.getPropietario(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """casos/""" + "$" + """id<[^/]+>/all""", """controllers.Casos.getAll(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """casos/""" + "$" + """id<[^/]+>/documentos""", """controllers.Casos.getDocuments(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """casos""", """controllers.Casos.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """casos/titulares/""" + "$" + """usr<[^/]+>/page""", """controllers.Casos.pageByTitular(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10, usr:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """casos/fiscalia/""" + "$" + """fiscalia<[^/]+>/page""", """controllers.Casos.pageByFiscalia(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10, fiscalia:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """casos/""" + "$" + """id<[^/]+>""", """controllers.Casos.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """casos""", """controllers.Casos.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """titulares/""" + "$" + """id<[^/]+>""", """controllers.Titulares.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """titulares/""" + "$" + """id<[^/]+>/page""", """controllers.Titulares.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """titulares/""" + "$" + """id<[^/]+>""", """controllers.Titulares.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """titulares""", """controllers.Titulares.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personas-casos""", """controllers.PersonasCasos.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personas-casos/casos/""" + "$" + """id<[^/]+>/page""", """controllers.PersonasCasos.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personas-casos/""" + "$" + """id<[^/]+>""", """controllers.PersonasCasos.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personas-casos/casos/""" + "$" + """id<[^/]+>""", """controllers.PersonasCasos.list(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personas-casos/casos/""" + "$" + """id<[^/]+>/tipos-intervinientes/""" + "$" + """idTipo<[^/]+>""", """controllers.PersonasCasos.listByCaseAndTipoInterviniente(id:Long, idTipo:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personas-casos/""" + "$" + """id<[^/]+>""", """controllers.PersonasCasos.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personas-casos""", """controllers.PersonasCasos.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos-casos""", """controllers.DelitosCasos.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos-casos/casos/""" + "$" + """id<[^/]+>/page""", """controllers.DelitosCasos.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos-casos/""" + "$" + """id<[^/]+>""", """controllers.DelitosCasos.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos-casos/""" + "$" + """id<[^/]+>/casos/""" + "$" + """idCaso<[^/]+>""", """controllers.DelitosCasos.setDefault(id:Long, idCaso:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos-casos/casos/""" + "$" + """id<[^/]+>""", """controllers.DelitosCasos.list(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos-casos/""" + "$" + """id<[^/]+>""", """controllers.DelitosCasos.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delitos-casos""", """controllers.DelitosCasos.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """armas/""" + "$" + """id<[^/]+>""", """controllers.Armas.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """armas/casos/""" + "$" + """id<[^/]+>""", """controllers.Armas.list(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """armas""", """controllers.Armas.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """armas/casos/""" + "$" + """id<[^/]+>/page""", """controllers.Armas.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """armas/""" + "$" + """id<[^/]+>""", """controllers.Armas.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """armas""", """controllers.Armas.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """relaciones/""" + "$" + """id<[^/]+>""", """controllers.Relaciones.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """relaciones""", """controllers.Relaciones.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """relaciones/casos/""" + "$" + """id<[^/]+>/page""", """controllers.Relaciones.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """relaciones/""" + "$" + """id<[^/]+>""", """controllers.Relaciones.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """relaciones""", """controllers.Relaciones.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehiculos/""" + "$" + """id<[^/]+>""", """controllers.Vehiculos.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehiculos/casos/""" + "$" + """id<[^/]+>""", """controllers.Vehiculos.list(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehiculos""", """controllers.Vehiculos.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehiculos/casos/""" + "$" + """id<[^/]+>/page""", """controllers.Vehiculos.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehiculos/""" + "$" + """id<[^/]+>""", """controllers.Vehiculos.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehiculos""", """controllers.Vehiculos.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lugares/""" + "$" + """id<[^/]+>""", """controllers.Lugares.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lugares/casos/""" + "$" + """id<[^/]+>""", """controllers.Lugares.list(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lugares""", """controllers.Lugares.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lugares/casos/""" + "$" + """id<[^/]+>/page""", """controllers.Lugares.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lugares/""" + "$" + """id<[^/]+>""", """controllers.Lugares.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lugares""", """controllers.Lugares.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personas/""" + "$" + """id<[^/]+>""", """controllers.Personas.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personas""", """controllers.Personas.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personas/""" + "$" + """id<[^/]+>""", """controllers.Personas.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personas""", """controllers.Personas.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-relacion-persona/page""", """controllers.TipoRelacionesPersonas.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-relacion-persona/casos/""" + "$" + """id<[^/]+>/page""", """controllers.TipoRelacionesPersonas.pageByCase(id:Long, p:Int ?= 0, s:String ?= "caso.created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-relacion-persona""", """controllers.TipoRelacionesPersonas.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-relacion-persona/""" + "$" + """id<[^/]+>""", """controllers.TipoRelacionesPersonas.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-relacion-persona/""" + "$" + """id<[^/]+>""", """controllers.TipoRelacionesPersonas.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-relacion-persona""", """controllers.TipoRelacionesPersonas.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """predenuncias/""" + "$" + """id<[^/]+>""", """controllers.Predenuncias.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """predenuncias/casos/""" + "$" + """id<[^/]+>/page""", """controllers.Predenuncias.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """predenuncias""", """controllers.Predenuncias.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """predenuncias/casos/""" + "$" + """id<[^/]+>""", """controllers.Predenuncias.getByCase(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """predenuncias/""" + "$" + """id<[^/]+>""", """controllers.Predenuncias.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """predenuncias""", """controllers.Predenuncias.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-acuerdos/""" + "$" + """id<[^/]+>""", """controllers.SolicitudesPreAcuerdos.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-acuerdos/casos/""" + "$" + """id<[^/]+>/page""", """controllers.SolicitudesPreAcuerdos.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-acuerdos""", """controllers.SolicitudesPreAcuerdos.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-acuerdos/""" + "$" + """id<[^/]+>""", """controllers.SolicitudesPreAcuerdos.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-acuerdos""", """controllers.SolicitudesPreAcuerdos.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-inspecciones/""" + "$" + """id<[^/]+>""", """controllers.SolicitudesPreInspecciones.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-inspecciones/casos/""" + "$" + """id<[^/]+>/page""", """controllers.SolicitudesPreInspecciones.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-inspecciones""", """controllers.SolicitudesPreInspecciones.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-inspecciones/""" + "$" + """id<[^/]+>""", """controllers.SolicitudesPreInspecciones.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-inspecciones""", """controllers.SolicitudesPreInspecciones.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-registros/""" + "$" + """id<[^/]+>""", """controllers.SolicitudesPreRegistros.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-registros/casos/""" + "$" + """id<[^/]+>/page""", """controllers.SolicitudesPreRegistros.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-registros""", """controllers.SolicitudesPreRegistros.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-registros/""" + "$" + """id<[^/]+>""", """controllers.SolicitudesPreRegistros.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-registros""", """controllers.SolicitudesPreRegistros.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-pericial/""" + "$" + """id<[^/]+>""", """controllers.SolicitudesPrePericiales.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-pericial/casos/""" + "$" + """id<[^/]+>/page""", """controllers.SolicitudesPrePericiales.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-pericial""", """controllers.SolicitudesPrePericiales.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-pericial/""" + "$" + """id<[^/]+>""", """controllers.SolicitudesPrePericiales.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-pericial""", """controllers.SolicitudesPrePericiales.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-policias/""" + "$" + """id<[^/]+>""", """controllers.SolicitudesPrePolicias.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-policias/casos/""" + "$" + """id<[^/]+>/page""", """controllers.SolicitudesPrePolicias.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-policias""", """controllers.SolicitudesPrePolicias.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-policias/""" + "$" + """id<[^/]+>""", """controllers.SolicitudesPrePolicias.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-policias""", """controllers.SolicitudesPrePolicias.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-info/""" + "$" + """id<[^/]+>""", """controllers.SolicitudesPreReqInfo.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-info/casos/""" + "$" + """id<[^/]+>/page""", """controllers.SolicitudesPreReqInfo.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-info""", """controllers.SolicitudesPreReqInfo.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-info/""" + "$" + """id<[^/]+>""", """controllers.SolicitudesPreReqInfo.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-info""", """controllers.SolicitudesPreReqInfo.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """acuerdos/""" + "$" + """id<[^/]+>""", """controllers.Acuerdos.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """acuerdos/casos/""" + "$" + """id<[^/]+>/page""", """controllers.Acuerdos.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """acuerdos/casos/""" + "$" + """id<[^/]+>/tipos""", """controllers.Acuerdos.listByCaseAndTipo(id:Long, tipo:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """acuerdos""", """controllers.Acuerdos.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """acuerdos/""" + "$" + """id<[^/]+>""", """controllers.Acuerdos.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """acuerdos""", """controllers.Acuerdos.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """archivos-temporales/""" + "$" + """id<[^/]+>""", """controllers.ArchivosTemporales.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """archivos-temporales/casos/""" + "$" + """id<[^/]+>/page""", """controllers.ArchivosTemporales.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """archivos-temporales""", """controllers.ArchivosTemporales.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """archivos-temporales/""" + "$" + """id<[^/]+>""", """controllers.ArchivosTemporales.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """archivos-temporales""", """controllers.ArchivosTemporales.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facultades-no-investigar/""" + "$" + """id<[^/]+>""", """controllers.FacultadesNoInvestigar.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facultades-no-investigar/casos/""" + "$" + """id<[^/]+>/page""", """controllers.FacultadesNoInvestigar.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facultades-no-investigar""", """controllers.FacultadesNoInvestigar.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facultades-no-investigar/""" + "$" + """id<[^/]+>""", """controllers.FacultadesNoInvestigar.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facultades-no-investigar""", """controllers.FacultadesNoInvestigar.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """no-ejercicio-accion/""" + "$" + """id<[^/]+>""", """controllers.NoEjerciciosAccionPenal.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """no-ejercicio-accion/casos/""" + "$" + """id<[^/]+>/page""", """controllers.NoEjerciciosAccionPenal.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """no-ejercicio-accion""", """controllers.NoEjerciciosAccionPenal.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """no-ejercicio-accion/""" + "$" + """id<[^/]+>""", """controllers.NoEjerciciosAccionPenal.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """no-ejercicio-accion""", """controllers.NoEjerciciosAccionPenal.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entrevistas/""" + "$" + """id<[^/]+>""", """controllers.Entrevistas.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entrevistas""", """controllers.Entrevistas.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entrevistas/casos/""" + "$" + """id<[^/]+>/page""", """controllers.Entrevistas.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entrevistas/""" + "$" + """id<[^/]+>""", """controllers.Entrevistas.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entrevistas""", """controllers.Entrevistas.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/""" + "$" + """id<[^/]+>""", """controllers.Usuarios.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/page""", """controllers.Usuarios.page(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/agencias/""" + "$" + """id<[^/]+>/options""", """controllers.Usuarios.optionsByAgency(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/""" + "$" + """id<[^/]+>""", """controllers.Usuarios.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """controllers.Usuarios.save()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """detalle-delitos/""" + "$" + """id<[^/]+>""", """controllers.DetalleDelitos.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notificaciones/usuario/""" + "$" + """usr<[^/]+>/page""", """controllers.NotificacionesController.pageByUser(p:Int ?= 0, s:String ?= "created", o:String ?= "desc", f:String ?= "", tr:Int ?= 10, usr:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notificaciones/usuario/""" + "$" + """usr<[^/]+>/sin-leer""", """controllers.NotificacionesController.countSinLeer(usr:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notificaciones/usuario/""" + "$" + """id<[^/]+>/leido""", """controllers.NotificacionesController.countLeido(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_Casos_get0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("casos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Casos_get0_invoker = createInvoker(
    Casos_14.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Casos",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """casos/""" + "$" + """id<[^/]+>""",
      """Casos
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Casos_getPropietario1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("casos/propietario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Casos_getPropietario1_invoker = createInvoker(
    Casos_14.getPropietario(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Casos",
      "getPropietario",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """casos/propietario/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Casos_getAll2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/all")))
  )
  private[this] lazy val controllers_Casos_getAll2_invoker = createInvoker(
    Casos_14.getAll(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Casos",
      "getAll",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """casos/""" + "$" + """id<[^/]+>/all""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Casos_getDocuments3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/documentos")))
  )
  private[this] lazy val controllers_Casos_getDocuments3_invoker = createInvoker(
    Casos_14.getDocuments(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Casos",
      "getDocuments",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """casos/""" + "$" + """id<[^/]+>/documentos""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Casos_page4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("casos")))
  )
  private[this] lazy val controllers_Casos_page4_invoker = createInvoker(
    Casos_14.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Casos",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """casos""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Casos_pageByTitular5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("casos/titulares/"), DynamicPart("usr", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_Casos_pageByTitular5_invoker = createInvoker(
    Casos_14.pageByTitular(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Casos",
      "pageByTitular",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int], classOf[String]),
      "GET",
      this.prefix + """casos/titulares/""" + "$" + """usr<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Casos_pageByFiscalia6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("casos/fiscalia/"), DynamicPart("fiscalia", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_Casos_pageByFiscalia6_invoker = createInvoker(
    Casos_14.pageByFiscalia(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Casos",
      "pageByFiscalia",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int], classOf[String]),
      "GET",
      this.prefix + """casos/fiscalia/""" + "$" + """fiscalia<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Casos_update7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("casos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Casos_update7_invoker = createInvoker(
    Casos_14.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Casos",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """casos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Casos_save8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("casos")))
  )
  private[this] lazy val controllers_Casos_save8_invoker = createInvoker(
    Casos_14.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Casos",
      "save",
      Nil,
      "POST",
      this.prefix + """casos""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Titulares_get9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("titulares/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Titulares_get9_invoker = createInvoker(
    Titulares_2.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Titulares",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """titulares/""" + "$" + """id<[^/]+>""",
      """Titulares
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Titulares_pageByCase10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("titulares/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_Titulares_pageByCase10_invoker = createInvoker(
    Titulares_2.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Titulares",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """titulares/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Titulares_update11_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("titulares/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Titulares_update11_invoker = createInvoker(
    Titulares_2.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Titulares",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """titulares/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Titulares_save12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("titulares")))
  )
  private[this] lazy val controllers_Titulares_save12_invoker = createInvoker(
    Titulares_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Titulares",
      "save",
      Nil,
      "POST",
      this.prefix + """titulares""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_PersonasCasos_page13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personas-casos")))
  )
  private[this] lazy val controllers_PersonasCasos_page13_invoker = createInvoker(
    PersonasCasos_5.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.PersonasCasos",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """personas-casos""",
      """Personas-Casos
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_PersonasCasos_pageByCase14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personas-casos/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_PersonasCasos_pageByCase14_invoker = createInvoker(
    PersonasCasos_5.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.PersonasCasos",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """personas-casos/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_PersonasCasos_get15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personas-casos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonasCasos_get15_invoker = createInvoker(
    PersonasCasos_5.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.PersonasCasos",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """personas-casos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_PersonasCasos_list16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personas-casos/casos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonasCasos_list16_invoker = createInvoker(
    PersonasCasos_5.list(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.PersonasCasos",
      "list",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """personas-casos/casos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_PersonasCasos_listByCaseAndTipoInterviniente17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personas-casos/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tipos-intervinientes/"), DynamicPart("idTipo", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonasCasos_listByCaseAndTipoInterviniente17_invoker = createInvoker(
    PersonasCasos_5.listByCaseAndTipoInterviniente(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.PersonasCasos",
      "listByCaseAndTipoInterviniente",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """personas-casos/casos/""" + "$" + """id<[^/]+>/tipos-intervinientes/""" + "$" + """idTipo<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_PersonasCasos_update18_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personas-casos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonasCasos_update18_invoker = createInvoker(
    PersonasCasos_5.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.PersonasCasos",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """personas-casos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_PersonasCasos_save19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personas-casos")))
  )
  private[this] lazy val controllers_PersonasCasos_save19_invoker = createInvoker(
    PersonasCasos_5.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.PersonasCasos",
      "save",
      Nil,
      "POST",
      this.prefix + """personas-casos""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_DelitosCasos_page20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos-casos")))
  )
  private[this] lazy val controllers_DelitosCasos_page20_invoker = createInvoker(
    DelitosCasos_13.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.DelitosCasos",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """delitos-casos""",
      """Delitos-Casos
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_DelitosCasos_pageByCase21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos-casos/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_DelitosCasos_pageByCase21_invoker = createInvoker(
    DelitosCasos_13.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.DelitosCasos",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """delitos-casos/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_DelitosCasos_get22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos-casos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DelitosCasos_get22_invoker = createInvoker(
    DelitosCasos_13.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.DelitosCasos",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delitos-casos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_DelitosCasos_setDefault23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos-casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/casos/"), DynamicPart("idCaso", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DelitosCasos_setDefault23_invoker = createInvoker(
    DelitosCasos_13.setDefault(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.DelitosCasos",
      "setDefault",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """delitos-casos/""" + "$" + """id<[^/]+>/casos/""" + "$" + """idCaso<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_DelitosCasos_list24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos-casos/casos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DelitosCasos_list24_invoker = createInvoker(
    DelitosCasos_13.list(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.DelitosCasos",
      "list",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delitos-casos/casos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_DelitosCasos_update25_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos-casos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DelitosCasos_update25_invoker = createInvoker(
    DelitosCasos_13.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.DelitosCasos",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """delitos-casos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_DelitosCasos_save26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delitos-casos")))
  )
  private[this] lazy val controllers_DelitosCasos_save26_invoker = createInvoker(
    DelitosCasos_13.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.DelitosCasos",
      "save",
      Nil,
      "POST",
      this.prefix + """delitos-casos""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_Armas_get27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("armas/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Armas_get27_invoker = createInvoker(
    Armas_9.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Armas",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """armas/""" + "$" + """id<[^/]+>""",
      """Armas
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Armas_list28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("armas/casos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Armas_list28_invoker = createInvoker(
    Armas_9.list(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Armas",
      "list",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """armas/casos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Armas_page29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("armas")))
  )
  private[this] lazy val controllers_Armas_page29_invoker = createInvoker(
    Armas_9.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Armas",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """armas""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Armas_pageByCase30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("armas/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_Armas_pageByCase30_invoker = createInvoker(
    Armas_9.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Armas",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """armas/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_Armas_update31_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("armas/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Armas_update31_invoker = createInvoker(
    Armas_9.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Armas",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """armas/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Armas_save32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("armas")))
  )
  private[this] lazy val controllers_Armas_save32_invoker = createInvoker(
    Armas_9.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Armas",
      "save",
      Nil,
      "POST",
      this.prefix + """armas""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Relaciones_get33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("relaciones/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Relaciones_get33_invoker = createInvoker(
    Relaciones_22.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Relaciones",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """relaciones/""" + "$" + """id<[^/]+>""",
      """Relaciones
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Relaciones_page34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("relaciones")))
  )
  private[this] lazy val controllers_Relaciones_page34_invoker = createInvoker(
    Relaciones_22.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Relaciones",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """relaciones""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_Relaciones_pageByCase35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("relaciones/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_Relaciones_pageByCase35_invoker = createInvoker(
    Relaciones_22.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Relaciones",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """relaciones/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_Relaciones_update36_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("relaciones/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Relaciones_update36_invoker = createInvoker(
    Relaciones_22.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Relaciones",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """relaciones/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_Relaciones_save37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("relaciones")))
  )
  private[this] lazy val controllers_Relaciones_save37_invoker = createInvoker(
    Relaciones_22.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Relaciones",
      "save",
      Nil,
      "POST",
      this.prefix + """relaciones""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_Vehiculos_get38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehiculos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Vehiculos_get38_invoker = createInvoker(
    Vehiculos_4.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Vehiculos",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """vehiculos/""" + "$" + """id<[^/]+>""",
      """Vehiculos
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val controllers_Vehiculos_list39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehiculos/casos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Vehiculos_list39_invoker = createInvoker(
    Vehiculos_4.list(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Vehiculos",
      "list",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """vehiculos/casos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_Vehiculos_page40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehiculos")))
  )
  private[this] lazy val controllers_Vehiculos_page40_invoker = createInvoker(
    Vehiculos_4.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Vehiculos",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """vehiculos""",
      """""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_Vehiculos_pageByCase41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehiculos/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_Vehiculos_pageByCase41_invoker = createInvoker(
    Vehiculos_4.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Vehiculos",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """vehiculos/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:75
  private[this] lazy val controllers_Vehiculos_update42_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehiculos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Vehiculos_update42_invoker = createInvoker(
    Vehiculos_4.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Vehiculos",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """vehiculos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_Vehiculos_save43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehiculos")))
  )
  private[this] lazy val controllers_Vehiculos_save43_invoker = createInvoker(
    Vehiculos_4.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Vehiculos",
      "save",
      Nil,
      "POST",
      this.prefix + """vehiculos""",
      """""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val controllers_Lugares_get44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lugares/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Lugares_get44_invoker = createInvoker(
    Lugares_1.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Lugares",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """lugares/""" + "$" + """id<[^/]+>""",
      """Lugares
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val controllers_Lugares_list45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lugares/casos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Lugares_list45_invoker = createInvoker(
    Lugares_1.list(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Lugares",
      "list",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """lugares/casos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:82
  private[this] lazy val controllers_Lugares_page46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lugares")))
  )
  private[this] lazy val controllers_Lugares_page46_invoker = createInvoker(
    Lugares_1.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Lugares",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """lugares""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_Lugares_pageByCase47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lugares/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_Lugares_pageByCase47_invoker = createInvoker(
    Lugares_1.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Lugares",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """lugares/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:84
  private[this] lazy val controllers_Lugares_update48_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lugares/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Lugares_update48_invoker = createInvoker(
    Lugares_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Lugares",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """lugares/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_Lugares_save49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lugares")))
  )
  private[this] lazy val controllers_Lugares_save49_invoker = createInvoker(
    Lugares_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Lugares",
      "save",
      Nil,
      "POST",
      this.prefix + """lugares""",
      """""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val controllers_Personas_get50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personas/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Personas_get50_invoker = createInvoker(
    Personas_3.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Personas",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """personas/""" + "$" + """id<[^/]+>""",
      """Personas
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_Personas_page51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personas")))
  )
  private[this] lazy val controllers_Personas_page51_invoker = createInvoker(
    Personas_3.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Personas",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """personas""",
      """""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val controllers_Personas_update52_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personas/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Personas_update52_invoker = createInvoker(
    Personas_3.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Personas",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """personas/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] lazy val controllers_Personas_save53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personas")))
  )
  private[this] lazy val controllers_Personas_save53_invoker = createInvoker(
    Personas_3.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Personas",
      "save",
      Nil,
      "POST",
      this.prefix + """personas""",
      """""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val controllers_TipoRelacionesPersonas_page54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-relacion-persona/page")))
  )
  private[this] lazy val controllers_TipoRelacionesPersonas_page54_invoker = createInvoker(
    TipoRelacionesPersonas_16.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.TipoRelacionesPersonas",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """tipo-relacion-persona/page""",
      """Relacion Tipo Persona
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:99
  private[this] lazy val controllers_TipoRelacionesPersonas_pageByCase55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-relacion-persona/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_TipoRelacionesPersonas_pageByCase55_invoker = createInvoker(
    TipoRelacionesPersonas_16.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.TipoRelacionesPersonas",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """tipo-relacion-persona/casos/""" + "$" + """id<[^/]+>/page""",
      """GET     /tipo-relacion-persona/options            controllers.TipoRelacionesPersonas.options()""",
      Seq()
    )
  )

  // @LINE:100
  private[this] lazy val controllers_TipoRelacionesPersonas_list56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-relacion-persona")))
  )
  private[this] lazy val controllers_TipoRelacionesPersonas_list56_invoker = createInvoker(
    TipoRelacionesPersonas_16.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.TipoRelacionesPersonas",
      "list",
      Nil,
      "GET",
      this.prefix + """tipo-relacion-persona""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_TipoRelacionesPersonas_get57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-relacion-persona/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoRelacionesPersonas_get57_invoker = createInvoker(
    TipoRelacionesPersonas_16.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.TipoRelacionesPersonas",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tipo-relacion-persona/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:102
  private[this] lazy val controllers_TipoRelacionesPersonas_update58_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-relacion-persona/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoRelacionesPersonas_update58_invoker = createInvoker(
    TipoRelacionesPersonas_16.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.TipoRelacionesPersonas",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """tipo-relacion-persona/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_TipoRelacionesPersonas_save59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-relacion-persona")))
  )
  private[this] lazy val controllers_TipoRelacionesPersonas_save59_invoker = createInvoker(
    TipoRelacionesPersonas_16.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.TipoRelacionesPersonas",
      "save",
      Nil,
      "POST",
      this.prefix + """tipo-relacion-persona""",
      """""",
      Seq()
    )
  )

  // @LINE:116
  private[this] lazy val controllers_Predenuncias_get60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("predenuncias/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Predenuncias_get60_invoker = createInvoker(
    Predenuncias_20.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Predenuncias",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """predenuncias/""" + "$" + """id<[^/]+>""",
      """Predenuncia
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:117
  private[this] lazy val controllers_Predenuncias_pageByCase61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("predenuncias/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_Predenuncias_pageByCase61_invoker = createInvoker(
    Predenuncias_20.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Predenuncias",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """predenuncias/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:118
  private[this] lazy val controllers_Predenuncias_page62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("predenuncias")))
  )
  private[this] lazy val controllers_Predenuncias_page62_invoker = createInvoker(
    Predenuncias_20.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Predenuncias",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """predenuncias""",
      """""",
      Seq()
    )
  )

  // @LINE:119
  private[this] lazy val controllers_Predenuncias_getByCase63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("predenuncias/casos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Predenuncias_getByCase63_invoker = createInvoker(
    Predenuncias_20.getByCase(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Predenuncias",
      "getByCase",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """predenuncias/casos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:120
  private[this] lazy val controllers_Predenuncias_update64_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("predenuncias/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Predenuncias_update64_invoker = createInvoker(
    Predenuncias_20.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Predenuncias",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """predenuncias/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:121
  private[this] lazy val controllers_Predenuncias_save65_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("predenuncias")))
  )
  private[this] lazy val controllers_Predenuncias_save65_invoker = createInvoker(
    Predenuncias_20.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Predenuncias",
      "save",
      Nil,
      "POST",
      this.prefix + """predenuncias""",
      """""",
      Seq()
    )
  )

  // @LINE:133
  private[this] lazy val controllers_SolicitudesPreAcuerdos_get66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-acuerdos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SolicitudesPreAcuerdos_get66_invoker = createInvoker(
    SolicitudesPreAcuerdos_15.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreAcuerdos",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """solicitudes-pre-acuerdos/""" + "$" + """id<[^/]+>""",
      """SolicitudesPreAcuerdos
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:134
  private[this] lazy val controllers_SolicitudesPreAcuerdos_pageByCase67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-acuerdos/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_SolicitudesPreAcuerdos_pageByCase67_invoker = createInvoker(
    SolicitudesPreAcuerdos_15.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreAcuerdos",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """solicitudes-pre-acuerdos/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:135
  private[this] lazy val controllers_SolicitudesPreAcuerdos_page68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-acuerdos")))
  )
  private[this] lazy val controllers_SolicitudesPreAcuerdos_page68_invoker = createInvoker(
    SolicitudesPreAcuerdos_15.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreAcuerdos",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """solicitudes-pre-acuerdos""",
      """""",
      Seq()
    )
  )

  // @LINE:136
  private[this] lazy val controllers_SolicitudesPreAcuerdos_update69_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-acuerdos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SolicitudesPreAcuerdos_update69_invoker = createInvoker(
    SolicitudesPreAcuerdos_15.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreAcuerdos",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """solicitudes-pre-acuerdos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:137
  private[this] lazy val controllers_SolicitudesPreAcuerdos_save70_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-acuerdos")))
  )
  private[this] lazy val controllers_SolicitudesPreAcuerdos_save70_invoker = createInvoker(
    SolicitudesPreAcuerdos_15.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreAcuerdos",
      "save",
      Nil,
      "POST",
      this.prefix + """solicitudes-pre-acuerdos""",
      """""",
      Seq()
    )
  )

  // @LINE:141
  private[this] lazy val controllers_SolicitudesPreInspecciones_get71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-inspecciones/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SolicitudesPreInspecciones_get71_invoker = createInvoker(
    SolicitudesPreInspecciones_7.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreInspecciones",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """solicitudes-pre-inspecciones/""" + "$" + """id<[^/]+>""",
      """SolicitudesPreInspecciones
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:142
  private[this] lazy val controllers_SolicitudesPreInspecciones_pageByCase72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-inspecciones/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_SolicitudesPreInspecciones_pageByCase72_invoker = createInvoker(
    SolicitudesPreInspecciones_7.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreInspecciones",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """solicitudes-pre-inspecciones/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:143
  private[this] lazy val controllers_SolicitudesPreInspecciones_page73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-inspecciones")))
  )
  private[this] lazy val controllers_SolicitudesPreInspecciones_page73_invoker = createInvoker(
    SolicitudesPreInspecciones_7.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreInspecciones",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """solicitudes-pre-inspecciones""",
      """""",
      Seq()
    )
  )

  // @LINE:144
  private[this] lazy val controllers_SolicitudesPreInspecciones_update74_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-inspecciones/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SolicitudesPreInspecciones_update74_invoker = createInvoker(
    SolicitudesPreInspecciones_7.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreInspecciones",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """solicitudes-pre-inspecciones/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:145
  private[this] lazy val controllers_SolicitudesPreInspecciones_save75_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-inspecciones")))
  )
  private[this] lazy val controllers_SolicitudesPreInspecciones_save75_invoker = createInvoker(
    SolicitudesPreInspecciones_7.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreInspecciones",
      "save",
      Nil,
      "POST",
      this.prefix + """solicitudes-pre-inspecciones""",
      """""",
      Seq()
    )
  )

  // @LINE:149
  private[this] lazy val controllers_SolicitudesPreRegistros_get76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-registros/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SolicitudesPreRegistros_get76_invoker = createInvoker(
    SolicitudesPreRegistros_11.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreRegistros",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """solicitudes-pre-registros/""" + "$" + """id<[^/]+>""",
      """SolicitudesPreRegistro
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:150
  private[this] lazy val controllers_SolicitudesPreRegistros_pageByCase77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-registros/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_SolicitudesPreRegistros_pageByCase77_invoker = createInvoker(
    SolicitudesPreRegistros_11.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreRegistros",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """solicitudes-pre-registros/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:151
  private[this] lazy val controllers_SolicitudesPreRegistros_page78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-registros")))
  )
  private[this] lazy val controllers_SolicitudesPreRegistros_page78_invoker = createInvoker(
    SolicitudesPreRegistros_11.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreRegistros",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """solicitudes-pre-registros""",
      """""",
      Seq()
    )
  )

  // @LINE:152
  private[this] lazy val controllers_SolicitudesPreRegistros_update79_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-registros/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SolicitudesPreRegistros_update79_invoker = createInvoker(
    SolicitudesPreRegistros_11.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreRegistros",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """solicitudes-pre-registros/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:153
  private[this] lazy val controllers_SolicitudesPreRegistros_save80_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-registros")))
  )
  private[this] lazy val controllers_SolicitudesPreRegistros_save80_invoker = createInvoker(
    SolicitudesPreRegistros_11.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreRegistros",
      "save",
      Nil,
      "POST",
      this.prefix + """solicitudes-pre-registros""",
      """""",
      Seq()
    )
  )

  // @LINE:157
  private[this] lazy val controllers_SolicitudesPrePericiales_get81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-pericial/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SolicitudesPrePericiales_get81_invoker = createInvoker(
    SolicitudesPrePericiales_23.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPrePericiales",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """solicitudes-pre-pericial/""" + "$" + """id<[^/]+>""",
      """SolicitudesPrePericiales
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:158
  private[this] lazy val controllers_SolicitudesPrePericiales_pageByCase82_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-pericial/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_SolicitudesPrePericiales_pageByCase82_invoker = createInvoker(
    SolicitudesPrePericiales_23.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPrePericiales",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """solicitudes-pre-pericial/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:159
  private[this] lazy val controllers_SolicitudesPrePericiales_page83_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-pericial")))
  )
  private[this] lazy val controllers_SolicitudesPrePericiales_page83_invoker = createInvoker(
    SolicitudesPrePericiales_23.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPrePericiales",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """solicitudes-pre-pericial""",
      """""",
      Seq()
    )
  )

  // @LINE:160
  private[this] lazy val controllers_SolicitudesPrePericiales_update84_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-pericial/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SolicitudesPrePericiales_update84_invoker = createInvoker(
    SolicitudesPrePericiales_23.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPrePericiales",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """solicitudes-pre-pericial/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:161
  private[this] lazy val controllers_SolicitudesPrePericiales_save85_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-pericial")))
  )
  private[this] lazy val controllers_SolicitudesPrePericiales_save85_invoker = createInvoker(
    SolicitudesPrePericiales_23.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPrePericiales",
      "save",
      Nil,
      "POST",
      this.prefix + """solicitudes-pre-pericial""",
      """""",
      Seq()
    )
  )

  // @LINE:165
  private[this] lazy val controllers_SolicitudesPrePolicias_get86_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-policias/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SolicitudesPrePolicias_get86_invoker = createInvoker(
    SolicitudesPrePolicias_17.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPrePolicias",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """solicitudes-pre-policias/""" + "$" + """id<[^/]+>""",
      """SolicitudesPrePolicias
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:166
  private[this] lazy val controllers_SolicitudesPrePolicias_pageByCase87_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-policias/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_SolicitudesPrePolicias_pageByCase87_invoker = createInvoker(
    SolicitudesPrePolicias_17.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPrePolicias",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """solicitudes-pre-policias/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:167
  private[this] lazy val controllers_SolicitudesPrePolicias_page88_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-policias")))
  )
  private[this] lazy val controllers_SolicitudesPrePolicias_page88_invoker = createInvoker(
    SolicitudesPrePolicias_17.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPrePolicias",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """solicitudes-pre-policias""",
      """""",
      Seq()
    )
  )

  // @LINE:168
  private[this] lazy val controllers_SolicitudesPrePolicias_update89_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-policias/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SolicitudesPrePolicias_update89_invoker = createInvoker(
    SolicitudesPrePolicias_17.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPrePolicias",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """solicitudes-pre-policias/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:169
  private[this] lazy val controllers_SolicitudesPrePolicias_save90_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-policias")))
  )
  private[this] lazy val controllers_SolicitudesPrePolicias_save90_invoker = createInvoker(
    SolicitudesPrePolicias_17.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPrePolicias",
      "save",
      Nil,
      "POST",
      this.prefix + """solicitudes-pre-policias""",
      """""",
      Seq()
    )
  )

  // @LINE:173
  private[this] lazy val controllers_SolicitudesPreReqInfo_get91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-info/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SolicitudesPreReqInfo_get91_invoker = createInvoker(
    SolicitudesPreReqInfo_8.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreReqInfo",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """solicitudes-pre-info/""" + "$" + """id<[^/]+>""",
      """SolicitudesPreReqInfo
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:174
  private[this] lazy val controllers_SolicitudesPreReqInfo_pageByCase92_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-info/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_SolicitudesPreReqInfo_pageByCase92_invoker = createInvoker(
    SolicitudesPreReqInfo_8.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreReqInfo",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """solicitudes-pre-info/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:175
  private[this] lazy val controllers_SolicitudesPreReqInfo_page93_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-info")))
  )
  private[this] lazy val controllers_SolicitudesPreReqInfo_page93_invoker = createInvoker(
    SolicitudesPreReqInfo_8.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreReqInfo",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """solicitudes-pre-info""",
      """""",
      Seq()
    )
  )

  // @LINE:176
  private[this] lazy val controllers_SolicitudesPreReqInfo_update94_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-info/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SolicitudesPreReqInfo_update94_invoker = createInvoker(
    SolicitudesPreReqInfo_8.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreReqInfo",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """solicitudes-pre-info/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:177
  private[this] lazy val controllers_SolicitudesPreReqInfo_save95_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-info")))
  )
  private[this] lazy val controllers_SolicitudesPreReqInfo_save95_invoker = createInvoker(
    SolicitudesPreReqInfo_8.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.SolicitudesPreReqInfo",
      "save",
      Nil,
      "POST",
      this.prefix + """solicitudes-pre-info""",
      """""",
      Seq()
    )
  )

  // @LINE:188
  private[this] lazy val controllers_Acuerdos_get96_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("acuerdos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Acuerdos_get96_invoker = createInvoker(
    Acuerdos_10.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Acuerdos",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """acuerdos/""" + "$" + """id<[^/]+>""",
      """Acuerdos
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:189
  private[this] lazy val controllers_Acuerdos_pageByCase97_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("acuerdos/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_Acuerdos_pageByCase97_invoker = createInvoker(
    Acuerdos_10.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Acuerdos",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """acuerdos/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:190
  private[this] lazy val controllers_Acuerdos_listByCaseAndTipo98_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("acuerdos/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tipos")))
  )
  private[this] lazy val controllers_Acuerdos_listByCaseAndTipo98_invoker = createInvoker(
    Acuerdos_10.listByCaseAndTipo(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Acuerdos",
      "listByCaseAndTipo",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """acuerdos/casos/""" + "$" + """id<[^/]+>/tipos""",
      """""",
      Seq()
    )
  )

  // @LINE:191
  private[this] lazy val controllers_Acuerdos_page99_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("acuerdos")))
  )
  private[this] lazy val controllers_Acuerdos_page99_invoker = createInvoker(
    Acuerdos_10.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Acuerdos",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """acuerdos""",
      """""",
      Seq()
    )
  )

  // @LINE:192
  private[this] lazy val controllers_Acuerdos_update100_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("acuerdos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Acuerdos_update100_invoker = createInvoker(
    Acuerdos_10.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Acuerdos",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """acuerdos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:193
  private[this] lazy val controllers_Acuerdos_save101_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("acuerdos")))
  )
  private[this] lazy val controllers_Acuerdos_save101_invoker = createInvoker(
    Acuerdos_10.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Acuerdos",
      "save",
      Nil,
      "POST",
      this.prefix + """acuerdos""",
      """""",
      Seq()
    )
  )

  // @LINE:197
  private[this] lazy val controllers_ArchivosTemporales_get102_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("archivos-temporales/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ArchivosTemporales_get102_invoker = createInvoker(
    ArchivosTemporales_12.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.ArchivosTemporales",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """archivos-temporales/""" + "$" + """id<[^/]+>""",
      """ArchivosTemporales
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:198
  private[this] lazy val controllers_ArchivosTemporales_pageByCase103_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("archivos-temporales/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_ArchivosTemporales_pageByCase103_invoker = createInvoker(
    ArchivosTemporales_12.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.ArchivosTemporales",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """archivos-temporales/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:199
  private[this] lazy val controllers_ArchivosTemporales_page104_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("archivos-temporales")))
  )
  private[this] lazy val controllers_ArchivosTemporales_page104_invoker = createInvoker(
    ArchivosTemporales_12.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.ArchivosTemporales",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """archivos-temporales""",
      """""",
      Seq()
    )
  )

  // @LINE:200
  private[this] lazy val controllers_ArchivosTemporales_update105_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("archivos-temporales/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ArchivosTemporales_update105_invoker = createInvoker(
    ArchivosTemporales_12.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.ArchivosTemporales",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """archivos-temporales/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:201
  private[this] lazy val controllers_ArchivosTemporales_save106_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("archivos-temporales")))
  )
  private[this] lazy val controllers_ArchivosTemporales_save106_invoker = createInvoker(
    ArchivosTemporales_12.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.ArchivosTemporales",
      "save",
      Nil,
      "POST",
      this.prefix + """archivos-temporales""",
      """""",
      Seq()
    )
  )

  // @LINE:205
  private[this] lazy val controllers_FacultadesNoInvestigar_get107_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facultades-no-investigar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FacultadesNoInvestigar_get107_invoker = createInvoker(
    FacultadesNoInvestigar_24.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.FacultadesNoInvestigar",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """facultades-no-investigar/""" + "$" + """id<[^/]+>""",
      """FacultadesNoInvestigar
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:206
  private[this] lazy val controllers_FacultadesNoInvestigar_pageByCase108_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facultades-no-investigar/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_FacultadesNoInvestigar_pageByCase108_invoker = createInvoker(
    FacultadesNoInvestigar_24.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.FacultadesNoInvestigar",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """facultades-no-investigar/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:207
  private[this] lazy val controllers_FacultadesNoInvestigar_page109_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facultades-no-investigar")))
  )
  private[this] lazy val controllers_FacultadesNoInvestigar_page109_invoker = createInvoker(
    FacultadesNoInvestigar_24.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.FacultadesNoInvestigar",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """facultades-no-investigar""",
      """""",
      Seq()
    )
  )

  // @LINE:208
  private[this] lazy val controllers_FacultadesNoInvestigar_update110_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facultades-no-investigar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FacultadesNoInvestigar_update110_invoker = createInvoker(
    FacultadesNoInvestigar_24.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.FacultadesNoInvestigar",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """facultades-no-investigar/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:209
  private[this] lazy val controllers_FacultadesNoInvestigar_save111_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facultades-no-investigar")))
  )
  private[this] lazy val controllers_FacultadesNoInvestigar_save111_invoker = createInvoker(
    FacultadesNoInvestigar_24.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.FacultadesNoInvestigar",
      "save",
      Nil,
      "POST",
      this.prefix + """facultades-no-investigar""",
      """""",
      Seq()
    )
  )

  // @LINE:213
  private[this] lazy val controllers_NoEjerciciosAccionPenal_get112_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("no-ejercicio-accion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NoEjerciciosAccionPenal_get112_invoker = createInvoker(
    NoEjerciciosAccionPenal_18.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.NoEjerciciosAccionPenal",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """no-ejercicio-accion/""" + "$" + """id<[^/]+>""",
      """NoEjercicioAccion
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:214
  private[this] lazy val controllers_NoEjerciciosAccionPenal_pageByCase113_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("no-ejercicio-accion/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_NoEjerciciosAccionPenal_pageByCase113_invoker = createInvoker(
    NoEjerciciosAccionPenal_18.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.NoEjerciciosAccionPenal",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """no-ejercicio-accion/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:215
  private[this] lazy val controllers_NoEjerciciosAccionPenal_page114_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("no-ejercicio-accion")))
  )
  private[this] lazy val controllers_NoEjerciciosAccionPenal_page114_invoker = createInvoker(
    NoEjerciciosAccionPenal_18.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.NoEjerciciosAccionPenal",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """no-ejercicio-accion""",
      """""",
      Seq()
    )
  )

  // @LINE:216
  private[this] lazy val controllers_NoEjerciciosAccionPenal_update115_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("no-ejercicio-accion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NoEjerciciosAccionPenal_update115_invoker = createInvoker(
    NoEjerciciosAccionPenal_18.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.NoEjerciciosAccionPenal",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """no-ejercicio-accion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:217
  private[this] lazy val controllers_NoEjerciciosAccionPenal_save116_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("no-ejercicio-accion")))
  )
  private[this] lazy val controllers_NoEjerciciosAccionPenal_save116_invoker = createInvoker(
    NoEjerciciosAccionPenal_18.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.NoEjerciciosAccionPenal",
      "save",
      Nil,
      "POST",
      this.prefix + """no-ejercicio-accion""",
      """""",
      Seq()
    )
  )

  // @LINE:228
  private[this] lazy val controllers_Entrevistas_get117_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entrevistas/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Entrevistas_get117_invoker = createInvoker(
    Entrevistas_21.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Entrevistas",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """entrevistas/""" + "$" + """id<[^/]+>""",
      """Entrevistas
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:229
  private[this] lazy val controllers_Entrevistas_page118_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entrevistas")))
  )
  private[this] lazy val controllers_Entrevistas_page118_invoker = createInvoker(
    Entrevistas_21.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Entrevistas",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """entrevistas""",
      """""",
      Seq()
    )
  )

  // @LINE:230
  private[this] lazy val controllers_Entrevistas_pageByCase119_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entrevistas/casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_Entrevistas_pageByCase119_invoker = createInvoker(
    Entrevistas_21.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Entrevistas",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """entrevistas/casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:231
  private[this] lazy val controllers_Entrevistas_update120_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entrevistas/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Entrevistas_update120_invoker = createInvoker(
    Entrevistas_21.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Entrevistas",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """entrevistas/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:232
  private[this] lazy val controllers_Entrevistas_save121_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entrevistas")))
  )
  private[this] lazy val controllers_Entrevistas_save121_invoker = createInvoker(
    Entrevistas_21.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Entrevistas",
      "save",
      Nil,
      "POST",
      this.prefix + """entrevistas""",
      """""",
      Seq()
    )
  )

  // @LINE:243
  private[this] lazy val controllers_Usuarios_get122_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Usuarios_get122_invoker = createInvoker(
    Usuarios_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Usuarios",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """usuarios/""" + "$" + """id<[^/]+>""",
      """Usuarios
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:244
  private[this] lazy val controllers_Usuarios_page123_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/page")))
  )
  private[this] lazy val controllers_Usuarios_page123_invoker = createInvoker(
    Usuarios_0.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Usuarios",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """usuarios/page""",
      """""",
      Seq()
    )
  )

  // @LINE:245
  private[this] lazy val controllers_Usuarios_optionsByAgency124_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/agencias/"), DynamicPart("id", """[^/]+""",true), StaticPart("/options")))
  )
  private[this] lazy val controllers_Usuarios_optionsByAgency124_invoker = createInvoker(
    Usuarios_0.optionsByAgency(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Usuarios",
      "optionsByAgency",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """usuarios/agencias/""" + "$" + """id<[^/]+>/options""",
      """""",
      Seq()
    )
  )

  // @LINE:246
  private[this] lazy val controllers_Usuarios_update125_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Usuarios_update125_invoker = createInvoker(
    Usuarios_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Usuarios",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """usuarios/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:247
  private[this] lazy val controllers_Usuarios_save126_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_Usuarios_save126_invoker = createInvoker(
    Usuarios_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.Usuarios",
      "save",
      Nil,
      "POST",
      this.prefix + """usuarios""",
      """""",
      Seq()
    )
  )

  // @LINE:259
  private[this] lazy val controllers_DetalleDelitos_update127_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("detalle-delitos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DetalleDelitos_update127_invoker = createInvoker(
    DetalleDelitos_19.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.DetalleDelitos",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """detalle-delitos/""" + "$" + """id<[^/]+>""",
      """DetalleDelitos
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:273
  private[this] lazy val controllers_NotificacionesController_pageByUser128_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notificaciones/usuario/"), DynamicPart("usr", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_NotificacionesController_pageByUser128_invoker = createInvoker(
    NotificacionesController_6.pageByUser(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.NotificacionesController",
      "pageByUser",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int], classOf[String]),
      "GET",
      this.prefix + """notificaciones/usuario/""" + "$" + """usr<[^/]+>/page""",
      """Notificaciones
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:274
  private[this] lazy val controllers_NotificacionesController_countSinLeer129_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notificaciones/usuario/"), DynamicPart("usr", """[^/]+""",true), StaticPart("/sin-leer")))
  )
  private[this] lazy val controllers_NotificacionesController_countSinLeer129_invoker = createInvoker(
    NotificacionesController_6.countSinLeer(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.NotificacionesController",
      "countSinLeer",
      Seq(classOf[String]),
      "GET",
      this.prefix + """notificaciones/usuario/""" + "$" + """usr<[^/]+>/sin-leer""",
      """""",
      Seq()
    )
  )

  // @LINE:276
  private[this] lazy val controllers_NotificacionesController_countLeido130_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notificaciones/usuario/"), DynamicPart("id", """[^/]+""",true), StaticPart("/leido")))
  )
  private[this] lazy val controllers_NotificacionesController_countLeido130_invoker = createInvoker(
    NotificacionesController_6.countLeido(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "base",
      "controllers.NotificacionesController",
      "countLeido",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """notificaciones/usuario/""" + "$" + """id<[^/]+>/leido""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:10
    case controllers_Casos_get0_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Casos_get0_invoker.call(Casos_14.get(id))
      }
  
    // @LINE:11
    case controllers_Casos_getPropietario1_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Casos_getPropietario1_invoker.call(Casos_14.getPropietario(id))
      }
  
    // @LINE:12
    case controllers_Casos_getAll2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Casos_getAll2_invoker.call(Casos_14.getAll(id))
      }
  
    // @LINE:13
    case controllers_Casos_getDocuments3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Casos_getDocuments3_invoker.call(Casos_14.getDocuments(id))
      }
  
    // @LINE:14
    case controllers_Casos_page4_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_Casos_page4_invoker.call(Casos_14.page(p, s, o, f, tr))
      }
  
    // @LINE:15
    case controllers_Casos_pageByTitular5_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10)), params.fromPath[String]("usr", None)) { (p, s, o, f, tr, usr) =>
        controllers_Casos_pageByTitular5_invoker.call(Casos_14.pageByTitular(p, s, o, f, tr, usr))
      }
  
    // @LINE:16
    case controllers_Casos_pageByFiscalia6_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10)), params.fromPath[String]("fiscalia", None)) { (p, s, o, f, tr, fiscalia) =>
        controllers_Casos_pageByFiscalia6_invoker.call(Casos_14.pageByFiscalia(p, s, o, f, tr, fiscalia))
      }
  
    // @LINE:17
    case controllers_Casos_update7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Casos_update7_invoker.call(Casos_14.update(id))
      }
  
    // @LINE:18
    case controllers_Casos_save8_route(params@_) =>
      call { 
        controllers_Casos_save8_invoker.call(Casos_14.save())
      }
  
    // @LINE:23
    case controllers_Titulares_get9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Titulares_get9_invoker.call(Titulares_2.get(id))
      }
  
    // @LINE:24
    case controllers_Titulares_pageByCase10_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_Titulares_pageByCase10_invoker.call(Titulares_2.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:25
    case controllers_Titulares_update11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Titulares_update11_invoker.call(Titulares_2.update(id))
      }
  
    // @LINE:26
    case controllers_Titulares_save12_route(params@_) =>
      call { 
        controllers_Titulares_save12_invoker.call(Titulares_2.save())
      }
  
    // @LINE:32
    case controllers_PersonasCasos_page13_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_PersonasCasos_page13_invoker.call(PersonasCasos_5.page(p, s, o, f, tr))
      }
  
    // @LINE:33
    case controllers_PersonasCasos_pageByCase14_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_PersonasCasos_pageByCase14_invoker.call(PersonasCasos_5.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:34
    case controllers_PersonasCasos_get15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonasCasos_get15_invoker.call(PersonasCasos_5.get(id))
      }
  
    // @LINE:35
    case controllers_PersonasCasos_list16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonasCasos_list16_invoker.call(PersonasCasos_5.list(id))
      }
  
    // @LINE:36
    case controllers_PersonasCasos_listByCaseAndTipoInterviniente17_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("idTipo", None)) { (id, idTipo) =>
        controllers_PersonasCasos_listByCaseAndTipoInterviniente17_invoker.call(PersonasCasos_5.listByCaseAndTipoInterviniente(id, idTipo))
      }
  
    // @LINE:37
    case controllers_PersonasCasos_update18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonasCasos_update18_invoker.call(PersonasCasos_5.update(id))
      }
  
    // @LINE:38
    case controllers_PersonasCasos_save19_route(params@_) =>
      call { 
        controllers_PersonasCasos_save19_invoker.call(PersonasCasos_5.save())
      }
  
    // @LINE:43
    case controllers_DelitosCasos_page20_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_DelitosCasos_page20_invoker.call(DelitosCasos_13.page(p, s, o, f, tr))
      }
  
    // @LINE:44
    case controllers_DelitosCasos_pageByCase21_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_DelitosCasos_pageByCase21_invoker.call(DelitosCasos_13.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:45
    case controllers_DelitosCasos_get22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DelitosCasos_get22_invoker.call(DelitosCasos_13.get(id))
      }
  
    // @LINE:46
    case controllers_DelitosCasos_setDefault23_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("idCaso", None)) { (id, idCaso) =>
        controllers_DelitosCasos_setDefault23_invoker.call(DelitosCasos_13.setDefault(id, idCaso))
      }
  
    // @LINE:47
    case controllers_DelitosCasos_list24_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DelitosCasos_list24_invoker.call(DelitosCasos_13.list(id))
      }
  
    // @LINE:48
    case controllers_DelitosCasos_update25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DelitosCasos_update25_invoker.call(DelitosCasos_13.update(id))
      }
  
    // @LINE:49
    case controllers_DelitosCasos_save26_route(params@_) =>
      call { 
        controllers_DelitosCasos_save26_invoker.call(DelitosCasos_13.save())
      }
  
    // @LINE:53
    case controllers_Armas_get27_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Armas_get27_invoker.call(Armas_9.get(id))
      }
  
    // @LINE:54
    case controllers_Armas_list28_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Armas_list28_invoker.call(Armas_9.list(id))
      }
  
    // @LINE:55
    case controllers_Armas_page29_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_Armas_page29_invoker.call(Armas_9.page(p, s, o, f, tr))
      }
  
    // @LINE:56
    case controllers_Armas_pageByCase30_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_Armas_pageByCase30_invoker.call(Armas_9.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:57
    case controllers_Armas_update31_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Armas_update31_invoker.call(Armas_9.update(id))
      }
  
    // @LINE:58
    case controllers_Armas_save32_route(params@_) =>
      call { 
        controllers_Armas_save32_invoker.call(Armas_9.save())
      }
  
    // @LINE:63
    case controllers_Relaciones_get33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Relaciones_get33_invoker.call(Relaciones_22.get(id))
      }
  
    // @LINE:64
    case controllers_Relaciones_page34_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_Relaciones_page34_invoker.call(Relaciones_22.page(p, s, o, f, tr))
      }
  
    // @LINE:65
    case controllers_Relaciones_pageByCase35_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_Relaciones_pageByCase35_invoker.call(Relaciones_22.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:66
    case controllers_Relaciones_update36_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Relaciones_update36_invoker.call(Relaciones_22.update(id))
      }
  
    // @LINE:67
    case controllers_Relaciones_save37_route(params@_) =>
      call { 
        controllers_Relaciones_save37_invoker.call(Relaciones_22.save())
      }
  
    // @LINE:71
    case controllers_Vehiculos_get38_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Vehiculos_get38_invoker.call(Vehiculos_4.get(id))
      }
  
    // @LINE:72
    case controllers_Vehiculos_list39_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Vehiculos_list39_invoker.call(Vehiculos_4.list(id))
      }
  
    // @LINE:73
    case controllers_Vehiculos_page40_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_Vehiculos_page40_invoker.call(Vehiculos_4.page(p, s, o, f, tr))
      }
  
    // @LINE:74
    case controllers_Vehiculos_pageByCase41_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_Vehiculos_pageByCase41_invoker.call(Vehiculos_4.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:75
    case controllers_Vehiculos_update42_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Vehiculos_update42_invoker.call(Vehiculos_4.update(id))
      }
  
    // @LINE:76
    case controllers_Vehiculos_save43_route(params@_) =>
      call { 
        controllers_Vehiculos_save43_invoker.call(Vehiculos_4.save())
      }
  
    // @LINE:80
    case controllers_Lugares_get44_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Lugares_get44_invoker.call(Lugares_1.get(id))
      }
  
    // @LINE:81
    case controllers_Lugares_list45_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Lugares_list45_invoker.call(Lugares_1.list(id))
      }
  
    // @LINE:82
    case controllers_Lugares_page46_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_Lugares_page46_invoker.call(Lugares_1.page(p, s, o, f, tr))
      }
  
    // @LINE:83
    case controllers_Lugares_pageByCase47_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_Lugares_pageByCase47_invoker.call(Lugares_1.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:84
    case controllers_Lugares_update48_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Lugares_update48_invoker.call(Lugares_1.update(id))
      }
  
    // @LINE:85
    case controllers_Lugares_save49_route(params@_) =>
      call { 
        controllers_Lugares_save49_invoker.call(Lugares_1.save())
      }
  
    // @LINE:90
    case controllers_Personas_get50_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Personas_get50_invoker.call(Personas_3.get(id))
      }
  
    // @LINE:91
    case controllers_Personas_page51_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_Personas_page51_invoker.call(Personas_3.page(p, s, o, f, tr))
      }
  
    // @LINE:92
    case controllers_Personas_update52_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Personas_update52_invoker.call(Personas_3.update(id))
      }
  
    // @LINE:93
    case controllers_Personas_save53_route(params@_) =>
      call { 
        controllers_Personas_save53_invoker.call(Personas_3.save())
      }
  
    // @LINE:97
    case controllers_TipoRelacionesPersonas_page54_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_TipoRelacionesPersonas_page54_invoker.call(TipoRelacionesPersonas_16.page(p, s, o, f, tr))
      }
  
    // @LINE:99
    case controllers_TipoRelacionesPersonas_pageByCase55_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("caso.created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_TipoRelacionesPersonas_pageByCase55_invoker.call(TipoRelacionesPersonas_16.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:100
    case controllers_TipoRelacionesPersonas_list56_route(params@_) =>
      call { 
        controllers_TipoRelacionesPersonas_list56_invoker.call(TipoRelacionesPersonas_16.list)
      }
  
    // @LINE:101
    case controllers_TipoRelacionesPersonas_get57_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoRelacionesPersonas_get57_invoker.call(TipoRelacionesPersonas_16.get(id))
      }
  
    // @LINE:102
    case controllers_TipoRelacionesPersonas_update58_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoRelacionesPersonas_update58_invoker.call(TipoRelacionesPersonas_16.update(id))
      }
  
    // @LINE:103
    case controllers_TipoRelacionesPersonas_save59_route(params@_) =>
      call { 
        controllers_TipoRelacionesPersonas_save59_invoker.call(TipoRelacionesPersonas_16.save())
      }
  
    // @LINE:116
    case controllers_Predenuncias_get60_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Predenuncias_get60_invoker.call(Predenuncias_20.get(id))
      }
  
    // @LINE:117
    case controllers_Predenuncias_pageByCase61_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_Predenuncias_pageByCase61_invoker.call(Predenuncias_20.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:118
    case controllers_Predenuncias_page62_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_Predenuncias_page62_invoker.call(Predenuncias_20.page(p, s, o, f, tr))
      }
  
    // @LINE:119
    case controllers_Predenuncias_getByCase63_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Predenuncias_getByCase63_invoker.call(Predenuncias_20.getByCase(id))
      }
  
    // @LINE:120
    case controllers_Predenuncias_update64_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Predenuncias_update64_invoker.call(Predenuncias_20.update(id))
      }
  
    // @LINE:121
    case controllers_Predenuncias_save65_route(params@_) =>
      call { 
        controllers_Predenuncias_save65_invoker.call(Predenuncias_20.save())
      }
  
    // @LINE:133
    case controllers_SolicitudesPreAcuerdos_get66_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SolicitudesPreAcuerdos_get66_invoker.call(SolicitudesPreAcuerdos_15.get(id))
      }
  
    // @LINE:134
    case controllers_SolicitudesPreAcuerdos_pageByCase67_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_SolicitudesPreAcuerdos_pageByCase67_invoker.call(SolicitudesPreAcuerdos_15.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:135
    case controllers_SolicitudesPreAcuerdos_page68_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_SolicitudesPreAcuerdos_page68_invoker.call(SolicitudesPreAcuerdos_15.page(p, s, o, f, tr))
      }
  
    // @LINE:136
    case controllers_SolicitudesPreAcuerdos_update69_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SolicitudesPreAcuerdos_update69_invoker.call(SolicitudesPreAcuerdos_15.update(id))
      }
  
    // @LINE:137
    case controllers_SolicitudesPreAcuerdos_save70_route(params@_) =>
      call { 
        controllers_SolicitudesPreAcuerdos_save70_invoker.call(SolicitudesPreAcuerdos_15.save())
      }
  
    // @LINE:141
    case controllers_SolicitudesPreInspecciones_get71_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SolicitudesPreInspecciones_get71_invoker.call(SolicitudesPreInspecciones_7.get(id))
      }
  
    // @LINE:142
    case controllers_SolicitudesPreInspecciones_pageByCase72_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_SolicitudesPreInspecciones_pageByCase72_invoker.call(SolicitudesPreInspecciones_7.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:143
    case controllers_SolicitudesPreInspecciones_page73_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_SolicitudesPreInspecciones_page73_invoker.call(SolicitudesPreInspecciones_7.page(p, s, o, f, tr))
      }
  
    // @LINE:144
    case controllers_SolicitudesPreInspecciones_update74_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SolicitudesPreInspecciones_update74_invoker.call(SolicitudesPreInspecciones_7.update(id))
      }
  
    // @LINE:145
    case controllers_SolicitudesPreInspecciones_save75_route(params@_) =>
      call { 
        controllers_SolicitudesPreInspecciones_save75_invoker.call(SolicitudesPreInspecciones_7.save())
      }
  
    // @LINE:149
    case controllers_SolicitudesPreRegistros_get76_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SolicitudesPreRegistros_get76_invoker.call(SolicitudesPreRegistros_11.get(id))
      }
  
    // @LINE:150
    case controllers_SolicitudesPreRegistros_pageByCase77_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_SolicitudesPreRegistros_pageByCase77_invoker.call(SolicitudesPreRegistros_11.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:151
    case controllers_SolicitudesPreRegistros_page78_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_SolicitudesPreRegistros_page78_invoker.call(SolicitudesPreRegistros_11.page(p, s, o, f, tr))
      }
  
    // @LINE:152
    case controllers_SolicitudesPreRegistros_update79_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SolicitudesPreRegistros_update79_invoker.call(SolicitudesPreRegistros_11.update(id))
      }
  
    // @LINE:153
    case controllers_SolicitudesPreRegistros_save80_route(params@_) =>
      call { 
        controllers_SolicitudesPreRegistros_save80_invoker.call(SolicitudesPreRegistros_11.save())
      }
  
    // @LINE:157
    case controllers_SolicitudesPrePericiales_get81_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SolicitudesPrePericiales_get81_invoker.call(SolicitudesPrePericiales_23.get(id))
      }
  
    // @LINE:158
    case controllers_SolicitudesPrePericiales_pageByCase82_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_SolicitudesPrePericiales_pageByCase82_invoker.call(SolicitudesPrePericiales_23.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:159
    case controllers_SolicitudesPrePericiales_page83_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_SolicitudesPrePericiales_page83_invoker.call(SolicitudesPrePericiales_23.page(p, s, o, f, tr))
      }
  
    // @LINE:160
    case controllers_SolicitudesPrePericiales_update84_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SolicitudesPrePericiales_update84_invoker.call(SolicitudesPrePericiales_23.update(id))
      }
  
    // @LINE:161
    case controllers_SolicitudesPrePericiales_save85_route(params@_) =>
      call { 
        controllers_SolicitudesPrePericiales_save85_invoker.call(SolicitudesPrePericiales_23.save())
      }
  
    // @LINE:165
    case controllers_SolicitudesPrePolicias_get86_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SolicitudesPrePolicias_get86_invoker.call(SolicitudesPrePolicias_17.get(id))
      }
  
    // @LINE:166
    case controllers_SolicitudesPrePolicias_pageByCase87_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_SolicitudesPrePolicias_pageByCase87_invoker.call(SolicitudesPrePolicias_17.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:167
    case controllers_SolicitudesPrePolicias_page88_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_SolicitudesPrePolicias_page88_invoker.call(SolicitudesPrePolicias_17.page(p, s, o, f, tr))
      }
  
    // @LINE:168
    case controllers_SolicitudesPrePolicias_update89_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SolicitudesPrePolicias_update89_invoker.call(SolicitudesPrePolicias_17.update(id))
      }
  
    // @LINE:169
    case controllers_SolicitudesPrePolicias_save90_route(params@_) =>
      call { 
        controllers_SolicitudesPrePolicias_save90_invoker.call(SolicitudesPrePolicias_17.save())
      }
  
    // @LINE:173
    case controllers_SolicitudesPreReqInfo_get91_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SolicitudesPreReqInfo_get91_invoker.call(SolicitudesPreReqInfo_8.get(id))
      }
  
    // @LINE:174
    case controllers_SolicitudesPreReqInfo_pageByCase92_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_SolicitudesPreReqInfo_pageByCase92_invoker.call(SolicitudesPreReqInfo_8.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:175
    case controllers_SolicitudesPreReqInfo_page93_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_SolicitudesPreReqInfo_page93_invoker.call(SolicitudesPreReqInfo_8.page(p, s, o, f, tr))
      }
  
    // @LINE:176
    case controllers_SolicitudesPreReqInfo_update94_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SolicitudesPreReqInfo_update94_invoker.call(SolicitudesPreReqInfo_8.update(id))
      }
  
    // @LINE:177
    case controllers_SolicitudesPreReqInfo_save95_route(params@_) =>
      call { 
        controllers_SolicitudesPreReqInfo_save95_invoker.call(SolicitudesPreReqInfo_8.save())
      }
  
    // @LINE:188
    case controllers_Acuerdos_get96_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Acuerdos_get96_invoker.call(Acuerdos_10.get(id))
      }
  
    // @LINE:189
    case controllers_Acuerdos_pageByCase97_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_Acuerdos_pageByCase97_invoker.call(Acuerdos_10.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:190
    case controllers_Acuerdos_listByCaseAndTipo98_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[String]("tipo", Some(""))) { (id, tipo) =>
        controllers_Acuerdos_listByCaseAndTipo98_invoker.call(Acuerdos_10.listByCaseAndTipo(id, tipo))
      }
  
    // @LINE:191
    case controllers_Acuerdos_page99_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_Acuerdos_page99_invoker.call(Acuerdos_10.page(p, s, o, f, tr))
      }
  
    // @LINE:192
    case controllers_Acuerdos_update100_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Acuerdos_update100_invoker.call(Acuerdos_10.update(id))
      }
  
    // @LINE:193
    case controllers_Acuerdos_save101_route(params@_) =>
      call { 
        controllers_Acuerdos_save101_invoker.call(Acuerdos_10.save())
      }
  
    // @LINE:197
    case controllers_ArchivosTemporales_get102_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ArchivosTemporales_get102_invoker.call(ArchivosTemporales_12.get(id))
      }
  
    // @LINE:198
    case controllers_ArchivosTemporales_pageByCase103_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_ArchivosTemporales_pageByCase103_invoker.call(ArchivosTemporales_12.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:199
    case controllers_ArchivosTemporales_page104_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_ArchivosTemporales_page104_invoker.call(ArchivosTemporales_12.page(p, s, o, f, tr))
      }
  
    // @LINE:200
    case controllers_ArchivosTemporales_update105_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ArchivosTemporales_update105_invoker.call(ArchivosTemporales_12.update(id))
      }
  
    // @LINE:201
    case controllers_ArchivosTemporales_save106_route(params@_) =>
      call { 
        controllers_ArchivosTemporales_save106_invoker.call(ArchivosTemporales_12.save())
      }
  
    // @LINE:205
    case controllers_FacultadesNoInvestigar_get107_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FacultadesNoInvestigar_get107_invoker.call(FacultadesNoInvestigar_24.get(id))
      }
  
    // @LINE:206
    case controllers_FacultadesNoInvestigar_pageByCase108_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_FacultadesNoInvestigar_pageByCase108_invoker.call(FacultadesNoInvestigar_24.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:207
    case controllers_FacultadesNoInvestigar_page109_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_FacultadesNoInvestigar_page109_invoker.call(FacultadesNoInvestigar_24.page(p, s, o, f, tr))
      }
  
    // @LINE:208
    case controllers_FacultadesNoInvestigar_update110_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FacultadesNoInvestigar_update110_invoker.call(FacultadesNoInvestigar_24.update(id))
      }
  
    // @LINE:209
    case controllers_FacultadesNoInvestigar_save111_route(params@_) =>
      call { 
        controllers_FacultadesNoInvestigar_save111_invoker.call(FacultadesNoInvestigar_24.save())
      }
  
    // @LINE:213
    case controllers_NoEjerciciosAccionPenal_get112_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NoEjerciciosAccionPenal_get112_invoker.call(NoEjerciciosAccionPenal_18.get(id))
      }
  
    // @LINE:214
    case controllers_NoEjerciciosAccionPenal_pageByCase113_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_NoEjerciciosAccionPenal_pageByCase113_invoker.call(NoEjerciciosAccionPenal_18.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:215
    case controllers_NoEjerciciosAccionPenal_page114_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_NoEjerciciosAccionPenal_page114_invoker.call(NoEjerciciosAccionPenal_18.page(p, s, o, f, tr))
      }
  
    // @LINE:216
    case controllers_NoEjerciciosAccionPenal_update115_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NoEjerciciosAccionPenal_update115_invoker.call(NoEjerciciosAccionPenal_18.update(id))
      }
  
    // @LINE:217
    case controllers_NoEjerciciosAccionPenal_save116_route(params@_) =>
      call { 
        controllers_NoEjerciciosAccionPenal_save116_invoker.call(NoEjerciciosAccionPenal_18.save())
      }
  
    // @LINE:228
    case controllers_Entrevistas_get117_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Entrevistas_get117_invoker.call(Entrevistas_21.get(id))
      }
  
    // @LINE:229
    case controllers_Entrevistas_page118_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_Entrevistas_page118_invoker.call(Entrevistas_21.page(p, s, o, f, tr))
      }
  
    // @LINE:230
    case controllers_Entrevistas_pageByCase119_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_Entrevistas_pageByCase119_invoker.call(Entrevistas_21.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:231
    case controllers_Entrevistas_update120_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Entrevistas_update120_invoker.call(Entrevistas_21.update(id))
      }
  
    // @LINE:232
    case controllers_Entrevistas_save121_route(params@_) =>
      call { 
        controllers_Entrevistas_save121_invoker.call(Entrevistas_21.save())
      }
  
    // @LINE:243
    case controllers_Usuarios_get122_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Usuarios_get122_invoker.call(Usuarios_0.get(id))
      }
  
    // @LINE:244
    case controllers_Usuarios_page123_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_Usuarios_page123_invoker.call(Usuarios_0.page(p, s, o, f, tr))
      }
  
    // @LINE:245
    case controllers_Usuarios_optionsByAgency124_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Usuarios_optionsByAgency124_invoker.call(Usuarios_0.optionsByAgency(id))
      }
  
    // @LINE:246
    case controllers_Usuarios_update125_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Usuarios_update125_invoker.call(Usuarios_0.update(id))
      }
  
    // @LINE:247
    case controllers_Usuarios_save126_route(params@_) =>
      call { 
        controllers_Usuarios_save126_invoker.call(Usuarios_0.save())
      }
  
    // @LINE:259
    case controllers_DetalleDelitos_update127_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DetalleDelitos_update127_invoker.call(DetalleDelitos_19.update(id))
      }
  
    // @LINE:273
    case controllers_NotificacionesController_pageByUser128_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10)), params.fromPath[String]("usr", None)) { (p, s, o, f, tr, usr) =>
        controllers_NotificacionesController_pageByUser128_invoker.call(NotificacionesController_6.pageByUser(p, s, o, f, tr, usr))
      }
  
    // @LINE:274
    case controllers_NotificacionesController_countSinLeer129_route(params@_) =>
      call(params.fromPath[String]("usr", None)) { (usr) =>
        controllers_NotificacionesController_countSinLeer129_invoker.call(NotificacionesController_6.countSinLeer(usr))
      }
  
    // @LINE:276
    case controllers_NotificacionesController_countLeido130_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NotificacionesController_countLeido130_invoker.call(NotificacionesController_6.countLeido(id))
      }
  }
}
