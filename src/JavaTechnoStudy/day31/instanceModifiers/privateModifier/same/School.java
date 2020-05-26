package JavaTechnoStudy.day31.instanceModifiers.privateModifier.same;

public class School {  // parent class

    public static void main(String[] args) {
        Person person = new Person(10, "John"); // object method to create variables
        System.out.println("ID: " + person.id);

        // cannot use private instance variable in different class
        // System.out.println("Name: " + person.name);

        person.toString();

        // cannot use/call private method in different class
        // person.getAge();


    }
}
