package JavaTechnoStudy.day43.inheritance.finalAttribute.ex2;

public class Car extends FourWheelVehicle {

    public Car(String model) {
        super(model);
        // super.model = model;
        // we cannot call "model" because it is final variable in parent class
     }

}
