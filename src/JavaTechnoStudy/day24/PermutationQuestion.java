package JavaTechnoStudy.day24;

public class PermutationQuestion {

    //Given a string str, the task is to print all the permutations of str.
    //A permutation is an arrangement of all or part of a set of objects, with regard to the order of the arrangement.
    //For instance, the words ‘bat’ and ‘tab’ represents two distinct permutation (or arrangements) of a similar three letter word.
    //
    //Examples:
    //
    //Input: str = “abc”
    //Output: abc acb bac bca cba cab

    static void printPermutation(String str, String str1)
    {
        if (str.length() == 0) {
            System.out.print(str1 + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String str2 = str.substring(0, i) +
                    str.substring(i + 1);

            printPermutation(str2, str1 + ch);
        }
    }

    public static void main(String[] args)
    {
        String s = "abb";
        printPermutation(s, "");
    }
}
