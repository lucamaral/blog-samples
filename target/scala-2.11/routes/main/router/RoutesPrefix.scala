
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/handit/workspace/blog-samples/conf/routes
// @DATE:Fri Mar 11 08:19:00 EST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
