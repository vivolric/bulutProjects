package JavaTechnoStudy.day32.nonAccessModifier.finalModifier;

public class Person {

    public String name;          // instance variable
    public final int fingerprintCode;  // instance variable

    public Person(String name, int fingerprint) {
        this.name = name;
        this.fingerprintCode = fingerprint;
    }
}
