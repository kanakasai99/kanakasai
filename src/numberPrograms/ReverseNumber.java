package numberPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		//int num=sc.nextInt();
		String num=sc.nextLine();
		//int rev=0;
		
		/*while(num !=0) {
			rev= rev*10+ num%10;
			num= num/10;
		}
System.out.println(rev);*/
		
		/*//using StringBuffer
		StringBuilder str= new StringBuilder(String.valueOf(num));
	StringBuilder rev= str.reverse();
		System.out.println(rev);*/
		
		//using StringBuilder
		/*StringBuilder str=new StringBuilder();
		
		StringBuilder rev=str.append(num);
		rev.reverse();
		System.out.println(rev);*/
		
		  StringBuilder str1=new StringBuilder(num);
		  StringBuilder revStr=str1.reverse();
		  System.out.println(revStr.toString());
		  
		
	}

}
