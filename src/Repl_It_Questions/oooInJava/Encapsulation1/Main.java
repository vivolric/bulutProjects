package Repl_It_Questions.oooInJava.Encapsulation1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String studentName = scan.nextLine();

        int studentAge = scan.nextInt();

        // DO NOT CHANGE THE CODE BEFORE THIS LINE.

        Student student1 = new Student();
        student1.setStudentName(studentName);
        student1.getStudentName();
        student1.setAge(studentAge);
        student1.getAge();

        System.out.println(student1);


    }
}