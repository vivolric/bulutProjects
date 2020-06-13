package MentoringSessions.Tuba.April13;

public class StringReverseWithArray {
    public static void main(String[] args) {

        // reverse the array and reverse the each element in the String array

        String[] strArray = {"Mardin", "London", "Atlanta", "Garfield"};

        for (int i = strArray.length - 1; i >= 0; i--) {  //burda her kelime sirasini tersten yaziyoruz,
            // Garfield, Atlanta, London, Mardin
            System.out.print(strArray[i] + ": ");

            char[] ch = strArray[i].toCharArray();      // converting each string to char,
            // burda ise harfi tersten siralama var, n o d n o L gibi
            for (int j = ch.length - 1; j >= 0; j--) {
                System.out.print(ch[j] + ", ");
            }
        }

        System.out.println("\n\n=======================================================================================");

        // reverse the 2 dimensional array
        // reverse the each element in the 2D String array

        String[][] twoDimenArray = {{"London", "Rome"}, {"Istanbul", "Ankara", "Bursa"}, {"Pakistan", "USA", "Mexico"}};

        // {{"Pakistan", "USA", "Mexico"}, {"Istanbul", "Ankara", "Bursa"}, {"London", "Rome"}};

        for (int i = twoDimenArray.length - 1; i >= 0; i--) {
            for (int j = twoDimenArray[i].length - 1; j >= 0; i--) {
                System.out.print(twoDimenArray[i][j] + " ");

                char[] chars = twoDimenArray[i][j].toCharArray();
                System.out.println();
                for (int k = chars.length - 1; k >= 0; k--) {
                    System.out.print(chars[k] + " ");
                }
            }
        }
    }
}
