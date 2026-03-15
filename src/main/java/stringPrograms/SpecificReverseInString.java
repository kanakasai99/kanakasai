package stringPrograms;

public class SpecificReverseInString {
    public static void main(String[] args){
        String s="!ABC$456#123";
        String rev="";
        String temp="";
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                rev=rev+ch;
            }
            else {
                if(rev.length()>0){
                    for(int j=rev.length()-1;j>=0;j--){
                        temp=temp+rev.charAt(j);
                    }
                    result=result+temp;
                    rev="";
                    temp="";
                }
                result=result+ch;
            }
        }
        for(int k=rev.length()-1;k>=0;k--){

            result=result+rev.charAt(k);
        }
        System.out.println(result);
    }
}

