package org.example.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by hyq on 2021/5/10 15:40.
 */

@Aspect
@Component
public class testAspect {

    @Before("execution(* org.example.aop.service.*.*())")
    public void testServiceBefore() {
        System.out.println("service拦截");
    }

    @Before("execution(* org.example.aop.controller.*.*())")
    public void testControllerBefore() {
        System.out.println("controller拦截");
    }
}
