package stringPrograms;

public class AAAABBBCheckingBISNextToAUsingIndexOf {
    public static void main(String[] args){
        String s="aaaabbb";
        Boolean br=false;
        int Bindex= s.indexOf('b');
        if(Bindex == -1){
            br=true;
        }
        for(int i=Bindex;i<s.length();i++){
            if(s.charAt(i)=='a'){
                br=true;
            }
        }
        if(!br){
            System.out.println("B is always next to A");
        }
        else{
            System.out.println("Wrong order");
        }
    }
}
