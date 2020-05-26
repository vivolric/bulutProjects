package JavaTechnoStudy.day13;

public class JavaDoWhileLoop {

    public static void main(String[] args) {

        //while
        int i = 10;
        while (i < 5) { //10 < 5 = false
            System.out.println("Hello while");
        }

        //do-while
        int a = 10;
        do {
            System.out.println("Hello do-while");
        } while (a < 5); // 10 < 5 = false

        System.out.println("========================");

        int it = 10;
        while (i <= 5) { // 10 <= 5  false
            System.out.println("while: " + i++);
        }

        System.out.println();

        i = 10;
        do {
            System.out.println("do-while: " + i++);
        } while (i <= 5); // 10 <= 5 false

    }

}