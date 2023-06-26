package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

import static hibernate.Consts.PATH_CONFIG;

public class Test3 {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure(PATH_CONFIG)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> emps = session.createQuery("from Employee").getResultList();

//            List resultList = session.createQuery("from Employee where name = 'Petr'")
//                    .getResultList();
            List resultList = session.createQuery("from Employee where salary < 350000")
                    .getResultList();
            resultList.forEach(System.out::println);

            session.getTransaction().commit();
        }
    }
}
