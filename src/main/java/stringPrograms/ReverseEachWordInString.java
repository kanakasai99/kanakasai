package stringPrograms;

public class ReverseEachWordInString {
	    public static void main(String[] args) {
	      String s="hello Kanaka Sai";
	     String splt[]= s.split(" ");
	      String revString="";
	     for(String w: splt){
	         String revword="";
	         for(int i=w.length()-1;i>=0;i--){
	             revword=revword+w.charAt(i);
	         }
	         revString=revString+revword+" ";   
	     }
	     System.out.println(revString);    
	    }
}
/*import java.util.*;
public class EachWordReverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string"); //code language is java
       String sr= sc.nextLine();
       String[] splString=sr.split(" "); {"code","language","is","java"}
        String revString="";
      for(String  eachWord: splString)
                                                                   //for(int i=0;i<splitString.length;i++){  //code
                                                                   // String eachWord=splitString[i];
           String wordRev="";
           for(int j=0;j<eachWord.length();j++){
                wordRev=eachWord.charAt(j)+wordRev; //edoc
           }
        revString=revString+wordRev+" ";  //edoc===>egaugnal edoc===>si egaugnal edoc===>avaj si egaugnal edoc 
       }
        System.out.println(revString);
    }
}*/
