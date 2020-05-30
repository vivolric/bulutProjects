package MentoringSessions.Zeynep.April7;

public class Task3 {
    public static void main(String[] args) {

        /* todo 3.BREAK

        write a program to calculate the sum numbers
        if number equals 5, make the loop terminates using by for loops

         */

        int sum = 0;

        for (int i = 0; i < 25; i++) {
            //sum += i;

            if (i==6){
                break;
            }
            sum += i;
        }
        System.out.println(sum);

    }
}
