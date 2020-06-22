package MentoringSessions.Yusuf.May4th;

public class Main {
    public static void main(String[] args) {
        Class tsClass = new Class();
        tsClass.classTeacher = new Teacher();
        tsClass.student = new Student();

        tsClass.subject = "Java";

        tsClass.classTeacher.name = "Dos";
        tsClass.classTeacher.BADegree = "Computer Science";
        tsClass.classTeacher.yearOfExperience = 15;

        tsClass.student.name = "Yusuf";
        tsClass.student.age = 25;
        tsClass.student.major = "Computer Science";
        tsClass.student.firstExamGrade = 86;
        tsClass.student.secondExamGrade = 67;
        tsClass.student.thirdExamGrade = 93;

        System.out.println(tsClass);
    }
}