package Repl_It_Questions.Class_tryCatch_Constructor;

import java.util.ArrayList;

public class tryCatch_3 {

    public static int sum(ArrayList<Integer> list) {
        try {
            int sum = 0;
            for (Integer integer : list) {
                sum += integer;
            }
            return sum;
        } catch (Exception e) {
            return -1;
        }
    }
}
