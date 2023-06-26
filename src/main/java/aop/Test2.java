package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> studentList = university.getStudents();
            studentList.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        context.close();
    }
}
