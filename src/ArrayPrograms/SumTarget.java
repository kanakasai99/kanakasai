
package ArrayPrograms;

//import java.util.Arrays;

public class SumTarget {
	public static void main(String[] args) {
	int a[]= {6,8,11,14,19,3,9};
	int target=17;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			int sum=a[i]+a[j];
			if(sum==target) {	
				System.out.println("Values: " + a[i] + " + " + a[j] + " = " + target +
                        " -> Indices at : [" + i + "," + j + "]");
			}
		}
	}
		}
	}

	


