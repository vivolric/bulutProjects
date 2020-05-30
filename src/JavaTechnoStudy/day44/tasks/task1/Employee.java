package JavaTechnoStudy.day44.tasks.task1;

public class Employee extends Person {
    private School school;
    private double salary;

    public Employee(String name, String address, double salary) {  // constructor method
        super(name, address);
        this.salary = salary;
    }
    // we are using getter and setter method

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n\nEmployee" +
                //"school=" + school +
                super.toString() +
                "\nsalary: " + salary;
    }
}
