package stringPrograms;

public class ZeroDigitsFirstAndLast {
	public static void main(String[] args){
	    String s = "32400121200";
	        StringBuilder nonZeroDigits = new StringBuilder(); 
	        StringBuilder zeros = new StringBuilder();
	for(char c:s.toCharArray()){
	    if(c=='0'){
	        zeros.append(c);
	    }
	    else{
	        nonZeroDigits.append(c);
	    }
	}
	System.out.println(nonZeroDigits+""+zeros);
	System.out.println(zeros+""+nonZeroDigits);
	}
	}

