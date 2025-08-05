package ArrayPrograms;
public class SumCharacterAndNumbers {
	
	    public static void main(String[] args) {
	      String mylist[]={"2","#@","$12","28","7","**"};
	      int sum=0;
	      String Invalid="";
	      for(String element: mylist){
	          try{
	          sum=sum+Integer.parseInt(element);
	      }
	      catch(Exception e){
	    	  Invalid= Invalid +element+", ";
	    	 
	      }
	    }
	    
	    System.out.println("Invalid number format: " +Invalid );
	    System.out.println("The sum is: "+sum);
	}
	}

