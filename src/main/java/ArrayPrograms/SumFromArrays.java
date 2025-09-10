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
1. str.matches("\\d")

\\d = any single digit (0–9).

matches() tries to match the entire string against the regex.

✅ Example:

"2".matches("\\d")   // true
"a".matches("\\d")   // false
"12".matches("\\d")  // false (because it's 2 digits, not a single digit)


👉 Use case: check if the string is exactly one digit only.

2. str.replaceAll("\\D", "")

\\D = any non-digit.

replaceAll("\\D", "") removes all non-digits, leaving only digits behind.

✅ Example:

"a1".replaceAll("\\D", "")    // "1"
"@25x".replaceAll("\\D", "")  // "25"
"k".replaceAll("\\D", "")     // ""


👉 Use case: extract all digits from a string (can handle multi-digit numbers).

🔹 Difference in behavior
Input String	matches("\\d")	replaceAll("\\D", "")
"2"	✅ true	"2"
"12"	❌ false	"12"
"a1"	❌ false	"1"
"abc123x"	❌ false	"123"
"@"	❌ false	""

✅ So:

Use matches("\\d") when you only expect one-character digit strings.

Use replaceAll("\\D","") when strings may contain digits mixed with other characters (and possibly multiple digits).

Do you want me to show you a combined generic method that will safely sum numbers from any mix of char[] and String[] (including "12a3", "@45", etc.)?

You said:
yes
ChatGPT said:

Perfect 👍 let’s make a generic method that works with any mix of char[] and String[].

✅ Approach

Convert char[] to a String[] (since handling is easier).

For each element:

Remove all non-digits using replaceAll("\\D","").

If digits remain, parse them as integer and add to sum.

Works for:

Single-digit ("2")

Multi-digit ("123")

Mixed ("a12b", "@45")

Pure non-numeric ("abc", 'x') → ignored.

🔹 Generic Utility Method
public class SumFromArrays {

    public static int sumNumbers(String[] arr) {
        int sum = 0;
        for (String str : arr) {
            String digits = str.replaceAll("\\D", ""); // keep only digits
            if (!digits.isEmpty()) {
                sum += Integer.parseInt(digits);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        char ch[] = {'a','2','@','5'};
        String s[] = {"a1", "2", "k", "123", "@45"};

        // Convert char[] to String[]
        String chStr[] = new String[ch.length];
        for (int i = 0; i < ch.length; i++) {
            chStr[i] = String.valueOf(ch[i]);
        }

        int total = sumNumbers(chStr) + sumNumbers(s);

        System.out.println("Sum of numbers = " + total);
    }
}

🔹 Example Run

For:

char ch[] = {'a','2','@','5'};
String s[] = {"a1", "2", "k", "123", "@45"};


👉 Processing:

From ch: 'a' → ignored, '2' → 2, '@' → ignored, '5' → 5

From s: "a1" → 1, "2" → 2, "k" → ignored, "123" → 123, "@45" → 45

✅ Total = 2 + 5 + 1 + 2 + 123 + 45 = 178

⚡ This method is generic:

Works for char[], String[]

Handles mixed chars and digits

Supports multi-digit numbers

Do you also want me to extend this so it can handle negative numbers (like "a-12b")?

You said:
12@3
ChatGPT said:

Ah, now we’re getting into a tricky but interesting case 🙂

If you have a string like:

String str = "12@3";


👉 There are two possible interpretations when extracting numbers:

🔹 Option 1: Treat as separate numbers

"12@3" → "12" and "3"

Sum = 12 + 3 = 15

Code for this:

String str = "12@3";

// split by non-digits
String[] parts = str.split("\\D+");
int sum = 0;

for (String p : parts) {
    if (!p.isEmpty()) {
        sum += Integer.parseInt(p);
    }
}

System.out.println(sum); // 15

🔹 Option 2: Treat as one continuous number ignoring symbols

"12@3" → remove @ → "123"

Sum = 123

Code for this:

String str = "12@3";

// remove all non-digits
String digits = str.replaceAll("\\D", "");
int sum = 0;
if (!digits.isEmpty()) {
    sum = Integer.parseInt(digits);
}

System.out.println(sum); // 123

✅ Which one is “correct”?

It depends on your requirement:

If you think "@" is a separator, use Option 1 → result = 15.

If you think "@" should be ignored, use Option 2 → result = 123.*/