package JavaTechnoStudy.day43.extendsKeyword.ex3;

import java.util.Scanner;

public class Employee {         //parent class
    private String name;
    public double salary;
    public double coef; //epi

    public Employee(String name, double salary, double coef) {
        this.name = name;
        this.salary = salary;
        this.coef = coef;
    }

    public double calculateSalary() {
        return this.salary * this.coef; //
    }

    @Override
    public String toString() {
        return this.name + ": $" + this.calculateSalary();
    }
}
