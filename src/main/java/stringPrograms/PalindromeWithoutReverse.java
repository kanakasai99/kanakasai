package stringPrograms;

import java.util.Scanner;

public class PalindromeWithoutReverse {

	public static void main(String[] args) {
	
		String str="kanak";
		 Boolean br=true;
		int length=str.length();
		 	 for(int i=0;i< length/2;i++)
		    {
			 if(str.charAt(i)!=str.charAt(str.length()-1-i))
			 {
				 br=false;
				 break;
			  }
			 }
			 if(br)
			 {
				 System.out.println("Palindrome ");
			 }
			 else
			 {
				 System.out.println("not palindrome");
			 }
		 }

	}

