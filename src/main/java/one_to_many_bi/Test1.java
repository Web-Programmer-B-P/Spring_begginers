package one_to_many_bi;

import one_to_many_bi.entity.Department;
import one_to_many_bi.entity.Employee;
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

//            Department department = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee("Petr", "Bars", 350000);
//            Employee emp2 = new Employee("Vasa", "Insxd", 50000);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//
//            session.save(department);


//            Department department = session.get(Department.class, 1);
//
//            System.out.println(department);
//            System.out.println(department.getEmployees());

//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());

            Employee employee = session.get(Employee.class, 3);

            session.delete(employee);

            session.getTransaction().commit();
        }
    }
}
