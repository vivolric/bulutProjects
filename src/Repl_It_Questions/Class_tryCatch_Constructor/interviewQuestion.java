package Repl_It_Questions.Class_tryCatch_Constructor;

import java.util.ArrayList;

public class interviewQuestion {

    public static ArrayList<String> myFancyPants(int low, int high, int A, int B) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = low; i <= high; i++) {

            if (i % A == 0 && i % B == 0) list.add("FancyPants");

            else if (i % B == 0) list.add("Pants");

            else if (i % A == 0) list.add("Fancy");

            else list.add(String.valueOf(i));
        }
        return list;
    }
}
