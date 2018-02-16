
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/base.routes
// @DATE:Thu Feb 15 10:13:36 CST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:10
package controllers {

  // @LINE:228
  class ReverseEntrevistas(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:231
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "entrevistas/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:228
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "entrevistas/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:229
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "entrevistas" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:232
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "entrevistas")
    }
  
    // @LINE:230
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "entrevistas/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:53
  class ReverseArmas(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "armas/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:53
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "armas/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:54
    def list(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "armas/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:55
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "armas" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:58
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "armas")
    }
  
    // @LINE:56
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "armas/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:165
  class ReverseSolicitudesPrePolicias(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:168
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "solicitudes-pre-policias/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:165
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-policias/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:167
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-policias" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:169
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "solicitudes-pre-policias")
    }
  
    // @LINE:166
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-policias/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:157
  class ReverseSolicitudesPrePericiales(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:160
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "solicitudes-pre-pericial/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:157
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-pericial/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:159
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-pericial" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:161
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "solicitudes-pre-pericial")
    }
  
    // @LINE:158
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-pericial/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:213
  class ReverseNoEjerciciosAccionPenal(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:216
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "no-ejercicio-accion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:213
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "no-ejercicio-accion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:215
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "no-ejercicio-accion" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:217
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "no-ejercicio-accion")
    }
  
    // @LINE:214
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "no-ejercicio-accion/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:90
  class ReversePersonas(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:91
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "personas" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:93
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "personas")
    }
  
    // @LINE:90
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "personas/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:92
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "personas/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:32
  class ReversePersonasCasos(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def listByCaseAndTipoInterviniente(id:Long, idTipo:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "personas-casos/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/tipos-intervinientes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("idTipo", idTipo)))
    }
  
    // @LINE:37
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "personas-casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:34
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "personas-casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:35
    def list(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "personas-casos/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:32
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "personas-casos" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:38
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "personas-casos")
    }
  
    // @LINE:33
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "personas-casos/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:23
  class ReverseTitulares(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "titulares")
    }
  
    // @LINE:23
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "titulares/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:25
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "titulares/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:24
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "titulares/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:188
  class ReverseAcuerdos(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:190
    def listByCaseAndTipo(id:Long, tipo:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "acuerdos/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/tipos" + play.core.routing.queryString(List(if(tipo == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("tipo", tipo)))))
    }
  
    // @LINE:192
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "acuerdos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:188
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "acuerdos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:191
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "acuerdos" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:193
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "acuerdos")
    }
  
    // @LINE:189
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "acuerdos/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:71
  class ReverseVehiculos(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:75
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "vehiculos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:71
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "vehiculos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:72
    def list(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "vehiculos/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:73
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "vehiculos" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:76
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "vehiculos")
    }
  
    // @LINE:74
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "vehiculos/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:97
  class ReverseTipoRelacionesPersonas(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:102
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "tipo-relacion-persona/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:101
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tipo-relacion-persona/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:97
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tipo-relacion-persona/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:100
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tipo-relacion-persona")
    }
  
    // @LINE:103
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tipo-relacion-persona")
    }
  
    // @LINE:99
    def pageByCase(id:Long, p:Int = 0, s:String = "caso.created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tipo-relacion-persona/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "caso.created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:10
  class ReverseCasos(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def pageByFiscalia(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10, fiscalia:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "casos/fiscalia/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("fiscalia", fiscalia)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:15
    def pageByTitular(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10, usr:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "casos/titulares/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("usr", usr)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:17
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:11
    def getPropietario(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "casos/propietario/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:12
    def getAll(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/all")
    }
  
    // @LINE:10
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:14
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "casos" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:18
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "casos")
    }
  
    // @LINE:13
    def getDocuments(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/documentos")
    }
  
  }

  // @LINE:173
  class ReverseSolicitudesPreReqInfo(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:176
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "solicitudes-pre-info/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:173
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-info/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:175
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-info" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:177
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "solicitudes-pre-info")
    }
  
    // @LINE:174
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-info/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:273
  class ReverseNotificacionesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:276
    def countLeido(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "notificaciones/usuario/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/leido")
    }
  
    // @LINE:273
    def pageByUser(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10, usr:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "notificaciones/usuario/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("usr", usr)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:274
    def countSinLeer(usr:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "notificaciones/usuario/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("usr", usr)) + "/sin-leer")
    }
  
  }

  // @LINE:259
  class ReverseDetalleDelitos(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:259
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "detalle-delitos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:141
  class ReverseSolicitudesPreInspecciones(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:144
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "solicitudes-pre-inspecciones/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:141
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-inspecciones/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:143
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-inspecciones" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:145
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "solicitudes-pre-inspecciones")
    }
  
    // @LINE:142
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-inspecciones/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:80
  class ReverseLugares(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "lugares/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:80
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lugares/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:81
    def list(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lugares/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:82
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lugares" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:85
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "lugares")
    }
  
    // @LINE:83
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lugares/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:149
  class ReverseSolicitudesPreRegistros(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:152
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "solicitudes-pre-registros/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:149
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-registros/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:151
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-registros" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:153
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "solicitudes-pre-registros")
    }
  
    // @LINE:150
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-registros/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:243
  class ReverseUsuarios(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:246
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "usuarios/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:243
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:244
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usuarios/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:247
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "usuarios")
    }
  
    // @LINE:245
    def optionsByAgency(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usuarios/agencias/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/options")
    }
  
  }

  // @LINE:116
  class ReversePredenuncias(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:120
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "predenuncias/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:119
    def getByCase(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "predenuncias/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:116
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "predenuncias/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:118
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "predenuncias" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:121
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "predenuncias")
    }
  
    // @LINE:117
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "predenuncias/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:133
  class ReverseSolicitudesPreAcuerdos(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:136
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "solicitudes-pre-acuerdos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:133
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-acuerdos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:135
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-acuerdos" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:137
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "solicitudes-pre-acuerdos")
    }
  
    // @LINE:134
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "solicitudes-pre-acuerdos/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:197
  class ReverseArchivosTemporales(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:200
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "archivos-temporales/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:197
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "archivos-temporales/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:199
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "archivos-temporales" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:201
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "archivos-temporales")
    }
  
    // @LINE:198
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "archivos-temporales/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:63
  class ReverseRelaciones(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "relaciones/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:63
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "relaciones/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:64
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "relaciones" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:67
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "relaciones")
    }
  
    // @LINE:65
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "relaciones/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:43
  class ReverseDelitosCasos(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "delitos-casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:46
    def setDefault(id:Long, idCaso:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delitos-casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("idCaso", idCaso)))
    }
  
    // @LINE:45
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delitos-casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:47
    def list(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delitos-casos/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:43
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delitos-casos" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:49
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delitos-casos")
    }
  
    // @LINE:44
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delitos-casos/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }

  // @LINE:205
  class ReverseFacultadesNoInvestigar(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:208
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "facultades-no-investigar/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:205
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "facultades-no-investigar/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:207
    def page(p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "facultades-no-investigar" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
    // @LINE:209
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "facultades-no-investigar")
    }
  
    // @LINE:206
    def pageByCase(id:Long, p:Int = 0, s:String = "created", o:String = "desc", f:String = "", tr:Int = 10): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "facultades-no-investigar/casos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/page" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "created") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)), if(tr == 10) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("tr", tr)))))
    }
  
  }


}
