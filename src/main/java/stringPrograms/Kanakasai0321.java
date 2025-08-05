package stringPrograms;

public class Kanakasai0321 {

	    public static void main(String[] args) {
	       String s="Kanakasai0321";
	       StringBuilder alpha=new StringBuilder();
	       StringBuilder num=new StringBuilder();
	       for(char ch:s.toCharArray()){
	           if(Character.isDigit(ch)){
	               num.append(ch);
	           }
	           else if(Character.isLetter(ch)){
	               alpha.append(ch);
	           }
	       }
	       System.out.println(num.toString());
	       System.out.println(alpha.toString());
	    }
	
}
