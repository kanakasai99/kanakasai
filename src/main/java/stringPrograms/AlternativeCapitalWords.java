package stringPrograms;

public class AlternativeCapitalWords {
    public static void main(String[] args) {
        String s = "Kanaka Sai Mereddy";
        String[] words = s.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) {
                    temp.append(Character.toUpperCase(word.charAt(i)));
                } else {
                    temp.append(word.charAt(i));
                }
            }
            result.append(temp).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
