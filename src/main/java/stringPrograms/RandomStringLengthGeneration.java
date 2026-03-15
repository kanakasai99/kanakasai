package stringPrograms;

import java.util.Random;

public class RandomStringLengthGeneration {

        public static void main(String[] args) {

            String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            Random rand = new Random();

            String result = "";

            for(int i = 0; i < 8; i++) {
                int index = rand.nextInt(s.length());
                result = result + s.charAt(index);
            }

            System.out.println(result);
        }
    }

