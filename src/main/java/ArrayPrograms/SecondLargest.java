package ArrayPrograms;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {10,15,68,78,36,48,98,12};
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
System.out.println(a[a.length-2]);
	}

}
