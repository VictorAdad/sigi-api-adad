
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/ldapControl.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package ldapControl

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  LdapController_0: controllers.LdapController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    LdapController_0: controllers.LdapController
  ) = this(errorHandler, LdapController_0, "/")

  def withPrefix(prefix: String): Routes = {
    ldapControl.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LdapController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agencias""", """controllers.LdapController.getAllAgencies()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fiscalias/agencias""", """controllers.LdapController.getAgencies(f:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fiscalias/agencias/usuarios""", """controllers.LdapController.getMembers(f:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """controllers.LdapController.getUsers(f:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_LdapController_getAllAgencies0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agencias")))
  )
  private[this] lazy val controllers_LdapController_getAllAgencies0_invoker = createInvoker(
    LdapController_0.getAllAgencies(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "ldapControl",
      "controllers.LdapController",
      "getAllAgencies",
      Nil,
      "GET",
      this.prefix + """agencias""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_LdapController_getAgencies1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fiscalias/agencias")))
  )
  private[this] lazy val controllers_LdapController_getAgencies1_invoker = createInvoker(
    LdapController_0.getAgencies(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "ldapControl",
      "controllers.LdapController",
      "getAgencies",
      Seq(classOf[String]),
      "GET",
      this.prefix + """fiscalias/agencias""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LdapController_getMembers2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fiscalias/agencias/usuarios")))
  )
  private[this] lazy val controllers_LdapController_getMembers2_invoker = createInvoker(
    LdapController_0.getMembers(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "ldapControl",
      "controllers.LdapController",
      "getMembers",
      Seq(classOf[String]),
      "GET",
      this.prefix + """fiscalias/agencias/usuarios""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_LdapController_getUsers3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_LdapController_getUsers3_invoker = createInvoker(
    LdapController_0.getUsers(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "ldapControl",
      "controllers.LdapController",
      "getUsers",
      Seq(classOf[String]),
      "GET",
      this.prefix + """usuarios""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_LdapController_getAllAgencies0_route(params@_) =>
      call { 
        controllers_LdapController_getAllAgencies0_invoker.call(LdapController_0.getAllAgencies())
      }
  
    // @LINE:9
    case controllers_LdapController_getAgencies1_route(params@_) =>
      call(params.fromQuery[String]("f", None)) { (f) =>
        controllers_LdapController_getAgencies1_invoker.call(LdapController_0.getAgencies(f))
      }
  
    // @LINE:10
    case controllers_LdapController_getMembers2_route(params@_) =>
      call(params.fromQuery[String]("f", None)) { (f) =>
        controllers_LdapController_getMembers2_invoker.call(LdapController_0.getMembers(f))
      }
  
    // @LINE:11
    case controllers_LdapController_getUsers3_route(params@_) =>
      call(params.fromQuery[String]("f", None)) { (f) =>
        controllers_LdapController_getUsers3_invoker.call(LdapController_0.getUsers(f))
      }
  }
}
