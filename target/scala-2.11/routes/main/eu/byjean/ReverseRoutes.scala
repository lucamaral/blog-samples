
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/handit/workspace/blog-samples/conf/routes
// @DATE:Fri Mar 11 08:19:00 EST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:1
package eu.byjean {

  // @LINE:1
  class ReverseHealth(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def check(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "health")
    }
  
  }


}