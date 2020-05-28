package JavaTechnoStudy.day21;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");


        printColorsLines(colors);   // method, it will iterate each element in diff line
        addToFirstPosition(colors, "Yellow");
        addToFirstPosition(colors, "Pink");
        printColors(colors); //it will iterate each element in same line
    }

    // Write a method to create a new array list,
    // add some colors (string) and print out the collection.
    public static void printColors(ArrayList<String> colors) {
        System.out.println(colors);
    }

    // Write a method to iterate through all elements in arrayList
    // and print in separate lines
    public static void printColorsLines(ArrayList<String> colors) {
        // 1. way
        for (String color : colors) {
            System.out.println(color);
        }

        // 2. way
        // for(int i = 0; i < colors.size(); i++) {
        //  System.out.println(colors.get(i));
        // }
    }

    //write a method to insert an element into the array list at the first position
    public static void addToFirstPosition(ArrayList<String> colors, String color) {
        colors.add(0, color);
    }


}