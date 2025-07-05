package numberPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		int count=0;
	/*	if(num<=0) {
			System.out.println("The number is not a prime number");
			return;
		}
for(int i=2;i<=num/2;i++) {                    //11/2=5
	if(num%i==0) {                               //11/2, 11/3,11/4,11/5
		count++;
	}
	if(count>1) {
		System.out.println("Given number is prime number");
	}
	else {
		System.out.println("Given is not a prime number");
	}
}*/
		
		if(num>0) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("prime number");
			}
			else {
				System.out.println("Not prime number");
			}
		}
		
	}

}
