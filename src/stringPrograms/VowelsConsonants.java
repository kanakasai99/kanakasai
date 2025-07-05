package stringPrograms;

public class VowelsConsonants {

	public static void main(String[] args) {
		String str="Welcomekanakasai";
		str=str.toLowerCase();
		int vowels = 0,consonants=0;
		for(char ch:str.toCharArray()) {
			System.out.println("aeiou".indexOf(ch) );
			if("aeiou".indexOf(ch) != -1) {
				vowels++;
			}
			else //if(ch >='a'  && ch <='z')
			{
				consonants++;
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
	}


	}


