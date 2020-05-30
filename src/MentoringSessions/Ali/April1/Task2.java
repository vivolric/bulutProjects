package MentoringSessions.Ali.April1;

import java.util.Scanner;

public class Task2 {
    /*
    Create a scanner object
    Create a string, assign string to scanner

    if String is US
        print I live in United States

    if String is BEL
        print I live in Belgium

     if String is DEU
        print I live in Germany

     else
        print I live somewhere else

     */
    public static void main(String[] args) {
        Scanner country = new Scanner(System.in);

        String whereYouLive = country.nextLine();

        switch (whereYouLive) {
            case "US":
                System.out.println("I live in United States");
                break;
            case "BEL":
                System.out.println("I live in Belgium");
                break;
            case "DEU":
                System.out.println("I live in Germany");
                break;
            default:
                System.out.println("I live in somewhere else");
        }
    }


}

