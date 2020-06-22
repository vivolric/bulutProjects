package MentoringSessions.Ali.May13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatesIntro {

    /*
    Dates in Java

    What is date class?
        with a date class we are able to create a date

    How we gonna use data class?

        While writing the date in the sign up page.
        For Example:

            Today is 5/13/2020

            If type 5/14/2002 then website should give an error

           But tomorrow which is 5/14/2020 then I need to type 5/15/2002

        How much time we need to spend on date classes?
            Focus on talking on date class for the interview

        Date for today and change it to MM/dd/YY and print it.

     */
    public static void today() {

        LocalDate ld = LocalDate.now();

        System.out.println(ld);

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");

        String s1 = ld.format(myFormatter);

        System.out.println(s1);
    }

    public static void main(String[] args) {
        today();

    }


}
