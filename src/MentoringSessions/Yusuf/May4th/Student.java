package MentoringSessions.Yusuf.May4th;

public class Student {
    String name;
    String major;
    int age;
    int firstExamGrade;
    int secondExamGrade;
    int thirdExamGrade;

    double getAverageGrade() {
        return (firstExamGrade + secondExamGrade + thirdExamGrade) / 3;
    }

}
