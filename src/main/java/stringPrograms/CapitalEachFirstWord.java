package stringPrograms;

public class CapitalEachFirstWord{
    public static void main(String[] args){
        String s="java is a programming language";
         String words[]=s.split(" ");
         StringBuilder newWord= new StringBuilder();
         for(String word: words){
             if(!word.isEmpty()){
             newWord.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
             //word.substring(1) gets the rest of the word (from index 1 to end).
             //This part remains unchanged (still lowercase).
         }
         }
         System.out.println(newWord.toString().trim());
    }
}
