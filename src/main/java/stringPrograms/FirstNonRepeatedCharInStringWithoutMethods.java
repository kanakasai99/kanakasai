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
