package ArrayPrograms;
import java.util.*;
public class BubbleSortSecLar {
	
	public static void main(String[] args){
	    
	    int a[]={10,55,87,36,11};
	    int n=a.length;
	    for(int i=0;i<n-1;i++){
	        for(int j=0;j<n-1;j++){
	            if(a[j]>a[j+1]){
	               int temp=a[j];
	               a[j]=a[j+1];
	               a[j+1]=temp;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(a));
	    System.out.println(a[a.length-2]);
	}
	}


