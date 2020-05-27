package JavaTechnoStudy.day43.inheritance.finalAttribute.ex2;

public class FourWheelVehicle {  // this parent class
    public final String model;
    public final int wheelCount = 4;

    public FourWheelVehicle(String model) {
        this.model = model;
    } // this is constructor

    public final void print() {
        System.out.println(model);
    }

}
