package JavaTechnoStudy.day31.instanceModifiers.privateModifier.same;

/*
private
The code is only accessible within the declared class
 */
public class Person {        // child class
    //private instance variable
    private String name;

    //private constructor
    private Person() {
        name = "Default Name";
    }

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int id;

    public String toString() {
        return "Name: " + name;
    }

    //private method
    private int getAge() {
        return 20;
    }

    public boolean checkUsernameAndPassword(String username, String password) {
        //check username and password for empty
        if (usernameNameEmpty()) {
            return false;
        }
        //check password has digits
        //check password has Uppercase letter
        //check password has Lowercase letter
        //check password has symbols
        if (passwordHasSymbols()) {
            return false;
        }

        return true;
    }

    private boolean passwordHasSymbols() {
        return false;
    }

    private boolean usernameNameEmpty() {
        return false;
    }


}
