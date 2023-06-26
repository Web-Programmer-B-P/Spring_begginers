package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents");
//    }

//    @AfterReturning("execution(* getStudents())")
//    public void afterGetStudentsLoggingAdvice() {
//        System.out.println("afterGetStudentsLoggingAdvice: логируем получение списка студентов после работы метода getStudents");
//    }

    //TODO AfterReturning advice

    /**
     * Данный advice может перехватывать и изменять результат работы оригинального метода.
     * Так же можем получить инфо о методе.
     */
//    @AfterReturning(pointcut = "execution(* getStudents())",
//            returning = "students")
//    public void afterGetStudentsLoggingAdvice(JoinPoint joinPoint, List<Student> students) {
//        Student student = students.get(0);
//        String name = student.getName();
//        name = "Mr. " + name;
//        student.setName(name);
//
//        double avgGrade = student.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        student.setAvgGrade(avgGrade);
//
//        System.out.println("afterGetStudentsLoggingAdvice: логируем получение списка студентов после работы метода getStudents");
//    }

//======================================================================================================================
    //TODO AfterThrowing advice - отработает при выбросе исключения

    /**
     * Можем получить инфу по выброшенному исключению
     * Обработка исключения не возможна.
     * Так же можем получить инфо о методе.
     */
//    @AfterThrowing(
//            pointcut = "execution(* getStudents())",
//            throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(JoinPoint joinPoint, Throwable exception) {
//        String message = exception.getMessage();
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исключения " + message);
//    }

//======================================================================================================================
        //TODO After advice - отработает вне зависимости будет исключение или нет.

    /**
     * Не можем получить инфу по выброшенному исключению
     * А так же не можем получить инфо о методе и его результату.
     */
//    @After("execution(* getStudents())")
//    public void afterGetStudentsLoggingAdvice() {
//        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное окончание работы метода или выброс исключение");
//    }

//======================================================================================================================


}
