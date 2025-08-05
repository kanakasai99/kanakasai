package ArrayPrograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {5,2,7,3,9};
		System.out.println("Before sorting:"+Arrays.toString(a));
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {              //no of passes
			for(int j=0;j<n-1;j++)  {        //no of iteration in each pass  //2,5,7,3,9//25379
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}     
			}                       
		}
			System.out.println("After sorting:"+Arrays.toString(a));

	}

}
