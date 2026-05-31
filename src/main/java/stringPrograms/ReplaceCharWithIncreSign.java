package stringPrograms;

public class ReplaceCharWithIncreSign{
    public static void main(String[] args){
        String s="my name is mereddy";
        String result="";
        int count=0;
        int temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='e'){
                count++;
                temp=count;
                while(temp>0){
                    result=result+'#';
                    temp--;
                }
            }
            else{
                result=result+s.charAt(i);
            }
        }
        System.out.println(result);
    }
}