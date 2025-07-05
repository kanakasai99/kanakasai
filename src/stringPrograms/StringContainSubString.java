package stringPrograms;

public class StringContainSubString {

	public static void main(String[] args) {
		String s="welcome to the home";
		String subs="to the";
		if(s.contains(subs)) {
			System.out.println("contains substring");
		}
		else {
			System.out.println("no substring");
		}
	}
}
