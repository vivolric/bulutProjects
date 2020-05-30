package JavaTechnoStudy.day44.superConstructor;

public class App {          // main class

    public static void main(String[] args) {

        // Vehicle vehicle = new Vehicle();

        Car car = new Car();
        // object is created to call the default method/vehicle class

        System.out.println("--------");

        Car car2 = new Car(1,2);
        // object is created to call the car int method/constructor

        Car car3 = new Car("albayim boyle mi olacakti");


    }

}
