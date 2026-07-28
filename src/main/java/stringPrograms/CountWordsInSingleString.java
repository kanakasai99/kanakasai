package stringPrograms;

public class CountWordsInSingleString {
    public static void main(String[] args) {

        String s = "kanakasaisaikanakamereddy";
        int kcount=0;
        int scount=0;
        int mcount=0;
        for(int i=0;i<s.length();i++){
            String temp="";
            for(int j=i;j<s.length();j++){
                temp=temp+s.charAt(j);
                if(temp.equals("kanaka")){
                    kcount++;
                }
                else if(temp.equals("sai")){
                    scount++;
                }
                else if(temp.equals("mereddy")){
                    mcount++;
                }
            }
        }
        System.out.println(kcount+":"+scount+":"+mcount);
    }
}
