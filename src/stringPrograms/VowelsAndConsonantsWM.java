package stringPrograms;

public class VowelsAndConsonantsWM {

	public static void main(String[] args) {
		
		String str="Welcometotheworld";
		str=str.toLowerCase();
		int vowels = 0,consonants=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			//if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			if("aeiouAEIOU".indexOf(ch) != -1)	{   //If ch is a vowel, indexOf returns its index (0 or greater). for aeiou index (0 or greater)
				/*"aeiou" is a string containing all lowercase vowels.
.indexOf(ch) checks if the character ch exists in the string "aeiou".
If ch is a vowel, indexOf returns its index (0 or greater).
if ch is not found, it returns -1.*/
				vowels++;
			}
			
			else //if(ch >='a'  && ch <='z')
			{
				consonants++;
			}
		}
		System.out.println("count of vow: "+" "+vowels);
		System.out.println("count of con: "+" "+consonants);
	}
}
