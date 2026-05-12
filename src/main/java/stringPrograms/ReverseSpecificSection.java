package stringPrograms;

public class ReverseSpecificSection {

    public static void main(String[] args) {

        String s = "ABD123";
        String letter = "";
        String number = "";
        String reverse = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                letter = ch + letter;
            } else {
                number = ch + number;
            }
        }

        reverse = letter + number;

        System.out.println(reverse);
    }
}
