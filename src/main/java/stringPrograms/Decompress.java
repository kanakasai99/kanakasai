package stringPrograms;

public class Decompress {

        public static void main(String[] args) {

            String s = "3s4ak5p";
            String result = "";

            for (int i = 0; i < s.length(); ) {
                int n=0;
                // Read the number
                if(Character.isDigit(s.charAt(i))) {
                    n= s.charAt(i) - '0';
                    i++;
                }
                // Read all letters until next digit
                String temp = "";
                while (i < s.length() && Character.isLetter(s.charAt(i))) {
                    temp=temp+ s.charAt(i);
                    i++;
                }

                // Repeat the collected string
                for (int j = 0; j < n; j++) {
                    result=result + temp;
                }
            }

            System.out.println(result);
        }
    }

