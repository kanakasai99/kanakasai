package stringPrograms;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class RemoveMultiSpacesWORegex {
    public static void main(String[] args) {
        String s=" This is the   kanaka      sai mereddy  ";
        s=s.trim();
        String result ="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch != ' '){
                result=result+ch;
            }
            else{
                char ch1=s.charAt(i+1);
                if(ch1 == ' '){
                    continue;

                }
                else{
                    result=result+ch;

                }
            }
        }
        System.out.println(result);
    }
}