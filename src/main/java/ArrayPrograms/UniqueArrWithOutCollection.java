package ArrayPrograms;

//import java.util.*;
public class UniqueArrWithOutCollection {
    public static void main(String[] args) {
     int a[]={42,58,25,42,86,52,25};
     int n=a.length;
     int uni[]=new int[n];
     int newIndex=0;
     for(int i=0;i<n;i++){
         Boolean br=false;
         for(int j=0;j<newIndex;j++){
             if(a[i]==uni[j]){
                 br=true;
                 break;
             }
         }
         if(!br){
             uni[newIndex]=a[i];
             newIndex++;
         }
     }
for(int k=0;k<newIndex;k++){
    System.out.print(uni[k]+" ");
}
     
     
    }
}
/*how it works
* a = [42, 58, 25, 42, 86, 52, 25]
n = 7
uni = [?, ?, ?, ?, ?, ?, ?] (empty but same size as a)
newIndex = 0
*
First iteration (i = 0 → a[i] = 42)
br = false
Inner loop: j < newIndex → newIndex = 0 → loop skips (no unique numbers yet)
if (!br) → true
Put 42 into uni[0]
uni = [42, ?, ?, ?, ?, ?, ?]
newIndex = 1

Second iteration (i = 1 → a[i] = 58)
br = false
Inner loop: j < newIndex → j < 1
j = 0: compare 58 == uni[0] (42) → false
End inner loop → still br = false
Add 58 at uni[1]
uni = [42, 58, ?, ?, ?, ?, ?]
newIndex = 2

Third iteration (i = 2 → a[i] = 25)
Compare with uni[0] (42) → false
Compare with uni[1] (58) → false
Still unique → add at uni[2]
uni = [42, 58, 25, ?, ?, ?, ?]
newIndex = 3

Fourth iteration (i = 3 → a[i] = 42)
Compare with uni[0] (42) → true → set br = true, break inner loop
Since br = true, skip adding → duplicate ignored

Fifth iteration (i = 4 → a[i] = 86)
Compare with 42, 58, 25 → all false
Unique → add at uni[3]
uni = [42, 58, 25, 86, ?, ?, ?]
newIndex = 4

Sixth iteration (i = 5 → a[i] = 52)
Compare with 42, 58, 25, 86 → all false
Unique → add at uni[4]
uni = [42, 58, 25, 86, 52, ?, ?]
newIndex = 5

Seventh iteration (i = 6 → a[i] = 25)
Compare with 42, 58, 25 → match at index 2 → br = true → skip adding
End Result
uni contains: [42, 58, 25, 86, 52]
newIndex = 5 (count of unique numbers)
Loop prints only first newIndex elements → 42 58 25 86 52

✅ Key background mechanism:

newIndex acts as a dynamic size marker for how many unique numbers we’ve stored so far.
br acts as a flag to prevent adding duplicates.
The inner loop is a manual check against the already stored unique elements.*/