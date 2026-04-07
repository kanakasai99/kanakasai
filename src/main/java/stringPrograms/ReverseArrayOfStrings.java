package stringPrograms;

public class ReverseArrayOfStrings {
    public static void main(String[] args){
        String names[]={"sai","kanaka","mereddy"};

        for(int i=0;i<names.length;i++){
             names[i]=Reverse(names[i]);
        }
        for(String name: names){
            System.out.print(name+",");
        }

    }
    static String Reverse(String str){
        String rev="";
   for(int i=str.length()-1;i>=0;i--){

       rev=rev+str.charAt(i);

   }
        return rev;

    }
}
