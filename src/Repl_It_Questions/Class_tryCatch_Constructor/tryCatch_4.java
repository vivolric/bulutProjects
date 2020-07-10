package Repl_It_Questions.Class_tryCatch_Constructor;

public class tryCatch_4 {

    public static String getCharacter(String str1, int num) {
        try {
            return Character.toString(str1.charAt(num));

        } catch (Exception e) {
            return "Invalid number!!!";
        }
    }
}
