package Repl_It_Questions.Class_tryCatch_Constructor;

public class tryCatch_1 {

    public static String nullPointer(String[] arr, int a) {
        try {
            return arr[a];
        } catch (Exception e) {
            return ("Invalid number!!!");
        }
    }
}
