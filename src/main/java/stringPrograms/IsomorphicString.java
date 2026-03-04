package stringPrograms;
import java.util.*;
public class IsomorphicString {
    public static void main(String[] args){
        String s1="sas";
        String s2="kak";
        Boolean br=false;
        for(int i=0;i<s1.length();i++){
            if(s1.indexOf(s1.charAt(i)) != s2.indexOf(s2.charAt(i))){
                br=true;
                break;
            }
        }
        if(!br){
            System.out.println("Isomorphic");
        }
        else{
            System.out.println("Not Isomorphic");
        }
    }
}
/*Isomorphic means each character maps to only one character and both string must have same length
* sas-> kak
* 012   012  index numbers represents here
* 010   010  -> this represents indexOf, even though for index 3 there are vaues also those repeated values also , so the indexof will pick index 1
*
* sai-> ksm
* 012   012
* 012   012
* */