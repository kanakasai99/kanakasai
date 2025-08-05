package stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=sc.nextLine().replace("//s","").toLowerCase();
		System.out.println("enter the second string");
		String s2=sc.nextLine().replace("//s","").toLowerCase();
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {

			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}
		

}
