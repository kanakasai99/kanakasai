package stringPrograms;

public class RemovingDuplicatesInStringWithIndex{
    public static void main(String[] args){
        String s="kanakasaimereddy";
        String result="";
        for(int i=0;i<s.length();i++){
            if(result.indexOf(s.charAt(i))==-1){
                result=result+s.charAt(i);
            }
        }
        System.out.println(result);
    }
}