package many_to_many;

import many_to_many.entity.Child;
import many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static hibernate.Consts.PATH_CONFIG;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure(PATH_CONFIG)
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory(); Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();

//            Section section = new Section("Photo");
//            Child child1 = new Child("Zeka", 4);
//            Child child2 = new Child("Ziza", 7);
//            Child child3 = new Child("Valik", 5);
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//            section.addChildToSection(child3);
//
//            session.persist(section);

//            Section section1 = new Section("Dance");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child = new Child("Igor", 10);
//            child.addSectionToChild(section1);
//            child.addSectionToChild(section2);
//            child.addSectionToChild(section3);
//
//
//            session.save(child);


//            Section section1 = session.get(Section.class, 1);
//            System.out.println(section1);
//            System.out.println(section1.getChildren());

//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());


//            Section section1 = session.get(Section.class, 2);
//            session.delete(section1);

            Child child = session.get(Child.class, 4);
            session.delete(child);
            session.getTransaction().commit();

        }
    }
}
