package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static hibernate.Consts.PATH_CONFIG;

public class Test2 {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure(PATH_CONFIG)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Elena", "Petrova", "Sales", 800);
            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();

            int id = employee.getId();

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Employee emp = session.get(Employee.class, id);
            System.out.println(emp);
            session.getTransaction().commit();
        }
    }
}
