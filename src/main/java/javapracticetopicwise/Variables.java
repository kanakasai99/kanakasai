package javapracticetopicwise;

public class Variables {
	public static int comNum=100;
	public int y=30;

	
public void number() {
	int a=10;
	int b=30;
	System.out.println(a+b);
}

public static void main(String[] args) {
	Variables vr=new Variables();
	System.out.println(vr.y);
	System.out.println(Variables.comNum);
	vr.number();
}
}
