package JavaTechnoStudy.day42.tasks.task3;

import java.util.ArrayList;
import java.util.List;

public class MyMath {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);


        MyNumber num = new MyNumber(numbers);
        System.out.println(num);

        List<Integer> evenNumbers = num.getEvenNumbers();
        System.out.println("copy of evenNumbers: " + evenNumbers);
        evenNumbers.add(100);

        System.out.println("copy of evenNumbers after update: " + evenNumbers);
        System.out.println(num);
    }
}
