package stringPrograms;

public class CountCharsWOMethods {
    public static void main(String[] args) {

        String str = "apple";
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            boolean alreadyPrinted = false;

            // Check if character appeared before
            for (int k = 0; k < i; k++) {
                if (ch[i] == ch[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted)
                continue;

            int count = 0;

            // Count frequency
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }

            System.out.println(ch[i] + " = " + count);
        }
    }
}
