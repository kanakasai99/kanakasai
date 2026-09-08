package stringPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String sr="names";
		String jr="samen";	
	char	ch1[]=sr.toCharArray();
	char	ch2[]=jr.toCharArray();
	Arrays.sort(ch1);
	System.out.println(ch1);
	Arrays.sort(ch2);
	System.out.println(ch2);
	if(Arrays.equals(ch1, ch2)) {
		System.out.println("anagram");
	}
	else {
		System.out.println("not anagram");
	}
	}

}
