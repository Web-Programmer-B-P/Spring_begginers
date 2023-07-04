package spring_introduction;

import org.springframework.beans.factory.annotation.Value;

//@Component("person")
public class Person {
    private Pet pet;
    @Value("${person.name}")
    private String name;

    @RandomIntegerValue(min = 10000, max = 20000)
    private int age;


//    @Autowired
//    public Person(@Qualifier(value = "cat") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }


    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }


//    public Person() {
//        System.out.println("Hello pet!");
//    }

    public void callYourPet() {
        System.out.println("Hello pet!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Set bean pet");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
