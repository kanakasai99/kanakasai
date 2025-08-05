package stringPrograms;

public class ReverseStringCharMethod {
	public static void main(String[] args) {
		
		String str= "JavaTechCommunity";
		char chars[]= str.toCharArray();
		System.out.println(chars.length);
		String rev="";
		for(int i= chars.length-1;i>=0;i--) {
			rev= rev+chars[i];
		}
		System.out.println(rev);
	}

}
