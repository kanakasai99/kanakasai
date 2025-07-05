package ArrayPrograms;
public class SumCharacterAndNumbers {
	
	    public static void main(String[] args) {
	      String mylist[]={"2","#","$","28","7"};
	      int sum=0;
	      for(String element: mylist){
	          try{
	          sum=sum+Integer.parseInt(element);
	      }
	      catch(Exception e){
	          
	      }
	    }
	    System.out.println("The sum is: "+sum);
	}
	}

