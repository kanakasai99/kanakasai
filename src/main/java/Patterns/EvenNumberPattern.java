package Patterns;

import java.util.*;
public class EvenNumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
       /* for(int i=1;i<=num;i++){
            int even=2;
            int ele=2*(i-1);
            for(int j=0;j<=ele;j++){

                System.out.print(even+" ");
                even=even+2;
            }
            System.out.println();
        }*/
        int even=2;
        for(int i=1;i<=num;i++){

            int ele=2*(i-1);
            for(int j=0;j<=ele;j++){

                System.out.print(even+" ");
                even=even+2;
            }
            System.out.println();
        }
    }
}
