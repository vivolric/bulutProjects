package moreAboutJava.Reversing;

import java.util.Arrays;
import java.util.Collections;

public class ReversingIntArray {
    /*function reverses the elements of the array*/
    static void reverse(Integer number[]) {
        Collections.reverse(Arrays.asList(number));
        System.out.println(Arrays.asList(number));
    }

    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};
        reverse(arr);
    }
}



