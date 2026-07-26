package stringPrograms;
import java.util.*;
public class RemovingDuplicatesForEachWord {
    public static void main(String[] args){
        String s[]="kanaka sai mereddy".split(" ");
        StringBuilder stg=new StringBuilder();
        for(String st: s){
            Set<Character> set=new LinkedHashSet<>();
            for(char c: st.toCharArray()){
                set.add(c);
            }

            System.out.println(set);
            for(char ch: set){
                stg.append(ch);
            }
            stg.append(" ");
        }
        System.out.println(stg);
    }
}
