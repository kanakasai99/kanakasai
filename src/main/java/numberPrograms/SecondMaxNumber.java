package numberPrograms;

public class SecondMaxNumber {
    public static void main(String[] args){
        int num=579132;
 String s=String.valueOf(num);
        int max=-1;
        int secondmax=-1;
 for(int i=0;i<s.length();i++){
     int digit=Character.getNumericValue(s.charAt(i));

   if(digit>max){

       secondmax=max;
       max=digit;
   }
   else if(digit>secondmax && digit<max){
       secondmax=digit;
   }
 }
 System.out.println(secondmax);
 System.out.println(max);
    }
}
