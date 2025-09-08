package numberPrograms;

import java.util.Scanner;

public class FactorialRecursion {

    // A method that calls itself to calculate factorial
    static int factorial(int n) {
        // base case (stopping point)
        if (n == 0 || n == 1) {
            return 1;
        }
        // recursive case (method calling itself)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("❌ Factorial is not possible for negative numbers.");
        } else {
            int result = factorial(num);
            System.out.println("✅ Factorial of " + num + " is: " + result);
        }

        sc.close();
    }
}
/*🔄 Step-by-step flow of recursion
We are calling:
factorial(5)

👉 Now let’s trace it:

factorial(5)
= 5 × factorial(4)

factorial(4)
= 4 × factorial(3)

factorial(3)
= 3 × factorial(2)

factorial(2)
= 2 × factorial(1)

factorial(1)
Base case → returns 1

🔁 Returning back (unwinding recursion)
Now the results come back one by one:

factorial(2) = 2 × 1 = 2

factorial(3) = 3 × 2 = 6

factorial(4) = 4 × 6 = 24

factorial(5) = 5 × 24 = 120 ✅

📌 Final Answer
factorial(5) = 120*/