package MentoringSessions.Yusuf.March27th;

import java.util.Scanner;

public class Task1 {

    // Create s String and give the value of: BrfxXccXxMnpCcCcLllmmnPrxvclmNckSsqlbb11116
    // Create another string and give the value of: BrfxXccXxMnpCcCclllmmnPrxvclmNckSsqlbb11116
    // Check if they are same, caps does not matter.

    public static void main(String[] args) {

//        String str = "BrfxXccXxMnpCcCcLllmmnPrxvclmNckSsqLbb11116";
//
//        String lowerStr = str.toLowerCase();
//        int lengthStr = lowerStr.length();
//
//        String LtoW = lowerStr.replaceAll("1","W");
//
//        System.out.println(LtoW);
//
//        System.out.println(lowerStr);

        Scanner input = new Scanner(System.in);

        System.out.println("Please give me a String: ");
        String userInput = input.nextLine();
        System.out.println(userInput.charAt(1));

        System.out.println("Please give me a sentence with at least 5 words: ");
        String userInput2 = input.nextLine();
        System.out.println(userInput2.replaceAll(" ", "2"));


    }
}
