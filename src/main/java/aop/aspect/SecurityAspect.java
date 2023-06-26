package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

//    @Before("aop.aspect.Pointcuts.allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: Проверка прав на получение книгу/журнал");
//    }

//    @Before("aop.aspect.Pointcuts.allAddMethods()")
//    public void beforeAddSecurityAdvice() {
//        System.out.println("beforeAddSecurityAdvice: Проверка прав при добавлении книги/журнала");
//        System.out.println("-----------------------------");
//    }
}
