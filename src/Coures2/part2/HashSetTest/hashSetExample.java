package Coures2.part2.HashSetTest;

import java.util.HashSet;
import java.util.Set;

public class hashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        System.out.println(set.size());

        for (String element : set){
            System.out.println(element);
        }

        System.out.println("");

        set.remove("Banana");
        for(String element : set){
            System.out.println(element);
        }

        System.out.println("");

        boolean contains = set.contains("Cherry");
        System.out.println(contains);

        System.out.println("");

        set.clear();
        boolean empty = set.isEmpty();
        System.out.println("Set is empty? => "+ empty);

    }
}
