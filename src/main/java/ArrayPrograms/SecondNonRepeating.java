package ArrayPrograms;

import java.util.*;

public class SecondNonRepeating {
    public static void main(String[] args) {

        int[] arr = {4, 5, 1, 2, 0, 4};

        Map<Integer, Integer> map = new LinkedHashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        // Find second non-repeating element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                count++;

                if (count == 2) {
                    System.out.println("Second Non-Repeating Element: " + entry.getKey());
                    break;
                }
            }
        }
    }
}
