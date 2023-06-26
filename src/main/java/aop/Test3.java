package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String s = uniLibrary.returnBook();
        System.out.println("В библиотеку вернули книгу " + s);

        context.close();
        System.out.println("Method main ends");
    }
}
