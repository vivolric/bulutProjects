package JavaTechnoStudy.day28.tasks.task1;

public class ElectricityAccount {
    double totalWph;
    double rate = 0.7;
    double bill;

    //  bill is rate * totalWph
    double calculateBill() {
        if (totalWph < 0) {
            System.out.println("Account is suspended, smtg wrong with you account!!!");
            return 0;
//            throw new RuntimeException("Account is suspended, smtg wrong with you account!!!");
        }
        bill = rate * totalWph;

        return bill;
    }
}