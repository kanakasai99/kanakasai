package numberPrograms;

import java.util.Scanner;

public class SwapUsingThirdVariable {
	public static void main(String[] args) {
		int a,b ,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a:");
		 a=sc.nextInt();
		 System.out.println("enter value of a:");
	     b=sc.nextInt();
	     c=a;                              //c=10  //C=A+B;
	     a=b;                             //a=20   //B=C-B
	     b=c;                             //b=10   //A=C-B
	System.out.println("value of a:"+a);
	System.out.println("value of b:"+b);
	}
}
