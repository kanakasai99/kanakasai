package stringPrograms;
import java.util.*;

public class MostFrequentPrefixStringArray {

    public static void main(String[] args) {
        String[] words = {"apple", "app", "application", "apply", "apt", "banana", "bat"};

        // Map to store frequency of each prefix
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            StringBuilder prefix = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                prefix.append(word.charAt(i));
                String currentPrefix = prefix.toString();
                map.put(currentPrefix, map.getOrDefault(currentPrefix, 0) + 1);
            }
        }
/*Let’s say word = "app"

Iteration 1: prefix = "a" → map: "a" → 1"
Iteration 2: prefix = "ap" → map: "ap" → 1"
Iteration 3: prefix = "app" → map: "app" → 1"*/
        
        // Find the most frequent prefix
        String mostFrequentPrefix = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentPrefix = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Most Frequent Prefix: " + mostFrequentPrefix);
        System.out.println("Frequency: " + maxCount);
    }
}

