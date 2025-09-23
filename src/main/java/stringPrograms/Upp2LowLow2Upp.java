package stringPrograms;

public class Upp2LowLow2Upp {
    public static void main(String[] args) {
        String s="TataConsultancyServices";
        StringBuilder result=new StringBuilder();
        for( char ch: s.toCharArray()){
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }
            else{
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
/*So:
For string → use .toLowerCase() or .toUpperCase()
For character → use Character.toLowerCase(char) or Character.toUpperCase(char)
*/