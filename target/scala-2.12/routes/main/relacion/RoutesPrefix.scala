
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/evomatik/apps/sigi-api/conf/relacion.routes
// @DATE:Thu Feb 15 10:13:35 CST 2018


package relacion {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
