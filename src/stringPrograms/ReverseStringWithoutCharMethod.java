package stringPrograms;

public class ReverseStringWithoutCharMethod {
	public static void main(String[] args) {
		String s ="kaNakasai";
		System.out.println(s.length());
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev= rev+s.charAt(i);
		}
		System.out.println(rev);
	}

} 
/*import java.util.Scanner;
public class Test {
public static void main(String[] args)
{ Scanner scanner = new
Scanner(System.in);
System.out.print("Enter a string: ");
String input = scanner.next();
char ch;
String nstr = "";
for (int i = 0; i < input.length(); i++)
{ 
nstr = input.charAt(i)+ nstr;
}
System.out.println("Reversed String is : " + nstr);
}
}*/