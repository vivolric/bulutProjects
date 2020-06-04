package JavaTechnoStudy.day24;

public class ArrayQuestion {

    // Write a method in Java which accepts a 2D array of integers
    // and its size as arguments and displays the elements of middle row and the elements of middle column.
    // [Assuming the 2D Array to be a square matrix with odd dimension i.e. 3x3, 5x5, 7x7 etc...]
    // Example, if the array contents is
    // 3  5  4
    // 7  6  9
    // 2  1  8
    // Output through the method should be :
    // Middle Row : 7 6 9
    // Middle column : 5 6 1


    public static void main(String[] args) {
        int[][] arr = {
                {3, 5, 4, 5, 6},
                {7, 6, 9, 5, 6},
                {2, 1, 83, 5, 6},
                {3, 5, 75, 5, 6},
                {2, 1, 83, 5, 6},


        };
        middleRow(arr);
        System.out.println("===============");
        middleCoulm(arr);
    }


    public static void middleRow(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[arr1.length - (arr1.length + 1) / 2][i]);

        }
    }

    public static void middleCoulm(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i][arr1.length - (arr1.length + 1) / 2]);

        }
    }

}
