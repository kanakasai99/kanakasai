package stringPrograms;

import java.util.*;
public class RemovingDuplicatesInString{
    public static void main(String[] args){
        String s="kanakasaimereddy";
        String result="";
        Set<Character> set=new LinkedHashSet<>();
        for(char c :s.toCharArray()){
            set.add(c);
        }
        for(char ch: set){
            result=result+ch;
        }
        System.out.println(result);
    }
}
