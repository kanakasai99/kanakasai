package stringPrograms;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
public class AnagramSubstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String input1=sc.nextLine();
        System.out.println("enter the second string");
        String input2=sc.nextLine();
        //   String input1="programming";
        //   String input2="gram";
        Boolean br=false;
        for(int i=0;i<input1.length();i++){
            String temp="";
            for(int j=i;j<input1.length();j++){
                temp=temp+input1.charAt(j);

                if(temp.equalsIgnoreCase(input2)){
                    br =true;
                    System.out.println("Substring anagram found: "+temp);
                    System.out.println("output: "+br);
                    break;
                }
            }
        }
    }
}
