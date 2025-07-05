package ArrayPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {10,20,50,60,30};
		int linSear=60;
		Boolean b=false;
		
		for(int i=0;i<a.length;i++) {
			if(linSear==a[i]) {
				System.out.println("element found at index: "+i);
				b=true;
				break;
			}
		}
if(b==false) {
	System.out.println("element not found");
}
	}

}
