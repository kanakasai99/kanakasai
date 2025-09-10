package ArrayPrograms;

public class SumFromArrays {
    public static void main(String[] args) {
        char ch[] = {'a','2','@'};
        String s[] = {"a", "2", "k"};

        int sum = 0;

        // --- From char array ---
        for (char c : ch) {
            if (Character.isDigit(c)) {  // check if it’s a number
                sum += Character.getNumericValue(c);
            }
        }

        // --- From String array ---
        for (String str : s) {
            if (str.matches("\\d")) {    // check if single-digit number
                sum += Integer.parseInt(str);
            }
        }

        System.out.println("Sum of numbers = " + sum);
    }
}

/*public class SumFromArrays {
    public static void main(String[] args) {
        String ch[] = {"a", "2", "@2"};
        String s[]  = {"a1", "2", "k"};

        int sum = 0;

        // --- From first String array (ch) ---
        for (String str : ch) {
            String digits = str.replaceAll("\\D", ""); // remove non-digits
            if (!digits.isEmpty()) {
                sum += Integer.parseInt(digits);
            }
        }

        // --- From second String array (s) ---
        for (String str : s) {
            String digits = str.replaceAll("\\D", "");
            if (!digits.isEmpty()) {
                sum += Integer.parseInt(digits);
            }
        }

        System.out.println("Sum of numbers = " + sum);
    }
}
*/