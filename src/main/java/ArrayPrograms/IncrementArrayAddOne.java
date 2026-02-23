package ArrayPrograms;

import java.util.*;
public class IncrementArrayAddOne{
    public static void main(String[] args){
        int arr1[]={1,3,7,5,9,8,7};
        int num=0;
        for(int a: arr1){
            num=num*10+a;
        }
        num=num+1;

        String ar=Integer.toString(num);
        System.out.println(ar);
        int newArr[]=new int[ar.length()];
        for(int i=0;i<ar.length();i++){
              newArr[i]=Character.getNumericValue(ar.charAt(i));
           // newArr[i]=ar.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(newArr));
    }
}
/*✅ Alternative Ways (Same Result)
1. Using String.valueOf() (Recommended)
String ar = String.valueOf(num);

2. Using concatenation
String ar = num + "";

✔ Works
❌ Not recommended in interviews (hacky)

3. Using Integer.toString()
String ar = Integer.toString(num);

✔ Explicit and clear

🎯 Best Practice (For Interviews)

👉 Prefer:

String ar = String.valueOf(num);

Because:

Cleaner

Works for all types

Widely used

💡 Bonus Insight

Even though you're passing an int, Java automatically boxes/unboxes when needed.

But:
        👉 You still need a class (Integer) to access methods.

🚀 One-line Interview Answer

If asked:

Why Integer and not int?

Say:

        "int is a primitive and doesn’t have methods, so we use the Integer wrapper class which provides utility methods like toString()."
        */
