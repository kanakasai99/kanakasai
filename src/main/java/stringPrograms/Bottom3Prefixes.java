package stringPrograms;

import java.util.*;

public class Bottom3Prefixes {
    public static void main(String[] args) {

        String s = "kanakasaimereddymereddykanakasaisaikanaka";

        // Step 1: Store prefix and its frequency
        Map<String, Integer> map = new HashMap<>();

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

        // Step 2: Convert map to list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Step 3: Manual sorting (ASCENDING by frequency)
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).getValue() > list.get(j).getValue()) {

                    Map.Entry<String, Integer> temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        // Step 4: Print bottom 3 least frequent prefixes
        System.out.println("Bottom 3 least frequent prefixes:");
        for (int i = 0; i < 3 && i < list.size(); i++) {
            System.out.println(
                    list.get(i).getKey() + " -> " + list.get(i).getValue()
            );
        }
    }
}

