package numberPrograms;

public class Fibonacciwithouttemp {
	public static void main(String[] args) {
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		
		for(int i=2;i<=10;i++) {    //since already we printed 0 1 so thats why we started the loop with '2' in order to print only 10 numbers 
			
			n2=n1+n2;
			n1=n2-n1;
			System.out.print(n2+" ");
		
		}
	}
}

