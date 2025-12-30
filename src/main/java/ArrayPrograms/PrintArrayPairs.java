package ArrayPrograms;

import java.util.Scanner;

public class PrintArrayPairs {
    public static void main(String[] args){
        int a[]={10,15,20,25,30,35};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int index=(n-1)*2;
        if(index<a.length){
            System.out.println(a[index]+","+a[index+1]);
        }
        else{
            System.out.println("invalid number entered");
        }
    }
}
