package ArrayPrograms;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int n = arr.length;

        k = k % n; // in case k > n,Ensure k < n to avoid unnecessary
/*reverse(a,0,n-1);  //5,4,3,2,1
              reverse(a,0,k);    //3,4,5,2,1
              reverse(a,k+1,n-1); //3,4,5,1,2
               System.out.println(Arrays.toString(a));*/
        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);     // Now arr becomes: [3, 2, 1, 4, 5]

        // Step 2: Reverse remaining elements
        reverse(arr, k, n - 1);    // Now arr becomes: [3, 2, 1, 5, 4]

        // Step 3: Reverse entire array
        reverse(arr, 0, n - 1);   // Now arr becomes: [4, 5, 1, 2, 3]

        System.out.println("Left Rotated Array: " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

/*Why while (start < end)?
The loop ensures you keep swapping pairs of elements from both ends until the two pointers meet.
Example: If array = {1, 2, 3, 4, 5}, start = 0, end = 4
Swap index 0 ↔ 4 → {5, 2, 3, 4, 1}
Swap index 1 ↔ 3 → {5, 4, 3, 2, 1}
Stop when start == end (middle element).
So the while loop is used to keep swapping until the array (or subarray) is completely reversed.*/