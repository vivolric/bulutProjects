package JavaTechnoStudy.day31.instanceModifiers.defaultModifier.same;

public class Book {
    //default/package-private access modifier
    String name;

    Book() {  // instance method
    }

    public Book(String name) {   // instance method
        this.name = name;
    }
}
