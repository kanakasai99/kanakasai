package ArrayPrograms;
import java.util.*;
public class CoomonElementsTwoArray {
	
	
	    public static void main(String[] args) {
	       int a1[]={1,8,6,4,3,5};
	      int a2[]={5,8,6,3,9,7};
	      
	    Set<Integer>  set1=new HashSet<>();
	    Set<Integer> common=new HashSet<>();
	    
	    for(int num: a1){
	        set1.add(num);
	    }
	    for(int num: a2){
	        if(set1.contains(num)){
	            common.add(num);
	        }
	    }
	    System.out.println("common elements are: "+common);
	    /*int uniqueArray[]=new int[common.size()];   
		int i=0;
		for(int num:common){
		    uniqueArray[i++]=num;
		}
		System.out.println("unique elements in array: "+Arrays.toString(uniqueArray));
		
		*//*for (int uni : common) {
    fresh[i++] = uni;
}
only works because common is declared as Set<Integer>.

This way, the compiler knows uni is an Integer and auto-unboxes it to int.

Without generics, common is just a Set of Object, and Java can’t auto-unbox Object to int — hence you’d be forced to cast.*/
		    }   
		
	    }
	

