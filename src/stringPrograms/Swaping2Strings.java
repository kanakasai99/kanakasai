package stringPrograms;
import java.util.*;
public class Swaping2Strings {
	

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the first string");
	        String str1=sc.nextLine();
	        System.out.println("enter the second string");
	        String str2=sc.nextLine();
	        System.out.println(str1+" "+str2);
	        str1=str1+str2;  //kanakasai
	        str2=str1.substring(0,str1.length()-str2.length());//(0,kanakasai-sai)=kanaka
	        str1=str1.substring(str2.length());//(kanaka)=sai
	        System.out.println(str1+" "+str2);
	    }
	}

