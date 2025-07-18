package stringPrograms;
import java.util.*;
public class abbcbacddcccddd {
	
	    public static void main(String[] args){
	        String s = "abbcbacddcccddd";
	        Map<Character,Integer> map=new LinkedHashMap<>();
	        for(char c: s.toCharArray()){
	            map.put(c,map.getOrDefault(c,0)+1);
	        }
	        StringBuilder result=new StringBuilder();
	        for(Map.Entry<Character,Integer> entry: map.entrySet()){
	            result.append(entry.getKey()).append(entry.getValue());
	        }
	        System.out.println(result);
	        /*  StringBuilder result=new StringBuilder();
	       for(char ch :map.keySet()){
	           if(map.get(ch)>1){
	               result.append(ch).append(map.get(ch));
	           }
	       }
	       System.out.println(result.toString());*/
	    }
	}

