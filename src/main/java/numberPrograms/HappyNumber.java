package numberPrograms;

public class HappyNumber{
    public static void main(String[] args){
        int num=1234;
        int sum=0;
        while(num!=1 && num!=4){
            sum=0;
            while(num>0){
                int digit=num%10;
                sum=sum+(digit*digit);
                num=num/10;
            }
            System.out.println(sum);
            num=sum;
        }
        if(num==1){
            System.out.println("Happy number");
        }
        else{
            System.out.println("Not happy number");
        }
    }
}
