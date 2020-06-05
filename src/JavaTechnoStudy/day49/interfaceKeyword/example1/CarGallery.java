package JavaTechnoStudy.day49.interfaceKeyword.example1;

import JavaTechnoStudy.day49.interfaceKeyword.example1.interfaces.Electric;
import JavaTechnoStudy.day49.interfaceKeyword.example1.vehicles.Bus;
import JavaTechnoStudy.day49.interfaceKeyword.example1.vehicles.TeslaCar;
import JavaTechnoStudy.day49.interfaceKeyword.example1.vehicles.ToyotaPrius;

public class CarGallery {

    public static void main(String[] args) {
        TeslaCar teslaCar = new TeslaCar();
        teslaCar.setModel("model X");

        ToyotaPrius prius = new ToyotaPrius();
        prius.setEngine(2.0);
        prius.setModel("Toyota");

        Bus cityBus = new Bus();
        cityBus.setEngine(2.5);
        cityBus.setModel("Mercedes");

        int batLife = Electric.batteryLife;

    }
}
