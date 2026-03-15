package stringPrograms;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class ReverseStringWithOutChangingIndex{

    public static void main(String[] args){
        String s="ABC&%#123@!";
        char a[]=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(a[left])){
                left++;
            }
            else if(!Character.isLetterOrDigit(a[right])){
                right--;
            }
            else{
                char ch=a[left];
                a[left]=a[right];
                a[right]=ch;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(a));

    }
}