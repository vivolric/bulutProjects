package JavaTechnoStudy.day48.tasks.task2;

import JavaTechnoStudy.day42.task1.Bank;
import JavaTechnoStudy.day42.task1.Currency;

public class BankingSystem {

    public static void main(String[] args) {
        ChaseBank chase = new ChaseBank("Chase at NJ",
                "+1 256 964 55 77",
                "Hazel 14",
                20);

        BankOfAmerica boa = new BankOfAmerica("Bank in NYC",
                "+1 457 896 57 32",
                "8 ave",
                10);
//        Bank bankOFAmerica = new BankOfAmerica("Bank Of America", "423 CLifton", "dogan@info",
//                "23 3435", 5987.80, Currency.EU);
//
//        bankOFAmerica.buyEuroWithDollar(500);
//        bankOFAmerica.sellEuroGetDollar(200);
//        bankOFAmerica.deposit(5_000);
//        bankOFAmerica.withdraw(2_000);
//
//        System.out.println("==================================================");
//
//        System.out.println(bankOFAmerica);
    }



        ///AbstractBank ab = new AbstractBank();

    }
