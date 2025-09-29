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
/*Case 2: Replace multiple spaces with a single space

(So "Welcome to the ground" → "Welcome to the ground")

Using regex:

str = str.replaceAll("\\s+", " ");
System.out.println(str.trim());*/