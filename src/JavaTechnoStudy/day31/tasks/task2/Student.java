package JavaTechnoStudy.day31.tasks.task2;

/*
create class Student
with private 2 fields: name, age
 */
public class Student {
    private String name;
    private int age;

    /*
    also, create private "default constructor"
    and public constructor that initialize all attributes
     */

    private Student() {  // default constructor
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void updateName(String name) {
        if (name.startsWith("M")) {
            System.out.println("No name with M latter");
        } else {
            this.name = name;
        }
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
