package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static hibernate.Consts.PATH_CONFIG;

public class Test4 {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure(PATH_CONFIG)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 1);
//            employee.setSalary(450000);

            session.createQuery("update Employee set salary = 5000000 where name = 'Petr'")
                            .executeUpdate();
            session.getTransaction().commit();
        }
    }
}
