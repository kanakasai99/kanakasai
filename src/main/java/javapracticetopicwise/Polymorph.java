package javapracticetopicwise;

public class Polymorph {
void m1() {
	System.out.println("Hi Sai");
}

int m1(int x) {
	return x;
}

double m1(double x) {
	return x;
}

public static void main(String[] args) {
	Polymorph ph= new Polymorph();
	ph.m1(52);
	System.out.println(ph.m1(15.001245893));
	ph.m1();
}
}

