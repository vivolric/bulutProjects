package JavaTechnoStudy.day49.interfaceKeyword.example1.vehicles;

import JavaTechnoStudy.day49.interfaceKeyword.example1.AbstractVehicle;
import JavaTechnoStudy.day49.interfaceKeyword.example1.interfaces.Electric;
import JavaTechnoStudy.day49.interfaceKeyword.example1.interfaces.Gas;

//to implement from multiple interfaces just put comma and write other interfaces
public class ToyotaPrius extends AbstractVehicle implements Electric, Gas {

    @Override
    public String changeBattery() {
        return "change every 1 year";
    }

    @Override
    public String changeOil() {
        return "change every 3 month";
    }

    @Override
    public String drive() {
        return "start slow, slow down on stops, goes medium";
    }

    public void setEngine(double v) {
    }
}
