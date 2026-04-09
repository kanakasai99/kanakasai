package stringPrograms;

import java.util.*;

public class LastRepeatingChar {
    public static void main(String[] args) {
        String s = "programming";

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = s.length()-1; i >= 0; i--){
            if(map.get(s.charAt(i)) > 1){
                System.out.println("Last repeating character: " + s.charAt(i));
                break;
            }
        }
    }
}