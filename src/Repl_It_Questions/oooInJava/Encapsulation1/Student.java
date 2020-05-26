package Repl_It_Questions.oooInJava.Encapsulation1;

public class Student {

    private String name;
    private int age;


    public String getStudentName() {
        return name;
    }

    public void setStudentName(String studentName) {
        this.name = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student name is " + name + "\n" + name + " is " + age + " years old.";
    }
}
