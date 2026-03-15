package numberPrograms;

import java.util.Scanner;

public class SumDigitsRecursion {
    public static int sumDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumDigits(n/10);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        System.out.println("The sum of the number is: "+sumDigits(num));
    }
}
