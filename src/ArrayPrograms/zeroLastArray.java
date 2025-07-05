package ArrayPrograms;

import java.util.*;
public class zeroLastArray{
 public static void main(String[] args){
      int[] array = {4,5,0,6,0,5,0};
      int index=0;
      for(int i=0;i<array.length;i++){  //i=6
          
          if(array[i]!=0){
              array[index]=array[i];  //4.5.6.5.?.?.?
              index++;                //index=4
          }
      }
      
      while(index<array.length){
          array[index]=0;
          index++;
      }
      System.out.println(Arrays.toString(array));
 }
}
