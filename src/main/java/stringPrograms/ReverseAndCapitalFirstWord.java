package stringPrograms;

public class ReverseAndCapitalFirstWord{
    public static void main(String[] args){
        String s[]="my name is Rockstar and i am from Jupiter".split(" ");
        String rev="";
        for(String st : s){
            String revWord="";
            for(int i=st.length()-1;i>=0;i--){
                revWord=revWord+st.charAt(i);
            }
            rev=rev+revWord+" ";
        }
        System.out.println(rev);
        String caps[]=rev.split(" ");
        StringBuilder str= new StringBuilder();
        for(String cap : caps){

            str.append(Character.toUpperCase(cap.charAt(0))).append(cap.substring(1)).append(" ");
        }
        System.out.println(str.toString());
    }
}
