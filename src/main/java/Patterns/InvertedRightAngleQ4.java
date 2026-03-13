package Patterns;

public class InvertedRightAngleQ4 {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=i;j<=4;j++){ // for(int j=4;j>=1;j--)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
