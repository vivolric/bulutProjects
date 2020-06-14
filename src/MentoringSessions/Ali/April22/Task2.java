package MentoringSessions.Ali.April22;

import java.util.TreeSet;

public class Task2 {

    public static void main(String[] args) {

        TreeSet<String> t1 = new TreeSet<>();

        t1.add("United States");
        t1.add("Canada");
        t1.add("Turkey");
        t1.add("France");
        t1.add("England");
        //t1.add("Tajikistan");

        int totalLength = 0;

        for (String myValue : t1) {  // use for each loop here

            totalLength += myValue.length();

        }

        System.out.println(totalLength); // kelimelerin toplam harf sayisini buluyoruz

    }

}