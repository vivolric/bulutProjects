package MentoringSessions.Ali.May13;

public class tryCatch {
    /*
    What is try catch block?

     */

    public static void main(String[] args) {

        int i = 10;
        int j = 0;

        try {
            System.out.println(i / j);

            // we can write multiple line of code

        } catch (ArithmeticException e) {
            System.out.println("j can be 0");
        }

        System.out.println("code is done");
    }


}
