package MentoringSessions.Yusuf.April14th;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {


        // Create a 2D array [5] by [4]
        // Fill the array with random numbers bound:50


        int[][] array = new int[5][4];

        Random rand = new Random();

        //int randomNumber = rand.nextInt(50);  eger buraya yazarsak sadece bi tane rakam alip
        //                                      hep onu basar ondan iceriye yazmaliyiz - line23

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int randomNumber = rand.nextInt(50);
                array[i][j] = randomNumber;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}