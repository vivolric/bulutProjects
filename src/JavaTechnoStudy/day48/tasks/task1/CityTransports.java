package JavaTechnoStudy.day48.tasks.task1;

import JavaTechnoStudy.day48.tasks.task1.individual.MyCar;
import JavaTechnoStudy.day48.tasks.task1.publicTransport.Bus;

public class CityTransports { //main class

    public static void main(String[] args) {
        MyCar car = new MyCar();
        car.setName("Jiguli");
        car.setGasType(GasType.REGULAR_GAS);
        car.setCapacity(5);
        car.setId(1);
        System.out.println(car.toString());

        Bus bus = new Bus();
        bus.setName("Mercedes");
        bus.setGasType(GasType.DIESEL);
        bus.setCapacity(30);
        bus.setId(2);
        System.out.println(bus);

    }
}
