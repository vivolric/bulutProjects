package JavaTechnoStudy.day48.tasks.task3.cat;

import JavaTechnoStudy.day48.tasks.task3.AbstractAnimal;

public class Cat extends AbstractAnimal {
           //subclass    super class

    public Cat(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "meow";
    }

}
