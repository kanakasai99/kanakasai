package ArrayPrograms;
import java.util.*;
public class NonRepeatedElements {
	

	
	    public static void main(String[] args) {
	        int[] array = {4, 5, 4, 6, 7, 5};

	        Map<Integer, Integer> frequencyMap = new HashMap<>();

	        // Count frequencies of each element
	        for (int num : array) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }
/*if(frequencyMap.containsKey(num){
 frequencyMap.put(num,frequencyMap.get(num)+1);
else{
frequencyMap.put(num,frequencyMap.get(num));

} }
	        System.out.print("Non-repeated elements: ");
	        for (int num : array) {
	            if (frequencyMap.get(num) == 1) {
	                System.out.print(num + " ");
	            }
	            //System.out.print("Duplicate elements: ");
*/for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
    if (entry.getValue() == 1) {
        System.out.println(entry.getKey()+"->no of times repeated : "+entry.getValue());
    }
}
	        }
	    }
	

