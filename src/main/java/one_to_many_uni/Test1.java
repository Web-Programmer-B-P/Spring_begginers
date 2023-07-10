package one_to_many_uni;

import one_to_many_uni.entity.Department;
import one_to_many_uni.entity.Employee;
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
                .addAnnotatedClass(Department.class)
                .buildSessionFactory(); Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();

//            Department department = new Department("HR", 500, 1500);
//            Employee emp1 = new Employee("Oleg", "Ivanov", 10000);
//            Employee emp2 = new Employee("Andrey", "Sidorov", 60000);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//
//            session.save(department);


//            Department department = session.get(Department.class, 3);
//
//            System.out.println(department);
//            System.out.println(department.getEmployees());

//            Employee employee = session.get(Employee.class, 6);
//            System.out.println(employee);

//            Employee employee = session.get(Employee.class, 6);
//
//            session.delete(employee);

            Department department = session.get(Department.class, 2);
            session.delete(department);

            session.getTransaction().commit();
        }
    }
}
