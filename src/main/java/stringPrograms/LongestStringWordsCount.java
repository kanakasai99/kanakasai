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