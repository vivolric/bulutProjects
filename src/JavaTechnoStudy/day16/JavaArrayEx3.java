package JavaTechnoStudy.day16;

import java.util.Arrays;

public class JavaArrayEx3 {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Trudy"};
        //class Arrays
        String output = Arrays.toString( names );
        System.out.println(output);

    }

}

//    public static void main(String[] args) {
//        char[] letters = {'H', 'e', 'l', 'l', 'o'};
//
//        //                 0    1    2    3    4
//        System.out.println( "Length:" + letters.length );
//        for(int i = 0; i < letters.length; i++) {
//            System.out.print( letters[i] );
//        }
//        System.out.println( "\n-------------" );
//
//        for(int i = letters.length - 1; i >= 0; i--) {   // bura epey onemli, nasil geri yaziyoruz harf ya da kelimeleri? onun kodu bu.
//            System.out.print( letters[i] );
//        }
//
//
//    }
//
//}



