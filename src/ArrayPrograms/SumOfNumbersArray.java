package ArrayPrograms;

public class SumOfNumbersArray {

	public static void main(String[] args) {

int a[]= {0,2,8,6,7,3,6};
int sum=0;
for(int i=0;i<a.length;i++) {
	sum= sum+a[i];
}
System.out.println("Sum of array:"+sum);
	}

}
