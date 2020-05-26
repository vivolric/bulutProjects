package JavaTechnoStudy.day27.May13;

import java.util.ArrayList;

public class Store {

    /**
     * String color;
     * String size;
     * int memory;
     * int CPU;
     */


    public static void main(String[] args) {
        // this is the long way to create the only one computer

        computer computer1 = new computer();  // this line is called as object. our class name is computer and we will call the objects from computer class
        computer1.color = "Silver";           // and computer1 will represent the objects such as color, size, memory etc.
        computer1.size = "Large";
        computer1.memory = 512;
        computer1.CPU = 111;

        System.out.println("Color " + computer1.color + "Size " + computer1.size + "Memory " + computer1.memory + "CPU " + computer1.CPU);

        // this is the short to create computer list with ArrayList. in that way we are calling 2 methods which are printComputer and createComputer
        ArrayList<computer> computers = new ArrayList<>();

        computers.add(createComputer("Silver", "Large", 512, 111));
        computers.add(createComputer("Black", "Medium", 256, 111));
        computers.add(createComputer("Orange", "Small", 1024, 224));

        for (computer computer : computers) {
            printComputer(computer);
        }

    }

    //this method helps us to print the ArrayList (up, line26)
    public static void printComputer(computer computer) {
        System.out.println("Color: " + computer.color + " \n" + "Size: " + computer.size + " \n" + "Memory: " + computer.memory + " \n" + "CPU: " + computer.CPU);
    }

    // this method helps us to create new computer for ArrayList (line28)
    public static computer createComputer(String color, String size, int memory, int CPU) {
        computer newComputer = new computer();
        newComputer.color = color;
        newComputer.size = size;
        newComputer.memory = memory;
        newComputer.CPU = CPU;

        return newComputer;
    }
}
