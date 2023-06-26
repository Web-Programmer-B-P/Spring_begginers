package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundLoggingAspect {

    /**
     * Around отрабатывает до и после выполнения целевого метода.
     * Мы сами должны вернуть результат отработанного метода.
     * Так же можем что то сделать с выброшенным исключением.
     */
//    @Around("execution(public String returnBook())")
//    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу ");
//        long begin = System.currentTimeMillis();
//        Object proceed = proceedingJoinPoint.proceed();
//        long end = System.currentTimeMillis();
//        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу.");
//        System.out.println("Время работы метода = " + (end - begin));
//        return proceed;
//    }

//====================================================================================================================

    /**
     * Обраьатываем исключение, не желательный способ, исключительно для наглядности.
     */
//    @Around("execution(public String returnBook())")
//    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        Object proceed = null;
//        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу ");
//        try {
//            proceed = proceedingJoinPoint.proceed();
//        } catch (Exception e) {
//            System.out.println("aroundReturnBookLoggingAdvice: Было пойманно исключение " + e.getMessage());
//            proceed = "Неизвестное название книги";
//        }
//        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу.");
//        return proceed;
//    }

//======================================================================================================================

    /**
     * Проброс исключения по флоу дальше.
     */
//    @Around("execution(public String returnBook())")
//    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        Object proceed = null;
//        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу ");
//        try {
//            proceed = proceedingJoinPoint.proceed();
//        } catch (Exception e) {
//            System.out.println("aroundReturnBookLoggingAdvice: Было пойманно исключение " + e.getMessage());
//            throw e;
//        }
//        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу.");
//        return proceed;
//    }

}
