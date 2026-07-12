package numberPrograms;

public class MinNumber{
    public static void main(String[] args){
        int num=451497;
        int min=4;
        while(num>0){
            int digit=num%10;
            if(digit<min){
                min=digit;
            }
            num=num/10;
        }
        System.out.println(min);
    }
}
