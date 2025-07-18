package stringPrograms;

public class VowelsConsonants {

	public static void main(String[] args) {
		String str="Welcomekanakasai";
		StringBuilder con=new StringBuilder();
		StringBuilder vow=new StringBuilder();
		str=str.toLowerCase();
		int vowels = 0,consonants=0;
		for(char ch:str.toCharArray()) {
			
			if("aeiou".indexOf(ch) != -1) {
				vow.append(ch);
				vowels++;
				
			}
			else //if(ch >='a'  && ch <='z')
			{
				con.append(ch);
				consonants++;
			}
		}
		System.out.println(vow.toString()+ " count of vowels: "+vowels);
		System.out.println(con.toString()+ " count of consonants: "+consonants);
		System.out.println(vowels);
		System.out.println(consonants);
	}


	}


