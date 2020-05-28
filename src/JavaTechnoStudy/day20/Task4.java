package JavaTechnoStudy.day20;

public class Task4 {
    //create method that calculates average of given student result
    // inputs: name and results
    // ex: Ali, 30, 40, 90, 100
    /// Ali : 65
    // ex: Bali, 30, 40, 90, 100, 95, 86
    /// Bali : 73.5

    public static void main(String[] args) {
        studentAverage("Ali", 30, 40, 90, 100);
        studentAverage("Baha", 30, 40, 90, 100, 95, 86);
    }

    public static void studentAverage(String name, int... results) {
        int sum = 0;
        for (int result : results) {
            sum += result;
        }
        double average = (double) sum / results.length;   // neden kusurati alamiyoruz widening yaptik burda cunku
        System.out.println(name + ": " + average);
    }
}
