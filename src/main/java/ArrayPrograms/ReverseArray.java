package ArrayPrograms;

import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        int index=0;
        int a[]={1,2,3,4,5,6};
        int rev[]=new int[a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--){

            rev[j]=a[i];
            j++;

        }
        System.out.println(Arrays.toString(rev));
    }
}