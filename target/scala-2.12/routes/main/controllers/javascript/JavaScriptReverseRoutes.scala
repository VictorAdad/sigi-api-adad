
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/base.routes
// @DATE:Thu Feb 15 10:13:36 CST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:10
package controllers.javascript {

  // @LINE:228
  class ReverseEntrevistas(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:231
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrevistas.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "entrevistas/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:228
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrevistas.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "entrevistas/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:229
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrevistas.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "entrevistas" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:232
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrevistas.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "entrevistas"})
        }
      """
    )
  
    // @LINE:230
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entrevistas.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "entrevistas/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:53
  class ReverseArmas(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Armas.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "armas/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:53
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Armas.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "armas/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:54
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Armas.list",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "armas/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:55
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Armas.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "armas" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:58
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Armas.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "armas"})
        }
      """
    )
  
    // @LINE:56
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Armas.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "armas/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:165
  class ReverseSolicitudesPrePolicias(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:168
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPrePolicias.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-policias/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:165
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPrePolicias.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-policias/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:167
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPrePolicias.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-policias" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:169
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPrePolicias.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-policias"})
        }
      """
    )
  
    // @LINE:166
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPrePolicias.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-policias/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:157
  class ReverseSolicitudesPrePericiales(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:160
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPrePericiales.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-pericial/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:157
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPrePericiales.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-pericial/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:159
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPrePericiales.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-pericial" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:161
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPrePericiales.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-pericial"})
        }
      """
    )
  
    // @LINE:158
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPrePericiales.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-pericial/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:213
  class ReverseNoEjerciciosAccionPenal(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:216
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoEjerciciosAccionPenal.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "no-ejercicio-accion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:213
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoEjerciciosAccionPenal.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "no-ejercicio-accion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:215
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoEjerciciosAccionPenal.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "no-ejercicio-accion" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:217
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoEjerciciosAccionPenal.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "no-ejercicio-accion"})
        }
      """
    )
  
    // @LINE:214
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoEjerciciosAccionPenal.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "no-ejercicio-accion/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:90
  class ReversePersonas(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:91
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Personas.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "personas" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:93
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Personas.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "personas"})
        }
      """
    )
  
    // @LINE:90
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Personas.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "personas/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:92
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Personas.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "personas/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:32
  class ReversePersonasCasos(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def listByCaseAndTipoInterviniente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasCasos.listByCaseAndTipoInterviniente",
      """
        function(id0,idTipo1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "personas-casos/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/tipos-intervinientes/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("idTipo", idTipo1))})
        }
      """
    )
  
    // @LINE:37
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasCasos.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "personas-casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:34
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasCasos.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "personas-casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:35
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasCasos.list",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "personas-casos/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:32
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasCasos.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "personas-casos" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:38
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasCasos.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "personas-casos"})
        }
      """
    )
  
    // @LINE:33
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasCasos.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "personas-casos/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseTitulares(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Titulares.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "titulares"})
        }
      """
    )
  
    // @LINE:23
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Titulares.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "titulares/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:25
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Titulares.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "titulares/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:24
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Titulares.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "titulares/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:188
  class ReverseAcuerdos(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:190
    def listByCaseAndTipo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Acuerdos.listByCaseAndTipo",
      """
        function(id0,tipo1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "acuerdos/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/tipos" + _qS([(tipo1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("tipo", tipo1))])})
        }
      """
    )
  
    // @LINE:192
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Acuerdos.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "acuerdos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:188
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Acuerdos.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "acuerdos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:191
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Acuerdos.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "acuerdos" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:193
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Acuerdos.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "acuerdos"})
        }
      """
    )
  
    // @LINE:189
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Acuerdos.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "acuerdos/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:71
  class ReverseVehiculos(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:75
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Vehiculos.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "vehiculos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:71
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Vehiculos.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vehiculos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:72
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Vehiculos.list",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vehiculos/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:73
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Vehiculos.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vehiculos" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:76
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Vehiculos.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "vehiculos"})
        }
      """
    )
  
    // @LINE:74
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Vehiculos.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vehiculos/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:97
  class ReverseTipoRelacionesPersonas(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:102
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TipoRelacionesPersonas.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "tipo-relacion-persona/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:101
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TipoRelacionesPersonas.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tipo-relacion-persona/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:97
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TipoRelacionesPersonas.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tipo-relacion-persona/page" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:100
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TipoRelacionesPersonas.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tipo-relacion-persona"})
        }
      """
    )
  
    // @LINE:103
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TipoRelacionesPersonas.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tipo-relacion-persona"})
        }
      """
    )
  
    // @LINE:99
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TipoRelacionesPersonas.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tipo-relacion-persona/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseCasos(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def pageByFiscalia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Casos.pageByFiscalia",
      """
        function(p0,s1,o2,f3,tr4,fiscalia5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "casos/fiscalia/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("fiscalia", fiscalia5)) + "/page" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:15
    def pageByTitular: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Casos.pageByTitular",
      """
        function(p0,s1,o2,f3,tr4,usr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "casos/titulares/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("usr", usr5)) + "/page" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:17
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Casos.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:11
    def getPropietario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Casos.getPropietario",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "casos/propietario/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:12
    def getAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Casos.getAll",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/all"})
        }
      """
    )
  
    // @LINE:10
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Casos.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:14
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Casos.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "casos" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:18
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Casos.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "casos"})
        }
      """
    )
  
    // @LINE:13
    def getDocuments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Casos.getDocuments",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/documentos"})
        }
      """
    )
  
  }

  // @LINE:173
  class ReverseSolicitudesPreReqInfo(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:176
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreReqInfo.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-info/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:173
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreReqInfo.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-info/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:175
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreReqInfo.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-info" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:177
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreReqInfo.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-info"})
        }
      """
    )
  
    // @LINE:174
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreReqInfo.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-info/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:273
  class ReverseNotificacionesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:276
    def countLeido: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NotificacionesController.countLeido",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "notificaciones/usuario/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/leido"})
        }
      """
    )
  
    // @LINE:273
    def pageByUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NotificacionesController.pageByUser",
      """
        function(p0,s1,o2,f3,tr4,usr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "notificaciones/usuario/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("usr", usr5)) + "/page" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:274
    def countSinLeer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NotificacionesController.countSinLeer",
      """
        function(usr0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "notificaciones/usuario/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("usr", usr0)) + "/sin-leer"})
        }
      """
    )
  
  }

  // @LINE:259
  class ReverseDetalleDelitos(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:259
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DetalleDelitos.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "detalle-delitos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:141
  class ReverseSolicitudesPreInspecciones(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:144
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreInspecciones.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-inspecciones/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:141
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreInspecciones.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-inspecciones/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:143
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreInspecciones.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-inspecciones" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:145
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreInspecciones.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-inspecciones"})
        }
      """
    )
  
    // @LINE:142
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreInspecciones.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-inspecciones/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:80
  class ReverseLugares(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Lugares.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "lugares/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:80
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Lugares.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lugares/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:81
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Lugares.list",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lugares/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:82
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Lugares.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lugares" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:85
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Lugares.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "lugares"})
        }
      """
    )
  
    // @LINE:83
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Lugares.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lugares/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:149
  class ReverseSolicitudesPreRegistros(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:152
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreRegistros.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-registros/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:149
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreRegistros.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-registros/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:151
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreRegistros.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-registros" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:153
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreRegistros.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-registros"})
        }
      """
    )
  
    // @LINE:150
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreRegistros.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-registros/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:243
  class ReverseUsuarios(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:246
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuarios.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:243
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuarios.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:244
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuarios.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/page" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:247
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuarios.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
        }
      """
    )
  
    // @LINE:245
    def optionsByAgency: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuarios.optionsByAgency",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/agencias/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/options"})
        }
      """
    )
  
  }

  // @LINE:116
  class ReversePredenuncias(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:120
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Predenuncias.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "predenuncias/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:119
    def getByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Predenuncias.getByCase",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "predenuncias/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:116
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Predenuncias.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "predenuncias/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:118
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Predenuncias.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "predenuncias" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:121
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Predenuncias.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "predenuncias"})
        }
      """
    )
  
    // @LINE:117
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Predenuncias.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "predenuncias/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:133
  class ReverseSolicitudesPreAcuerdos(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:136
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreAcuerdos.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-acuerdos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:133
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreAcuerdos.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-acuerdos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:135
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreAcuerdos.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-acuerdos" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:137
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreAcuerdos.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-acuerdos"})
        }
      """
    )
  
    // @LINE:134
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SolicitudesPreAcuerdos.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudes-pre-acuerdos/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:197
  class ReverseArchivosTemporales(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:200
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArchivosTemporales.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "archivos-temporales/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:197
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArchivosTemporales.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "archivos-temporales/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:199
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArchivosTemporales.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "archivos-temporales" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:201
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArchivosTemporales.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "archivos-temporales"})
        }
      """
    )
  
    // @LINE:198
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArchivosTemporales.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "archivos-temporales/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:63
  class ReverseRelaciones(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Relaciones.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "relaciones/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:63
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Relaciones.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "relaciones/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:64
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Relaciones.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "relaciones" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:67
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Relaciones.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "relaciones"})
        }
      """
    )
  
    // @LINE:65
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Relaciones.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "relaciones/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:43
  class ReverseDelitosCasos(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DelitosCasos.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "delitos-casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:46
    def setDefault: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DelitosCasos.setDefault",
      """
        function(id0,idCaso1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delitos-casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("idCaso", idCaso1))})
        }
      """
    )
  
    // @LINE:45
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DelitosCasos.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delitos-casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:47
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DelitosCasos.list",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delitos-casos/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:43
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DelitosCasos.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delitos-casos" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:49
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DelitosCasos.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delitos-casos"})
        }
      """
    )
  
    // @LINE:44
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DelitosCasos.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delitos-casos/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }

  // @LINE:205
  class ReverseFacultadesNoInvestigar(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:208
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FacultadesNoInvestigar.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "facultades-no-investigar/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:205
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FacultadesNoInvestigar.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facultades-no-investigar/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:207
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FacultadesNoInvestigar.page",
      """
        function(p0,s1,o2,f3,tr4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facultades-no-investigar" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3)), (tr4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr4))])})
        }
      """
    )
  
    // @LINE:209
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FacultadesNoInvestigar.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "facultades-no-investigar"})
        }
      """
    )
  
    // @LINE:206
    def pageByCase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FacultadesNoInvestigar.pageByCase",
      """
        function(id0,p1,s2,o3,f4,tr5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facultades-no-investigar/casos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/page" + _qS([(p1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p1)), (s2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s2)), (o3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o3)), (f4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f4)), (tr5 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("tr", tr5))])})
        }
      """
    )
  
  }


}
