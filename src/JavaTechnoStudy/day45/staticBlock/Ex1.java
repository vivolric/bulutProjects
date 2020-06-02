package JavaTechnoStudy.day45.staticBlock;

public class Ex1 {

    static {
        print();
    }

    public static void print() {
        System.out.println("Hello");
    }

public Ex1 (String str){
    System.out.println("Hello from default method");

}
    public Ex1 (String name, int age){
        System.out.println((name + " " + age));
    }

    public static void main(String[] args) {
        System.out.println("Hello from main");

        new Ex1("albayim");
        new Ex1("ne olacak bu isler boyle", 25);

    }

}
