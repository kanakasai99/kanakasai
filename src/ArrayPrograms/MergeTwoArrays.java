package ArrayPrograms;

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
        }
    }
}

