package ArrayPrograms;
import java.util.*;
//remove duplicates from array and print the array
public class DuplicateUniqueArray {
	public static void main(String[] args) {
	int a[]={1,5,8,6,8,4,1,3,6,9};
	Set<Integer> uniqueSet=new LinkedHashSet<>(); //maintaining insertion order with unqiue elements
	//Set<Integer> uniqueSet=new LinkedHashSet<>(); //not maintain insertion order
	for(int num: a){
	    uniqueSet.add(num);  //removed duplicates and store unique set
	}
	//convert set to array
	int uniqueArray[]=new int[uniqueSet.size()];   
	int i=0;
	for(int num:uniqueSet){
	    uniqueArray[i++]=num;
	}
	System.out.println("unique elements in array: "+Arrays.toString(uniqueArray));
	    }   
	}

