package JavaTechnoStudy.day44.superConstructor;

public class Vehicle {      //  parent class

    public Vehicle(){       // default method because it does not have parameter
        System.out.println("Vehicle Constructor");
    }

    public Vehicle(String str) { // Vehicle method because it has parameter (String str)
        System.out.println("Vehicle Constructor " + str);
    }
}
