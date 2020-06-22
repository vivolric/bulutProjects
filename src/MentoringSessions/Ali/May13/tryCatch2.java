package MentoringSessions.Ali.May13;

public class tryCatch2 {

    /*
    What kind of exception do you know ?
    https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/

    Can you type multiple catches in try catch?

    YES DEFINITELY


     */

    public static void main(String[] args) {

        int[] i1 = new int[5];

        try {
            System.out.println(10 / 0);

            // }catch (ArrayIndexOutOfBoundsException e){
        } catch (Exception e) {
            //eger hangi exception oldugunu bilmiyorsak yaz bunu gec albayim

            // System.out.println("Array index out of bound exception");
            System.out.println("All Exception");

            //}catch (NullPointerException e){   burda birden fazla exception yazabiliriz

        }
        System.out.println("Code is done");
    }
}
