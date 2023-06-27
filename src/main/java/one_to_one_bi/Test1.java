package one_to_one_bi;

import one_to_one_bi.entity.Detail;
import one_to_one_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static hibernate.Consts.PATH_CONFIG;

/**
 * Для корректной работы с Bi-direction нужно использовать оба сеттера иначе не пропишется ссылка.
 */
public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure(PATH_CONFIG)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory(); Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();

//            Employee employee = new Employee("Kolay", "Ivanov", "Sales", 50_000);
//            Detail detail = new Detail("London", "56703453", "kolay@gmail.ru");
//            detail.setEmployee(employee);
//            employee.setDetail(detail);
//            session.persist(detail);

            Detail detail = session.get(Detail.class, 6);
            //Отвязываем внешний ключ, чтобы удалить только детали без работника.
            detail.getEmployee().setDetail(null);
//            System.out.println(detail);
            session.delete(detail);


            session.getTransaction().commit();
        }
    }
}
