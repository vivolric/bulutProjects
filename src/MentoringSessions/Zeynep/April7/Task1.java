package MentoringSessions.Zeynep.April7;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        /*
         todo 1. LOOP

         write a program to calculate average of 4 random numbers using by for loop
         */

          Random rand = new Random();
//
//        int num1 = rand.nextInt(20);
//        int num2 = rand.nextInt(20);
//        int num3 = rand.nextInt(20);
//        int num4 = rand.nextInt(20);
//
//        int totalNum = num1 + num2 + num3 + num4;
//        System.out.println(totalNum);

        int totalNum = 0;

        for (int i = 0; i < 4 ; i++) {
            int num = rand.nextInt(20);

            System.out.println("Random Number: " + num);
            totalNum += num;
        }
        System.out.println("Total Number: " + totalNum/4);


    }


}
