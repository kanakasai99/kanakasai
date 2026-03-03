package ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*Linear Search means checking each element one by one from start to end until you find the target.works for both sorted and unsorted arrays
Binary Search finds an element by repeatedly dividing the array into half.⚠️ Condition:
👉 Array must be sorted*/

public class BinarySearchWithList {
    // Online Java Compiler

        public static void main(String[] args){

            int a[] = {9,5,3,4,8,2};

            // Convert array to List<Integer>
            List<Integer> list = new ArrayList<>();
            for(int n : a){
                list.add(n);   // auto-boxing
            }
                                                                                                //*Alternative
                                                                                                //        int a[]={5,6,9,8,3,6,1};
                                                                                                //        Arrays.sort(a);
                                                                                                //       // System.out.println(Arrays.toString(a));
                                                                                                //    ArrayList<Integer> list=new ArrayList<>();
                                                                                                //    for(int li: a){
                                                                                                //        list.add(li);
                                                                                                //    }
                                                                                                //        System.out.println(list);*/

                                                                                                // Sort the list
            Collections.sort(list);

            int target = 9;
            int low = 0;
            int high = list.size() - 1;
            boolean found = false;

            while(low <= high){
                int mid = (low + high) / 2;

                if(list.get(mid) == target){
                    System.out.println("element found at index: " + mid);
                    found = true;
                    break;
                }
                else if(list.get(mid) < target){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

            if(!found){
                System.out.println("target not found");
            }
        }
    }

/*🚨 Arrays.asList() returns List<Integer>
so thats why we get  error like this
incompatible types: no instance(s) of type variable(s) T exist so that List<T> conforms to ArrayList<Integer>
🚨ArrayList<Integer> list=Arrays.asList(a); -- so it must not be like this
It should be like below
🧠List<Integer> list=Arrays.asList(a);
(If you really need ArrayList)
Wrap it inside a new ArrayList:
🧠 ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));
and also arrays should be
Integer a[]={4,5,5,5,6,} like this then only it will give with no error
 if the array is not like we need ie it is in int a[]={4,5,6,7,9,7}
🚨 VERY IMPORTANT (Interview Point)
If your array is:
int[] a = {1,2,3,4};
And you do:
Arrays.asList(a);
🚨It will NOT convert into List<Integer>
Instead, it becomes:
List<int[]>
Because int is primitive, not Integer object.
🧠 Correct Way for int[] Array
int[] a = {1,2,3,4};
List<Integer> list = new ArrayList<>();
for(int num : a){
    list.add(num);
}
*/
