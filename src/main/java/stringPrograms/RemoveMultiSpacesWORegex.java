package stringPrograms;

public class RemoveMultiSpacesWORegex {
    public static void main(String[] args) {

        String s = " This is the   kanaka      sai mereddy  ";
        String result = "";

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Skip leading spaces
            if(result.length() == 0 && ch == ' ') {
                continue;
            }

            if(ch != ' ') {
                result = result + ch;
            }
            else {
                if(i + 1 < s.length() && s.charAt(i + 1) != ' ') {
                    result = result + ch;
                }
            }
        }
        System.out.println(result);
    }
}