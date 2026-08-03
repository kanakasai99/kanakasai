package stringPrograms;

public class DecompressStringType2 {
    public static void main(String[] args){
        String s="3s4a5i";
        String s1="";
        for(int i=0;i<s.length();i++){
           if(Character.isDigit(s.charAt(i))&& i+1<s.length()){
               int n=s.charAt(i)-'0';
               char ch= s.charAt(i+1);

               for(int j=0;j<n;j++){
                   s1=s1+ch;
              }

           }
        }
        System.out.println(s1);
    }
}
