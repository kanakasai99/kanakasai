package javapracticetopicwise;

public class ThrowDemo {
public void testThrow(int age) {
	if(age<18) {
	    // throw new ArithmeticException("Not eligible for vote");
	     System.out.println("Not eligible for vote");
	}
	else {
		System.out.println("Eligible for vote");
	}
}
public static void main(String[] args) {
	ThrowDemo tw=new ThrowDemo();
	try {
		tw.testThrow(13);
	}
	catch(Exception e){
		System.out.println(e);
		System.out.println("Invalid Voter");
	}
}
}
