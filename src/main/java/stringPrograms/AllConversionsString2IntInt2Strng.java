package stringPrograms;

public class AllConversionsString2IntInt2Strng {

    public static void main(String[] args) {

        // ---------------- INTEGER TO STRING ----------------

        int num1 = 100;

        // Method 1 : String.valueOf()
        String s1 = String.valueOf(num1);
        System.out.println("Using String.valueOf(): " + s1);

        // Method 2 : Integer.toString()
        String s2 = Integer.toString(num1);
        System.out.println("Using Integer.toString(): " + s2);



        // ---------------- STRING TO INTEGER ----------------

        String str = "500";

        // Method 1 : Integer.parseInt()
        int n1 = Integer.parseInt(str);
        System.out.println("Using Integer.parseInt(): " + n1);

        // Method 2 : Integer.valueOf()
        Integer n2 = Integer.valueOf(str);
        System.out.println("Using Integer.valueOf(): " + n2);



        // ---------------- EXTRA CHECK ----------------

        System.out.println();

        System.out.println("String Concatenation:");
        System.out.println(s1 + 50); // 10050

        System.out.println();

        System.out.println("Integer Addition:");
        System.out.println(n1 + 50); // 550
    }
}
