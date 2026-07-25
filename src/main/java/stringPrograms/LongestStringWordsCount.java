package stringPrograms;

public class LongestStringWordsCount {
    public static void main(String[] args) {
        String s="India is my country. "+" All indians036     are my brothers and sister. "+" I love my country.";
        String s1[] = s.replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
        int count=0;
        for(String s2:s1){
            count++;
System.out.println(s2);
        }
        System.out.println(count);
    }
}
/*[^a-zA-Z0-9 ]
Meaning
Symbol	Meaning
[]	character group
^	NOT
a-z	lowercase letters
A-Z	uppercase letters
0-9	numbers
space	allows spaces

So:

Remove everything that is NOT:
- letters
- numbers
- spaces
     String s[]="One night stand.+india is the most    powerful  in cricket565   +point of view".replaceAll("[^a-zA-Z0-9 ]","").split("\\s+");
       System.out.println(Arrays.toString(s));
       StringBuilder st=new StringBuilder();
       int count=0;
       for(String s1:s){
           count++;
           st.append(s1).append(" ");
       }
       System.out.println(count);
       System.out.println(st.toString().trim());




*/