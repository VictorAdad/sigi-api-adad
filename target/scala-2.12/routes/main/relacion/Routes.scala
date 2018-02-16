
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/relacion.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package relacion

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:10
  ClasificacionDelitoController_7: controllers.ClasificacionDelitoController,
  // @LINE:21
  ClasificacionDelitoOrdenController_13: controllers.ClasificacionDelitoOrdenController,
  // @LINE:32
  ConcursoDelitoController_5: controllers.ConcursoDelitoController,
  // @LINE:43
  ConductaDetalleController_11: controllers.ConductaDetalleController,
  // @LINE:54
  EfectoDetalleController_0: controllers.EfectoDetalleController,
  // @LINE:66
  ElementoComisionController_3: controllers.ElementoComisionController,
  // @LINE:76
  FormaAccionController_4: controllers.FormaAccionController,
  // @LINE:86
  FormaComisionController_12: controllers.FormaComisionController,
  // @LINE:97
  FormaConductaController_10: controllers.FormaConductaController,
  // @LINE:108
  GradoParticipacionController_9: controllers.GradoParticipacionController,
  // @LINE:119
  ModalidadAmbitoController_6: controllers.ModalidadAmbitoController,
  // @LINE:130
  ModalidadDelitoController_8: controllers.ModalidadDelitoController,
  // @LINE:141
  TipoTransportacionController_14: controllers.TipoTransportacionController,
  // @LINE:152
  ViolenciaGeneroController_1: controllers.ViolenciaGeneroController,
  // @LINE:161
  DesaparicionConsumacionController_2: controllers.DesaparicionConsumacionController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:10
    ClasificacionDelitoController_7: controllers.ClasificacionDelitoController,
    // @LINE:21
    ClasificacionDelitoOrdenController_13: controllers.ClasificacionDelitoOrdenController,
    // @LINE:32
    ConcursoDelitoController_5: controllers.ConcursoDelitoController,
    // @LINE:43
    ConductaDetalleController_11: controllers.ConductaDetalleController,
    // @LINE:54
    EfectoDetalleController_0: controllers.EfectoDetalleController,
    // @LINE:66
    ElementoComisionController_3: controllers.ElementoComisionController,
    // @LINE:76
    FormaAccionController_4: controllers.FormaAccionController,
    // @LINE:86
    FormaComisionController_12: controllers.FormaComisionController,
    // @LINE:97
    FormaConductaController_10: controllers.FormaConductaController,
    // @LINE:108
    GradoParticipacionController_9: controllers.GradoParticipacionController,
    // @LINE:119
    ModalidadAmbitoController_6: controllers.ModalidadAmbitoController,
    // @LINE:130
    ModalidadDelitoController_8: controllers.ModalidadDelitoController,
    // @LINE:141
    TipoTransportacionController_14: controllers.TipoTransportacionController,
    // @LINE:152
    ViolenciaGeneroController_1: controllers.ViolenciaGeneroController,
    // @LINE:161
    DesaparicionConsumacionController_2: controllers.DesaparicionConsumacionController
  ) = this(errorHandler, ClasificacionDelitoController_7, ClasificacionDelitoOrdenController_13, ConcursoDelitoController_5, ConductaDetalleController_11, EfectoDetalleController_0, ElementoComisionController_3, FormaAccionController_4, FormaComisionController_12, FormaConductaController_10, GradoParticipacionController_9, ModalidadAmbitoController_6, ModalidadDelitoController_8, TipoTransportacionController_14, ViolenciaGeneroController_1, DesaparicionConsumacionController_2, "/")

  def withPrefix(prefix: String): Routes = {
    relacion.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ClasificacionDelitoController_7, ClasificacionDelitoOrdenController_13, ConcursoDelitoController_5, ConductaDetalleController_11, EfectoDetalleController_0, ElementoComisionController_3, FormaAccionController_4, FormaComisionController_12, FormaConductaController_10, GradoParticipacionController_9, ModalidadAmbitoController_6, ModalidadDelitoController_8, TipoTransportacionController_14, ViolenciaGeneroController_1, DesaparicionConsumacionController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito/page""", """controllers.ClasificacionDelitoController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito/options""", """controllers.ClasificacionDelitoController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito""", """controllers.ClasificacionDelitoController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito/""" + "$" + """id<[^/]+>""", """controllers.ClasificacionDelitoController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito/""" + "$" + """id<[^/]+>""", """controllers.ClasificacionDelitoController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito""", """controllers.ClasificacionDelitoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito/""" + "$" + """id<[^/]+>""", """controllers.ClasificacionDelitoController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito-orden/page""", """controllers.ClasificacionDelitoOrdenController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito-orden/options""", """controllers.ClasificacionDelitoOrdenController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito-orden""", """controllers.ClasificacionDelitoOrdenController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito-orden/""" + "$" + """id<[^/]+>""", """controllers.ClasificacionDelitoOrdenController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito-orden/""" + "$" + """id<[^/]+>""", """controllers.ClasificacionDelitoOrdenController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito-orden""", """controllers.ClasificacionDelitoOrdenController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clasificacion-delito-orden/""" + "$" + """id<[^/]+>""", """controllers.ClasificacionDelitoOrdenController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """concurso-delito/page""", """controllers.ConcursoDelitoController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """concurso-delito/options""", """controllers.ConcursoDelitoController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """concurso-delito""", """controllers.ConcursoDelitoController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """concurso-delito/""" + "$" + """id<[^/]+>""", """controllers.ConcursoDelitoController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """concurso-delito/""" + "$" + """id<[^/]+>""", """controllers.ConcursoDelitoController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """concurso-delito""", """controllers.ConcursoDelitoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """concurso-delito/""" + "$" + """id<[^/]+>""", """controllers.ConcursoDelitoController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """conducta-detalle/page""", """controllers.ConductaDetalleController.page(p:Int ?= 0, s:String ?= "conducta", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """conducta-detalle/options""", """controllers.ConductaDetalleController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """conducta-detalle""", """controllers.ConductaDetalleController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """conducta-detalle/""" + "$" + """id<[^/]+>""", """controllers.ConductaDetalleController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """conducta-detalle/""" + "$" + """id<[^/]+>""", """controllers.ConductaDetalleController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """conducta-detalle""", """controllers.ConductaDetalleController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """conducta-detalle/""" + "$" + """id<[^/]+>""", """controllers.ConductaDetalleController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """efecto-detalle/page""", """controllers.EfectoDetalleController.page(p:Int ?= 0, s:String ?= "efecto", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """efecto-detalle/options""", """controllers.EfectoDetalleController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """efecto-detalle""", """controllers.EfectoDetalleController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """efecto-detalle/""" + "$" + """id<[^/]+>""", """controllers.EfectoDetalleController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """efecto-detalle/""" + "$" + """id<[^/]+>""", """controllers.EfectoDetalleController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """efecto-detalle""", """controllers.EfectoDetalleController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """efecto-detalle/""" + "$" + """id<[^/]+>""", """controllers.EfectoDetalleController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """elemento-comision/page""", """controllers.ElementoComisionController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """elemento-comision/options""", """controllers.ElementoComisionController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """elemento-comision""", """controllers.ElementoComisionController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """elemento-comision/""" + "$" + """id<[^/]+>""", """controllers.ElementoComisionController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """elemento-comision/""" + "$" + """id<[^/]+>""", """controllers.ElementoComisionController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """elemento-comision""", """controllers.ElementoComisionController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """elemento-comision/""" + "$" + """id<[^/]+>""", """controllers.ElementoComisionController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-accion/page""", """controllers.FormaAccionController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-accion/options""", """controllers.FormaAccionController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-accion""", """controllers.FormaAccionController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-accion/""" + "$" + """id<[^/]+>""", """controllers.FormaAccionController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-accion/""" + "$" + """id<[^/]+>""", """controllers.FormaAccionController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-accion""", """controllers.FormaAccionController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-accion/""" + "$" + """id<[^/]+>""", """controllers.FormaAccionController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-comision/page""", """controllers.FormaComisionController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-comision/options""", """controllers.FormaComisionController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-comision""", """controllers.FormaComisionController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-comision/""" + "$" + """id<[^/]+>""", """controllers.FormaComisionController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-comision/""" + "$" + """id<[^/]+>""", """controllers.FormaComisionController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-comision""", """controllers.FormaComisionController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-comision/""" + "$" + """id<[^/]+>""", """controllers.FormaComisionController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-conducta/page""", """controllers.FormaConductaController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-conducta/options""", """controllers.FormaConductaController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-conducta""", """controllers.FormaConductaController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-conducta/""" + "$" + """id<[^/]+>""", """controllers.FormaConductaController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-conducta/""" + "$" + """id<[^/]+>""", """controllers.FormaConductaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-conducta""", """controllers.FormaConductaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forma-conducta/""" + "$" + """id<[^/]+>""", """controllers.FormaConductaController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grado-participacion/page""", """controllers.GradoParticipacionController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grado-participacion/options""", """controllers.GradoParticipacionController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grado-participacion""", """controllers.GradoParticipacionController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grado-participacion/""" + "$" + """id<[^/]+>""", """controllers.GradoParticipacionController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grado-participacion/""" + "$" + """id<[^/]+>""", """controllers.GradoParticipacionController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grado-participacion""", """controllers.GradoParticipacionController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grado-participacion/""" + "$" + """id<[^/]+>""", """controllers.GradoParticipacionController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modalidad-ambito/page""", """controllers.ModalidadAmbitoController.page(p:Int ?= 0, s:String ?= "modalidad", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modalidad-ambito""", """controllers.ModalidadAmbitoController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modalidad-ambito/""" + "$" + """id<[^/]+>""", """controllers.ModalidadAmbitoController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modalidad-ambito/""" + "$" + """id<[^/]+>""", """controllers.ModalidadAmbitoController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modalidad-ambito""", """controllers.ModalidadAmbitoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modalidad-ambito/""" + "$" + """id<[^/]+>""", """controllers.ModalidadAmbitoController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modalidad-delito/page""", """controllers.ModalidadDelitoController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modalidad-delito/options""", """controllers.ModalidadDelitoController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modalidad-delito""", """controllers.ModalidadDelitoController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modalidad-delito/""" + "$" + """id<[^/]+>""", """controllers.ModalidadDelitoController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modalidad-delito/""" + "$" + """id<[^/]+>""", """controllers.ModalidadDelitoController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modalidad-delito""", """controllers.ModalidadDelitoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modalidad-delito/""" + "$" + """id<[^/]+>""", """controllers.ModalidadDelitoController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-transportacion/page""", """controllers.TipoTransportacionController.page(p:Int ?= 0, s:String ?= "tipo", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-transportacion/options""", """controllers.TipoTransportacionController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-transportacion""", """controllers.TipoTransportacionController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-transportacion/""" + "$" + """id<[^/]+>""", """controllers.TipoTransportacionController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-transportacion/""" + "$" + """id<[^/]+>""", """controllers.TipoTransportacionController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-transportacion""", """controllers.TipoTransportacionController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-transportacion/""" + "$" + """id<[^/]+>""", """controllers.TipoTransportacionController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """violencia-genero""", """controllers.ViolenciaGeneroController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """violencia-genero/""" + "$" + """id<[^/]+>""", """controllers.ViolenciaGeneroController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """violencia-genero/""" + "$" + """id<[^/]+>""", """controllers.ViolenciaGeneroController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """violencia-genero""", """controllers.ViolenciaGeneroController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """violencia-genero/""" + "$" + """id<[^/]+>""", """controllers.ViolenciaGeneroController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """desaparicion-consumacion/""" + "$" + """id<[^/]+>""", """controllers.DesaparicionConsumacionController.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """desaparicion-consumacion""", """controllers.DesaparicionConsumacionController.list()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """desaparicion-consumacion/""" + "$" + """id<[^/]+>""", """controllers.DesaparicionConsumacionController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """desaparicion-consumacion""", """controllers.DesaparicionConsumacionController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """desaparicion-consumacion/""" + "$" + """id<[^/]+>""", """controllers.DesaparicionConsumacionController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_ClasificacionDelitoController_page0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito/page")))
  )
  private[this] lazy val controllers_ClasificacionDelitoController_page0_invoker = createInvoker(
    ClasificacionDelitoController_7.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """clasificacion-delito/page""",
      """Clasificacion Delito
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ClasificacionDelitoController_options1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito/options")))
  )
  private[this] lazy val controllers_ClasificacionDelitoController_options1_invoker = createInvoker(
    ClasificacionDelitoController_7.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoController",
      "options",
      Nil,
      "GET",
      this.prefix + """clasificacion-delito/options""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ClasificacionDelitoController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito")))
  )
  private[this] lazy val controllers_ClasificacionDelitoController_list2_invoker = createInvoker(
    ClasificacionDelitoController_7.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoController",
      "list",
      Nil,
      "GET",
      this.prefix + """clasificacion-delito""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ClasificacionDelitoController_get3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClasificacionDelitoController_get3_invoker = createInvoker(
    ClasificacionDelitoController_7.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """clasificacion-delito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ClasificacionDelitoController_update4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClasificacionDelitoController_update4_invoker = createInvoker(
    ClasificacionDelitoController_7.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """clasificacion-delito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ClasificacionDelitoController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito")))
  )
  private[this] lazy val controllers_ClasificacionDelitoController_save5_invoker = createInvoker(
    ClasificacionDelitoController_7.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoController",
      "save",
      Nil,
      "POST",
      this.prefix + """clasificacion-delito""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ClasificacionDelitoController_delete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClasificacionDelitoController_delete6_invoker = createInvoker(
    ClasificacionDelitoController_7.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """clasificacion-delito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_page7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito-orden/page")))
  )
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_page7_invoker = createInvoker(
    ClasificacionDelitoOrdenController_13.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoOrdenController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """clasificacion-delito-orden/page""",
      """Clasificacion Delito Orden
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_options8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito-orden/options")))
  )
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_options8_invoker = createInvoker(
    ClasificacionDelitoOrdenController_13.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoOrdenController",
      "options",
      Nil,
      "GET",
      this.prefix + """clasificacion-delito-orden/options""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_list9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito-orden")))
  )
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_list9_invoker = createInvoker(
    ClasificacionDelitoOrdenController_13.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoOrdenController",
      "list",
      Nil,
      "GET",
      this.prefix + """clasificacion-delito-orden""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_get10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito-orden/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_get10_invoker = createInvoker(
    ClasificacionDelitoOrdenController_13.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoOrdenController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """clasificacion-delito-orden/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_update11_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito-orden/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_update11_invoker = createInvoker(
    ClasificacionDelitoOrdenController_13.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoOrdenController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """clasificacion-delito-orden/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_save12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito-orden")))
  )
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_save12_invoker = createInvoker(
    ClasificacionDelitoOrdenController_13.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoOrdenController",
      "save",
      Nil,
      "POST",
      this.prefix + """clasificacion-delito-orden""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_delete13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clasificacion-delito-orden/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClasificacionDelitoOrdenController_delete13_invoker = createInvoker(
    ClasificacionDelitoOrdenController_13.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ClasificacionDelitoOrdenController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """clasificacion-delito-orden/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ConcursoDelitoController_page14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("concurso-delito/page")))
  )
  private[this] lazy val controllers_ConcursoDelitoController_page14_invoker = createInvoker(
    ConcursoDelitoController_5.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConcursoDelitoController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """concurso-delito/page""",
      """Concurso Delito
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ConcursoDelitoController_options15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("concurso-delito/options")))
  )
  private[this] lazy val controllers_ConcursoDelitoController_options15_invoker = createInvoker(
    ConcursoDelitoController_5.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConcursoDelitoController",
      "options",
      Nil,
      "GET",
      this.prefix + """concurso-delito/options""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ConcursoDelitoController_list16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("concurso-delito")))
  )
  private[this] lazy val controllers_ConcursoDelitoController_list16_invoker = createInvoker(
    ConcursoDelitoController_5.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConcursoDelitoController",
      "list",
      Nil,
      "GET",
      this.prefix + """concurso-delito""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ConcursoDelitoController_get17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("concurso-delito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConcursoDelitoController_get17_invoker = createInvoker(
    ConcursoDelitoController_5.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConcursoDelitoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """concurso-delito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ConcursoDelitoController_update18_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("concurso-delito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConcursoDelitoController_update18_invoker = createInvoker(
    ConcursoDelitoController_5.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConcursoDelitoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """concurso-delito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_ConcursoDelitoController_save19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("concurso-delito")))
  )
  private[this] lazy val controllers_ConcursoDelitoController_save19_invoker = createInvoker(
    ConcursoDelitoController_5.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConcursoDelitoController",
      "save",
      Nil,
      "POST",
      this.prefix + """concurso-delito""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ConcursoDelitoController_delete20_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("concurso-delito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConcursoDelitoController_delete20_invoker = createInvoker(
    ConcursoDelitoController_5.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConcursoDelitoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """concurso-delito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_ConductaDetalleController_page21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("conducta-detalle/page")))
  )
  private[this] lazy val controllers_ConductaDetalleController_page21_invoker = createInvoker(
    ConductaDetalleController_11.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConductaDetalleController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """conducta-detalle/page""",
      """Conducta Detalle
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_ConductaDetalleController_options22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("conducta-detalle/options")))
  )
  private[this] lazy val controllers_ConductaDetalleController_options22_invoker = createInvoker(
    ConductaDetalleController_11.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConductaDetalleController",
      "options",
      Nil,
      "GET",
      this.prefix + """conducta-detalle/options""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_ConductaDetalleController_list23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("conducta-detalle")))
  )
  private[this] lazy val controllers_ConductaDetalleController_list23_invoker = createInvoker(
    ConductaDetalleController_11.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConductaDetalleController",
      "list",
      Nil,
      "GET",
      this.prefix + """conducta-detalle""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_ConductaDetalleController_get24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("conducta-detalle/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConductaDetalleController_get24_invoker = createInvoker(
    ConductaDetalleController_11.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConductaDetalleController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """conducta-detalle/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_ConductaDetalleController_update25_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("conducta-detalle/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConductaDetalleController_update25_invoker = createInvoker(
    ConductaDetalleController_11.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConductaDetalleController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """conducta-detalle/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_ConductaDetalleController_save26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("conducta-detalle")))
  )
  private[this] lazy val controllers_ConductaDetalleController_save26_invoker = createInvoker(
    ConductaDetalleController_11.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConductaDetalleController",
      "save",
      Nil,
      "POST",
      this.prefix + """conducta-detalle""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_ConductaDetalleController_delete27_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("conducta-detalle/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConductaDetalleController_delete27_invoker = createInvoker(
    ConductaDetalleController_11.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ConductaDetalleController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """conducta-detalle/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_EfectoDetalleController_page28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("efecto-detalle/page")))
  )
  private[this] lazy val controllers_EfectoDetalleController_page28_invoker = createInvoker(
    EfectoDetalleController_0.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.EfectoDetalleController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """efecto-detalle/page""",
      """Efecto Detalle
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_EfectoDetalleController_options29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("efecto-detalle/options")))
  )
  private[this] lazy val controllers_EfectoDetalleController_options29_invoker = createInvoker(
    EfectoDetalleController_0.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.EfectoDetalleController",
      "options",
      Nil,
      "GET",
      this.prefix + """efecto-detalle/options""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_EfectoDetalleController_list30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("efecto-detalle")))
  )
  private[this] lazy val controllers_EfectoDetalleController_list30_invoker = createInvoker(
    EfectoDetalleController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.EfectoDetalleController",
      "list",
      Nil,
      "GET",
      this.prefix + """efecto-detalle""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_EfectoDetalleController_get31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("efecto-detalle/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EfectoDetalleController_get31_invoker = createInvoker(
    EfectoDetalleController_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.EfectoDetalleController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """efecto-detalle/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_EfectoDetalleController_update32_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("efecto-detalle/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EfectoDetalleController_update32_invoker = createInvoker(
    EfectoDetalleController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.EfectoDetalleController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """efecto-detalle/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_EfectoDetalleController_save33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("efecto-detalle")))
  )
  private[this] lazy val controllers_EfectoDetalleController_save33_invoker = createInvoker(
    EfectoDetalleController_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.EfectoDetalleController",
      "save",
      Nil,
      "POST",
      this.prefix + """efecto-detalle""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_EfectoDetalleController_delete34_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("efecto-detalle/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EfectoDetalleController_delete34_invoker = createInvoker(
    EfectoDetalleController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.EfectoDetalleController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """efecto-detalle/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_ElementoComisionController_page35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("elemento-comision/page")))
  )
  private[this] lazy val controllers_ElementoComisionController_page35_invoker = createInvoker(
    ElementoComisionController_3.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ElementoComisionController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """elemento-comision/page""",
      """Elemento Comision
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_ElementoComisionController_options36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("elemento-comision/options")))
  )
  private[this] lazy val controllers_ElementoComisionController_options36_invoker = createInvoker(
    ElementoComisionController_3.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ElementoComisionController",
      "options",
      Nil,
      "GET",
      this.prefix + """elemento-comision/options""",
      """""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val controllers_ElementoComisionController_list37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("elemento-comision")))
  )
  private[this] lazy val controllers_ElementoComisionController_list37_invoker = createInvoker(
    ElementoComisionController_3.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ElementoComisionController",
      "list",
      Nil,
      "GET",
      this.prefix + """elemento-comision""",
      """""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_ElementoComisionController_get38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("elemento-comision/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ElementoComisionController_get38_invoker = createInvoker(
    ElementoComisionController_3.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ElementoComisionController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """elemento-comision/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:70
  private[this] lazy val controllers_ElementoComisionController_update39_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("elemento-comision/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ElementoComisionController_update39_invoker = createInvoker(
    ElementoComisionController_3.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ElementoComisionController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """elemento-comision/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_ElementoComisionController_save40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("elemento-comision")))
  )
  private[this] lazy val controllers_ElementoComisionController_save40_invoker = createInvoker(
    ElementoComisionController_3.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ElementoComisionController",
      "save",
      Nil,
      "POST",
      this.prefix + """elemento-comision""",
      """""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val controllers_ElementoComisionController_delete41_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("elemento-comision/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ElementoComisionController_delete41_invoker = createInvoker(
    ElementoComisionController_3.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ElementoComisionController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """elemento-comision/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_FormaAccionController_page42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-accion/page")))
  )
  private[this] lazy val controllers_FormaAccionController_page42_invoker = createInvoker(
    FormaAccionController_4.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaAccionController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """forma-accion/page""",
      """Forma Accion
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_FormaAccionController_options43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-accion/options")))
  )
  private[this] lazy val controllers_FormaAccionController_options43_invoker = createInvoker(
    FormaAccionController_4.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaAccionController",
      "options",
      Nil,
      "GET",
      this.prefix + """forma-accion/options""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val controllers_FormaAccionController_list44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-accion")))
  )
  private[this] lazy val controllers_FormaAccionController_list44_invoker = createInvoker(
    FormaAccionController_4.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaAccionController",
      "list",
      Nil,
      "GET",
      this.prefix + """forma-accion""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_FormaAccionController_get45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-accion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FormaAccionController_get45_invoker = createInvoker(
    FormaAccionController_4.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaAccionController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """forma-accion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val controllers_FormaAccionController_update46_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-accion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FormaAccionController_update46_invoker = createInvoker(
    FormaAccionController_4.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaAccionController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """forma-accion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val controllers_FormaAccionController_save47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-accion")))
  )
  private[this] lazy val controllers_FormaAccionController_save47_invoker = createInvoker(
    FormaAccionController_4.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaAccionController",
      "save",
      Nil,
      "POST",
      this.prefix + """forma-accion""",
      """""",
      Seq()
    )
  )

  // @LINE:82
  private[this] lazy val controllers_FormaAccionController_delete48_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-accion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FormaAccionController_delete48_invoker = createInvoker(
    FormaAccionController_4.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaAccionController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """forma-accion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:86
  private[this] lazy val controllers_FormaComisionController_page49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-comision/page")))
  )
  private[this] lazy val controllers_FormaComisionController_page49_invoker = createInvoker(
    FormaComisionController_12.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaComisionController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """forma-comision/page""",
      """Forma Comision
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:87
  private[this] lazy val controllers_FormaComisionController_options50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-comision/options")))
  )
  private[this] lazy val controllers_FormaComisionController_options50_invoker = createInvoker(
    FormaComisionController_12.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaComisionController",
      "options",
      Nil,
      "GET",
      this.prefix + """forma-comision/options""",
      """""",
      Seq()
    )
  )

  // @LINE:88
  private[this] lazy val controllers_FormaComisionController_list51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-comision")))
  )
  private[this] lazy val controllers_FormaComisionController_list51_invoker = createInvoker(
    FormaComisionController_12.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaComisionController",
      "list",
      Nil,
      "GET",
      this.prefix + """forma-comision""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_FormaComisionController_get52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-comision/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FormaComisionController_get52_invoker = createInvoker(
    FormaComisionController_12.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaComisionController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """forma-comision/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val controllers_FormaComisionController_update53_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-comision/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FormaComisionController_update53_invoker = createInvoker(
    FormaComisionController_12.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaComisionController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """forma-comision/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_FormaComisionController_save54_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-comision")))
  )
  private[this] lazy val controllers_FormaComisionController_save54_invoker = createInvoker(
    FormaComisionController_12.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaComisionController",
      "save",
      Nil,
      "POST",
      this.prefix + """forma-comision""",
      """""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val controllers_FormaComisionController_delete55_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-comision/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FormaComisionController_delete55_invoker = createInvoker(
    FormaComisionController_12.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaComisionController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """forma-comision/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val controllers_FormaConductaController_page56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-conducta/page")))
  )
  private[this] lazy val controllers_FormaConductaController_page56_invoker = createInvoker(
    FormaConductaController_10.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaConductaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """forma-conducta/page""",
      """Forma Conducta
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:98
  private[this] lazy val controllers_FormaConductaController_options57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-conducta/options")))
  )
  private[this] lazy val controllers_FormaConductaController_options57_invoker = createInvoker(
    FormaConductaController_10.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaConductaController",
      "options",
      Nil,
      "GET",
      this.prefix + """forma-conducta/options""",
      """""",
      Seq()
    )
  )

  // @LINE:99
  private[this] lazy val controllers_FormaConductaController_list58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-conducta")))
  )
  private[this] lazy val controllers_FormaConductaController_list58_invoker = createInvoker(
    FormaConductaController_10.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaConductaController",
      "list",
      Nil,
      "GET",
      this.prefix + """forma-conducta""",
      """""",
      Seq()
    )
  )

  // @LINE:100
  private[this] lazy val controllers_FormaConductaController_get59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-conducta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FormaConductaController_get59_invoker = createInvoker(
    FormaConductaController_10.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaConductaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """forma-conducta/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_FormaConductaController_update60_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-conducta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FormaConductaController_update60_invoker = createInvoker(
    FormaConductaController_10.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaConductaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """forma-conducta/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:102
  private[this] lazy val controllers_FormaConductaController_save61_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-conducta")))
  )
  private[this] lazy val controllers_FormaConductaController_save61_invoker = createInvoker(
    FormaConductaController_10.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaConductaController",
      "save",
      Nil,
      "POST",
      this.prefix + """forma-conducta""",
      """""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_FormaConductaController_delete62_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forma-conducta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FormaConductaController_delete62_invoker = createInvoker(
    FormaConductaController_10.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.FormaConductaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """forma-conducta/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:108
  private[this] lazy val controllers_GradoParticipacionController_page63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grado-participacion/page")))
  )
  private[this] lazy val controllers_GradoParticipacionController_page63_invoker = createInvoker(
    GradoParticipacionController_9.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.GradoParticipacionController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """grado-participacion/page""",
      """Grado Participacion
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:109
  private[this] lazy val controllers_GradoParticipacionController_options64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grado-participacion/options")))
  )
  private[this] lazy val controllers_GradoParticipacionController_options64_invoker = createInvoker(
    GradoParticipacionController_9.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.GradoParticipacionController",
      "options",
      Nil,
      "GET",
      this.prefix + """grado-participacion/options""",
      """""",
      Seq()
    )
  )

  // @LINE:110
  private[this] lazy val controllers_GradoParticipacionController_list65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grado-participacion")))
  )
  private[this] lazy val controllers_GradoParticipacionController_list65_invoker = createInvoker(
    GradoParticipacionController_9.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.GradoParticipacionController",
      "list",
      Nil,
      "GET",
      this.prefix + """grado-participacion""",
      """""",
      Seq()
    )
  )

  // @LINE:111
  private[this] lazy val controllers_GradoParticipacionController_get66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grado-participacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GradoParticipacionController_get66_invoker = createInvoker(
    GradoParticipacionController_9.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.GradoParticipacionController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """grado-participacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:112
  private[this] lazy val controllers_GradoParticipacionController_update67_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grado-participacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GradoParticipacionController_update67_invoker = createInvoker(
    GradoParticipacionController_9.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.GradoParticipacionController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """grado-participacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:113
  private[this] lazy val controllers_GradoParticipacionController_save68_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grado-participacion")))
  )
  private[this] lazy val controllers_GradoParticipacionController_save68_invoker = createInvoker(
    GradoParticipacionController_9.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.GradoParticipacionController",
      "save",
      Nil,
      "POST",
      this.prefix + """grado-participacion""",
      """""",
      Seq()
    )
  )

  // @LINE:114
  private[this] lazy val controllers_GradoParticipacionController_delete69_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grado-participacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GradoParticipacionController_delete69_invoker = createInvoker(
    GradoParticipacionController_9.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.GradoParticipacionController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """grado-participacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:119
  private[this] lazy val controllers_ModalidadAmbitoController_page70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modalidad-ambito/page")))
  )
  private[this] lazy val controllers_ModalidadAmbitoController_page70_invoker = createInvoker(
    ModalidadAmbitoController_6.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ModalidadAmbitoController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """modalidad-ambito/page""",
      """Modalidad Ambito
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:121
  private[this] lazy val controllers_ModalidadAmbitoController_list71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modalidad-ambito")))
  )
  private[this] lazy val controllers_ModalidadAmbitoController_list71_invoker = createInvoker(
    ModalidadAmbitoController_6.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ModalidadAmbitoController",
      "list",
      Nil,
      "GET",
      this.prefix + """modalidad-ambito""",
      """GET     /modalidad-ambito/options       controllers.ModalidadAmbitoController.options()""",
      Seq()
    )
  )

  // @LINE:122
  private[this] lazy val controllers_ModalidadAmbitoController_get72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modalidad-ambito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ModalidadAmbitoController_get72_invoker = createInvoker(
    ModalidadAmbitoController_6.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ModalidadAmbitoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """modalidad-ambito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:123
  private[this] lazy val controllers_ModalidadAmbitoController_update73_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modalidad-ambito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ModalidadAmbitoController_update73_invoker = createInvoker(
    ModalidadAmbitoController_6.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ModalidadAmbitoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """modalidad-ambito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:124
  private[this] lazy val controllers_ModalidadAmbitoController_save74_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modalidad-ambito")))
  )
  private[this] lazy val controllers_ModalidadAmbitoController_save74_invoker = createInvoker(
    ModalidadAmbitoController_6.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ModalidadAmbitoController",
      "save",
      Nil,
      "POST",
      this.prefix + """modalidad-ambito""",
      """""",
      Seq()
    )
  )

  // @LINE:125
  private[this] lazy val controllers_ModalidadAmbitoController_delete75_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modalidad-ambito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ModalidadAmbitoController_delete75_invoker = createInvoker(
    ModalidadAmbitoController_6.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ModalidadAmbitoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """modalidad-ambito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:130
  private[this] lazy val controllers_ModalidadDelitoController_page76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modalidad-delito/page")))
  )
  private[this] lazy val controllers_ModalidadDelitoController_page76_invoker = createInvoker(
    ModalidadDelitoController_8.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ModalidadDelitoController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """modalidad-delito/page""",
      """Modalidad Delito
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:131
  private[this] lazy val controllers_ModalidadDelitoController_options77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modalidad-delito/options")))
  )
  private[this] lazy val controllers_ModalidadDelitoController_options77_invoker = createInvoker(
    ModalidadDelitoController_8.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ModalidadDelitoController",
      "options",
      Nil,
      "GET",
      this.prefix + """modalidad-delito/options""",
      """""",
      Seq()
    )
  )

  // @LINE:132
  private[this] lazy val controllers_ModalidadDelitoController_list78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modalidad-delito")))
  )
  private[this] lazy val controllers_ModalidadDelitoController_list78_invoker = createInvoker(
    ModalidadDelitoController_8.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ModalidadDelitoController",
      "list",
      Nil,
      "GET",
      this.prefix + """modalidad-delito""",
      """""",
      Seq()
    )
  )

  // @LINE:133
  private[this] lazy val controllers_ModalidadDelitoController_get79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modalidad-delito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ModalidadDelitoController_get79_invoker = createInvoker(
    ModalidadDelitoController_8.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ModalidadDelitoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """modalidad-delito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:134
  private[this] lazy val controllers_ModalidadDelitoController_update80_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modalidad-delito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ModalidadDelitoController_update80_invoker = createInvoker(
    ModalidadDelitoController_8.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ModalidadDelitoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """modalidad-delito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:135
  private[this] lazy val controllers_ModalidadDelitoController_save81_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modalidad-delito")))
  )
  private[this] lazy val controllers_ModalidadDelitoController_save81_invoker = createInvoker(
    ModalidadDelitoController_8.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ModalidadDelitoController",
      "save",
      Nil,
      "POST",
      this.prefix + """modalidad-delito""",
      """""",
      Seq()
    )
  )

  // @LINE:136
  private[this] lazy val controllers_ModalidadDelitoController_delete82_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modalidad-delito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ModalidadDelitoController_delete82_invoker = createInvoker(
    ModalidadDelitoController_8.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ModalidadDelitoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """modalidad-delito/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:141
  private[this] lazy val controllers_TipoTransportacionController_page83_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-transportacion/page")))
  )
  private[this] lazy val controllers_TipoTransportacionController_page83_invoker = createInvoker(
    TipoTransportacionController_14.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.TipoTransportacionController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """tipo-transportacion/page""",
      """Tipo Transportacion
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:142
  private[this] lazy val controllers_TipoTransportacionController_options84_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-transportacion/options")))
  )
  private[this] lazy val controllers_TipoTransportacionController_options84_invoker = createInvoker(
    TipoTransportacionController_14.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.TipoTransportacionController",
      "options",
      Nil,
      "GET",
      this.prefix + """tipo-transportacion/options""",
      """""",
      Seq()
    )
  )

  // @LINE:143
  private[this] lazy val controllers_TipoTransportacionController_list85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-transportacion")))
  )
  private[this] lazy val controllers_TipoTransportacionController_list85_invoker = createInvoker(
    TipoTransportacionController_14.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.TipoTransportacionController",
      "list",
      Nil,
      "GET",
      this.prefix + """tipo-transportacion""",
      """""",
      Seq()
    )
  )

  // @LINE:144
  private[this] lazy val controllers_TipoTransportacionController_get86_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-transportacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoTransportacionController_get86_invoker = createInvoker(
    TipoTransportacionController_14.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.TipoTransportacionController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tipo-transportacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:145
  private[this] lazy val controllers_TipoTransportacionController_update87_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-transportacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoTransportacionController_update87_invoker = createInvoker(
    TipoTransportacionController_14.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.TipoTransportacionController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """tipo-transportacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:146
  private[this] lazy val controllers_TipoTransportacionController_save88_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-transportacion")))
  )
  private[this] lazy val controllers_TipoTransportacionController_save88_invoker = createInvoker(
    TipoTransportacionController_14.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.TipoTransportacionController",
      "save",
      Nil,
      "POST",
      this.prefix + """tipo-transportacion""",
      """""",
      Seq()
    )
  )

  // @LINE:147
  private[this] lazy val controllers_TipoTransportacionController_delete89_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-transportacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoTransportacionController_delete89_invoker = createInvoker(
    TipoTransportacionController_14.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.TipoTransportacionController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """tipo-transportacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:152
  private[this] lazy val controllers_ViolenciaGeneroController_list90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("violencia-genero")))
  )
  private[this] lazy val controllers_ViolenciaGeneroController_list90_invoker = createInvoker(
    ViolenciaGeneroController_1.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ViolenciaGeneroController",
      "list",
      Nil,
      "GET",
      this.prefix + """violencia-genero""",
      """Violencia Genero
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:153
  private[this] lazy val controllers_ViolenciaGeneroController_get91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("violencia-genero/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ViolenciaGeneroController_get91_invoker = createInvoker(
    ViolenciaGeneroController_1.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ViolenciaGeneroController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """violencia-genero/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:154
  private[this] lazy val controllers_ViolenciaGeneroController_update92_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("violencia-genero/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ViolenciaGeneroController_update92_invoker = createInvoker(
    ViolenciaGeneroController_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ViolenciaGeneroController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """violencia-genero/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:155
  private[this] lazy val controllers_ViolenciaGeneroController_save93_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("violencia-genero")))
  )
  private[this] lazy val controllers_ViolenciaGeneroController_save93_invoker = createInvoker(
    ViolenciaGeneroController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ViolenciaGeneroController",
      "save",
      Nil,
      "POST",
      this.prefix + """violencia-genero""",
      """""",
      Seq()
    )
  )

  // @LINE:156
  private[this] lazy val controllers_ViolenciaGeneroController_delete94_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("violencia-genero/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ViolenciaGeneroController_delete94_invoker = createInvoker(
    ViolenciaGeneroController_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.ViolenciaGeneroController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """violencia-genero/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:161
  private[this] lazy val controllers_DesaparicionConsumacionController_get95_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("desaparicion-consumacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DesaparicionConsumacionController_get95_invoker = createInvoker(
    DesaparicionConsumacionController_2.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.DesaparicionConsumacionController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """desaparicion-consumacion/""" + "$" + """id<[^/]+>""",
      """DesaparicionConsumacion
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:162
  private[this] lazy val controllers_DesaparicionConsumacionController_list96_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("desaparicion-consumacion")))
  )
  private[this] lazy val controllers_DesaparicionConsumacionController_list96_invoker = createInvoker(
    DesaparicionConsumacionController_2.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.DesaparicionConsumacionController",
      "list",
      Nil,
      "GET",
      this.prefix + """desaparicion-consumacion""",
      """""",
      Seq()
    )
  )

  // @LINE:163
  private[this] lazy val controllers_DesaparicionConsumacionController_update97_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("desaparicion-consumacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DesaparicionConsumacionController_update97_invoker = createInvoker(
    DesaparicionConsumacionController_2.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.DesaparicionConsumacionController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """desaparicion-consumacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:164
  private[this] lazy val controllers_DesaparicionConsumacionController_save98_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("desaparicion-consumacion")))
  )
  private[this] lazy val controllers_DesaparicionConsumacionController_save98_invoker = createInvoker(
    DesaparicionConsumacionController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.DesaparicionConsumacionController",
      "save",
      Nil,
      "POST",
      this.prefix + """desaparicion-consumacion""",
      """""",
      Seq()
    )
  )

  // @LINE:165
  private[this] lazy val controllers_DesaparicionConsumacionController_delete99_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("desaparicion-consumacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DesaparicionConsumacionController_delete99_invoker = createInvoker(
    DesaparicionConsumacionController_2.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "relacion",
      "controllers.DesaparicionConsumacionController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """desaparicion-consumacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:10
    case controllers_ClasificacionDelitoController_page0_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_ClasificacionDelitoController_page0_invoker.call(ClasificacionDelitoController_7.page(p, s, o, f, tr))
      }
  
    // @LINE:11
    case controllers_ClasificacionDelitoController_options1_route(params@_) =>
      call { 
        controllers_ClasificacionDelitoController_options1_invoker.call(ClasificacionDelitoController_7.options())
      }
  
    // @LINE:12
    case controllers_ClasificacionDelitoController_list2_route(params@_) =>
      call { 
        controllers_ClasificacionDelitoController_list2_invoker.call(ClasificacionDelitoController_7.list)
      }
  
    // @LINE:13
    case controllers_ClasificacionDelitoController_get3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClasificacionDelitoController_get3_invoker.call(ClasificacionDelitoController_7.get(id))
      }
  
    // @LINE:14
    case controllers_ClasificacionDelitoController_update4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClasificacionDelitoController_update4_invoker.call(ClasificacionDelitoController_7.update(id))
      }
  
    // @LINE:15
    case controllers_ClasificacionDelitoController_save5_route(params@_) =>
      call { 
        controllers_ClasificacionDelitoController_save5_invoker.call(ClasificacionDelitoController_7.save())
      }
  
    // @LINE:16
    case controllers_ClasificacionDelitoController_delete6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClasificacionDelitoController_delete6_invoker.call(ClasificacionDelitoController_7.delete(id))
      }
  
    // @LINE:21
    case controllers_ClasificacionDelitoOrdenController_page7_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_ClasificacionDelitoOrdenController_page7_invoker.call(ClasificacionDelitoOrdenController_13.page(p, s, o, f, tr))
      }
  
    // @LINE:22
    case controllers_ClasificacionDelitoOrdenController_options8_route(params@_) =>
      call { 
        controllers_ClasificacionDelitoOrdenController_options8_invoker.call(ClasificacionDelitoOrdenController_13.options())
      }
  
    // @LINE:23
    case controllers_ClasificacionDelitoOrdenController_list9_route(params@_) =>
      call { 
        controllers_ClasificacionDelitoOrdenController_list9_invoker.call(ClasificacionDelitoOrdenController_13.list)
      }
  
    // @LINE:24
    case controllers_ClasificacionDelitoOrdenController_get10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClasificacionDelitoOrdenController_get10_invoker.call(ClasificacionDelitoOrdenController_13.get(id))
      }
  
    // @LINE:25
    case controllers_ClasificacionDelitoOrdenController_update11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClasificacionDelitoOrdenController_update11_invoker.call(ClasificacionDelitoOrdenController_13.update(id))
      }
  
    // @LINE:26
    case controllers_ClasificacionDelitoOrdenController_save12_route(params@_) =>
      call { 
        controllers_ClasificacionDelitoOrdenController_save12_invoker.call(ClasificacionDelitoOrdenController_13.save())
      }
  
    // @LINE:27
    case controllers_ClasificacionDelitoOrdenController_delete13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClasificacionDelitoOrdenController_delete13_invoker.call(ClasificacionDelitoOrdenController_13.delete(id))
      }
  
    // @LINE:32
    case controllers_ConcursoDelitoController_page14_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_ConcursoDelitoController_page14_invoker.call(ConcursoDelitoController_5.page(p, s, o, f, tr))
      }
  
    // @LINE:33
    case controllers_ConcursoDelitoController_options15_route(params@_) =>
      call { 
        controllers_ConcursoDelitoController_options15_invoker.call(ConcursoDelitoController_5.options())
      }
  
    // @LINE:34
    case controllers_ConcursoDelitoController_list16_route(params@_) =>
      call { 
        controllers_ConcursoDelitoController_list16_invoker.call(ConcursoDelitoController_5.list)
      }
  
    // @LINE:35
    case controllers_ConcursoDelitoController_get17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConcursoDelitoController_get17_invoker.call(ConcursoDelitoController_5.get(id))
      }
  
    // @LINE:36
    case controllers_ConcursoDelitoController_update18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConcursoDelitoController_update18_invoker.call(ConcursoDelitoController_5.update(id))
      }
  
    // @LINE:37
    case controllers_ConcursoDelitoController_save19_route(params@_) =>
      call { 
        controllers_ConcursoDelitoController_save19_invoker.call(ConcursoDelitoController_5.save())
      }
  
    // @LINE:38
    case controllers_ConcursoDelitoController_delete20_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConcursoDelitoController_delete20_invoker.call(ConcursoDelitoController_5.delete(id))
      }
  
    // @LINE:43
    case controllers_ConductaDetalleController_page21_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("conducta")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_ConductaDetalleController_page21_invoker.call(ConductaDetalleController_11.page(p, s, o, f, tr))
      }
  
    // @LINE:44
    case controllers_ConductaDetalleController_options22_route(params@_) =>
      call { 
        controllers_ConductaDetalleController_options22_invoker.call(ConductaDetalleController_11.options())
      }
  
    // @LINE:45
    case controllers_ConductaDetalleController_list23_route(params@_) =>
      call { 
        controllers_ConductaDetalleController_list23_invoker.call(ConductaDetalleController_11.list)
      }
  
    // @LINE:46
    case controllers_ConductaDetalleController_get24_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConductaDetalleController_get24_invoker.call(ConductaDetalleController_11.get(id))
      }
  
    // @LINE:47
    case controllers_ConductaDetalleController_update25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConductaDetalleController_update25_invoker.call(ConductaDetalleController_11.update(id))
      }
  
    // @LINE:48
    case controllers_ConductaDetalleController_save26_route(params@_) =>
      call { 
        controllers_ConductaDetalleController_save26_invoker.call(ConductaDetalleController_11.save())
      }
  
    // @LINE:49
    case controllers_ConductaDetalleController_delete27_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConductaDetalleController_delete27_invoker.call(ConductaDetalleController_11.delete(id))
      }
  
    // @LINE:54
    case controllers_EfectoDetalleController_page28_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("efecto")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_EfectoDetalleController_page28_invoker.call(EfectoDetalleController_0.page(p, s, o, f, tr))
      }
  
    // @LINE:55
    case controllers_EfectoDetalleController_options29_route(params@_) =>
      call { 
        controllers_EfectoDetalleController_options29_invoker.call(EfectoDetalleController_0.options())
      }
  
    // @LINE:56
    case controllers_EfectoDetalleController_list30_route(params@_) =>
      call { 
        controllers_EfectoDetalleController_list30_invoker.call(EfectoDetalleController_0.list)
      }
  
    // @LINE:57
    case controllers_EfectoDetalleController_get31_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EfectoDetalleController_get31_invoker.call(EfectoDetalleController_0.get(id))
      }
  
    // @LINE:58
    case controllers_EfectoDetalleController_update32_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EfectoDetalleController_update32_invoker.call(EfectoDetalleController_0.update(id))
      }
  
    // @LINE:59
    case controllers_EfectoDetalleController_save33_route(params@_) =>
      call { 
        controllers_EfectoDetalleController_save33_invoker.call(EfectoDetalleController_0.save())
      }
  
    // @LINE:60
    case controllers_EfectoDetalleController_delete34_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EfectoDetalleController_delete34_invoker.call(EfectoDetalleController_0.delete(id))
      }
  
    // @LINE:66
    case controllers_ElementoComisionController_page35_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_ElementoComisionController_page35_invoker.call(ElementoComisionController_3.page(p, s, o, f, tr))
      }
  
    // @LINE:67
    case controllers_ElementoComisionController_options36_route(params@_) =>
      call { 
        controllers_ElementoComisionController_options36_invoker.call(ElementoComisionController_3.options())
      }
  
    // @LINE:68
    case controllers_ElementoComisionController_list37_route(params@_) =>
      call { 
        controllers_ElementoComisionController_list37_invoker.call(ElementoComisionController_3.list)
      }
  
    // @LINE:69
    case controllers_ElementoComisionController_get38_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ElementoComisionController_get38_invoker.call(ElementoComisionController_3.get(id))
      }
  
    // @LINE:70
    case controllers_ElementoComisionController_update39_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ElementoComisionController_update39_invoker.call(ElementoComisionController_3.update(id))
      }
  
    // @LINE:71
    case controllers_ElementoComisionController_save40_route(params@_) =>
      call { 
        controllers_ElementoComisionController_save40_invoker.call(ElementoComisionController_3.save())
      }
  
    // @LINE:72
    case controllers_ElementoComisionController_delete41_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ElementoComisionController_delete41_invoker.call(ElementoComisionController_3.delete(id))
      }
  
    // @LINE:76
    case controllers_FormaAccionController_page42_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_FormaAccionController_page42_invoker.call(FormaAccionController_4.page(p, s, o, f, tr))
      }
  
    // @LINE:77
    case controllers_FormaAccionController_options43_route(params@_) =>
      call { 
        controllers_FormaAccionController_options43_invoker.call(FormaAccionController_4.options())
      }
  
    // @LINE:78
    case controllers_FormaAccionController_list44_route(params@_) =>
      call { 
        controllers_FormaAccionController_list44_invoker.call(FormaAccionController_4.list)
      }
  
    // @LINE:79
    case controllers_FormaAccionController_get45_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FormaAccionController_get45_invoker.call(FormaAccionController_4.get(id))
      }
  
    // @LINE:80
    case controllers_FormaAccionController_update46_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FormaAccionController_update46_invoker.call(FormaAccionController_4.update(id))
      }
  
    // @LINE:81
    case controllers_FormaAccionController_save47_route(params@_) =>
      call { 
        controllers_FormaAccionController_save47_invoker.call(FormaAccionController_4.save())
      }
  
    // @LINE:82
    case controllers_FormaAccionController_delete48_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FormaAccionController_delete48_invoker.call(FormaAccionController_4.delete(id))
      }
  
    // @LINE:86
    case controllers_FormaComisionController_page49_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_FormaComisionController_page49_invoker.call(FormaComisionController_12.page(p, s, o, f, tr))
      }
  
    // @LINE:87
    case controllers_FormaComisionController_options50_route(params@_) =>
      call { 
        controllers_FormaComisionController_options50_invoker.call(FormaComisionController_12.options())
      }
  
    // @LINE:88
    case controllers_FormaComisionController_list51_route(params@_) =>
      call { 
        controllers_FormaComisionController_list51_invoker.call(FormaComisionController_12.list)
      }
  
    // @LINE:89
    case controllers_FormaComisionController_get52_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FormaComisionController_get52_invoker.call(FormaComisionController_12.get(id))
      }
  
    // @LINE:90
    case controllers_FormaComisionController_update53_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FormaComisionController_update53_invoker.call(FormaComisionController_12.update(id))
      }
  
    // @LINE:91
    case controllers_FormaComisionController_save54_route(params@_) =>
      call { 
        controllers_FormaComisionController_save54_invoker.call(FormaComisionController_12.save())
      }
  
    // @LINE:92
    case controllers_FormaComisionController_delete55_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FormaComisionController_delete55_invoker.call(FormaComisionController_12.delete(id))
      }
  
    // @LINE:97
    case controllers_FormaConductaController_page56_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_FormaConductaController_page56_invoker.call(FormaConductaController_10.page(p, s, o, f, tr))
      }
  
    // @LINE:98
    case controllers_FormaConductaController_options57_route(params@_) =>
      call { 
        controllers_FormaConductaController_options57_invoker.call(FormaConductaController_10.options())
      }
  
    // @LINE:99
    case controllers_FormaConductaController_list58_route(params@_) =>
      call { 
        controllers_FormaConductaController_list58_invoker.call(FormaConductaController_10.list)
      }
  
    // @LINE:100
    case controllers_FormaConductaController_get59_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FormaConductaController_get59_invoker.call(FormaConductaController_10.get(id))
      }
  
    // @LINE:101
    case controllers_FormaConductaController_update60_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FormaConductaController_update60_invoker.call(FormaConductaController_10.update(id))
      }
  
    // @LINE:102
    case controllers_FormaConductaController_save61_route(params@_) =>
      call { 
        controllers_FormaConductaController_save61_invoker.call(FormaConductaController_10.save())
      }
  
    // @LINE:103
    case controllers_FormaConductaController_delete62_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FormaConductaController_delete62_invoker.call(FormaConductaController_10.delete(id))
      }
  
    // @LINE:108
    case controllers_GradoParticipacionController_page63_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_GradoParticipacionController_page63_invoker.call(GradoParticipacionController_9.page(p, s, o, f, tr))
      }
  
    // @LINE:109
    case controllers_GradoParticipacionController_options64_route(params@_) =>
      call { 
        controllers_GradoParticipacionController_options64_invoker.call(GradoParticipacionController_9.options())
      }
  
    // @LINE:110
    case controllers_GradoParticipacionController_list65_route(params@_) =>
      call { 
        controllers_GradoParticipacionController_list65_invoker.call(GradoParticipacionController_9.list)
      }
  
    // @LINE:111
    case controllers_GradoParticipacionController_get66_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GradoParticipacionController_get66_invoker.call(GradoParticipacionController_9.get(id))
      }
  
    // @LINE:112
    case controllers_GradoParticipacionController_update67_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GradoParticipacionController_update67_invoker.call(GradoParticipacionController_9.update(id))
      }
  
    // @LINE:113
    case controllers_GradoParticipacionController_save68_route(params@_) =>
      call { 
        controllers_GradoParticipacionController_save68_invoker.call(GradoParticipacionController_9.save())
      }
  
    // @LINE:114
    case controllers_GradoParticipacionController_delete69_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GradoParticipacionController_delete69_invoker.call(GradoParticipacionController_9.delete(id))
      }
  
    // @LINE:119
    case controllers_ModalidadAmbitoController_page70_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("modalidad")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_ModalidadAmbitoController_page70_invoker.call(ModalidadAmbitoController_6.page(p, s, o, f, tr))
      }
  
    // @LINE:121
    case controllers_ModalidadAmbitoController_list71_route(params@_) =>
      call { 
        controllers_ModalidadAmbitoController_list71_invoker.call(ModalidadAmbitoController_6.list)
      }
  
    // @LINE:122
    case controllers_ModalidadAmbitoController_get72_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ModalidadAmbitoController_get72_invoker.call(ModalidadAmbitoController_6.get(id))
      }
  
    // @LINE:123
    case controllers_ModalidadAmbitoController_update73_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ModalidadAmbitoController_update73_invoker.call(ModalidadAmbitoController_6.update(id))
      }
  
    // @LINE:124
    case controllers_ModalidadAmbitoController_save74_route(params@_) =>
      call { 
        controllers_ModalidadAmbitoController_save74_invoker.call(ModalidadAmbitoController_6.save())
      }
  
    // @LINE:125
    case controllers_ModalidadAmbitoController_delete75_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ModalidadAmbitoController_delete75_invoker.call(ModalidadAmbitoController_6.delete(id))
      }
  
    // @LINE:130
    case controllers_ModalidadDelitoController_page76_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_ModalidadDelitoController_page76_invoker.call(ModalidadDelitoController_8.page(p, s, o, f, tr))
      }
  
    // @LINE:131
    case controllers_ModalidadDelitoController_options77_route(params@_) =>
      call { 
        controllers_ModalidadDelitoController_options77_invoker.call(ModalidadDelitoController_8.options())
      }
  
    // @LINE:132
    case controllers_ModalidadDelitoController_list78_route(params@_) =>
      call { 
        controllers_ModalidadDelitoController_list78_invoker.call(ModalidadDelitoController_8.list)
      }
  
    // @LINE:133
    case controllers_ModalidadDelitoController_get79_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ModalidadDelitoController_get79_invoker.call(ModalidadDelitoController_8.get(id))
      }
  
    // @LINE:134
    case controllers_ModalidadDelitoController_update80_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ModalidadDelitoController_update80_invoker.call(ModalidadDelitoController_8.update(id))
      }
  
    // @LINE:135
    case controllers_ModalidadDelitoController_save81_route(params@_) =>
      call { 
        controllers_ModalidadDelitoController_save81_invoker.call(ModalidadDelitoController_8.save())
      }
  
    // @LINE:136
    case controllers_ModalidadDelitoController_delete82_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ModalidadDelitoController_delete82_invoker.call(ModalidadDelitoController_8.delete(id))
      }
  
    // @LINE:141
    case controllers_TipoTransportacionController_page83_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("tipo")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_TipoTransportacionController_page83_invoker.call(TipoTransportacionController_14.page(p, s, o, f, tr))
      }
  
    // @LINE:142
    case controllers_TipoTransportacionController_options84_route(params@_) =>
      call { 
        controllers_TipoTransportacionController_options84_invoker.call(TipoTransportacionController_14.options())
      }
  
    // @LINE:143
    case controllers_TipoTransportacionController_list85_route(params@_) =>
      call { 
        controllers_TipoTransportacionController_list85_invoker.call(TipoTransportacionController_14.list)
      }
  
    // @LINE:144
    case controllers_TipoTransportacionController_get86_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoTransportacionController_get86_invoker.call(TipoTransportacionController_14.get(id))
      }
  
    // @LINE:145
    case controllers_TipoTransportacionController_update87_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoTransportacionController_update87_invoker.call(TipoTransportacionController_14.update(id))
      }
  
    // @LINE:146
    case controllers_TipoTransportacionController_save88_route(params@_) =>
      call { 
        controllers_TipoTransportacionController_save88_invoker.call(TipoTransportacionController_14.save())
      }
  
    // @LINE:147
    case controllers_TipoTransportacionController_delete89_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoTransportacionController_delete89_invoker.call(TipoTransportacionController_14.delete(id))
      }
  
    // @LINE:152
    case controllers_ViolenciaGeneroController_list90_route(params@_) =>
      call { 
        controllers_ViolenciaGeneroController_list90_invoker.call(ViolenciaGeneroController_1.list)
      }
  
    // @LINE:153
    case controllers_ViolenciaGeneroController_get91_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ViolenciaGeneroController_get91_invoker.call(ViolenciaGeneroController_1.get(id))
      }
  
    // @LINE:154
    case controllers_ViolenciaGeneroController_update92_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ViolenciaGeneroController_update92_invoker.call(ViolenciaGeneroController_1.update(id))
      }
  
    // @LINE:155
    case controllers_ViolenciaGeneroController_save93_route(params@_) =>
      call { 
        controllers_ViolenciaGeneroController_save93_invoker.call(ViolenciaGeneroController_1.save())
      }
  
    // @LINE:156
    case controllers_ViolenciaGeneroController_delete94_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ViolenciaGeneroController_delete94_invoker.call(ViolenciaGeneroController_1.delete(id))
      }
  
    // @LINE:161
    case controllers_DesaparicionConsumacionController_get95_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DesaparicionConsumacionController_get95_invoker.call(DesaparicionConsumacionController_2.get(id))
      }
  
    // @LINE:162
    case controllers_DesaparicionConsumacionController_list96_route(params@_) =>
      call { 
        controllers_DesaparicionConsumacionController_list96_invoker.call(DesaparicionConsumacionController_2.list())
      }
  
    // @LINE:163
    case controllers_DesaparicionConsumacionController_update97_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DesaparicionConsumacionController_update97_invoker.call(DesaparicionConsumacionController_2.update(id))
      }
  
    // @LINE:164
    case controllers_DesaparicionConsumacionController_save98_route(params@_) =>
      call { 
        controllers_DesaparicionConsumacionController_save98_invoker.call(DesaparicionConsumacionController_2.save())
      }
  
    // @LINE:165
    case controllers_DesaparicionConsumacionController_delete99_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DesaparicionConsumacionController_delete99_invoker.call(DesaparicionConsumacionController_2.delete(id))
      }
  }
}
