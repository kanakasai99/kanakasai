package stringPrograms;

public class LongestStringWordsCount {
    public static void main(String[] args) {
        String s="India is my country. "+" All indians  are my brothers and sister. "+" I love my country.";
        String s1[] = s.replaceAll("[^a-zA-Z ]", "").split("\\s+");
        int count=0;
        for(String s2:s1){
            count++;

        }
        System.out.println(count);
    }
}