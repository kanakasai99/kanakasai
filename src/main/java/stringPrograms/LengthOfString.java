package stringPrograms;

public class LengthOfString {

	public static void main(String[] args) {
		String s="kanakasaimereddy";
//System.out.println(s.length());
		int length=0;
		for(char ch:s.toCharArray()) {
			length++;
		}
	System.out.println(length);
	}

}
