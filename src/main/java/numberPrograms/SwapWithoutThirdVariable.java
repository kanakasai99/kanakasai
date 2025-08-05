package numberPrograms;

import java.util.Scanner;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=sc.nextInt();
		System.out.println("Enter value of b");
		b=sc.nextInt();
		/*//a=a+b;     */           a=a*b ; //10*20=200
		/*//b=a-b; 	*/			b=a/b ; //200/20=10
		/*//a=a-b;		*/		    a=a/b; //200/10=20
		System.out.println("Value of a:"+a);
		System.out.println("Value of a:"+b);
	}

}
