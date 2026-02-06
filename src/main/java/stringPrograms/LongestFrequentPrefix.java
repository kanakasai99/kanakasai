package stringPrograms;
import java.util.*;

public class LongestFrequentPrefix {
    public static void main(String[] args) {
        String s = "kanakasaimereddymereddykanakasaisaikanaka";

        Map<String, Integer> map = new HashMap<>();

        // Generate all prefixes
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            int count = 0;

            for (int j = 0; j <= s.length() - prefix.length(); j++) {
                if (s.substring(j, j + prefix.length()).equals(prefix)) {
                    count++;
                }
            }

            if (count > 1) {
                map.put(prefix, count);
            }
        }

        String result = "";
        int maxFreq = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String prefix = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq ||
                    (freq == maxFreq && prefix.length() > result.length())) {
                maxFreq = freq;
                result = prefix;
            }
        }

        System.out.println("Longest prefix with highest frequency: " + result);
        System.out.println("Frequency: " + maxFreq);
    }
}

