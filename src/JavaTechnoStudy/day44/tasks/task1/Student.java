package JavaTechnoStudy.day44.tasks.task1;

public class Student extends Person {   // child class
    private School school; // instance variable
    private double fee;   // instance variable

    public Student(String name, String address, School school, double fee) {
        super(name, address);

        this.school = school;
        this.fee = fee;
    }


    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "\n\nStudent" +
                "\nschool: " + school.getName() +
                super.toString() +
                "\nfee: " + fee;  // this is reuse to make the codes maintainable o have less work.
    }

}
