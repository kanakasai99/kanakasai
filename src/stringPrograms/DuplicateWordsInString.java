package stringPrograms;
import java.util.*;
public class DuplicateWordsInString{
    public static void main(String[] args){
        String orgString="This string is the my ultimate the my string";
        Map<String,Integer> map= new LinkedHashMap<>();
        for(String s: orgString.split(" ")){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
         else {
                map.put(s,1);
                }
            if (map.get(s) > 1) {
                System.out.println(s + ": " + map.get(s));
            }
      
           }
    }
    }
             
        
      
    