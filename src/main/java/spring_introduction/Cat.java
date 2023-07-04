package spring_introduction;

//@Component("cat")
@Profiling
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("May may");
    }
}
