package stringPrograms;

public class QuestionString {
public static void main(String args[]) {
	String s1="welcome";   //stack memory
	String s2 =new String("Welcome");  // string pool constant memory
String s3=s1.replace('w', 'W');
System.out.println(s1);
System.out.println(s2==s3);  //checks memory location
System.out.println(s1==s3);
System.out.println(s1.equals(s3));  //checks content in the memory
}
}
