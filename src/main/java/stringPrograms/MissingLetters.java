package stringPrograms;
import java.util.*;
public class MissingLetters {
    public static void main(String[] args){
        String s="abcdefghijklmnopqrstuvwxyz";
        String input="Kanaka sai mereddy".toLowerCase().replace(" ","");
        Set<Character> set1=new LinkedHashSet<>();
        Set<Character> inputSet=new LinkedHashSet<>();
        for(Character c: s.toCharArray()){
            set1.add(c);
        }
        for(Character c1: input.toCharArray()){
           inputSet.add(c1);
        }

        set1.removeAll(inputSet);

        System.out.println("Missing character in the string are :"+set1);
    }
}
