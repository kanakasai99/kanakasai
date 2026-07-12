package numberPrograms;

public class HarshadNumber{
    public static void main(String[] args){
        int num=123;
        int temp=num;
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        if(temp%sum==0){
            System.out.println("Harshad number");
        }
        else{
            System.out.println("Not a Harshad number");
        }

    }
}