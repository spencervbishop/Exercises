package com.example.aopdemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MathsAspects {

    @Around("execution(* com.example.aopdemo.domain.Maths.*(..))") //ADVICE and the thing between POINTCUT
    public void setUp(ProceedingJoinPoint jp) throws Throwable{ //JoinPoint
        Object[] args = jp.getArgs();
        System.out.println("\nMethod name: " + jp +  "--------");
        System.out.println("\nMethod argument type: " + args[0].getClass());
        long start = System.currentTimeMillis();

        jp.proceed();

        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Method execution time: " + elapsedTime + " milliseconds.");

    }


}
