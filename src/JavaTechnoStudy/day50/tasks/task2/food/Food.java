package JavaTechnoStudy.day50.tasks.task2.food;


public abstract interface Food {

    String taste();

    static void aa() {

    }

    //print how it taste
    default void print() {
        System.out.println("food taste: " + taste());
    }


}
