package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student str1 = new Student("Vasa", 4, 7.5);
        Student str2 = new Student("Zhanna", 2, 4.5);
        Student str3 = new Student("Lida", 1, 7.7);

        students.add(str1);
        students.add(str2);
        students.add(str3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
//        students.get(3);
        System.out.println("Information from method getStudentList: ");
        System.out.println(students);
        return students;
    }
}
