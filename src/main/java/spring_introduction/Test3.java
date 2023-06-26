package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("person", Person.class);

//        Pet pet = new Dog();
//        Person person = new Person(pet);
        person.callYourPet();
        System.out.println(person.getName() + " " + person.getAge());
    }
}
