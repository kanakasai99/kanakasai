package stringPrograms;

import java.util.*;

public class Top3Prefixes {
    public static void main(String[] args) {
        String s = "kanakasaimereddymereddykanakasaisaikanaka";

        Map<String, Integer> map = new HashMap<>();

        // Count prefix occurrences
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            int count = 0;

            for (int j = 0; j <= s.length() - prefix.length(); j++) {
                if (s.substring(j, j + prefix.length()).equals(prefix)) {
                    count++;
                }
            }
            map.put(prefix, count);
        }

        // Sort by frequency descending
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Top 3 frequent prefixes:");
        for (int i = 0; i < 3 && i < list.size(); i++) {
            System.out.println(
                    list.get(i).getKey() + " -> " + list.get(i).getValue()
            );
        }
    }
}

