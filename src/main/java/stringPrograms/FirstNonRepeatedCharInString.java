package stringPrograms;

import java.util.*;
import java.util.Map.Entry;
public class FirstNonRepeatedCharInString{
    public static void main(String[] args){
        String s="java programming jlanguage".toLowerCase().replace(" ", "");
        Map<Character,Integer> map= new LinkedHashMap<>();
        char[] ch=s.toCharArray();
        //System.out.println(ch);
        for(char eachChar: ch){
        	map.put(eachChar, map.getOrDefault(eachChar, 0) + 1);
        }
for(Entry<Character,Integer> entry : map.entrySet()) {
	if(entry.getValue()==1) {
		System.out.println("First non repeated value is: "+entry.getKey());
		break;
	}
}
 
    }
    }
    
    
