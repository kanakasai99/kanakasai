package numberPrograms;

import java.util.Scanner;

public class FindNthNumberInFibonacciSeriesRecursion {
    public static long calculateFibonacciSum(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return calculateFibonacciSum(n-1)+calculateFibonacciSum(n-2);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        System.out.println("The nth Fibonacci number is: "+calculateFibonacciSum(num));
    }
}
/*                F(5)
           /                  \
        F(4)                  F(3)
       /   \                 /   \
    F(3)  F(2)              F(2)  F(1)
    /  \   /  \              /  \
 F(2) F(1)F(1)F(0)         F(1)F(0)

0 1 1 2 3 5 8 13 21 34 55

*/