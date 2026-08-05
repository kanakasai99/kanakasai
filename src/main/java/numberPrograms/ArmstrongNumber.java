package numberPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		 int num=sc.nextInt();
		 int temp=num;
		    int res;
		    double sum=0;
		    int n=String.valueOf(temp).length();  //why can't we give temp.length //Count number of digits to use as the exponent.E.g., if input is 371, then n = 3
		/*String.valueOf(num).length();

What it does (simple explanation 👇)
String.valueOf(num)
Converts the number num into a String
Example:
num = 12345 → "12345"
.length()
Returns the number of characters in that string*/

		    while(num > 0) {
		        res = num % 10;                  // Get the last digit
		        sum = sum + Math.pow(res, n);   // Add digit^n to sum
		        num = num / 10;                 // Remove last digit
		    }

		if(temp==sum) {
			System.out.println("given number is armstrong");
		}
		else {
			System.out.println("given number is not armstrong number");
		}

	}

}
/*An Armstrong number (also known as a narcissistic number, pluperfect digital invariant (PPDI), or number of the power sum of digits) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
Easy rule to remember

For integer division:

Java removes everything after the decimal point.

Examples:

9 / 10 = 0.9  → 0
7 / 10 = 0.7  → 0
15 / 10 = 1.5 → 1
123 / 10 = 12.3 → 12
*/
