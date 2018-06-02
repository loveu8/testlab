package aoptest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import aoptest.annotation.Check;
import aoptest.annotation.Finish;

@Aspect
@Component
public class AOP {

  @Around(value="@annotation(check)")
  public Object logger(ProceedingJoinPoint pjp , Check check) throws Throwable {
    System.out.println("Around , before is calling");
    pjp.proceed();
    System.out.println("Around , after is finish");
    return pjp.getTarget();
  }

  @After(value="@annotation(finish)")
  public void after(Finish finish){
    System.out.println("after is call ");
  }
}
