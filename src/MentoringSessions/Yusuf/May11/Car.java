package MentoringSessions.Yusuf.May11;


enum Condition {
    REALLYYOLD, USED, GOOD, LIKENEW
}

public class Car {

    String brand;
    int year;
    Condition condition;
    double price;


    public Car(String brand, int year, Condition condition, double price) {
        this.brand = brand;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;

    }

    @Override
    public String toString() {
        return "Brand='" + brand +
                "\nYear=" + year +
                "\nCondition=" + condition +
                "\nPrice=" + price;
    }
}

