package ArrayPrograms;

import java.util.*;
public class FindingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        missed(sc.nextInt());
    }
    public static void missed(int num){
        boolean br =false;
        int a[]={4,5,8,9,-7};
        for(int i=0;i<a.length;i++){
            if(a[i]==num){
                br=true;
                System.out.println("number is present");
                break;
            }
        }
        if(!br){
            System.out.println("number is not present");
        }
    }
}
