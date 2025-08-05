package numberPrograms;

import java.util.Scanner;

public class CountOddEvenNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		int res,even=0,odd=0;
		
		while(num>0) {
			res=num%10;
			if(res%2==0) {
				even++;
			}
			else {
				odd++;
			}
			num=num/10;
		}
System.out.println("count of even numbers:"+even);
System.out.println("count of odd numbers:"+odd);
	}

}
