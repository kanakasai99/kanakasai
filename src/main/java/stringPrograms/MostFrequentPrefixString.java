package stringPrograms;

public class MostFrequentPrefixString {
    public static void main(String[] args) {
        String s = "kanakasaimereddymereddykanakasaisaikanaka";

        String mostFrequentPrefix = "";
        int maxCount = 0;

        // generate all prefixes
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            int count = 0;

            // count occurrences of prefix
            for (int j = 0; j <= s.length() - prefix.length(); j++) {
                if (s.substring(j, j + prefix.length()).equals(prefix)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequentPrefix = prefix;
            }
        }

        System.out.println("Most frequent prefix: " + mostFrequentPrefix);
        System.out.println("Frequency: " + maxCount);
    }
}

