package stringPrograms;

class Decompress2 {
    public static void main(String[] args) {
        String s="a4ks6i2";
        String temp="";
        String s1="";
        for(int i=0;i<s.length();){
            int n=0;
            while(Character.isLetter(s.charAt(i))){
                temp=temp+s.charAt(i);
                i++;
            }
            if(Character.isDigit(s.charAt(i))){
                n=s.charAt(i)-'0';
                i++;
            }
            while(n>0){
                s1=s1+temp;
                n--;
            }
            temp="";

        }
        System.out.println(s1);
    }
}