package stringPrograms;

public class ReverseStringWords {

	    public static void main(String[] args) {
	        String s = "I Love Java";

	        // Split the string into words using space as delimiter
	        String[] s1 = s.split("\\s");
	       // String[] s1 = s.split(" ");
	        // Print the words in reverse order
	        for (int i = s1.length - 1; i >= 0; i--) {
	            System.out.print(s1[i] + " ");
	        }
	    }
	}


