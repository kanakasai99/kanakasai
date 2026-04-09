package stringPrograms;

public class DotString {
    public static void main(String[] args) {

        String input = "this is sunny day";

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            // For all words except last
            if (i < words.length - 1) {
                result.append(words[i].charAt(0)).append(".");
            }
            // Last word
            else {
                result.append(words[i]);
            }
        }

        System.out.println(result.toString());
    }
}