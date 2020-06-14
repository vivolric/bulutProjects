package MentoringSessions.Ali.April22;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetDifference {

    /*

        Difference between sets

        HashSet LinkedHashSet TreeSet

        1) Ordering difference

        HashSet
             Print(return) randomly

        LinkedHashSet
            Print insertion order  or entered order

        TreeSet
            Print Alphabetical order , Number from smaller to bigger

        2) Performance difference
        HashSet > TreeSet > LinkedHashSet
        en hizlidan en yavasa gore bu performans

     */

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();  //randomly, rastgele siralama yapiyor

        hashSet.add("Lion");
        hashSet.add("Elephant");
        hashSet.add("Tiger");
        hashSet.add("Giraffe");
        hashSet.add("Zebra");
        hashSet.add("Leopard");

        System.out.println("hashSet -->> " + hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(); // Print insertion order  or entered order

        linkedHashSet.add("Lion");
        linkedHashSet.add("Elephant");
        linkedHashSet.add("Tiger");
        linkedHashSet.add("Giraffe");
        linkedHashSet.add("Zebra");
        linkedHashSet.add("Leopard");

        System.out.println("\nlinkedHashSet  -->> " + linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();   // alfabetik veya numerik siralama yapar

        treeSet.add("Lion");
        treeSet.add("Elephant");
        treeSet.add("Tiger");
        treeSet.add("Giraffe");
        treeSet.add("Zebra");
        treeSet.add("Leopard");

        System.out.println("\ntreeSet -->> " + treeSet);


    }

}

