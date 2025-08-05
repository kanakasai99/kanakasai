
package stringPrograms;

public class RepeatedCharString {

	public static void main(String[] args) {
		String s="kanakasaimereddyri";
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			//System.out.println(ch[i]+" count is "+count);
		if(count==1) {
				System.out.print(ch[i]+" ");
		}
		
		}
	}

	}


