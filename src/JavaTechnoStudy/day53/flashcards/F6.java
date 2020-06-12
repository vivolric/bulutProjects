package JavaTechnoStudy.day53.flashcards;

import java.lang.*;

//QID: 0AFR9102136
public class F6 {

    //class member/variable/field
    public static String name;

    static {
        String s = F6.name;
//        System.out.println(new F6().age);
    }

    //instance member/variable/field
    public int age;

    {
//        System.out.println(new F6().age);
        String s = F6.name;
    }

    F6() {
        String s = F6.name;
    }

    public static void main(String[] args) {
        String s = F6.name;
        System.out.println(name);
        System.out.println(new F6().age);

        //local member/variable
        double money = 0.0;
        System.out.println(money);


        for (int i = 0; i < 10; i++) {

        }

        int i = 10;
    }
}
