package numberPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int original=num;
		int rev=0;
		
		while(num !=0)
		{
			rev=rev*10+num%10;  //0+1=1   10+2=12  120+2=122   1220+1=1221   rev=1221
			num=num/10;               //122        12              1                     0
		}
if(original==rev) {
	System.out.println("the number is palindrome");
}
else {
	System.out.println("the number is not palindrome");
}
	}

}
