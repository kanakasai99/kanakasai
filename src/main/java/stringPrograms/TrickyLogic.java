package stringPrograms;

public class TrickyLogic {
    public static void main(String[] args){
        String s="2[a]3[ks]";
        int n=0;
        String s1="";
        String s2="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                n=Character.getNumericValue(ch);
            }
            else if(Character.isLetter(ch)){
               s1=s1+ch;
            }
            else if(ch==']'){
               for(int j=0;j<n;j++){
                   s2=s2+s1;
               }
               s1="";
            }
        }
        System.out.println(s2);
    }
}
