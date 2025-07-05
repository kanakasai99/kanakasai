package stringPrograms;

import java.util.*;
public class DuplicateChars{
    public static void main(String[] args){
        String s="Java programming language".toLowerCase().replace(" ", "");
        Map<Character,Integer> map= new LinkedHashMap<>();
        char[] ch=s.toCharArray();
        System.out.println(ch);
        for(char eachChar: ch){
        	map.put(eachChar, map.getOrDefault(eachChar, 0) + 1);
           /* if(map.containsKey(eachChar)){
                map.put(eachChar, map.get(eachChar)+1);
            }
            else{
                map.put(eachChar,1);
            }
        }
         Set<Character> charToString= map.keySet();
         for(char charac: charToString){
        if(map.get(charac)>1){
            System.out.println(charac+": "+map.get(charac));
        }
    }*/
        }
    for (char charac : map.keySet()) {
        if (map.get(charac) >1) {
            System.out.println(charac + ": " + map.get(charac));
        }
    }
    }
    }
    
