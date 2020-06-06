package JavaTechnoStudy.day50.tasks.task2;

import JavaTechnoStudy.day44.staticFieldInheritance.B;
import JavaTechnoStudy.day50.tasks.task2.food.Beshbarmak;
import JavaTechnoStudy.day50.tasks.task2.food.Food;
import JavaTechnoStudy.day50.tasks.task2.food.Kebab;
import JavaTechnoStudy.day50.tasks.task2.food.Maklube;

public class TechnoCafe {

    public static void main(String[] args) {
        Food beshparmak = new Beshbarmak();
        beshparmak.print();

    }

    public static void part1(){
        Food kebab = new Kebab();

        Food maklube = new Maklube();

        Kitchen fetihKitchen = new Kitchen();

        System.out.println("---------kebab----------");
        fetihKitchen.cook(kebab);

        System.out.println("---------maklube----------");
        fetihKitchen.cook(maklube);
    }
}
