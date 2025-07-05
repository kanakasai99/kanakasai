package stringPrograms;

public class RemovewhiteSpaces {

	public static void main(String[] args) {
		String str="Welcome to the ground";
		/*str=str.replaceAll("\\s", "");               //with methods
		System.out.println(str);*/
		String res = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ') {
				res=res+str.charAt(i);
			}
		}
		System.out.println(res);
	}
}
