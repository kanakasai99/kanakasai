package numberPrograms;

public class SecondMinNumber {
    public static void main(String[] args){
        int num=79162;
        int min=9;
        int secondMin=9;
        while(num>0){
            int digit=num%10;
            if(digit<min){
                secondMin=min;
                min=digit;
            }
            else if(digit>min && digit<secondMin){
                secondMin=digit;
            }
            num=num/10;
        }
        System.out.println(secondMin);
        System.out.println(min);
    }
}
