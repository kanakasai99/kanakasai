package stringPrograms;

public class AllSubStrings {
    public static void main(String[] args) {
        String str = "kanaka";
        int n = str.length();

        System.out.println("All substrings of \"" + str + "\" are:");
        					/*   for (int i = 0; i < n; i++) {
            							// StringBuilder to build substrings
            							StringBuilder sb = new StringBuilder();

            								// Inner loop for ending index
            								for (int j = i; j < n; j++) {
                						sb.append(str.charAt(j)); // Add one character at a time
                									System.out.println(sb.toString()); // Print the current substring
            																			}*/
        // Outer loop for starting index
        for (int i = 0; i < n; i++) {
            String temp = ""; // Start with empty string

            // Inner loop for building substrings manually
            for (int j = i; j < n; j++) {
                temp = temp + str.charAt(j); // Add one character at a time
                System.out.println(temp);    // Print the current substring
            }
        }
    }
}
