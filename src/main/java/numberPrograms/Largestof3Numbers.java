package numberPrograms;

import java.util.Scanner;

public class Largestof3Numbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the 1st number");
		int a= sc.nextInt();
		System.out.println("enter the 2nd number");
		int b= sc.nextInt();
		System.out.println("enter the 3rd number");
		int c= sc.nextInt();

		if(a>b && a>c) {
			System.out.println("largest number:"+a);
		}
		else if(b>a && b>c) {
			System.out.println("largest number:"+b);
		}
		else {
			System.out.println("largest number:"+c);
		}
	}

}
