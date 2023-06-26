package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Before("execution(public void aop.UniLibrary.getBook())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
//    }

    /**
     * Любой метод с одним параметром
     */
//    @Before("execution(public void *(*))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
//    }

    /**
     * Любое колличество параметров и любым названием метода.
     */
//    @Before("execution(public void *(..))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
//    }

    /**
     * Один параметр кастомный
     */
//    @Before("execution(public void getBook(aop.Book))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
//    }

    /**
     * Первый параметр кастомный, дальше могут быть 0 или более параметров.
     */
//    @Before("execution(public void getBook(aop.Book, ..))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
//    }

    /**
     * Колличество параметров, модификатор и возвращаемый тип могут быть любыми
     */
//    @Before("execution(* * (..))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
//    }

//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeGetBookAdvice: Попытка вернуть книгу");
//    }

//=====================================================================================================================
                                            //TODO Pointcut expression

//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {
//
//    }

//    @Before("aop.aspect.Pointcuts.allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: Логирование попытки получить книгу/журнал");
//    }

//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: Проверка прав на получение книгу/журнал");
//    }

//=====================================================================================================================
                                            //TODO Комбинирование Pointcut

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {}
//
//    /**
//     * Должен быть именно || т.к одновременно не может быть Get и Return.
//     */
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {}
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }

 //===================================================================================================================

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }

//=====================================================================================================================

    //TODO JoinPoint - позволяет получить инфо о сигнатуре и параметрах метода.


//    @Before("aop.aspect.Pointcuts.allAddMethods()")
//    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        String methodName = methodSignature.getName();
//        Method method = methodSignature.getMethod();
//        Class returnType = methodSignature.getReturnType();
//
//        System.out.println("beforeAddLoggingAdvice: Логирование попытки при добавлении книги/журнала");
//        System.out.println("MethodSignature = " + methodSignature);
//        System.out.println("Method = " + method);
//        System.out.println("MethodName = " + methodName);
//        System.out.println("ReturnType = " + returnType);
//
//        if (methodSignature.getName().equals("addBook")) {
//            Object[] args = joinPoint.getArgs();
//            Arrays.asList(args).forEach(item -> {
//                if (item instanceof Book) {
//                    Book myBook = (Book) item;
//                    System.out.println("Информация о книге: ");
//                    System.out.println("Автор: " + myBook.getAuthor());
//                    System.out.println("Дата публикации: " + myBook.getYearOfPublication());
//                    System.out.println("Название книги: " + myBook.getName());
//                } else if (item instanceof String) {
//                    System.out.println("Книгу добавил: " + item);
//                }
//            });
//        }
//
//        System.out.println("-----------------------------");
//    }
}
