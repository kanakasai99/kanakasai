// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package stringPrograms;
import java.util.*;
public class RemoveIntegersAndDuplicatesInString {
    public static void main(String[] args){
        String str = "01m34y n42a1m5e i33s3 7w8h89a99t10e133ve0r6 w2h3a4t5555e6ve888888888r000000000".replace(" ","");
        StringBuilder st=new StringBuilder();
        char ch[]=str.toCharArray();
        for(char c: ch){
            if(Character.isLetter(c)){
                st.append(c);
            }
        }
        System.out.println(st.toString());
        String uniString=st.toString();
        char uniChar[]=uniString.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char uni: uniChar){
            map.put(uni,map.getOrDefault(uni,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey());
            }
        }
    }
}