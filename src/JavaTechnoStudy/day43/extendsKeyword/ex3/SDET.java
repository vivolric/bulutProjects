package JavaTechnoStudy.day43.extendsKeyword.ex3;

public class SDET extends Employee {   // subclass
    private double bonus;  // this instance variable belongs to subclass(SDET)

    public SDET(String name, double salary, double coef, double bonus) {
        super(name, salary, coef);
        this.bonus = bonus; // we are using instance variable thats why we have "this"
    }

    @Override
    public double calculateSalary() {
        return salary * coef + bonus;

        //coef: emsal, katsayi, faktor
    }


}
