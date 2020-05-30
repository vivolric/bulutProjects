package JavaTechnoStudy.day44.superVsThis;

/*
differentiate the members of superclass
from the members of subclass,
if they have same names.
 */
public class Apple extends Fruit {

    public String name;

    public Apple() {
        this.name = "Apple";
        // this keyword shows us instance variable belongs to apple class
        super.name = "Fruit";
        // super keyword helps us to use code from parent class if they have same name
    }
}
