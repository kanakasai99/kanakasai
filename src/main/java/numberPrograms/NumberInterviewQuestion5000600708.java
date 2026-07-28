package numberPrograms;

import java.util.Arrays;

public class NumberInterviewQuestion5000600708 {
    public static void main(String[] args) {

        int num = 58423664;
        String s = String.valueOf(num);

        String[] arr = new String[s.length()];
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {

                StringBuilder sb = new StringBuilder();
                sb.append(s.charAt(i));

                for (int j = i + 1; j < s.length(); j++) {
                    sb.append("0");
                }

                arr[index++] = sb.toString();
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}