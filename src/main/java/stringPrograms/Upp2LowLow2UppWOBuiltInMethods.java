package stringPrograms;

public class Upp2LowLow2UppWOBuiltInMethods {
    public static void main(String[] args) {
        String s[] = "sai mereddy".split(" ");
        String result = "";
        for (String s1 : s) {
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);   // ch = (char) (ch + 32);
                }
                result = result + ch;
            }
            result = result +" ";

        }
        System.out.println(result);
    }

}
