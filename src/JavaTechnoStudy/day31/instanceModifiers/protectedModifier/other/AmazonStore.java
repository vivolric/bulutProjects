package JavaTechnoStudy.day31.instanceModifiers.protectedModifier.other;

import JavaTechnoStudy.day31.instanceModifiers.protectedModifier.same.Book;

public class AmazonStore {

    public static void main(String[] args) {
        // protected access modifier cannot be used/called from different package
//        Book book1 = new Book();
//        book1.name = "Lord Of The Rings";
//        book1.print();

        Book book2 = new Book("Effective Java");
    }
}
