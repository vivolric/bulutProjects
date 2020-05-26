package JavaTechnoStudy.day32.nonAccessModifier.finalModifier;

/*
final
Attributes and methods cannot be overridden/modified

 */
public class JavaFinalModifier {

    private final int number;

    public JavaFinalModifier(int number) {  //instance method - constructor
        this.number = number;
    }


    public static void main(String[] args) {
        JavaFinalModifier jfm = new JavaFinalModifier(10);
        // cannot change final field
        // jfm.number = 10;
    }

}
