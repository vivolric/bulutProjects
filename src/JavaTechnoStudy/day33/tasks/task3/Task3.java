package JavaTechnoStudy.day33.tasks.task3;

public class Task3 {

    int factorial = 1;  // variable + value

    public int fact(int n) {
        if (n == 1) return 1;

        factorial *= n;
        return fact(n - 1);
    }

    public int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return factorial(num - 1) * num;
        // 5*4*3*2*1=120
    }

    public static void main(String[] args) {
        Task3 t = new Task3();
        t.fact(5);
        System.out.println("Fact: " + t.factorial);

        System.out.println("Fact: " + t.factorial(5));

    }
}
