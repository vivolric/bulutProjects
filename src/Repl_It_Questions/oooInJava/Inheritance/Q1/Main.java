package Repl_It_Questions.oooInJava.Inheritance.Q1;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);

        String ManagerName = dp.nextLine();
        String ManagerDepartment = dp.nextLine();
        int ManagerNumberOfEmployee = dp.nextInt();
        dp.nextLine();
        int ManagerSalary = dp.nextInt();
        dp.nextLine();

        String workerName = dp.nextLine();
        String workerDepartment = dp.nextLine();
        int workerHourlyIncome = dp.nextInt();

        // dont change the code before this line


        Manager manager = new Manager(ManagerName, ManagerDepartment, ManagerNumberOfEmployee, ManagerSalary);
        System.out.println(manager);
        System.out.println(new Worker(workerName, workerDepartment, workerHourlyIncome));


    }
}

class Employee {

    protected String name;
    protected String department;
    protected int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        setSalary(salary);
    }


    public void setSalary(int salary) {

        if (salary > 50_000 && salary < 120_000) {
            this.salary = salary;
        } else
            throw new RuntimeException("Salary should be between 50000 to 120000");
    }


}

class Manager extends Employee {
    private int underemployed;

    public Manager(String name, String department, int underemployed, int salary) {
        super(name, department, salary);
        this.underemployed = underemployed;
    }


    @Override
    public String toString() {
        return
                "Name=" + name +
                        "\nSalary=" + salary +
                        "\nDepartment=" + department +
                        "\nUnderemployed=" + underemployed;
    }
}


class Worker extends Employee {
    private int hourlyIncome;

    public Worker(String name, String department, int hourlyIncome) {
        super(name, department, hourlyIncome * 2080);
        this.hourlyIncome = hourlyIncome * 2080;
    }


    @Override
    public String toString() {
        return
                "Name=" + name +
                        "\nDepartment=" + department +
                        "\nHourly Income=" + hourlyIncome;
    }
}



/*
  Type your answer for the first two questions.

 1) I used the constructor instead of encapsulation in the Employee class because
    to reach the instance variables which are stored in the Employee class.

 2) a- I made the employee variables as protected because it allows the subclass
    getting access to the instance variables.

    b- If I could use variables as a private it would not allow the subclass to reach
    the instance variables.

    c- If I could use variables as a public it would allow the subclass to reach the
    instance variables.

*/
