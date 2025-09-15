package stringPrograms;

public class ReverseSpecificWordInString {
public static void main(String[] args) {
	String s="I love jaava programming language";
	String words[]=s.split(" ");
	String result="";
	
		for(int i=0;i<words.length;i++) {
			if(i==3) {
				String rev="";
				for(int j=words[i].length()-1;j>=0;j--) {
					rev=rev+words[i].charAt(j);
				}
				result=result+rev+" ";
			}
			else {
				result=result+words[i]+" ";
			}

		}
		System.out.println(result);
}
}
