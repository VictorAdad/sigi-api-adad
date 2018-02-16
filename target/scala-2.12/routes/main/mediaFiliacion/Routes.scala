
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/mediaFiliacion.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package mediaFiliacion

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  CabelloController_3: controllers.CabelloController,
  // @LINE:19
  CaraNarizController_5: controllers.CaraNarizController,
  // @LINE:30
  CejaBocaController_6: controllers.CejaBocaController,
  // @LINE:41
  ComplexionPielSangreController_2: controllers.ComplexionPielSangreController,
  // @LINE:51
  FrenteMentonController_1: controllers.FrenteMentonController,
  // @LINE:61
  LabioOjoController_4: controllers.LabioOjoController,
  // @LINE:71
  OrejaController_7: controllers.OrejaController,
  // @LINE:82
  DesaparicionConsumacionController_0: controllers.DesaparicionConsumacionController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    CabelloController_3: controllers.CabelloController,
    // @LINE:19
    CaraNarizController_5: controllers.CaraNarizController,
    // @LINE:30
    CejaBocaController_6: controllers.CejaBocaController,
    // @LINE:41
    ComplexionPielSangreController_2: controllers.ComplexionPielSangreController,
    // @LINE:51
    FrenteMentonController_1: controllers.FrenteMentonController,
    // @LINE:61
    LabioOjoController_4: controllers.LabioOjoController,
    // @LINE:71
    OrejaController_7: controllers.OrejaController,
    // @LINE:82
    DesaparicionConsumacionController_0: controllers.DesaparicionConsumacionController
  ) = this(errorHandler, CabelloController_3, CaraNarizController_5, CejaBocaController_6, ComplexionPielSangreController_2, FrenteMentonController_1, LabioOjoController_4, OrejaController_7, DesaparicionConsumacionController_0, "/")

  def withPrefix(prefix: String): Routes = {
    mediaFiliacion.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, CabelloController_3, CaraNarizController_5, CejaBocaController_6, ComplexionPielSangreController_2, FrenteMentonController_1, LabioOjoController_4, OrejaController_7, DesaparicionConsumacionController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cabello/page""", """controllers.CabelloController.page(p:Int ?= 0, s:String ?= "cantidad", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cabello/options""", """controllers.CabelloController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cabello""", """controllers.CabelloController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cabello/""" + "$" + """id<[^/]+>""", """controllers.CabelloController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cabello/""" + "$" + """id<[^/]+>""", """controllers.CabelloController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cabello""", """controllers.CabelloController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cabello/""" + "$" + """id<[^/]+>""", """controllers.CabelloController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cara-nariz/page""", """controllers.CaraNarizController.page(p:Int ?= 0, s:String ?= "forma_cara", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cara-nariz/options""", """controllers.CaraNarizController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cara-nariz""", """controllers.CaraNarizController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cara-nariz/""" + "$" + """id<[^/]+>""", """controllers.CaraNarizController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cara-nariz/""" + "$" + """id<[^/]+>""", """controllers.CaraNarizController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cara-nariz""", """controllers.CaraNarizController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cara-nariz/""" + "$" + """id<[^/]+>""", """controllers.CaraNarizController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ceja-boca/page""", """controllers.CejaBocaController.page(p:Int ?= 0, s:String ?= "direccion_ceja", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ceja-boca/options""", """controllers.CejaBocaController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ceja-boca""", """controllers.CejaBocaController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ceja-boca/""" + "$" + """id<[^/]+>""", """controllers.CejaBocaController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ceja-boca/""" + "$" + """id<[^/]+>""", """controllers.CejaBocaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ceja-boca""", """controllers.CejaBocaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ceja-boca/""" + "$" + """id<[^/]+>""", """controllers.CejaBocaController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """complexion-piel-sangre/page""", """controllers.ComplexionPielSangreController.page(p:Int ?= 0, s:String ?= "tipo_complexion", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """complexion-piel-sangre/options""", """controllers.ComplexionPielSangreController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """complexion-piel-sangre""", """controllers.ComplexionPielSangreController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """complexion-piel-sangre/""" + "$" + """id<[^/]+>""", """controllers.ComplexionPielSangreController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """complexion-piel-sangre/""" + "$" + """id<[^/]+>""", """controllers.ComplexionPielSangreController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """complexion-piel-sangre""", """controllers.ComplexionPielSangreController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """complexion-piel-sangre/""" + "$" + """id<[^/]+>""", """controllers.ComplexionPielSangreController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frente-menton/page""", """controllers.FrenteMentonController.page(p:Int ?= 0, s:String ?= "altura_frente", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frente-menton/options""", """controllers.FrenteMentonController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frente-menton""", """controllers.FrenteMentonController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frente-menton/""" + "$" + """id<[^/]+>""", """controllers.FrenteMentonController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frente-menton/""" + "$" + """id<[^/]+>""", """controllers.FrenteMentonController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frente-menton""", """controllers.FrenteMentonController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frente-menton/""" + "$" + """id<[^/]+>""", """controllers.FrenteMentonController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """labio-ojo/page""", """controllers.LabioOjoController.page(p:Int ?= 0, s:String ?= "espesor_labio", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """labio-ojo/options""", """controllers.LabioOjoController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """labio-ojo""", """controllers.LabioOjoController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """labio-ojo/""" + "$" + """id<[^/]+>""", """controllers.LabioOjoController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """labio-ojo/""" + "$" + """id<[^/]+>""", """controllers.LabioOjoController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """labio-ojo""", """controllers.LabioOjoController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """labio-ojo/""" + "$" + """id<[^/]+>""", """controllers.LabioOjoController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """oreja/page""", """controllers.OrejaController.page(p:Int ?= 0, s:String ?= "forma", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """oreja/options""", """controllers.OrejaController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """oreja""", """controllers.OrejaController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """oreja/""" + "$" + """id<[^/]+>""", """controllers.OrejaController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """oreja/""" + "$" + """id<[^/]+>""", """controllers.OrejaController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """oreja""", """controllers.OrejaController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """oreja/""" + "$" + """id<[^/]+>""", """controllers.OrejaController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """desaparacion-consumacion/page""", """controllers.DesaparicionConsumacionController.page(p:Int ?= 0, s:String ?= "consumacion", o:String ?= "asc", f:String ?= "", tr:Int ?= 10)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """desaparacion-consumacion/options""", """controllers.DesaparicionConsumacionController.options()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """desaparacion-consumacion""", """controllers.DesaparicionConsumacionController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """desaparacion-consumacion/""" + "$" + """id<[^/]+>""", """controllers.DesaparicionConsumacionController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """desaparacion-consumacion/""" + "$" + """id<[^/]+>""", """controllers.DesaparicionConsumacionController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """desaparacion-consumacion""", """controllers.DesaparicionConsumacionController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """desaparacion-consumacion/""" + "$" + """id<[^/]+>""", """controllers.DesaparicionConsumacionController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_CabelloController_page0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cabello/page")))
  )
  private[this] lazy val controllers_CabelloController_page0_invoker = createInvoker(
    CabelloController_3.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CabelloController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """cabello/page""",
      """Cabello
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_CabelloController_options1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cabello/options")))
  )
  private[this] lazy val controllers_CabelloController_options1_invoker = createInvoker(
    CabelloController_3.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CabelloController",
      "options",
      Nil,
      "GET",
      this.prefix + """cabello/options""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CabelloController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cabello")))
  )
  private[this] lazy val controllers_CabelloController_list2_invoker = createInvoker(
    CabelloController_3.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CabelloController",
      "list",
      Nil,
      "GET",
      this.prefix + """cabello""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CabelloController_get3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cabello/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CabelloController_get3_invoker = createInvoker(
    CabelloController_3.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CabelloController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cabello/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_CabelloController_update4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cabello/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CabelloController_update4_invoker = createInvoker(
    CabelloController_3.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CabelloController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """cabello/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_CabelloController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cabello")))
  )
  private[this] lazy val controllers_CabelloController_save5_invoker = createInvoker(
    CabelloController_3.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CabelloController",
      "save",
      Nil,
      "POST",
      this.prefix + """cabello""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_CabelloController_delete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cabello/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CabelloController_delete6_invoker = createInvoker(
    CabelloController_3.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CabelloController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """cabello/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_CaraNarizController_page7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cara-nariz/page")))
  )
  private[this] lazy val controllers_CaraNarizController_page7_invoker = createInvoker(
    CaraNarizController_5.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CaraNarizController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """cara-nariz/page""",
      """CaraNariz
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_CaraNarizController_options8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cara-nariz/options")))
  )
  private[this] lazy val controllers_CaraNarizController_options8_invoker = createInvoker(
    CaraNarizController_5.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CaraNarizController",
      "options",
      Nil,
      "GET",
      this.prefix + """cara-nariz/options""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_CaraNarizController_list9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cara-nariz")))
  )
  private[this] lazy val controllers_CaraNarizController_list9_invoker = createInvoker(
    CaraNarizController_5.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CaraNarizController",
      "list",
      Nil,
      "GET",
      this.prefix + """cara-nariz""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_CaraNarizController_get10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cara-nariz/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CaraNarizController_get10_invoker = createInvoker(
    CaraNarizController_5.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CaraNarizController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cara-nariz/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_CaraNarizController_update11_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cara-nariz/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CaraNarizController_update11_invoker = createInvoker(
    CaraNarizController_5.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CaraNarizController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """cara-nariz/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_CaraNarizController_save12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cara-nariz")))
  )
  private[this] lazy val controllers_CaraNarizController_save12_invoker = createInvoker(
    CaraNarizController_5.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CaraNarizController",
      "save",
      Nil,
      "POST",
      this.prefix + """cara-nariz""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_CaraNarizController_delete13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cara-nariz/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CaraNarizController_delete13_invoker = createInvoker(
    CaraNarizController_5.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CaraNarizController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """cara-nariz/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_CejaBocaController_page14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ceja-boca/page")))
  )
  private[this] lazy val controllers_CejaBocaController_page14_invoker = createInvoker(
    CejaBocaController_6.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CejaBocaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """ceja-boca/page""",
      """CejaBoca
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_CejaBocaController_options15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ceja-boca/options")))
  )
  private[this] lazy val controllers_CejaBocaController_options15_invoker = createInvoker(
    CejaBocaController_6.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CejaBocaController",
      "options",
      Nil,
      "GET",
      this.prefix + """ceja-boca/options""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_CejaBocaController_list16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ceja-boca")))
  )
  private[this] lazy val controllers_CejaBocaController_list16_invoker = createInvoker(
    CejaBocaController_6.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CejaBocaController",
      "list",
      Nil,
      "GET",
      this.prefix + """ceja-boca""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_CejaBocaController_get17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ceja-boca/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CejaBocaController_get17_invoker = createInvoker(
    CejaBocaController_6.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CejaBocaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """ceja-boca/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_CejaBocaController_update18_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ceja-boca/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CejaBocaController_update18_invoker = createInvoker(
    CejaBocaController_6.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CejaBocaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """ceja-boca/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_CejaBocaController_save19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ceja-boca")))
  )
  private[this] lazy val controllers_CejaBocaController_save19_invoker = createInvoker(
    CejaBocaController_6.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CejaBocaController",
      "save",
      Nil,
      "POST",
      this.prefix + """ceja-boca""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_CejaBocaController_delete20_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ceja-boca/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CejaBocaController_delete20_invoker = createInvoker(
    CejaBocaController_6.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.CejaBocaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """ceja-boca/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_ComplexionPielSangreController_page21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("complexion-piel-sangre/page")))
  )
  private[this] lazy val controllers_ComplexionPielSangreController_page21_invoker = createInvoker(
    ComplexionPielSangreController_2.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.ComplexionPielSangreController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """complexion-piel-sangre/page""",
      """ComplexionPielSangre
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_ComplexionPielSangreController_options22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("complexion-piel-sangre/options")))
  )
  private[this] lazy val controllers_ComplexionPielSangreController_options22_invoker = createInvoker(
    ComplexionPielSangreController_2.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.ComplexionPielSangreController",
      "options",
      Nil,
      "GET",
      this.prefix + """complexion-piel-sangre/options""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_ComplexionPielSangreController_list23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("complexion-piel-sangre")))
  )
  private[this] lazy val controllers_ComplexionPielSangreController_list23_invoker = createInvoker(
    ComplexionPielSangreController_2.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.ComplexionPielSangreController",
      "list",
      Nil,
      "GET",
      this.prefix + """complexion-piel-sangre""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_ComplexionPielSangreController_get24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("complexion-piel-sangre/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ComplexionPielSangreController_get24_invoker = createInvoker(
    ComplexionPielSangreController_2.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.ComplexionPielSangreController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """complexion-piel-sangre/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_ComplexionPielSangreController_update25_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("complexion-piel-sangre/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ComplexionPielSangreController_update25_invoker = createInvoker(
    ComplexionPielSangreController_2.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.ComplexionPielSangreController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """complexion-piel-sangre/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_ComplexionPielSangreController_save26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("complexion-piel-sangre")))
  )
  private[this] lazy val controllers_ComplexionPielSangreController_save26_invoker = createInvoker(
    ComplexionPielSangreController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.ComplexionPielSangreController",
      "save",
      Nil,
      "POST",
      this.prefix + """complexion-piel-sangre""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_ComplexionPielSangreController_delete27_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("complexion-piel-sangre/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ComplexionPielSangreController_delete27_invoker = createInvoker(
    ComplexionPielSangreController_2.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.ComplexionPielSangreController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """complexion-piel-sangre/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_FrenteMentonController_page28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frente-menton/page")))
  )
  private[this] lazy val controllers_FrenteMentonController_page28_invoker = createInvoker(
    FrenteMentonController_1.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.FrenteMentonController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """frente-menton/page""",
      """FrenteMenton
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_FrenteMentonController_options29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frente-menton/options")))
  )
  private[this] lazy val controllers_FrenteMentonController_options29_invoker = createInvoker(
    FrenteMentonController_1.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.FrenteMentonController",
      "options",
      Nil,
      "GET",
      this.prefix + """frente-menton/options""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_FrenteMentonController_list30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frente-menton")))
  )
  private[this] lazy val controllers_FrenteMentonController_list30_invoker = createInvoker(
    FrenteMentonController_1.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.FrenteMentonController",
      "list",
      Nil,
      "GET",
      this.prefix + """frente-menton""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_FrenteMentonController_get31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frente-menton/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FrenteMentonController_get31_invoker = createInvoker(
    FrenteMentonController_1.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.FrenteMentonController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """frente-menton/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_FrenteMentonController_update32_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frente-menton/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FrenteMentonController_update32_invoker = createInvoker(
    FrenteMentonController_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.FrenteMentonController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """frente-menton/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_FrenteMentonController_save33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frente-menton")))
  )
  private[this] lazy val controllers_FrenteMentonController_save33_invoker = createInvoker(
    FrenteMentonController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.FrenteMentonController",
      "save",
      Nil,
      "POST",
      this.prefix + """frente-menton""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_FrenteMentonController_delete34_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frente-menton/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FrenteMentonController_delete34_invoker = createInvoker(
    FrenteMentonController_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.FrenteMentonController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """frente-menton/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_LabioOjoController_page35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("labio-ojo/page")))
  )
  private[this] lazy val controllers_LabioOjoController_page35_invoker = createInvoker(
    LabioOjoController_4.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.LabioOjoController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """labio-ojo/page""",
      """LabioOjo
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_LabioOjoController_options36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("labio-ojo/options")))
  )
  private[this] lazy val controllers_LabioOjoController_options36_invoker = createInvoker(
    LabioOjoController_4.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.LabioOjoController",
      "options",
      Nil,
      "GET",
      this.prefix + """labio-ojo/options""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_LabioOjoController_list37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("labio-ojo")))
  )
  private[this] lazy val controllers_LabioOjoController_list37_invoker = createInvoker(
    LabioOjoController_4.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.LabioOjoController",
      "list",
      Nil,
      "GET",
      this.prefix + """labio-ojo""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_LabioOjoController_get38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("labio-ojo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LabioOjoController_get38_invoker = createInvoker(
    LabioOjoController_4.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.LabioOjoController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """labio-ojo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_LabioOjoController_update39_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("labio-ojo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LabioOjoController_update39_invoker = createInvoker(
    LabioOjoController_4.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.LabioOjoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """labio-ojo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_LabioOjoController_save40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("labio-ojo")))
  )
  private[this] lazy val controllers_LabioOjoController_save40_invoker = createInvoker(
    LabioOjoController_4.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.LabioOjoController",
      "save",
      Nil,
      "POST",
      this.prefix + """labio-ojo""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_LabioOjoController_delete41_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("labio-ojo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LabioOjoController_delete41_invoker = createInvoker(
    LabioOjoController_4.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.LabioOjoController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """labio-ojo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_OrejaController_page42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("oreja/page")))
  )
  private[this] lazy val controllers_OrejaController_page42_invoker = createInvoker(
    OrejaController_7.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.OrejaController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """oreja/page""",
      """Oreja
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val controllers_OrejaController_options43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("oreja/options")))
  )
  private[this] lazy val controllers_OrejaController_options43_invoker = createInvoker(
    OrejaController_7.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.OrejaController",
      "options",
      Nil,
      "GET",
      this.prefix + """oreja/options""",
      """""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_OrejaController_list44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("oreja")))
  )
  private[this] lazy val controllers_OrejaController_list44_invoker = createInvoker(
    OrejaController_7.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.OrejaController",
      "list",
      Nil,
      "GET",
      this.prefix + """oreja""",
      """""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_OrejaController_get45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("oreja/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrejaController_get45_invoker = createInvoker(
    OrejaController_7.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.OrejaController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """oreja/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:75
  private[this] lazy val controllers_OrejaController_update46_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("oreja/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrejaController_update46_invoker = createInvoker(
    OrejaController_7.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.OrejaController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """oreja/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_OrejaController_save47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("oreja")))
  )
  private[this] lazy val controllers_OrejaController_save47_invoker = createInvoker(
    OrejaController_7.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.OrejaController",
      "save",
      Nil,
      "POST",
      this.prefix + """oreja""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_OrejaController_delete48_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("oreja/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrejaController_delete48_invoker = createInvoker(
    OrejaController_7.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.OrejaController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """oreja/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:82
  private[this] lazy val controllers_DesaparicionConsumacionController_page49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("desaparacion-consumacion/page")))
  )
  private[this] lazy val controllers_DesaparicionConsumacionController_page49_invoker = createInvoker(
    DesaparicionConsumacionController_0.page(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.DesaparicionConsumacionController",
      "page",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """desaparacion-consumacion/page""",
      """DesaparicionConsumacion
##############################################################################################################""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_DesaparicionConsumacionController_options50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("desaparacion-consumacion/options")))
  )
  private[this] lazy val controllers_DesaparicionConsumacionController_options50_invoker = createInvoker(
    DesaparicionConsumacionController_0.options(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.DesaparicionConsumacionController",
      "options",
      Nil,
      "GET",
      this.prefix + """desaparacion-consumacion/options""",
      """""",
      Seq()
    )
  )

  // @LINE:84
  private[this] lazy val controllers_DesaparicionConsumacionController_list51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("desaparacion-consumacion")))
  )
  private[this] lazy val controllers_DesaparicionConsumacionController_list51_invoker = createInvoker(
    DesaparicionConsumacionController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.DesaparicionConsumacionController",
      "list",
      Nil,
      "GET",
      this.prefix + """desaparacion-consumacion""",
      """""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_DesaparicionConsumacionController_get52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("desaparacion-consumacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DesaparicionConsumacionController_get52_invoker = createInvoker(
    DesaparicionConsumacionController_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.DesaparicionConsumacionController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """desaparacion-consumacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:86
  private[this] lazy val controllers_DesaparicionConsumacionController_update53_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("desaparacion-consumacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DesaparicionConsumacionController_update53_invoker = createInvoker(
    DesaparicionConsumacionController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.DesaparicionConsumacionController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """desaparacion-consumacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:87
  private[this] lazy val controllers_DesaparicionConsumacionController_save54_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("desaparacion-consumacion")))
  )
  private[this] lazy val controllers_DesaparicionConsumacionController_save54_invoker = createInvoker(
    DesaparicionConsumacionController_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.DesaparicionConsumacionController",
      "save",
      Nil,
      "POST",
      this.prefix + """desaparacion-consumacion""",
      """""",
      Seq()
    )
  )

  // @LINE:88
  private[this] lazy val controllers_DesaparicionConsumacionController_delete55_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("desaparacion-consumacion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DesaparicionConsumacionController_delete55_invoker = createInvoker(
    DesaparicionConsumacionController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "mediaFiliacion",
      "controllers.DesaparicionConsumacionController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """desaparacion-consumacion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_CabelloController_page0_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("cantidad")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_CabelloController_page0_invoker.call(CabelloController_3.page(p, s, o, f, tr))
      }
  
    // @LINE:10
    case controllers_CabelloController_options1_route(params@_) =>
      call { 
        controllers_CabelloController_options1_invoker.call(CabelloController_3.options())
      }
  
    // @LINE:11
    case controllers_CabelloController_list2_route(params@_) =>
      call { 
        controllers_CabelloController_list2_invoker.call(CabelloController_3.list)
      }
  
    // @LINE:12
    case controllers_CabelloController_get3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CabelloController_get3_invoker.call(CabelloController_3.get(id))
      }
  
    // @LINE:13
    case controllers_CabelloController_update4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CabelloController_update4_invoker.call(CabelloController_3.update(id))
      }
  
    // @LINE:14
    case controllers_CabelloController_save5_route(params@_) =>
      call { 
        controllers_CabelloController_save5_invoker.call(CabelloController_3.save())
      }
  
    // @LINE:15
    case controllers_CabelloController_delete6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CabelloController_delete6_invoker.call(CabelloController_3.delete(id))
      }
  
    // @LINE:19
    case controllers_CaraNarizController_page7_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("forma_cara")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_CaraNarizController_page7_invoker.call(CaraNarizController_5.page(p, s, o, f, tr))
      }
  
    // @LINE:20
    case controllers_CaraNarizController_options8_route(params@_) =>
      call { 
        controllers_CaraNarizController_options8_invoker.call(CaraNarizController_5.options())
      }
  
    // @LINE:21
    case controllers_CaraNarizController_list9_route(params@_) =>
      call { 
        controllers_CaraNarizController_list9_invoker.call(CaraNarizController_5.list)
      }
  
    // @LINE:22
    case controllers_CaraNarizController_get10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CaraNarizController_get10_invoker.call(CaraNarizController_5.get(id))
      }
  
    // @LINE:23
    case controllers_CaraNarizController_update11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CaraNarizController_update11_invoker.call(CaraNarizController_5.update(id))
      }
  
    // @LINE:24
    case controllers_CaraNarizController_save12_route(params@_) =>
      call { 
        controllers_CaraNarizController_save12_invoker.call(CaraNarizController_5.save())
      }
  
    // @LINE:25
    case controllers_CaraNarizController_delete13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CaraNarizController_delete13_invoker.call(CaraNarizController_5.delete(id))
      }
  
    // @LINE:30
    case controllers_CejaBocaController_page14_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("direccion_ceja")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_CejaBocaController_page14_invoker.call(CejaBocaController_6.page(p, s, o, f, tr))
      }
  
    // @LINE:31
    case controllers_CejaBocaController_options15_route(params@_) =>
      call { 
        controllers_CejaBocaController_options15_invoker.call(CejaBocaController_6.options())
      }
  
    // @LINE:32
    case controllers_CejaBocaController_list16_route(params@_) =>
      call { 
        controllers_CejaBocaController_list16_invoker.call(CejaBocaController_6.list)
      }
  
    // @LINE:33
    case controllers_CejaBocaController_get17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CejaBocaController_get17_invoker.call(CejaBocaController_6.get(id))
      }
  
    // @LINE:34
    case controllers_CejaBocaController_update18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CejaBocaController_update18_invoker.call(CejaBocaController_6.update(id))
      }
  
    // @LINE:35
    case controllers_CejaBocaController_save19_route(params@_) =>
      call { 
        controllers_CejaBocaController_save19_invoker.call(CejaBocaController_6.save())
      }
  
    // @LINE:36
    case controllers_CejaBocaController_delete20_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CejaBocaController_delete20_invoker.call(CejaBocaController_6.delete(id))
      }
  
    // @LINE:41
    case controllers_ComplexionPielSangreController_page21_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("tipo_complexion")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_ComplexionPielSangreController_page21_invoker.call(ComplexionPielSangreController_2.page(p, s, o, f, tr))
      }
  
    // @LINE:42
    case controllers_ComplexionPielSangreController_options22_route(params@_) =>
      call { 
        controllers_ComplexionPielSangreController_options22_invoker.call(ComplexionPielSangreController_2.options())
      }
  
    // @LINE:43
    case controllers_ComplexionPielSangreController_list23_route(params@_) =>
      call { 
        controllers_ComplexionPielSangreController_list23_invoker.call(ComplexionPielSangreController_2.list)
      }
  
    // @LINE:44
    case controllers_ComplexionPielSangreController_get24_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ComplexionPielSangreController_get24_invoker.call(ComplexionPielSangreController_2.get(id))
      }
  
    // @LINE:45
    case controllers_ComplexionPielSangreController_update25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ComplexionPielSangreController_update25_invoker.call(ComplexionPielSangreController_2.update(id))
      }
  
    // @LINE:46
    case controllers_ComplexionPielSangreController_save26_route(params@_) =>
      call { 
        controllers_ComplexionPielSangreController_save26_invoker.call(ComplexionPielSangreController_2.save())
      }
  
    // @LINE:47
    case controllers_ComplexionPielSangreController_delete27_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ComplexionPielSangreController_delete27_invoker.call(ComplexionPielSangreController_2.delete(id))
      }
  
    // @LINE:51
    case controllers_FrenteMentonController_page28_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("altura_frente")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_FrenteMentonController_page28_invoker.call(FrenteMentonController_1.page(p, s, o, f, tr))
      }
  
    // @LINE:52
    case controllers_FrenteMentonController_options29_route(params@_) =>
      call { 
        controllers_FrenteMentonController_options29_invoker.call(FrenteMentonController_1.options())
      }
  
    // @LINE:53
    case controllers_FrenteMentonController_list30_route(params@_) =>
      call { 
        controllers_FrenteMentonController_list30_invoker.call(FrenteMentonController_1.list)
      }
  
    // @LINE:54
    case controllers_FrenteMentonController_get31_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FrenteMentonController_get31_invoker.call(FrenteMentonController_1.get(id))
      }
  
    // @LINE:55
    case controllers_FrenteMentonController_update32_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FrenteMentonController_update32_invoker.call(FrenteMentonController_1.update(id))
      }
  
    // @LINE:56
    case controllers_FrenteMentonController_save33_route(params@_) =>
      call { 
        controllers_FrenteMentonController_save33_invoker.call(FrenteMentonController_1.save())
      }
  
    // @LINE:57
    case controllers_FrenteMentonController_delete34_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FrenteMentonController_delete34_invoker.call(FrenteMentonController_1.delete(id))
      }
  
    // @LINE:61
    case controllers_LabioOjoController_page35_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("espesor_labio")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_LabioOjoController_page35_invoker.call(LabioOjoController_4.page(p, s, o, f, tr))
      }
  
    // @LINE:62
    case controllers_LabioOjoController_options36_route(params@_) =>
      call { 
        controllers_LabioOjoController_options36_invoker.call(LabioOjoController_4.options())
      }
  
    // @LINE:63
    case controllers_LabioOjoController_list37_route(params@_) =>
      call { 
        controllers_LabioOjoController_list37_invoker.call(LabioOjoController_4.list)
      }
  
    // @LINE:64
    case controllers_LabioOjoController_get38_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LabioOjoController_get38_invoker.call(LabioOjoController_4.get(id))
      }
  
    // @LINE:65
    case controllers_LabioOjoController_update39_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LabioOjoController_update39_invoker.call(LabioOjoController_4.update(id))
      }
  
    // @LINE:66
    case controllers_LabioOjoController_save40_route(params@_) =>
      call { 
        controllers_LabioOjoController_save40_invoker.call(LabioOjoController_4.save())
      }
  
    // @LINE:67
    case controllers_LabioOjoController_delete41_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LabioOjoController_delete41_invoker.call(LabioOjoController_4.delete(id))
      }
  
    // @LINE:71
    case controllers_OrejaController_page42_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("forma")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_OrejaController_page42_invoker.call(OrejaController_7.page(p, s, o, f, tr))
      }
  
    // @LINE:72
    case controllers_OrejaController_options43_route(params@_) =>
      call { 
        controllers_OrejaController_options43_invoker.call(OrejaController_7.options())
      }
  
    // @LINE:73
    case controllers_OrejaController_list44_route(params@_) =>
      call { 
        controllers_OrejaController_list44_invoker.call(OrejaController_7.list)
      }
  
    // @LINE:74
    case controllers_OrejaController_get45_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrejaController_get45_invoker.call(OrejaController_7.get(id))
      }
  
    // @LINE:75
    case controllers_OrejaController_update46_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrejaController_update46_invoker.call(OrejaController_7.update(id))
      }
  
    // @LINE:76
    case controllers_OrejaController_save47_route(params@_) =>
      call { 
        controllers_OrejaController_save47_invoker.call(OrejaController_7.save())
      }
  
    // @LINE:77
    case controllers_OrejaController_delete48_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrejaController_delete48_invoker.call(OrejaController_7.delete(id))
      }
  
    // @LINE:82
    case controllers_DesaparicionConsumacionController_page49_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("consumacion")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[Int]("tr", Some(10))) { (p, s, o, f, tr) =>
        controllers_DesaparicionConsumacionController_page49_invoker.call(DesaparicionConsumacionController_0.page(p, s, o, f, tr))
      }
  
    // @LINE:83
    case controllers_DesaparicionConsumacionController_options50_route(params@_) =>
      call { 
        controllers_DesaparicionConsumacionController_options50_invoker.call(DesaparicionConsumacionController_0.options())
      }
  
    // @LINE:84
    case controllers_DesaparicionConsumacionController_list51_route(params@_) =>
      call { 
        controllers_DesaparicionConsumacionController_list51_invoker.call(DesaparicionConsumacionController_0.list)
      }
  
    // @LINE:85
    case controllers_DesaparicionConsumacionController_get52_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DesaparicionConsumacionController_get52_invoker.call(DesaparicionConsumacionController_0.get(id))
      }
  
    // @LINE:86
    case controllers_DesaparicionConsumacionController_update53_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DesaparicionConsumacionController_update53_invoker.call(DesaparicionConsumacionController_0.update(id))
      }
  
    // @LINE:87
    case controllers_DesaparicionConsumacionController_save54_route(params@_) =>
      call { 
        controllers_DesaparicionConsumacionController_save54_invoker.call(DesaparicionConsumacionController_0.save())
      }
  
    // @LINE:88
    case controllers_DesaparicionConsumacionController_delete55_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DesaparicionConsumacionController_delete55_invoker.call(DesaparicionConsumacionController_0.delete(id))
      }
  }
}
