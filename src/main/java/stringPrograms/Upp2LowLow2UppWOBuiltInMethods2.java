package stringPrograms;

public class Upp2LowLow2UppWOBuiltInMethods2 {
    public static void main(String[] args) {
        String s1 = "sai";
        String result = "";

            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);   // ch = (char) (ch + 32);->converting upper to lower
                }
                result = result + ch;
            }
        System.out.println(result);

        }

    }


