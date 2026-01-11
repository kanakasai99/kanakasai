package ArrayPrograms;
import java.util.*;
public class MoveNegativesLeft {
	  public static void main(String[] args) {
	        int[] arr = {12, -7, 5, -3, 9, -1, 4, -2};

	        int left = 0, right = arr.length - 1;

	        while (left < right) {
	            // If left is negative, move forward
	            if (arr[left] < 0) {   //arr[left]>=0--> if we want negative at right
	                left++;
	            }
	            // If right is positive, move backward

	            else if (arr[right] >= 0) {  //arr[right]<0
	                right--;
	            }
	            // Swap when left is positive and right is negative
	            else {
	                int temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;
	                left++;
	                right--;
	            }
	        }
	        System.out.println("Rearranged Array: " + Arrays.toString(arr));
	    }


	}


