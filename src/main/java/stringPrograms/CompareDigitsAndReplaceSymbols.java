package stringPrograms;

public class CompareDigitsAndReplaceSymbols {
    public static void main(String[] args){
        int num=58423664;
        String s=String.valueOf(num);
        String result="";
        for(int i=0;i<s.length()-1;i++){
            char a= s.charAt(i);
            char b=s.charAt(i+1);

            if(a>b){
                result=result+">";
            }
            else if(a<b){
                result=result+"<";
            }
            else{
                result=result+"=";
            }
        }
        System.out.println(result);
    }
}
