package MentoringSessions.Zeynep.April7;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        /* todo 2.LOOP with Scanner
         *
         * write a program that takes a number from console and
         * print multiplication table according to that number
         *
         * ex: number 3
         *
         * 1 * 2 = 2
         * 2 * 2 = 4
         * 3 * 2 = 6
         * 4 * 2 = 8
         *
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please provide a number: ");

        int number = scan.nextInt();

        for (int i = 1; i <=10 ; i++) {

            int multiply = number * i;
            System.out.println(number + "*" + i + "=" + multiply);

        }
    }

}
