package JavaTechnoStudy.day8;

import java.util.Scanner;

public class mustafaabidenaparmalar {

//    public static void main(String[] args) {
//        int num = 24;
//        int num2 = num;
//        int count = 0;
//        int result = 1;
//        int result2 = 0;
//        int result3= 0;
//        while(num != 0)
//        {
//            // num = num/10
//            num /= 10;
//            ++count;
//        }
//        count = count -1;
//
//        System.out.println("senin numara " + num2);
//        System.out.println("Number of digits: " + count);
//
//        for (int i = 0 ; i<count ; i++ )
//        {
//            result = result*10;
//        }
//        System.out.println("kaca bolmen lazim " + result);
//        System.out.println("mesela ilk seferinde bolum = " + num2/(result));
//        System.out.println("simdi onu donguye sokmak lazim her seferinde bolumu yazdirmak icin");
//        for (int k = 0 ; k<count+1 ; k++)
//        {
//            result2 = num2/result;
//            System.out.println(result2);
//            num2 = num2-(result2*result);
//            result = result/10;
//    }
//}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        //int num = 12345;
        int num2 = num;
        int count = 0;
        int result = 1;
        int result2 = 0;
        int result3 = 0;
        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }
        count = count - 1;

        System.out.println("senin numara " + num2);
        System.out.println("Number of digits: " + count);

        for (int i = 0; i < count; i++) {
            result = result * 10;
        }
        System.out.println("kaca bolmen lazim " + result);
        System.out.println("mesela ilk seferinde bolum = " + num2 / (result));
        System.out.println("simdi onu donguye sokmak lazim her seferinde bolumu yazdirmak icin");
        for (int k = 0; k < count + 1; k++) {
            result2 = num2 / result;
            System.out.println(result2);
            num2 = num2 - (result2 * result);
            result = result / 10;

        }


    }
}