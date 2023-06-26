package spring_introduction;

//@Component
//@Scope("prototype")
//@Scope("singleton")
public class Dog implements Pet {
//    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Wof-wof");
    }

    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @PostConstruct
    public void init() {
        System.out.println("Class dog init method!");
    }

//    @PreDestroy
    public void destroy() {
        System.out.println("Class dog destroy method!");
    }
}
