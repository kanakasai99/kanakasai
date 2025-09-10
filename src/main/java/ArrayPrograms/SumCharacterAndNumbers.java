package ArrayPrograms;
public class SumCharacterAndNumbers {
	
	    public static void main(String[] args) {
	      String mylist[]={"2","#@","$11","28","7","**"};
	      int sum=0;
	      String Invalid="";
	      for(String element: mylist){
			  String digits=element.replaceAll("\\D","");

	          try{
	          sum=sum+Integer.parseInt(digits);
	      }
	      catch(Exception e){
	    	  Invalid= Invalid +digits+", ";
	    	 
	      }
	    }
	    
	    System.out.println("Invalid number format: " +Invalid );
	    System.out.println("The sum is: "+sum);
	}
	}

