package stringPrograms;

public class VowelsConsSpecCharArrange{
    public static void main(String[] args){
        String s="kanak##saimereddy#@&";
        StringBuilder vow=new StringBuilder();
        StringBuilder cons=new StringBuilder();
        StringBuilder spec=new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch)!=-1){
                    vow.append(ch);
                }
                else{
                    cons.append(ch);
                }

            }
            else{
                spec.append(ch);
            }
        }
        vow.append(cons).append(spec);
        System.out.println(vow);
    }
}