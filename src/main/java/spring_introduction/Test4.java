package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog = context.getBean("pet", Dog.class);
//        dog.setName("Belka");
        Dog dog1 = context.getBean("pet", Dog.class);
//        dog1.setName("Strelka");

//        System.out.println(dog.getName());
//        System.out.println(dog1.getName());

        System.out.println(dog.hashCode());
        System.out.println(dog1.hashCode());
        System.out.println(dog == dog1);
        context.close();
    }
}
