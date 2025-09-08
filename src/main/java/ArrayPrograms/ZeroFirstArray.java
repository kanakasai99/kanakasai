package ArrayPrograms;

//import java.util.Arrays;

import java.util.*;
public class ZeroFirstArray{
    public static void main(String[] args){
         int[] array = {4,5,0,6,0,5,0};
         int n = array.length;     // n = 7
         int index = n - 1;        // index = 6

    for(int i=n-1;i>=0;i--){  //i=1
        if(array[i]!=0){
        array[index]=array[i];   //0  1   2 3 4 5 6
                                // 0  0   0  4  5  6 5
        index--;                //2
    }
    }
     while(index>=0){
        array[index]=0;
        index--;
    }
     System.out.println(Arrays.toString(array));
    }   
    }
