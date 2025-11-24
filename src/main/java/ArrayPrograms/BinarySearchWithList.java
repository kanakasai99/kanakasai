package ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchWithList {
    // Online Java Compiler

        public static void main(String[] args){

            int a[] = {9,5,3,4,8,2};

            // Convert array to List<Integer>
            List<Integer> list = new ArrayList<>();
            for(int n : a){
                list.add(n);   // auto-boxing
            }

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


