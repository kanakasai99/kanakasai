package stringPrograms;
import java.util.*;
public class Tomorrow {
public static void main(String[] args) {
	String input="tomorrow";
	   StringBuilder output=new StringBuilder();
	     Map<Character,Integer> map= new LinkedHashMap<>();
	     for(char ch: input.toCharArray()) {
	    	 map.put(ch, map.getOrDefault(ch, 0)+1);
	     }
	     
	     for(char c:input.toCharArray()) {
	    	int count= map.get(c);
	    	if(count>1) {
	    		output.append(count);
	    	}
	    	else {
	    		output.append(c);
	    	}
	     }
	     System.out.println(output.toString());
		 /*for(Map.Entry<Character,Integer> entry:map.entrySet()){
			 if(entry.getValue()>1){
				 output.append(entry.getValue());
			 }
			 else{
				 output.append(entry.getKey());
			 }
		 }*/
	System.out.println(output.toString());
}
}
