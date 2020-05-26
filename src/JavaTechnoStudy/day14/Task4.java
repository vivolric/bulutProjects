package JavaTechnoStudy.day14;

import java.util.Scanner;

public class Task4 {
    // Determine and print the number of times
    // the character ‘a’ appears in the input entered by the user.

    // input: Test output
    //        a: 0

    // input: Ola amigo
    //        a:2

    //hint: .charAt, length(), for, index, counter,

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Provide a text: ");
        String text = input.nextLine();

        int counterA = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter == 'a') {
                System.out.println(letter);
                counterA++;
            }
        }

        System.out.println("‘a’ appears in the input: " + counterA + " times");

    }

}
