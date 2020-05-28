package JavaTechnoStudy.day20;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        printNames("Jon", "Aria");

        printNames("Mark", "Max", "Maria");
    }

    // create method print given names in one line
    public static void printNames(String... names) {
        System.out.println(Arrays.toString(names));

        //2.way
//        for(String name : names) {   for each kullaniyoruz
//            System.out.print(name + " ");
//        }
    }
}




