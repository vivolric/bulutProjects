package JavaTechnoStudy.day33.javaEnum.ex1;

public class Ex1 {

    public static void main(String[] args) {
        User user1 = new User();
        user1.role = Role.ADMIN;
        user1.status = Status.ACTIVE;

        //Enums are often used in switch statements to check for corresponding values:

        /**
         * Difference between Enums and Classes
         * An enum can, just like a class, have attributes and methods.
         * The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).
         An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
         *
         * Why And When To Use Enums?
         * Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
         */

    }
}
