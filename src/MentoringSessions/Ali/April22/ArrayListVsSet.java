package MentoringSessions.Ali.April22;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayListVsSet {

     /*
        ArrayList and Set is part of collections in JAVA

        What kind of collections do you use in Java
        What is the difference between set vs ArrayList

        .. ArrayList
        Accept duplicate
        Accept multiple null values
        ArrayList I can use .get() method

        .. Set
        No duplicate
        Just one null value (except treeSet , Treeset will throw null pointer exception)
        Not able to use .get() method

     */

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(4);
        a1.add(2);
        a1.add(6);
        a1.add(1);

        LinkedHashSet<Integer> l1 = new LinkedHashSet<>();

        l1.add(4);
        l1.add(2);
        l1.add(6);
        l1.add(1);

        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(4);
        t1.add(2);
        t1.add(6);
        t1.add(1);

        System.out.println("ArrayList print: " + a1);
        System.out.println("\nLinkedHashSet print: " + l1);
        System.out.println("\nTreeSet print: " + t1);

        for (int i = 0; i < a1.size(); i++) {
            System.out.print("\n3rd print: " + a1.get(i));
//            System.out.println(l1.get(i)); //not able to write set.get() method
        }

        System.out.println("\n------------");

        for (Integer value : l1) {

            System.out.print("\n4th print: " + value);

        }


    }


}
