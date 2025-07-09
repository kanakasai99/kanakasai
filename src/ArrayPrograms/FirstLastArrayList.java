 package ArrayPrograms;
import java.util.*;
public class FirstLastArrayList {
	
	
	    public static void main(String[] args) {
	       ArrayList<String> myList=new ArrayList<>();
	       myList.add("Banana");
	       myList.add("Apple");
	       myList.add("Mango");
	       myList.add("Grapes");
	       if(!myList.isEmpty()){
	           String fe=myList.get(0);
	           String le=myList.get(myList.size()-1);
	           System.out.println("first element is: "+fe);
	           System.out.println("last but one element is: "+le);
	       }
	       else{
	           System.out.println("arraylist is empty");
	       }
	    
	}
}
