package stringPrograms;


public class NextAlphabet{
    public static void main(String[] args){
        String s="aeds";
        StringBuilder st=new StringBuilder();

        for (char ch : s.toCharArray()) {
            st.append((char)(ch + 1));
        }
        System.out.println(st);

        String result="";
        for(int i=0;i<s.length();i++){
            result =result+(char)(s.charAt(i)+1);
        }
        System.out.println(result);

    }
}
