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
		
		*/
		    }   
		
	    }
	

