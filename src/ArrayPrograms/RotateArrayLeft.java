package ArrayPrograms;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int n = arr.length;

        k = k % n; // in case k > n,Ensure k < n to avoid unnecessary

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse entire array
        reverse(arr, 0, n - 1);

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

