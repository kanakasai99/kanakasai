package numberPrograms;

import java.util.Scanner;

public class FactorialNumber {
//number that is the product of positive integers from 1 to that number 
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
    int num=sc.nextInt();
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
System.out.println("factorial of given number:"+ fact);
	}

}
