package MentoringSessions.Yusuf.May11;

public class Task1 {

    // Write a class called Car and write the following field:
    // String brand, int year, enum condition, double price
    // fill your enum Condition with REALLYYOLD, USED, GOOD, LIKENEW

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2010, Condition.USED, 10000.0);
        Car hisCar = new Car("Honda", 2009);


        System.out.println(myCar);

        System.out.println("----------------------");

        System.out.println(hisCar);


    }
}
