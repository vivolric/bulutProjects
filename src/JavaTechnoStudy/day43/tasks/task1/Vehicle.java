package JavaTechnoStudy.day43.tasks.task1;

public class Vehicle {   // parent class
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model is: " + model;
    }

}
