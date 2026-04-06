
package stringPrograms;
import java.util.*;
public class AnagramSubstring {
    public static void main(String[] args){
        String s1="programming";
        String s2="marg";

        char ch1[]=s2.toCharArray();
        Arrays.sort(ch1);

        for(int i=0;i<=s1.length()-s2.length();i++){
          String sub=s1.substring(i,i+s2.length());
          char ch2[]=sub.toCharArray();
          Arrays.sort(ch2);
          if(Arrays.equals(ch1,ch2)){
              System.out.println("Anagram");
               break;
          }
          else{

              System.out.println("not anagram");
          }
        }

    }

}
