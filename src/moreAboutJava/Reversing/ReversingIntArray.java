package moreAboutJava.Reversing;

import java.util.Arrays;
import java.util.Collections;

public class ReversingIntArray {

    // 1. way

    /*function reverses the elements of the array*/
    static void reverse(Integer number[]) {
        Collections.reverse(Arrays.asList(number));
        System.out.println(Arrays.asList(number));
    }

    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};
        reverse(arr);
    }

    // 2.way
    //given array, prints it in reverse order
    public static void printReverseArray(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }








}



