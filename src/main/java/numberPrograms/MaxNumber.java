package numberPrograms;

public class MaxNumber{
    public static void main(String[] args){
        int num=454971;
        int max=4;
        while(num>0){
            int digit=num%10;
            if(digit>max){
                max=digit;
            }
            num=num/10;
        }
        System.out.println(max);
    }
}
