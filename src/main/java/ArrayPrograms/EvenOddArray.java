package ArrayPrograms;

import java.util.ArrayList;

public class EvenOddArray {

    public static void main(String[] args) {
        
        int[] a = {1, 2, 5, 6, 9, 8, 3};

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenNumbers.add(a[i]);
            } else {
                oddNumbers.add(a[i]);
            }
        }

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Count of even numbers: " + evenNumbers.size());
        System.out.println("Count of odd numbers: " + oddNumbers.size());
    }
}
