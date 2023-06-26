package one_to_one_uni;

import one_to_one_uni.entity.Detail;
import one_to_one_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static hibernate.Consts.PATH_CONFIG;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure(PATH_CONFIG)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory(); Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();

//            Employee employee = new Employee("Petr", "Bars", "IT", 350000);
//            Detail detail = new Detail("Voronezh", "3453453", "mail.ru");
//            employee.setDetail(detail);

//            Employee employee = new Employee("Oleg", "Smdfd", "Sales", 125990);
//            Detail detail = new Detail("Novgorod", "3453453", "mail.ru");
//            employee.setDetail(detail);

//            Employee employee = session.get(Employee.class, 10);
//            System.out.println(employee.getDetail());
//            session.persist(employee);

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);
            session.getTransaction().commit();
        }
    }
}
