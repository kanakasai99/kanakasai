package ArrayPrograms;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class EvenLeftOddRight {
    public static void main(String[] args){
        int a[]={2, 0, 4, 0, 3, 0, 5, 0};
        int left=0; int right=a.length-1;
        while(left<right){
            if(a[left]%2==0){
                left++;
            }
            else if(a[right]%2!=0){
                right--;
            }
            else{
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(a));

    }
}