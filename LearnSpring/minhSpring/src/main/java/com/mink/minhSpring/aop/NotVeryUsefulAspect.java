package com.mink.minhSpring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class NotVeryUsefulAspect {
    private Logger logger = LoggerFactory.getLogger(NotVeryUsefulAspect.class);

    @Before("execution(* com.mink.minhSpring.restservice.*.*(..))")
    public void before(JoinPoint joinPoint) {
        this.logger.info(" before called " + joinPoint.toString());
    }
}
