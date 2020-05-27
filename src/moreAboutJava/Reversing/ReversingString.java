package moreAboutJava.Reversing;

import java.util.Arrays;

public class ReversingString {
    public static void main(String[] args) {

        String str = "Dogan";
        char[] letters = new char[str.length()];
        int letterIndex = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            // once burda kelimeyi ters ceviriyorsun, data type char oluyor
            letters[letterIndex] = str.charAt(i);
                        // 0            n
                        // 1            a
                        // 2            g
                        // 3            o
                        // 4            d
            letterIndex++;
        }
        System.out.println("Char Array: " + Arrays.toString(letters));

        String reverseStr = "";
        for (int i = 0; i < str.length(); i++) {
            reverseStr = reverseStr + letters[i];
        }
        System.out.println("String: " + reverseStr);
    }


}
