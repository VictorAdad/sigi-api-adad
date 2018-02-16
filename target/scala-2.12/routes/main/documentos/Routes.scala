
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/documentos.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package documentos

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:11
  Documentos_2: controllers.Documentos,
  // @LINE:19
  DocsAcuerdos_7: controllers.DocsAcuerdos,
  // @LINE:23
  DocsArchivosTemporales_13: controllers.DocsArchivosTemporales,
  // @LINE:27
  DocsEntrevistas_6: controllers.DocsEntrevistas,
  // @LINE:31
  DocsNics_10: controllers.DocsNics,
  // @LINE:37
  DocsPredenuncias_9: controllers.DocsPredenuncias,
  // @LINE:41
  DocsSolPreAcuerdos_11: controllers.DocsSolPreAcuerdos,
  // @LINE:45
  DocsFacultadesNoInvestigar_3: controllers.DocsFacultadesNoInvestigar,
  // @LINE:49
  DocsNoEjerciciosAcciones_4: controllers.DocsNoEjerciciosAcciones,
  // @LINE:53
  DocsSolPreInspecciones_12: controllers.DocsSolPreInspecciones,
  // @LINE:57
  DocsSolPrePericiales_1: controllers.DocsSolPrePericiales,
  // @LINE:61
  DocsSolPrePolicias_8: controllers.DocsSolPrePolicias,
  // @LINE:65
  DocsSolPreRegistros_5: controllers.DocsSolPreRegistros,
  // @LINE:69
  DocsSolPreReqInfos_0: controllers.DocsSolPreReqInfos,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:11
    Documentos_2: controllers.Documentos,
    // @LINE:19
    DocsAcuerdos_7: controllers.DocsAcuerdos,
    // @LINE:23
    DocsArchivosTemporales_13: controllers.DocsArchivosTemporales,
    // @LINE:27
    DocsEntrevistas_6: controllers.DocsEntrevistas,
    // @LINE:31
    DocsNics_10: controllers.DocsNics,
    // @LINE:37
    DocsPredenuncias_9: controllers.DocsPredenuncias,
    // @LINE:41
    DocsSolPreAcuerdos_11: controllers.DocsSolPreAcuerdos,
    // @LINE:45
    DocsFacultadesNoInvestigar_3: controllers.DocsFacultadesNoInvestigar,
    // @LINE:49
    DocsNoEjerciciosAcciones_4: controllers.DocsNoEjerciciosAcciones,
    // @LINE:53
    DocsSolPreInspecciones_12: controllers.DocsSolPreInspecciones,
    // @LINE:57
    DocsSolPrePericiales_1: controllers.DocsSolPrePericiales,
    // @LINE:61
    DocsSolPrePolicias_8: controllers.DocsSolPrePolicias,
    // @LINE:65
    DocsSolPreRegistros_5: controllers.DocsSolPreRegistros,
    // @LINE:69
    DocsSolPreReqInfos_0: controllers.DocsSolPreReqInfos
  ) = this(errorHandler, Documentos_2, DocsAcuerdos_7, DocsArchivosTemporales_13, DocsEntrevistas_6, DocsNics_10, DocsPredenuncias_9, DocsSolPreAcuerdos_11, DocsFacultadesNoInvestigar_3, DocsNoEjerciciosAcciones_4, DocsSolPreInspecciones_12, DocsSolPrePericiales_1, DocsSolPrePolicias_8, DocsSolPreRegistros_5, DocsSolPreReqInfos_0, "/")

  def withPrefix(prefix: String): Routes = {
    documentos.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Documentos_2, DocsAcuerdos_7, DocsArchivosTemporales_13, DocsEntrevistas_6, DocsNics_10, DocsPredenuncias_9, DocsSolPreAcuerdos_11, DocsFacultadesNoInvestigar_3, DocsNoEjerciciosAcciones_4, DocsSolPreInspecciones_12, DocsSolPrePericiales_1, DocsSolPrePolicias_8, DocsSolPreRegistros_5, DocsSolPreReqInfos_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """formatos/save/""" + "$" + """id<[^/]+>/""" + "$" + """formato<[^/]+>""", """controllers.Documentos.save(id:Long, formato:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """documento/""" + "$" + """uuidOracle<[^/]+>/""" + "$" + """contentType<[^/]+>/""" + "$" + """tipo<[^/]+>""", """controllers.Documentos.descargarDocumento(uuidOracle:String, contentType:String, fileName:String ?= "documento.pdf", tipo:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """acuerdos/save/""" + "$" + """id<[^/]+>""", """controllers.DocsAcuerdos.save(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """archivos-temporales/save/""" + "$" + """id<[^/]+>""", """controllers.DocsArchivosTemporales.save(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entrevistas/save/""" + "$" + """id<[^/]+>""", """controllers.DocsEntrevistas.save(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """casos/save/""" + "$" + """id<[^/]+>""", """controllers.DocsNics.save(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """casos/""" + "$" + """id<[^/]+>/page""", """controllers.DocsNics.pageByCase(id:Long, p:Int ?= 0, s:String ?= "created", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """predenuncias/save/""" + "$" + """id<[^/]+>""", """controllers.DocsPredenuncias.save(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-acuerdos/save/""" + "$" + """id<[^/]+>""", """controllers.DocsSolPreAcuerdos.save(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facultades-no-investigar/save/""" + "$" + """id<[^/]+>""", """controllers.DocsFacultadesNoInvestigar.save(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """no-ejercicio-accion/save/""" + "$" + """id<[^/]+>""", """controllers.DocsNoEjerciciosAcciones.save(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-inspecciones/save/""" + "$" + """id<[^/]+>""", """controllers.DocsSolPreInspecciones.save(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-pericial/save/""" + "$" + """id<[^/]+>""", """controllers.DocsSolPrePericiales.save(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-policias/save/""" + "$" + """id<[^/]+>""", """controllers.DocsSolPrePolicias.save(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-registros/save/""" + "$" + """id<[^/]+>""", """controllers.DocsSolPreRegistros.save(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitudes-pre-info/save/""" + "$" + """id<[^/]+>""", """controllers.DocsSolPreReqInfos.save(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:11
  private[this] lazy val controllers_Documentos_save0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("formatos/save/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("formato", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Documentos_save0_invoker = createInvoker(
    Documentos_2.save(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.Documentos",
      "save",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """formatos/save/""" + "$" + """id<[^/]+>/""" + "$" + """formato<[^/]+>""",
      """Formatos
##############################################################################################################           				""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Documentos_descargarDocumento1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("documento/"), DynamicPart("uuidOracle", """[^/]+""",true), StaticPart("/"), DynamicPart("contentType", """[^/]+""",true), StaticPart("/"), DynamicPart("tipo", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Documentos_descargarDocumento1_invoker = createInvoker(
    Documentos_2.descargarDocumento(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.Documentos",
      "descargarDocumento",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """documento/""" + "$" + """uuidOracle<[^/]+>/""" + "$" + """contentType<[^/]+>/""" + "$" + """tipo<[^/]+>""",
      """Documentos
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_DocsAcuerdos_save2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("acuerdos/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocsAcuerdos_save2_invoker = createInvoker(
    DocsAcuerdos_7.save(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsAcuerdos",
      "save",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """acuerdos/save/""" + "$" + """id<[^/]+>""",
      """Acuerdos
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_DocsArchivosTemporales_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("archivos-temporales/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocsArchivosTemporales_save3_invoker = createInvoker(
    DocsArchivosTemporales_13.save(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsArchivosTemporales",
      "save",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """archivos-temporales/save/""" + "$" + """id<[^/]+>""",
      """Archivo temporal
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_DocsEntrevistas_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entrevistas/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocsEntrevistas_save4_invoker = createInvoker(
    DocsEntrevistas_6.save(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsEntrevistas",
      "save",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """entrevistas/save/""" + "$" + """id<[^/]+>""",
      """Entrevista
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_DocsNics_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("casos/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocsNics_save5_invoker = createInvoker(
    DocsNics_10.save(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsNics",
      "save",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """casos/save/""" + "$" + """id<[^/]+>""",
      """Caso
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_DocsNics_pageByCase6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("casos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/page")))
  )
  private[this] lazy val controllers_DocsNics_pageByCase6_invoker = createInvoker(
    DocsNics_10.pageByCase(fakeValue[Long], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsNics",
      "pageByCase",
      Seq(classOf[Long], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """casos/""" + "$" + """id<[^/]+>/page""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_DocsPredenuncias_save7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("predenuncias/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocsPredenuncias_save7_invoker = createInvoker(
    DocsPredenuncias_9.save(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsPredenuncias",
      "save",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """predenuncias/save/""" + "$" + """id<[^/]+>""",
      """Predenuncias
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_DocsSolPreAcuerdos_save8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-acuerdos/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocsSolPreAcuerdos_save8_invoker = createInvoker(
    DocsSolPreAcuerdos_11.save(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsSolPreAcuerdos",
      "save",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """solicitudes-pre-acuerdos/save/""" + "$" + """id<[^/]+>""",
      """Solicitud preliminar de acuerdo general
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_DocsFacultadesNoInvestigar_save9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facultades-no-investigar/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocsFacultadesNoInvestigar_save9_invoker = createInvoker(
    DocsFacultadesNoInvestigar_3.save(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsFacultadesNoInvestigar",
      "save",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """facultades-no-investigar/save/""" + "$" + """id<[^/]+>""",
      """Facultad de no investigar
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_DocsNoEjerciciosAcciones_save10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("no-ejercicio-accion/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocsNoEjerciciosAcciones_save10_invoker = createInvoker(
    DocsNoEjerciciosAcciones_4.save(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsNoEjerciciosAcciones",
      "save",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """no-ejercicio-accion/save/""" + "$" + """id<[^/]+>""",
      """No ejercicio de la acción penal
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_DocsSolPreInspecciones_save11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-inspecciones/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocsSolPreInspecciones_save11_invoker = createInvoker(
    DocsSolPreInspecciones_12.save(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsSolPreInspecciones",
      "save",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """solicitudes-pre-inspecciones/save/""" + "$" + """id<[^/]+>""",
      """Solicitud preliminar de inspección
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_DocsSolPrePericiales_save12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-pericial/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocsSolPrePericiales_save12_invoker = createInvoker(
    DocsSolPrePericiales_1.save(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsSolPrePericiales",
      "save",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """solicitudes-pre-pericial/save/""" + "$" + """id<[^/]+>""",
      """Solicitud preliminar de periciales
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_DocsSolPrePolicias_save13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-policias/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocsSolPrePolicias_save13_invoker = createInvoker(
    DocsSolPrePolicias_8.save(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsSolPrePolicias",
      "save",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """solicitudes-pre-policias/save/""" + "$" + """id<[^/]+>""",
      """Solicitud preliminar de policias
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_DocsSolPreRegistros_save14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-registros/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocsSolPreRegistros_save14_invoker = createInvoker(
    DocsSolPreRegistros_5.save(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsSolPreRegistros",
      "save",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """solicitudes-pre-registros/save/""" + "$" + """id<[^/]+>""",
      """Solicitud preliminar de registro general
########################################################################################################################""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_DocsSolPreReqInfos_save15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitudes-pre-info/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocsSolPreReqInfos_save15_invoker = createInvoker(
    DocsSolPreReqInfos_0.save(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "documentos",
      "controllers.DocsSolPreReqInfos",
      "save",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """solicitudes-pre-info/save/""" + "$" + """id<[^/]+>""",
      """Solicitud preliminar de requerimiento de información
########################################################################################################################""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:11
    case controllers_Documentos_save0_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("formato", None)) { (id, formato) =>
        controllers_Documentos_save0_invoker.call(Documentos_2.save(id, formato))
      }
  
    // @LINE:15
    case controllers_Documentos_descargarDocumento1_route(params@_) =>
      call(params.fromPath[String]("uuidOracle", None), params.fromPath[String]("contentType", None), params.fromQuery[String]("fileName", Some("documento.pdf")), params.fromPath[String]("tipo", None)) { (uuidOracle, contentType, fileName, tipo) =>
        controllers_Documentos_descargarDocumento1_invoker.call(Documentos_2.descargarDocumento(uuidOracle, contentType, fileName, tipo))
      }
  
    // @LINE:19
    case controllers_DocsAcuerdos_save2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocsAcuerdos_save2_invoker.call(DocsAcuerdos_7.save(id))
      }
  
    // @LINE:23
    case controllers_DocsArchivosTemporales_save3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocsArchivosTemporales_save3_invoker.call(DocsArchivosTemporales_13.save(id))
      }
  
    // @LINE:27
    case controllers_DocsEntrevistas_save4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocsEntrevistas_save4_invoker.call(DocsEntrevistas_6.save(id))
      }
  
    // @LINE:31
    case controllers_DocsNics_save5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocsNics_save5_invoker.call(DocsNics_10.save(id))
      }
  
    // @LINE:32
    case controllers_DocsNics_pageByCase6_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("created")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (id, p, s, o, f, tr) =>
        controllers_DocsNics_pageByCase6_invoker.call(DocsNics_10.pageByCase(id, p, s, o, f, tr))
      }
  
    // @LINE:37
    case controllers_DocsPredenuncias_save7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocsPredenuncias_save7_invoker.call(DocsPredenuncias_9.save(id))
      }
  
    // @LINE:41
    case controllers_DocsSolPreAcuerdos_save8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocsSolPreAcuerdos_save8_invoker.call(DocsSolPreAcuerdos_11.save(id))
      }
  
    // @LINE:45
    case controllers_DocsFacultadesNoInvestigar_save9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocsFacultadesNoInvestigar_save9_invoker.call(DocsFacultadesNoInvestigar_3.save(id))
      }
  
    // @LINE:49
    case controllers_DocsNoEjerciciosAcciones_save10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocsNoEjerciciosAcciones_save10_invoker.call(DocsNoEjerciciosAcciones_4.save(id))
      }
  
    // @LINE:53
    case controllers_DocsSolPreInspecciones_save11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocsSolPreInspecciones_save11_invoker.call(DocsSolPreInspecciones_12.save(id))
      }
  
    // @LINE:57
    case controllers_DocsSolPrePericiales_save12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocsSolPrePericiales_save12_invoker.call(DocsSolPrePericiales_1.save(id))
      }
  
    // @LINE:61
    case controllers_DocsSolPrePolicias_save13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocsSolPrePolicias_save13_invoker.call(DocsSolPrePolicias_8.save(id))
      }
  
    // @LINE:65
    case controllers_DocsSolPreRegistros_save14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocsSolPreRegistros_save14_invoker.call(DocsSolPreRegistros_5.save(id))
      }
  
    // @LINE:69
    case controllers_DocsSolPreReqInfos_save15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DocsSolPreReqInfos_save15_invoker.call(DocsSolPreReqInfos_0.save(id))
      }
  }
}
