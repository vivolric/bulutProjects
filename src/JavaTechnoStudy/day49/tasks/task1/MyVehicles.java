package JavaTechnoStudy.day49.tasks.task1;

import JavaTechnoStudy.day49.tasks.task1.interfaces.Flying;
import JavaTechnoStudy.day49.tasks.task1.interfaces.Vehicle;
import JavaTechnoStudy.day49.tasks.task1.vehicles.AirPlane;
import JavaTechnoStudy.day49.tasks.task1.vehicles.Car;
import JavaTechnoStudy.day49.tasks.task1.vehicles.SpaceShip;

import java.util.ArrayList;
import java.util.List;

public class MyVehicles {

    public static void main(String[] args) {
        Vehicle car = (Vehicle) new Car();
        doubleSpeed(car);

        Vehicle airPlane = (Vehicle) new AirPlane();
        doubleSpeed(airPlane);
        print((Flying) airPlane);

        Vehicle spaceShip = (Vehicle) new SpaceShip();
        doubleSpeed(spaceShip);


        List<Integer> list = new ArrayList<>();
    }

    public static void doubleSpeed(Vehicle vehicle) {
        System.out.println(vehicle.getClass().getSimpleName()+ ", doubled speed is: " + vehicle.speed() * 2);
    }

    public static void print(Flying flying){
        System.out.println("This vehicle fly on: " + flying.fly());
    }


    public static void option1() {
        Car car = new Car();
        AirPlane airPlane = new AirPlane();
        SpaceShip spaceShip = new SpaceShip();
    }
}
