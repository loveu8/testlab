package aoptest.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aoptest.aop.AOP;
import aoptest.core.B;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan({"aop.AOP"})
public class AppConfig {
  
  @Bean
  public AOP aop() {
    return new AOP();
  }
  
  @Bean
  public B b() {
    return new B();
  }

}
