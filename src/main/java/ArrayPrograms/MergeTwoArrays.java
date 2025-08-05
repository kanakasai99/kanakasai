package ArrayPrograms;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {5, 1, 9};
        int[] arr2 = {8, 3, 2};

        // Step 1: Merge arrays
        int[] mergedArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }

        // Step 2: Sort using Bubble Sort
        for (int i = 0; i < mergedArray.length - 1; i++) {
            for (int j = 0; j < mergedArray.length - 1 ; j++) {
                if (mergedArray[j] > mergedArray[j + 1]) {
                    // Swap
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = temp;
                }
            }
        }

        // Step 3: Print sorted merged array
        System.out.print("Merged and Sorted Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
           // System.out.println(Arrays.toString(mergedArray));
        }
    }
}
/*// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
int a[]={5,8,1,3,8};
int b[]={2,4,6};

int merge[]=new int[a.length+b.length];

for(int i=0;i<a.length;i++){
    merge[i]=a[i];
}

for(int j=0;j<b.length;j++){
    merge[a.length+j]=b[j];
}
for(int p=0;p<merge.length-1;p++){
for(int k=0;k<merge.length-1;k++){
    if(merge[k]>merge[k+1]){
        int temp=merge[k];
        merge[k]=merge[k+1];
        merge[k+1]=temp;
    }
}
}

System.out.println(Arrays.toString(merge));
Set<Integer> set= new LinkedHashSet<>();
for(int num: merge){
    set.add(num);
}
System.out.println("After removing duplicates in merged array: "+set);

int unique[]=new int[set.size()];
int i=0;
for(int uni: set){
    unique[i++]=uni;
}
System.out.println(Arrays.toString(unique));


}
}
*/
