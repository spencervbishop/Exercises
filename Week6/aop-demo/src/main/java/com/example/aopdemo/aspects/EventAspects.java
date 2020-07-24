package com.example.aopdemo.aspects;

import com.example.aopdemo.domain.Event;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EventAspects { //ASPECT
    public static Logger logger = LoggerFactory.getLogger(EventAspects.class.getName());

    //pointcuts play and run
    @Before("execution(* com.example.aopdemo.services.EventService.play*(..))") //ADVICE and the thing between POINTCUT
    public void setUp(JoinPoint jp){ //JoinPoint
        Object[] args = jp.getArgs();
        Event e = (Event)args[0];
        System.out.println("\nPatrons are entering the venue for " + e.getName() + "--------");
    }

    @Around("execution(* com.example.aopdemo.services.EventService.run*(..))")
    public void runVenue(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("\nOpening the venue ----");
        pjp.proceed();
        System.out.println("Closing the venue ----");
    }

    @AfterThrowing(pointcut="execution(* com.example.aopdemo.services.EventService.doEvent(..))", throwing="ex")
    public void exceptionAspect(Exception ex){
        System.out.println("\nMethod execution caught an exception \n" + ex.getMessage());
    }


}
