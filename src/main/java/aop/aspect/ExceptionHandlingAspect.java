package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

//    @Before("aop.aspect.Pointcuts.allGetMethods()")
//    public void beforeGetExceptionHandlingAdvice() {
//        System.out.println("beforeGetExceptionHandlingAdvice: ловим/обрабатываем исключения" +
//                "при попытке получить книгу/журнал");
//    }

//    @Before("aop.aspect.Pointcuts.allAddMethods()")
//    public void beforeAddExceptionHandlingAdvice() {
//        System.out.println("beforeAddExceptionHandlingAdvice: ловим/обрабатываем исключения" +
//                "при попытке добавить книгу/журнал");
//        System.out.println("-----------------------------");
//    }
}
