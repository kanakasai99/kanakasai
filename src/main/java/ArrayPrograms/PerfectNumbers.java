package ArrayPrograms;

import java.util.*;
public class PerfectNumbers {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        List<Integer> perfectNumbers=new LinkedList<>();
        for(int num: a){
            int sum=0;
            for(int i=1;i<num;i++){
                if(num%i==0){
                    sum=sum+i;
                }
            }
            if(sum==num){
                perfectNumbers.add(num);
            }
        }
        System.out.println("perfect numbers: "+perfectNumbers);
    }
}