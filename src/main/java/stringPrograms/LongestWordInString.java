package stringPrograms;

public class LongestWordInString {
public static void main(String[] args) {
	String s="I am a passionate software tester";
	//String s1=s.toLowerCase();
	String words[]=s.split(" ");
	String longestWord="";
	for(String word: words) {
		if(word.length()>longestWord.length()) {
			longestWord=word;
		}
	}
	System.out.println("Longest word : "+longestWord);
	
	
}
}
