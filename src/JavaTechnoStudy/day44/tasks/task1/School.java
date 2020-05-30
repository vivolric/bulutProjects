package JavaTechnoStudy.day44.tasks.task1;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private int maxStudents;
    private List<Student> students;
    private List<Employee> employees;

    public School(String name, int maxStudents) {
        this.name = name;
        this.maxStudents = maxStudents;
        students = new ArrayList<>();  // we re using the list and copy it
        employees = new ArrayList<>(); //that s why we cannot use "this" here also for employees

    }

    public List<Student> registerStudent(Student student) {
        students.add(student);

        return new ArrayList<>(students);
    }

    public List<Employee> registerEmployee(Employee employee) {
        employee.setSchool(this);
        employees.add(employee);

        return new ArrayList<>(employees);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", maxStudents=" + maxStudents +
                ", students=" + students +
                ", employees=" + employees +
                '}';
    }
}
