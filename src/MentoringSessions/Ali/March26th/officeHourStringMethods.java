package MentoringSessions.Ali.March26th;

public class officeHourStringMethods {

    public static void main(String[] args) {

        // String Methods (index of, last index of, trim, replace, replace all)

        // index of -->> position of character, starts counting from ZERO - bura muhim albayim, 0 dan basliyor index

        String name = "Techno Studyn";

        System.out.println("index of is here: " + name.indexOf('n'));

        // last index of -->> position of the character, starting from zero

        System.out.println("last index of is here: " + name.lastIndexOf('n'));

        // System.out.println("Multiple Characters: " + name.indexOf('T','S'));

        int positionIfS = name.indexOf('S');
        System.out.println("index of second example: " + positionIfS);

        // trim -->> removing all the spaces in the beginning and in the end
        String state = "       new      jersey      ";
        System.out.println("without trim: " + state);
        System.out.println("with trim: " + state.trim());

        // replace -->> is replacing one character with another character

        String country = " United States and Germany ";

        country = country.replace('a', 'K');
        System.out.println("Replace: " + country);

        String country2 = " Brazil and France";
        country2 = country2.replace('r', 'O');
        System.out.println("Replace r to O in the String" + country2);

        System.out.println("--------------------------");

        // remove the $ from the String
        String num = "$18";
        num = num.replace("$", "");
        System.out.println("number without $ sign: " + num);

        String state2 = "new jersey";
        state2 = state2.replace("new", "old");
        System.out.println("change the word with a replace: " + state2);

        // replace all

        String sentence = "I am traveling from London to New York";

        // remove all the spaces
        sentence = sentence.replaceAll("\\s", "");
        System.out.println("Remove all the spaces: " + sentence);

        String number = "$18MM";
        number = number.replaceAll("[a-zA-Z]", "");
        System.out.println("Number without MM: " + number);

        String number2 = "$1800KK";
        number2 = number2.replaceAll("[^\\d.]", "");
        System.out.println("Remove all characters: " + number2);

        // substring -->> removing the chahracters from one position to other position

        String myName = "Yakup Bulut";
        myName = myName.substring(4, 9);
        System.out.println(myName);

        String myName2 = "California is good";
        System.out.println(myName2.length());

        myName2.substring(myName2.lastIndexOf("s"), myName2.length());
        System.out.println(myName2);


    }


}
