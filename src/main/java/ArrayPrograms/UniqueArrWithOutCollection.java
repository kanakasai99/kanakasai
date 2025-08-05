package ArrayPrograms;

//import java.util.*;
public class UniqueArrWithOutCollection {
    public static void main(String[] args) {
     int a[]={42,58,25,42,86,52,25};
     int n=a.length;
     int uni[]=new int[n];
     int newIndex=0;
     for(int i=0;i<n;i++){
         Boolean br=false;
         for(int j=0;j<newIndex;j++){
             if(a[i]==uni[j]){
                 br=true;
                 break;
             }
         }
         if(!br){
             uni[newIndex]=a[i];
             newIndex++;
         }
     }
for(int k=0;k<newIndex;k++){
    System.out.print(uni[k]+" ");
}
     
     
    }
}
