package stringPrograms;

import java.util.*;
public class StringReverseRecursion{
    public static String reverse(String s){
        if(s.isEmpty()){
            return s;
        }
        return reverse(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String st=sc.nextLine();
        System.out.println(reverse(st));
    }
}
/*1️⃣ Forward Calls (Breaking the string)

Java keeps calling the function until the base condition.

reverse("abc")
= reverse("bc") + 'a'
reverse("bc")
= reverse("c") + 'b'
reverse("c")
= reverse("") + 'c'
reverse("")
= ""

Now recursion stops here because of:

if(s.isEmpty())
2️⃣ Reconstruction Starts (Returning values)

Now the stack starts returning values upward.

Step 1
reverse("")
returns ""
Step 2

We go back to this line:

reverse("c") = reverse("") + 'c'

Substitute value:

"" + 'c' = "c"

So:

reverse("c") returns "c"
Step 3

Now go back to:

reverse("bc") = reverse("c") + 'b'

Substitute:

"c" + 'b' = "cb"

So:

reverse("bc") returns "cb"
Step 4

Now go back to:

reverse("abc") = reverse("bc") + 'a'

Substitute:

"cb" + 'a' = "cba"
Final Result
reverse("abc") → "cba"
🔁 Visual Stack
Calls going down
reverse("abc")
reverse("bc")
reverse("c")
reverse("")
Values returning up
""
→ "c"
→ "cb"
→ "cba"*/