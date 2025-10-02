package ArrayPrograms;

import java.util.Arrays;

public class BinarySearch {
public static void main(String[] args) {
	//binary search Works only on sorted arrays
	//Arrays.sort(arr); // Sort the array first
int[] arr = {10, 12, 23, 34, 45, 67, 89}; // sorted array
int target = 67;

int low = 0, high = arr.length - 1;  
    boolean found = false;
    while (low <= high) {  
        int mid = (low + high) / 2;  

        if (arr[mid] == target) {  
            System.out.println("Element found at index: " + mid);  
            found = true;  
            break;  
        } else if (arr[mid] < target) {  
            low = mid + 1;  
        } else {
            high = mid - 1;  
        }  
    }  

    if (!found) {  
        System.out.println("Element not found.");  
    }  
}

} 
