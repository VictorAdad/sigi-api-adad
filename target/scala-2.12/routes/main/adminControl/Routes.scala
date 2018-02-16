
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/adminControl.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018

package adminControl

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  ldapControl_Routes_0: ldapControl.Routes,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    ldapControl_Routes_0: ldapControl.Routes
  ) = this(errorHandler, ldapControl_Routes_0, "/")

  def withPrefix(prefix: String): Routes = {
    adminControl.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ldapControl_Routes_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    prefixed_ldapControl_Routes_0_0.router.documentation,
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] val prefixed_ldapControl_Routes_0_0 = Include(ldapControl_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "ldap/"))


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case prefixed_ldapControl_Routes_0_0(handler) => handler
  }
}
