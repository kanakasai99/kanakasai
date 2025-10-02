package numberPrograms;

import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the number");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not perfect number");
        }
    }
}
/*A perfect number is a positive integer that is equal to the sum of its proper divisors (divisors excluding the number itself).
* Example:

6

Divisors of 6 (excluding itself): 1, 2, 3

Sum =
1+2+3=6
✅ So, 6 is a perfect number.*/