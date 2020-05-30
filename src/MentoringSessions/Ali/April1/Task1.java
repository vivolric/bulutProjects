package MentoringSessions.Ali.April1;

import java.util.Scanner;

public class Task1 {
    /*
        Create one int

        if int is = 0
        print the I do not have any sibling

        if int is = 1
        print the I have one sibling

        if int is = 2
        print the I have two sibling

        if int is more then 2
        print I have too many siblings

     */

    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        int countOfSiblings = dp.nextInt();

        switch (countOfSiblings) {
            case 0:
                System.out.println("I do not have any sibling");
                break;
            case 1:
                System.out.println("I have one sibling");
                break;
            default:
                System.out.println("I have too many siblings");
                break;
            case 2:
                System.out.println("I have two sibling");
                break;
        }
    }
}
