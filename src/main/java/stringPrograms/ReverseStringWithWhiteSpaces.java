package stringPrograms;

public class ReverseStringWithWhiteSpaces {
	  public static void main(String[] args) {
	        String orgString = "Kanaka Sai Mereddy";
	        System.out.println("Original String: " + orgString);
	        System.out.println("Reversed String: " + reverseWithSpacesPreserved(orgString));
	    }
	    public static String reverseWithSpacesPreserved(String str) { 
	    	//no need for object instantiation
	    	/*we are using static method so that we no need to create object we can directly call the method*/
	    	//converting the string into a character array.
	        char[] arr = str.toCharArray();
	 //     System.out.println("array length:"+arr.length);
	        int left = 0, right = arr.length - 1;
	        
	        while (left < right) {
	            // Move left index to the next non-space character
	            if (arr[left] == ' ') {
	                left++;
	            }
	            // Move right index to the previous non-space character
	            else if (arr[right] == ' ') {
	                right--;
	            }
	            // Swap characters at left and right if both are non-space
	            else {
	                char temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;
	                left++;
	                right--;
	            }
	            
	            
	        }
	        return new String(arr);
	       //char array to string by creating new string , we need to return the result as string since method signature is string
	    }
	
	/*Explanation:
	This program works by converting the string into a character array.
	Two pointers (left and right) are used to scan from both ends of the string.
	If a space is encountered, the pointer moves without swapping.
	If both left and right point to non-space characters, they are swapped.
	The loop continues until both pointers cross each other.
	Example Output:

	vbnet
	Copy
	Original String: This is an example
	Reversed String: elpmaxe na si sihT*/

}
