package stringPrograms;

public class FirstNonRepeatedCharInStringWithoutMethods {
public static void main(String[] args) {
	String s="sweisweft";
	char ch[]=s.toCharArray();
	boolean isRepeated ;
	
	for(int i=0;i<ch.length;i++) {
		isRepeated=false;
		for(int j=0;j<ch.length;j++) {
			if(i!=j && ch[i]==ch[j]) {
				isRepeated=true;
				break;
			}
		} 
		if(!isRepeated){
			System.out.println("first non rp: "+ch[i]);
			break;
		}
	}
}
}
/*import java.util.*;
class Main {
	public static void main(String[] args) {
		String s="kanaka";
		for(int i=0; i<s.length();i++){
			Boolean br=false;
			for(int j=0;j<s.length();j++){
				if(i!=j && (s.charAt(i)==s.charAt(j))){
					br=true;
					break;
				}

			}
			if(!br){
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
}*/