
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/handit/workspace/blog-samples/conf/routes
// @DATE:Fri Mar 11 08:19:00 EST 2016

package eu.byjean;

import router.RoutesPrefix;

public class routes {
  
  public static final eu.byjean.ReverseHealth Health = new eu.byjean.ReverseHealth(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final eu.byjean.javascript.ReverseHealth Health = new eu.byjean.javascript.ReverseHealth(RoutesPrefix.byNamePrefix());
  }

}
