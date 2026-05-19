package stringPrograms;

public class AAABBBCheckingBISNextToA {
    public static void main(String[] args){
        String s="aaabb";
        Boolean br=false;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
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
