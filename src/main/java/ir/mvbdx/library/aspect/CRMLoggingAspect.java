package ir.mvbdx.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class CRMLoggingAspect {

    @Pointcut("execution(* ir.mvbdx.library.controller.*.*(..))")
    private void forControllerPackage(){}

    @Pointcut("execution(* ir.mvbdx.library.dao.*.*(..))")
    private void forDaoPackage(){}

    @Pointcut("execution(* ir.mvbdx.library.service.*.*(..))")
    private void forServicePackage(){}

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    private void forAppFlow(){}

    @Before("forAppFlow()")
    public void whatDoYouDo(JoinPoint theJoinPoint){
        System.out.println("+++ in @Before: calling method: " + theJoinPoint.getSignature().toShortString());

        //display the arguments to the method
        Object[] args = theJoinPoint.getArgs();

        for(Object tempArg : args){
            System.out.println("===>argument :" + tempArg);
        }
    }

    //add @AfterReturning advice
    @AfterReturning(pointcut = "forAppFlow()",returning = "theResult")
    public void after(JoinPoint theJoinPoint, Object theResult){
        //display method we are returning from
        String theMethod = theJoinPoint.getSignature().toShortString();
        System.out.println((">>> in @AfterReturning: calling method: " + theMethod));

        //display data returned
        System.out.println("=====> result: " + theResult);

    }

}
