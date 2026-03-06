package numberPrograms;

import java.util.*;
public class LargestOf3NumWthOutIfelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        int a[]=new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}