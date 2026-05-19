package numberPrograms;

public class NumberInterviewQuestion5000600708 {
    public static void main(String[] args){
        int num=58423664;
        String s=String.valueOf(num);

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){

                System.out.print(s.charAt(i));
                for(int j=i+1;j<s.length();j++){
                    System.out.print(0);
                }
                System.out.print(" ");
            }
        }
    }
}
