package stringPrograms;

public class DecompressStringType1 {
    public static void main(String[] args){
        String s="s3a2i1";
        String s1="";
        for(int i=0;i<s.length();i++){
           if(Character.isLetter(s.charAt(i)) && i+1<s.length()){
              char ch= s.charAt(i);
              int n=s.charAt(i+1)-'0';

              for(int j=0;j<n;j++){
                  s1=s1+ch;
              }
           }
        }
        System.out.println(s1);
    }
}
