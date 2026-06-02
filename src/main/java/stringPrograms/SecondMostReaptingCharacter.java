package stringPrograms;

import java.util.*;
public class SecondMostReaptingCharacter{
    public static void main(String[] args){
        String s="kanakasaimereddy";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int firstMax=0;
        int secMax=0;
        char firMost=' ';
        char secMost=' ';
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            int freq=entry.getValue();
            char c=entry.getKey();
            if(freq>firstMax){
                secMax=firstMax;
                secMost=firMost;

                firstMax=freq;
                firMost=c;

            }
            else if(freq >secMax && freq <firstMax){
                secMax=freq;
                secMost=c;
            }

        }
        System.out.println(secMost+": "+secMax);

    }

}
