package JavaTechnoStudy.day38.tasks.task2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Task2 t2 = new Task2();  // object is created

        ArrayList<Double> prices = t2.getPrices();
        System.out.println(prices);

        double average = t2.priceAverage(prices);
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(average));
        System.out.println("Average:" + average);
    }

    //1. create method that gets price from user until input given by user is "exit"
    public ArrayList<Double> getPrices() {
        ArrayList<Double> pricesList = new ArrayList<>();  // arraylist i prices olarak mi call yapicam yoksa
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide prices:");
        String strPrice = scanner.nextLine();

        while (!strPrice.equals("exit")) {
            try {
                double price = Double.parseDouble(strPrice);
                // 2. add prices to ArrayList
                pricesList.add(price);
            } catch (NumberFormatException ex) {
                System.out.println("Please provide valid price");
            }
            strPrice = scanner.nextLine();
        }
        return pricesList;

    }

    //3. create method to get average prices
    public double priceAverage(ArrayList<Double> prices) {
        double sum = 0;
        for (Double price : prices) {
            sum += price;
        }

        if (sum == 0) {
            throw new ArithmeticException("Sum is zero, there is no average"); //eger bu sart saglanirsa console da calisir
        }
        double average = sum / prices.size();
        return average;
    }
}
