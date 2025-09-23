package ArrayPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 7, 11};
        for(int num: arr ){
            if(num>0){
                int count=0;
                for(int i=1;i<=num;i++){
                    if(num%i==0){
                        count++;
                    }

                }
                if(count==2){
                    System.out.println("prime number: "+num);
                }

            }
        }
    }
}