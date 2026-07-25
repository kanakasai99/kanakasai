package Patterns;
import java.util.*;
public class OddNumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            int odd=1;
            int ele=2*i-1;
            for(int j=1;j<=ele;j++){

                System.out.print(odd+" ");
                odd=odd+2;
            }
            System.out.println();
        }
        int odd=1;
        /* for(int i=1;i<=num;i++){

            int ele=2*i-1;
            for(int j=1;j<=ele;j++){

                System.out.print(odd+" ");
                odd=odd+2;
            }
            System.out.println();
        }*/
    }
}
