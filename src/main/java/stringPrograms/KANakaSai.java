package stringPrograms;

public class KANakaSai {
    public static void main(String[] args) {
        String s="KANakaSai";
        StringBuilder upp=new StringBuilder();
        StringBuilder low=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch)){
                low.append(ch);
               
            }
            else{
                upp.append(ch);
            }
        }
        System.out.println(upp.toString());
        System.out.println(low.toString());
       }
   }

