package ArrayPrograms;
import java.util.*;


   public class SearchNumberInArray {
        public static void main(String[] args) {
            int a[]={1,3,3,4,5,6,6,7,8};
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the number");
            int num=sc.nextInt();
            Boolean br=false;
            for(int i=0;i<a.length;i++){
                if(a[i]==num){
                    br=true;
                    System.out.println("number found at index: "+i);
                }

            }
            if(!br){
                System.out.println("element not present in given array");
            }

        }
    }

