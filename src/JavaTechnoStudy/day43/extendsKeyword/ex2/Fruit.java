package JavaTechnoStudy.day43.extendsKeyword.ex2;

public class Fruit {  // this super class
    public String name;  // instance variable

    public Fruit(){}  //default constructor

    public Fruit(String name){
        this.name = name;
    }

    public void print(){     // print method
        System.out.println("My Fruit is: " + name);
    }
}
