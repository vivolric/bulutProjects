package JavaTechnoStudy.day33.javaRecursion;

public class Ex1 {

    /**
     * Recursion is made for solving problems that can be broken down into smaller, repetitive problems.
     * It is especially good for working on things that have many possible branches and are too complex for an iterative approach.
     * One good example of this would be searching through a file system.
     */


    //method to print from 1 to 5;
    static void print1to5() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    static int printito5(int i) {
        System.out.println(i);
        if (i == 5) {
            return -1;
        }

        return printito5(i + 1);
    }


    public static void main(String[] args) {
//        print1to5();
        printito5(1);
    }
}
