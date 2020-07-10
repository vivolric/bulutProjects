package Repl_It_Questions.Class_tryCatch_Constructor;

public class tryCatch_5 {

    public static String getChar(String str1, int num) {
        try {
            return Character.toString(str1.charAt(num));
        } catch (Exception e) {
            return "String can not be null";
        }
    }
}

