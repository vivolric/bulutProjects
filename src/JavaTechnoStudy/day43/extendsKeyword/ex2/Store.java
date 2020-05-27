package JavaTechnoStudy.day43.extendsKeyword.ex2;

public class Store {   // this is main class
    public static void main(String[] args) {

        Banana banana = new Banana();  // object
        //banana.name = "Banana";
        banana.print();


        Apple apple = new Apple("Green apple");
        apple.print();

        Orange orange = new Orange("Yellow  Orange");
        orange.print();
    }
}
