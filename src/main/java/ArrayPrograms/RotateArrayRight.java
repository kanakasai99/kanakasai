package ArrayPrograms;

import java.util.Arrays;

public class RotateArrayRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};     // Step 1: Original array
        int k = 3;                        // Step 2: Number of rotations

        int n = arr.length;              // Step 3: Length of array
        k = k % n;                       // Step 4: Ensure k < n to avoid unnecessary full cycles

        // Step 5: Reverse entire array
        reverse(arr, 0, n - 1);          // Now arr becomes: [5, 4, 3, 2, 1]

        // Step 6: Reverse first k elements
        reverse(arr, 0, k - 1);          // Reverse first 3 → [3, 4, 5, 2, 1]

        // Step 7: Reverse remaining elements
        reverse(arr, k, n - 1);          // Reverse last 2 → [3, 4, 5, 1, 2]

        // Step 8: Print result
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }

    // Utility method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];      // Swap arr[start] and arr[end]
            arr[start] = arr[end];
            arr[end] = temp;
            start++;                    // Move start index forward
            end--;                      // Move end index backward
        }
    }
}

