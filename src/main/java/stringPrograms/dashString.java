package stringPrograms;

public class dashString {
    public static void main(String[] args) {
        String s = "My name is so and so";


        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                result=result+"-";
            }
            else{
                result=result+s.charAt(i);
            }
        }
        System.out.println(result);
    }
}