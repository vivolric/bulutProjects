package JavaTechnoStudy.day16;

import java.util.Arrays;

public class JavaArrayEx2 {


    public static void main(String[] args) {
        //String array
        //When you don`t know what will be values of array
//        String[] array = new String[3];

        String [] member = new String[5];
        String[] names = {"Bob", "Alice", "Trudy", "Jack"}; //no limitation

        int[] ages = {20, 25, 38, 40, 50};


        //class Arrays
        System.out.println("Prints string array: " + Arrays.toString(names)); // arrays.toString metodu konsola yazdirmaya yarar.
        System.out.println("Prints int array: " + Arrays.toString(ages));

    }
}
