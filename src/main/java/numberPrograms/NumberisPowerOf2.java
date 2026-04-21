package numberPrograms;

import java.util.Scanner;

public class NumberisPowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
       if(numPower(num)){
           System.out.println(num+": the given number is power of 2");
       }


    }

    public static boolean numPower(int num) {
        if(num > 0) {
            while (num % 2 == 0) {
                num = num / 2;
            }

        }
        return num==1;
    }
}
