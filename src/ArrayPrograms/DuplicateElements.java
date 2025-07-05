package ArrayPrograms;

public class DuplicateElements {
	public static void main(String[] args) {
		int a[]= {2,4,5,6,2,5,9,8,9};
		//int len=a.length;
		//System.out.println(len);
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
  					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
