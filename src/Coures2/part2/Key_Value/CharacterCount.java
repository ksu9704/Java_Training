package Coures2.part2.Key_Value;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {

        String str = "Hello, World";
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] setArray = str.toCharArray();

        for (char c : setArray){
            if (charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println("Character Count");
        for (char c : charCountMap.keySet()){
            System.out.println(c + ":" + charCountMap.get(c));
        }

    }
}
