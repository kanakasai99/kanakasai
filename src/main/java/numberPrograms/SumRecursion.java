package numberPrograms;

import java.util.*;
public class SumRecursion{
    public static long sum(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("the sum of first n natural numbers: "+sum(num));
    }
}
