package ArrayPrograms;

import java.util.*;
public class SelectionSort{
    public static void main(String[] args){
        int a[]={4,5,1,2,8};
        for(int i=0;i<a.length;i++){
            int index=i;
            for(int j=i+1;j<a.length-1;j++){
                if(a[j]<a[index]){
                    index=j;
                }
            }
            int temp=a[index];
            a[index]=a[i];
            a[i]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}