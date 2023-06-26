package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);

        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();

        uniLibrary.addBook("Петр", book);
        uniLibrary.addMagazine();

//        SchoolLibrary school = context.getBean("schoolLibrary", SchoolLibrary.class);
//        school.getBook();

        context.close();
    }
}
