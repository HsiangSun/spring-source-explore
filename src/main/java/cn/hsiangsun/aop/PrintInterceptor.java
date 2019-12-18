package cn.hsiangsun.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class PrintInterceptor {

    /*
    * ps：@annotation(cn.hsiangsun.aop.Print) only support around advice
    * */
    //@Before("methodAnnotation()")
    @Around("@annotation(cn.hsiangsun.aop.Print)")
    public Object interceptorPrint(ProceedingJoinPoint joinPoint) throws Throwable {
        //get method signature
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        //get custom annotation
        Print annotation = signature.getMethod().getAnnotation(Print.class);

        //your code
        if (annotation != null){
            log.debug("*****find custom annotation*****");
        }

        if (annotation.type().equals("DEBUG")){
            System.err.println("DEBUG MODE");
        }else if (annotation.type().equals("PRO")){
            System.err.println("PRODUCTION MODE");
        }else if (annotation.type().equals("DEV")){
            System.err.println("DEVELOPMENT MODE");
        }
        //around advice
        return joinPoint.proceed();
        //others advice
        //return joinPoint.getThis();
    }

    /*
    * point execution
    * */
    @Pointcut("execution(* cn.hsiangsun.run..*.*(..))")
    void methodAnnotation(){}



}
