package javapracticetopicwise;

public class Exceptc {
public void excepted() {
	int a= 10/0;
}
public static void main(String[] args) {
	Exceptc ex=new Exceptc();
	try {
		ex.excepted();
	}
	catch(ArithmeticException ec) {
		System.out.println(ec);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("program closed");
}
}
