package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static hibernate.Consts.PATH_CONFIG;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure(PATH_CONFIG)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Vasa", "Ivanov", "Hrr", 75000);
            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();
        }
    }
}
