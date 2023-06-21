package JavaStudy.Coures2.part2.GenericTest.PairGenericTest;

import java.util.HashMap;
import java.util.Map;

public class PairGeneric {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("hello", 1);

        System.out.println("key: " + pair.getKey());
        System.out.println("value: " + pair.getValue());

        // 검색을 빠르게 할수있는 자료구조(HashMap, Hashtable)
        Map<String, Integer> maps = new HashMap<>();

        maps.put("kor",60);
        maps.put("eng", 80);
        maps.put("mat", 90);

        System.out.println(maps.get("kor"));
        System.out.println(maps.get("eng"));
        System.out.println(maps.get("mat"));


    }
}
