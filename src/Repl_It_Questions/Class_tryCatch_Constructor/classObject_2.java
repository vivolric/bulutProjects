package Repl_It_Questions.Class_tryCatch_Constructor;

import java.util.Scanner;

public class classObject_2 {

    static class Family {
        int amountOfUser;
        int totalAmount;

        String familyName;
        String familyPrimaryUser;

        public void getTotalAmount(PhonePlan name) {
            totalAmount = name.amount(amountOfUser) * amountOfUser;
        }

        public String toString() {
            return "\ntotal Amount is : " + totalAmount +
                    "\nfamily name is : " + familyName +
                    "\nprimary user is : " + familyPrimaryUser;
        }
    }


    static class PhonePlan {

        String planType;
        int priceForEach;

        public int amount(int user) { //totalUser from Family class

            if (planType.equals("eco") && user <= 3) {
                priceForEach = 50;
            } else if (planType.equals("eco") && user > 3 && user <= 5) {
                priceForEach = 45;
            } else if (planType.equals("eco") && user > 5) {
                priceForEach = 35;
            } else if (planType.equals("premium") && user <= 3) {
                priceForEach = 70;
            } else if (planType.equals("premium") && user > 3 && user <= 5) {
                priceForEach = 60;
            } else if (planType.equals("premium") && user > 5) {
                priceForEach = 55;
            }
            return priceForEach;
        }
    }


    static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int amountOfUser = scan.nextInt();
            scan.nextLine();
            String familyName = scan.nextLine();
            String familyPrimaryUser = scan.nextLine();
            String planType = scan.nextLine();
            Family f1 = new Family();

            f1.amountOfUser = amountOfUser;
            f1.familyName = familyName;
            f1.familyPrimaryUser = familyPrimaryUser;

            PhonePlan p1 = new PhonePlan();
            p1.planType = planType;

            f1.getTotalAmount(p1);
            System.out.println(f1);
        }
    }
}
