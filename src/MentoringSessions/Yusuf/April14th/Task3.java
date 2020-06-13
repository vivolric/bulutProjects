package MentoringSessions.Yusuf.April14th;

public class Task3 {
    public static void main(String[] args) {

        // Create a 2D String array
        // put the following values

        //        {"techno","study"},
        //        {"atlanta","new jersey"},
        //        {"ohio","brooklyn"},
        //        {"pittsburgh"}

        // find the average length of the strings


        String array[][] = {
                {"techno", "study", "yusuf"},
                {"atlanta", "new jersey"},
                {"ohio", "brooklyn"},
                {"pittsburgh", "topo chico"}
        };
        //neden burda fazla element ekleyince outputta sayi artmiyor ki?
        // bunu bi sor bakalim

        int sum = 0, count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j].length();
                count++;
            }
        }
        System.out.println("The average length of the strings is: " + (sum / count));
    }
}
