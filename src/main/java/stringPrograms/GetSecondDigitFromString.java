package stringPrograms;

import java.util.*;
public class GetSecondDigitFromString {
    public static void main(String[] args){
        char ch[]="claude2403edualc".toCharArray();
        StringBuilder letters=new StringBuilder();
        StringBuilder numbers=new StringBuilder();
        for(char c: ch){
            if(Character.isLetter(c)){
                letters.append(c);
            }
            else{
                numbers.append(c);
            }
        }
        System.out.println(letters.toString());
        System.out.println(numbers.toString());
        char chn[]=numbers.toString().toCharArray();
        int num[]=new int[chn.length];
        int k=0;
        for(char cn: chn){
            num[k++]=Character.getNumericValue(cn);  //alternative-num[i++] = Integer.parseInt(String.valueOf(chn[i]));
        }

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(num[1]);
    }
}