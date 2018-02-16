
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/solicitudPreliminarCatalog.routes
// @DATE:Thu Feb 15 10:13:36 CST 2018

package solicitudPreliminarCatalog

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:10
  DenunciaQuerellaController_1: controllers.DenunciaQuerellaController,
  // @LINE:20
  VictimaQuerellanteController_3: controllers.VictimaQuerellanteController,
  // @LINE:30
  TipoExamenController_0: controllers.TipoExamenController,
  // @LINE:40
  PeritoMateriaController_2: controllers.PeritoMateriaController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:10
    DenunciaQuerellaController_1: controllers.DenunciaQuerellaController,
    // @LINE:20
    VictimaQuerellanteController_3: controllers.VictimaQuerellanteController,
    // @LINE:30
    TipoExamenController_0: controllers.TipoExamenController,
    // @LINE:40
    PeritoMateriaController_2: controllers.PeritoMateriaController
  ) = this(errorHandler, DenunciaQuerellaController_1, VictimaQuerellanteController_3, TipoExamenController_0, PeritoMateriaController_2, "/")

  def withPrefix(prefix: String): Routes = {
    solicitudPreliminarCatalog.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, DenunciaQuerellaController_1, VictimaQuerellanteController_3, TipoExamenController_0, PeritoMateriaController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """denuncia-querella/page""", """controllers.DenunciaQuerellaController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """denuncia-querella/options""", """controllers.DenunciaQuerellaController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """denuncia-querella/""" + "$" + """id<[^/]+>""", """controllers.DenunciaQuerellaController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """denuncia-querella/""" + "$" + """id<[^/]+>""", """controllers.DenunciaQuerellaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """denuncia-querella""", """controllers.DenunciaQuerellaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """denuncia-querella/""" + "$" + """id<[^/]+>""", """controllers.DenunciaQuerellaController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """victima-querellante/page""", """controllers.VictimaQuerellanteController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """victima-querellante/options""", """controllers.VictimaQuerellanteController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """victima-querellante/""" + "$" + """id<[^/]+>""", """controllers.VictimaQuerellanteController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """victima-querellante/""" + "$" + """id<[^/]+>""", """controllers.VictimaQuerellanteController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """victima-querellante""", """controllers.VictimaQuerellanteController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """victima-querellante/""" + "$" + """id<[^/]+>""", """controllers.VictimaQuerellanteController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-examen/page""", """controllers.TipoExamenController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-examen/options""", """controllers.TipoExamenController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-examen/""" + "$" + """id<[^/]+>""", """controllers.TipoExamenController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-examen/""" + "$" + """id<[^/]+>""", """controllers.TipoExamenController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-examen""", """controllers.TipoExamenController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipo-examen/""" + "$" + """id<[^/]+>""", """controllers.TipoExamenController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """perito-materia/page""", """controllers.PeritoMateriaController.page(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """perito-materia/options""", """controllers.PeritoMateriaController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """perito-materia/""" + "$" + """id<[^/]+>""", """controllers.PeritoMateriaController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """perito-materia/""" + "$" + """id<[^/]+>""", """controllers.PeritoMateriaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """perito-materia""", """controllers.PeritoMateriaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """perito-materia/""" + "$" + """id<[^/]+>""", """controllers.PeritoMateriaController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_DenunciaQuerellaController_page0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("denuncia-querella/page")))
  )
  private[this] lazy val controllers_DenunciaQuerellaController_page0_invoker = createInvoker(
    DenunciaQuerellaController_1.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.DenunciaQuerellaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """denuncia-querella/page""",
      """Denuncia Querella
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_DenunciaQuerellaController_options1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("denuncia-querella/options")))
  )
  private[this] lazy val controllers_DenunciaQuerellaController_options1_invoker = createInvoker(
    DenunciaQuerellaController_1.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.DenunciaQuerellaController",
      "options",
      Nil,
      "GET",
      this.prefix + """denuncia-querella/options""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_DenunciaQuerellaController_get2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("denuncia-querella/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DenunciaQuerellaController_get2_invoker = createInvoker(
    DenunciaQuerellaController_1.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.DenunciaQuerellaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """denuncia-querella/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_DenunciaQuerellaController_update3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("denuncia-querella/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DenunciaQuerellaController_update3_invoker = createInvoker(
    DenunciaQuerellaController_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.DenunciaQuerellaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """denuncia-querella/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_DenunciaQuerellaController_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("denuncia-querella")))
  )
  private[this] lazy val controllers_DenunciaQuerellaController_save4_invoker = createInvoker(
    DenunciaQuerellaController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.DenunciaQuerellaController",
      "save",
      Nil,
      "POST",
      this.prefix + """denuncia-querella""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_DenunciaQuerellaController_delete5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("denuncia-querella/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DenunciaQuerellaController_delete5_invoker = createInvoker(
    DenunciaQuerellaController_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.DenunciaQuerellaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """denuncia-querella/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_VictimaQuerellanteController_page6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("victima-querellante/page")))
  )
  private[this] lazy val controllers_VictimaQuerellanteController_page6_invoker = createInvoker(
    VictimaQuerellanteController_3.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.VictimaQuerellanteController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """victima-querellante/page""",
      """Victima Querellante
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_VictimaQuerellanteController_options7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("victima-querellante/options")))
  )
  private[this] lazy val controllers_VictimaQuerellanteController_options7_invoker = createInvoker(
    VictimaQuerellanteController_3.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.VictimaQuerellanteController",
      "options",
      Nil,
      "GET",
      this.prefix + """victima-querellante/options""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_VictimaQuerellanteController_get8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("victima-querellante/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VictimaQuerellanteController_get8_invoker = createInvoker(
    VictimaQuerellanteController_3.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.VictimaQuerellanteController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """victima-querellante/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_VictimaQuerellanteController_update9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("victima-querellante/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VictimaQuerellanteController_update9_invoker = createInvoker(
    VictimaQuerellanteController_3.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.VictimaQuerellanteController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """victima-querellante/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_VictimaQuerellanteController_save10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("victima-querellante")))
  )
  private[this] lazy val controllers_VictimaQuerellanteController_save10_invoker = createInvoker(
    VictimaQuerellanteController_3.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.VictimaQuerellanteController",
      "save",
      Nil,
      "POST",
      this.prefix + """victima-querellante""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_VictimaQuerellanteController_delete11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("victima-querellante/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VictimaQuerellanteController_delete11_invoker = createInvoker(
    VictimaQuerellanteController_3.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.VictimaQuerellanteController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """victima-querellante/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_TipoExamenController_page12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-examen/page")))
  )
  private[this] lazy val controllers_TipoExamenController_page12_invoker = createInvoker(
    TipoExamenController_0.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.TipoExamenController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """tipo-examen/page""",
      """Tipo Examen
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_TipoExamenController_options13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-examen/options")))
  )
  private[this] lazy val controllers_TipoExamenController_options13_invoker = createInvoker(
    TipoExamenController_0.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.TipoExamenController",
      "options",
      Nil,
      "GET",
      this.prefix + """tipo-examen/options""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_TipoExamenController_get14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-examen/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoExamenController_get14_invoker = createInvoker(
    TipoExamenController_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.TipoExamenController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tipo-examen/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_TipoExamenController_update15_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-examen/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoExamenController_update15_invoker = createInvoker(
    TipoExamenController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.TipoExamenController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """tipo-examen/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_TipoExamenController_save16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-examen")))
  )
  private[this] lazy val controllers_TipoExamenController_save16_invoker = createInvoker(
    TipoExamenController_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.TipoExamenController",
      "save",
      Nil,
      "POST",
      this.prefix + """tipo-examen""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_TipoExamenController_delete17_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipo-examen/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TipoExamenController_delete17_invoker = createInvoker(
    TipoExamenController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.TipoExamenController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """tipo-examen/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_PeritoMateriaController_page18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("perito-materia/page")))
  )
  private[this] lazy val controllers_PeritoMateriaController_page18_invoker = createInvoker(
    PeritoMateriaController_2.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.PeritoMateriaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """perito-materia/page""",
      """Perito Material
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_PeritoMateriaController_options19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("perito-materia/options")))
  )
  private[this] lazy val controllers_PeritoMateriaController_options19_invoker = createInvoker(
    PeritoMateriaController_2.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.PeritoMateriaController",
      "options",
      Nil,
      "GET",
      this.prefix + """perito-materia/options""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_PeritoMateriaController_get20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("perito-materia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PeritoMateriaController_get20_invoker = createInvoker(
    PeritoMateriaController_2.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.PeritoMateriaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """perito-materia/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_PeritoMateriaController_update21_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("perito-materia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PeritoMateriaController_update21_invoker = createInvoker(
    PeritoMateriaController_2.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.PeritoMateriaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """perito-materia/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_PeritoMateriaController_save22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("perito-materia")))
  )
  private[this] lazy val controllers_PeritoMateriaController_save22_invoker = createInvoker(
    PeritoMateriaController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.PeritoMateriaController",
      "save",
      Nil,
      "POST",
      this.prefix + """perito-materia""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_PeritoMateriaController_delete23_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("perito-materia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PeritoMateriaController_delete23_invoker = createInvoker(
    PeritoMateriaController_2.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "solicitudPreliminarCatalog",
      "controllers.PeritoMateriaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """perito-materia/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:10
    case controllers_DenunciaQuerellaController_page0_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_DenunciaQuerellaController_page0_invoker.call(DenunciaQuerellaController_1.page(p, s, o, f, tr))
      }
  
    // @LINE:11
    case controllers_DenunciaQuerellaController_options1_route(params@_) =>
      call { 
        controllers_DenunciaQuerellaController_options1_invoker.call(DenunciaQuerellaController_1.options())
      }
  
    // @LINE:12
    case controllers_DenunciaQuerellaController_get2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DenunciaQuerellaController_get2_invoker.call(DenunciaQuerellaController_1.get(id))
      }
  
    // @LINE:13
    case controllers_DenunciaQuerellaController_update3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DenunciaQuerellaController_update3_invoker.call(DenunciaQuerellaController_1.update(id))
      }
  
    // @LINE:14
    case controllers_DenunciaQuerellaController_save4_route(params@_) =>
      call { 
        controllers_DenunciaQuerellaController_save4_invoker.call(DenunciaQuerellaController_1.save())
      }
  
    // @LINE:15
    case controllers_DenunciaQuerellaController_delete5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DenunciaQuerellaController_delete5_invoker.call(DenunciaQuerellaController_1.delete(id))
      }
  
    // @LINE:20
    case controllers_VictimaQuerellanteController_page6_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_VictimaQuerellanteController_page6_invoker.call(VictimaQuerellanteController_3.page(p, s, o, f, tr))
      }
  
    // @LINE:21
    case controllers_VictimaQuerellanteController_options7_route(params@_) =>
      call { 
        controllers_VictimaQuerellanteController_options7_invoker.call(VictimaQuerellanteController_3.options())
      }
  
    // @LINE:22
    case controllers_VictimaQuerellanteController_get8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VictimaQuerellanteController_get8_invoker.call(VictimaQuerellanteController_3.get(id))
      }
  
    // @LINE:23
    case controllers_VictimaQuerellanteController_update9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VictimaQuerellanteController_update9_invoker.call(VictimaQuerellanteController_3.update(id))
      }
  
    // @LINE:24
    case controllers_VictimaQuerellanteController_save10_route(params@_) =>
      call { 
        controllers_VictimaQuerellanteController_save10_invoker.call(VictimaQuerellanteController_3.save())
      }
  
    // @LINE:25
    case controllers_VictimaQuerellanteController_delete11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VictimaQuerellanteController_delete11_invoker.call(VictimaQuerellanteController_3.delete(id))
      }
  
    // @LINE:30
    case controllers_TipoExamenController_page12_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_TipoExamenController_page12_invoker.call(TipoExamenController_0.page(p, s, o, f, tr))
      }
  
    // @LINE:31
    case controllers_TipoExamenController_options13_route(params@_) =>
      call { 
        controllers_TipoExamenController_options13_invoker.call(TipoExamenController_0.options())
      }
  
    // @LINE:32
    case controllers_TipoExamenController_get14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoExamenController_get14_invoker.call(TipoExamenController_0.get(id))
      }
  
    // @LINE:33
    case controllers_TipoExamenController_update15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoExamenController_update15_invoker.call(TipoExamenController_0.update(id))
      }
  
    // @LINE:34
    case controllers_TipoExamenController_save16_route(params@_) =>
      call { 
        controllers_TipoExamenController_save16_invoker.call(TipoExamenController_0.save())
      }
  
    // @LINE:35
    case controllers_TipoExamenController_delete17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipoExamenController_delete17_invoker.call(TipoExamenController_0.delete(id))
      }
  
    // @LINE:40
    case controllers_PeritoMateriaController_page18_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_PeritoMateriaController_page18_invoker.call(PeritoMateriaController_2.page(p, s, o, f, tr))
      }
  
    // @LINE:41
    case controllers_PeritoMateriaController_options19_route(params@_) =>
      call { 
        controllers_PeritoMateriaController_options19_invoker.call(PeritoMateriaController_2.options())
      }
  
    // @LINE:42
    case controllers_PeritoMateriaController_get20_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PeritoMateriaController_get20_invoker.call(PeritoMateriaController_2.get(id))
      }
  
    // @LINE:43
    case controllers_PeritoMateriaController_update21_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PeritoMateriaController_update21_invoker.call(PeritoMateriaController_2.update(id))
      }
  
    // @LINE:44
    case controllers_PeritoMateriaController_save22_route(params@_) =>
      call { 
        controllers_PeritoMateriaController_save22_invoker.call(PeritoMateriaController_2.save())
      }
  
    // @LINE:45
    case controllers_PeritoMateriaController_delete23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PeritoMateriaController_delete23_invoker.call(PeritoMateriaController_2.delete(id))
      }
  }
}
