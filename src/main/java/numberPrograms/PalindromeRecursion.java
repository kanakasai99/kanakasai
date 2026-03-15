package numberPrograms;

import java.util.Scanner;

public class PalindromeRecursion {

    static int reverse = 0;

    public static int palindrome(int n){
        if(n == 0){
            return reverse;
        }

        int digit = n % 10;
        reverse = reverse * 10 + digit;

        return palindrome(n / 10);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int num = sc.nextInt();
        int temp = num;

        int result = palindrome(num);

        System.out.println("Reversed number: " + result);

        if(temp == result){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not palindrome number");
        }
    }
}