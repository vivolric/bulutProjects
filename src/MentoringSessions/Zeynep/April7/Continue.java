package MentoringSessions.Zeynep.April7;

public class Continue {
    public static void main(String[] args) {
        String sentence = "hola            @ gmail. com";

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (ch == ' ') {

                continue;
            }
            System.out.print(ch);
        }
    }
}

