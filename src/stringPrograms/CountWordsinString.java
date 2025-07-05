package stringPrograms;

import java.util.Scanner;

public class CountWordsinString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println(s.length());
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
		if((s.charAt(i)==' ') && (s.charAt(i+1) !=' ')) {
			count++;
		}	
		}
		System.out.println(count);

	}

}
