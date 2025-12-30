package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5

                ; // height of half diamond



        // 🔽 Lower inverted pyramid
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
