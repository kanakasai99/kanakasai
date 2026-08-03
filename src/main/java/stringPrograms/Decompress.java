package stringPrograms;

public class Decompress {

        public static void main(String[] args) {

            String s = "3s4ak5i";
            String result = "";

            for (int i = 0; i < s.length(); ) {

                // Read the number
                int n = s.charAt(i) - '0';
                i++;

                // Read all letters until next digit
                String temp = "";
                while (i < s.length() && Character.isLetter(s.charAt(i))) {
                    temp += s.charAt(i);
                    i++;
                }

                // Repeat the collected string
                for (int j = 0; j < n; j++) {
                    result += temp;
                }
            }

            System.out.println(result);
        }
    }

