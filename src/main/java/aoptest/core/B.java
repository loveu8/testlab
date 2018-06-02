package aoptest.core;

import aoptest.annotation.Check;
import aoptest.annotation.Finish;

public class B {
  
  @Check 
  @Finish
  public void HelloWorld(){
    System.out.println("Hello World , It Aop test!");
  }
  
}
