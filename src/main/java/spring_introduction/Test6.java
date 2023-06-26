package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean("person", Person.class);
//        Person person2 = context.getBean("person", Person.class);
//        Pet cat = context.getBean("cat", Pet.class);
//        Pet cat = context.getBean("cat", Pet.class);
//        cat.say();

//        System.out.println(person == person2);
//        System.out.println(person.getPet() == person2.getPet());
        System.out.println(person.getName());
        System.out.println(person.getAge());
        context.close();
    }
}
