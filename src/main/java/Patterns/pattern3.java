package Patterns;

public class pattern3 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");         // (4a) Star
                } else {
                    System.out.print(" ");         // (4b) Space inside hollow
                }
            }
            System.out.println();
        }
    }
}
