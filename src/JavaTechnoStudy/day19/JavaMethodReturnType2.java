package JavaTechnoStudy.day19;

public class JavaMethodReturnType2 {
//Michael Jackson
    //initials: M. J.


    public static void main(String[] args) {
        String firstName = "Michael";
        String lastName = "Jackson";

        System.out.println(initial(firstName) + initial(lastName));
        System.out.println(initial("Furkat") + initial("Ali"));
        System.out.println(initial("Yusuf") + initial("Esenboga"));
    }

    private static String initial(String name){
    // method type is String, name is initial, parameter is String name is name

        return name.charAt(0) + ".";
    }
}
