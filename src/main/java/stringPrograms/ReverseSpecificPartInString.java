package stringPrograms;

public class ReverseSpecificPartInString {
    public static void main(String[] args){
        String s="kanakasaimereddy";

        StringBuilder rev=new StringBuilder();
        StringBuilder st1=new StringBuilder();
        rev.append(s.substring(6,9)).reverse();
        st1.append(s.substring(0,6));
        st1.append(rev);
        st1.append(s.substring(9));

        System.out.println(st1.toString());

    }

}
