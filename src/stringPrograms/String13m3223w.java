package stringPrograms;

import java.util.*;
public class String13m3223w{
    public static void main(String[] args){
        String input="tomorrow";
        Map<Character, Character> map=new LinkedHashMap<>();
        map.put('t','1');
        map.put('o','3');
        map.put('r','2');
        
        StringBuilder output=new StringBuilder();
        for(char ch: input.toCharArray()){
            if(map.containsKey(ch)){
                output.append(map.get(ch));
            }
            else{
                output.append(ch);
            }
        }
     System.out.println(output.toString());   
    }   
}