package stringPrograms;

public class CountMultiOccuranceInString {

    public static void main(String[] args){
        String s="kanakasaisaikanakamereddy";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(i+1 < s.length() && s.charAt(i)=='k' && s.charAt(i+1)=='a'){
                count++;
                System.out.println("count of 'ka': "+count+" "+"'k' found at index: "+i+" & "+" 'a' found at index: "+(i+1));
            }

        }

    }
}
