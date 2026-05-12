package stringPrograms;

public class ReverseSpecificSectionNativeMethods {

    public static void main(String[] args) {

        String s = "ABD123";

        char ch[] = s.toCharArray();

        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char c : ch) {

            if (Character.isLetter(c)) {
                letters.append(c);
            } else {
                numbers.append(c);
            }
        }

        String revLetters = letters.reverse().toString();
        String revNumbers = numbers.reverse().toString();

        String rev = revLetters + revNumbers;

        System.out.println(rev);
    }
}
