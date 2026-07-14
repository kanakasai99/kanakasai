package ArrayPrograms;

import java.util.*;

public class SecondMostFrequent {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4};

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        int secondMax = 0;
        int mostElement = 0;
        int secondMostElement = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > max) {
                secondMax = max;
                secondMostElement = mostElement;

                max = entry.getValue();
                mostElement = entry.getKey();
            } else if (entry.getValue() > secondMax && entry.getValue() < max) {
                secondMax = entry.getValue();
                secondMostElement = entry.getKey();
            }
        }

        System.out.println("Most Frequent Element: " + mostElement);
        System.out.println("Second Most Frequent Element: " + secondMostElement);
    }
}