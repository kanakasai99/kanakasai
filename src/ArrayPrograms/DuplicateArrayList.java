package ArrayPrograms;
import java.util.*;

public class DuplicateArrayList {
	
	    public static void main(String[] args) {
	      List<Integer> myList=new ArrayList<>();
	      myList.add(0);
	      myList.add(1);
	      myList.add(1);
	      myList.add(3);
	      myList.add(0);
	      myList.add(3);
	      myList.add(0);
	      
	      System.out.println(myList);
	      Set<Integer> myNewSet=new LinkedHashSet<>(myList);
	      
	     List<Integer> uniqueList=new LinkedList<>(myNewSet);
	     System.out.println(uniqueList);
	    
	}
}
