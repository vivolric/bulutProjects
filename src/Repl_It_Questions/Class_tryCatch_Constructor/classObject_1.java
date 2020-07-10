package Repl_It_Questions.Class_tryCatch_Constructor;

public class classObject_1 {

    public String result(int num1, int num2, int num3) {
        Calculation c1 = new Calculation();
        int average = c1.average(num1, num2, num3);
        String result = c1.examResult(average);
        if (result.equals("A++")) {
            return "Your result is good and it is A++ You passed Yeayyy";
        } else if (result.equals("A")) {
            return "Your result is good and it is A You passed Yeayyy";
        } else if (result.equals("B++")) {
            return "Your result is okay and it is B++ You passed Yeayyy";
        } else if (result.equals("B")) {
            return "Your result is okay and it is B You passed Yeayyy";
        } else if (result.equals("C")) {
            return "Your result could be better but you passed and it is C";
        } else if (result.equals("F")) {
            return "Your result is Not good enough it is F . See you next year bro.";
        } else
            return "This is not a valid input";

    }

}


class Calculation {

    public int average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public String examResult(int num) {
        if (num <= 100 && num >= 90) {
            return "A++";
        } else if (num < 90 && num >= 70) {
            return "A";
        } else if (num < 70 && num >= 60) {
            return "B++";
        } else if (num < 60 && num >= 50) {
            return "B";
        } else if (num < 50 && num >= 40) {
            return "C";
        } else if (num < 40 && num >= 0) {
            return "F";
        } else
            return "This is not a valid input";
    }
}

