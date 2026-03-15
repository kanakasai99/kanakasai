package stringPrograms;


public class EvenIndexUpperCase{
    public static void main(String[] args){
        String s[]="kanaka sai mereddy".split(" ");
        String evenResult="";
        for(String s1: s){
            String result="";
            for(int i=0;i<s1.length();i++){
                if(i%2==0){
                    result=result+Character.toUpperCase(s1.charAt(i));
                }
                else{
                    result=result+s1.charAt(i);
                }
            }
            evenResult=evenResult+result+" ";
        }
        System.out.println(evenResult);
    }
}