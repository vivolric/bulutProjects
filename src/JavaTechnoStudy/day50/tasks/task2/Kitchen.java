package JavaTechnoStudy.day50.tasks.task2;

import JavaTechnoStudy.day50.tasks.task2.food.*;

public class Kitchen {

    public void cook(Food food) {
        System.out.println("===========" + food.getClass().getSimpleName() + "==================");

        System.out.println("star cooking");

        if (food instanceof AdanaKebab) {         // AdanaKabab  kabab = new AdanaKaba()
            AdanaKebab kebab = (AdanaKebab) food;
            System.out.println(kebab.marinade());
            System.out.println(kebab.grill());
        } else if (food instanceof Borsh) {
            Borsh borsh = (Borsh) food;
            System.out.println(borsh.boil());
        } else if (food instanceof Lahmacun) {
            Lahmacun lahmacun = (Lahmacun) food;
            System.out.println(lahmacun.dough());
            System.out.println(lahmacun.topping());
            System.out.println(lahmacun.bake());
        } else if (food instanceof Palov) {
            Palov palov = (Palov) food;
            System.out.println(palov.fry());
            System.out.println(palov.boil());
        }


        //System.out.println(food.taste());
        food.print();
        System.out.println("serve food");
    }
}
