package stringPrograms;

import java.util.*;
import java.util.Map.Entry;
public class SecondNonRepeatedCharInString{
    public static void main(String[] args){
        String s="java programming jlanguage".toLowerCase().replace(" ", "");
        Map<Character,Integer> map= new LinkedHashMap<>();
        char[] ch=s.toCharArray();
        //System.out.println(ch);
        for(char eachChar: ch){
            map.put(eachChar, map.getOrDefault(eachChar, 0) + 1);
        }
        int count=0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            if(entry.getValue()==1) {
                count++;
                if (count == 2) {
                    System.out.println("Second non repeated value is: " + entry.getKey());
                    break;
                }
            }
        }

    }
}
