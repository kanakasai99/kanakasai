package stringPrograms;

public class CountMultiOccuranceInString {

    public static void main(String[] args) {

        String s = "kanakasaisaikanakamereddy";
        int count = 0;

        for(int i = 0; i < s.length() - 1; i++) {

            if(s.charAt(i) == 'k' && s.charAt(i+1) == 'a') {
                count++;
                System.out.println("'k' found at index: " + i +
                        " & 'a' found at index: " + (i+1));
            }
        }

        System.out.println("Count of 'ka' : " + count);
    }
}