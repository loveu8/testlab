package aoptest.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import aoptest.config.AppConfig;

public class A {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    B b = context.getBean(B.class);
    b.HelloWorld();
  }
}
