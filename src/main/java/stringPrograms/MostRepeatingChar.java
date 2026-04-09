package stringPrograms;

import java.util.*;

public class MostRepeatingChar {
    public static void main(String[] args) {
        String s = "programming";

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find max
        char maxChar = ' ';
        int maxCount = 0;

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Most repeating character: " + maxChar);
        System.out.println("Count: " + maxCount);
    }
}