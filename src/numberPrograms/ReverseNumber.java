package numberPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		//int rev=0;
		
		/*while(num !=0) {
			rev= rev*10+ num%10;
			num= num/10;
		}
System.out.println(rev);*/
		
		/*//using StringBuffer
		StringBuffer str= new StringBuffer(String.valueOf(num));
	StringBuffer 	rev= str.reverse();
		System.out.println(rev);*/
		
		//using StringBuilder
		StringBuilder str=new StringBuilder();
		StringBuilder rev=str.append(num);
		rev.reverse();
		System.out.println(rev);
		
		  
		
	}

}
