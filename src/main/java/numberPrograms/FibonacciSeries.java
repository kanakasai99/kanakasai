package numberPrograms;

public class FibonacciSeries {
//0 1 1 2 3 5 8 13 21 34
	public static void main(String[] args) {
		int n1=0,n2=1, sum=0;
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<=10;i++) {    //since already we printed 0 1 so thats why we started the loop with '2' in order to print only 10 numbers 
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
			
			/**/
		}
	}
}
//0 1 1 2 3 5 8 13 21 34 55
//sequence of numbers in which every third number is equal to sum of its two preceeding number