package ArrayPrograms;

public class MaxMinNumberArray {

	public static void main(String[] args) {
	int a[]= {9,50,67,25,8,94,35};
	int max=a[0];
	int min=a[0];
	
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {          //50>10 //condition pass so a[1]=50
			max=a[i];
		}
	}
System.out.println(max);
	
	for(int i=1;i<a.length;i++) {
	if(a[i]<min) {          //50<9  //condition fails so a[0]=9
		min=a[i];
	}
}
System.out.println(min);
}
}
