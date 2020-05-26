package MentoringSessions.Ali.April1st;

public class switchStatement {

    // switch statement

    public static void main(String[] args) {
        int num = 1;
        // if the num is = 1 print Month is January
        // if the num is = 2 print Month is February

        switch (num) {
            case 1:
                System.out.println("Month is January");
                break;
            case 2:
                System.out.println("Month is February");
                break;
            case 3:
                System.out.println("Month is March");
                break;
            case 4:
                System.out.println("Month is April");
                break;
            case 5:
                System.out.println("Month is May");
                break;
            default:
                System.out.println("This is more then my condition");

        }  // difference btwn if and switch

        if (num == 1) {
            System.out.println("Month is January");
        } else if (num == 2) {
            System.out.println("Month is February");
        }
    }
}
/**
 * Note: in switch statement I cannot use boolean in the case it should be int (in our example)
 * <p>
 * if statement condition is always boolean
 */

