package numberPrograms;

import java.util.*;
public class DigitSumUntilSingleDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        while(num>=10){
            int sum=0;
            while(num>0){
                sum =sum+num%10;
                num=num/10;
            }
            System.out.println("sum of numbers:"+sum);
            num=sum;
        }
    }
}
