package MentoringSessions.Zeynep.April7;

public class Break {
    public static void main(String[] args) {

    /*
    what is the "break"?
    we can control the loop to terminate from loop
    basically used for out of jump from loop



     */

        String text = "keep@calm";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == '@') {
                break;
            }
            System.out.println(ch);
        }

    }
}
