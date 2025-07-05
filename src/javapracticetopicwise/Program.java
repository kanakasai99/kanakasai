package javapracticetopicwise;

public class Program {
int x=10;
int y=20;

public void actual(int x,int y) {
	 this.x=x;
	 this.y=y;
	
	//this.x=z;
	//this.y=p;
}
public void act(){
	System.out.println(x+" "+y);
}


public static void main(String[] args) {
	Program p=new Program() ;
 p.actual(5, 6);
 p.act();
}
}
