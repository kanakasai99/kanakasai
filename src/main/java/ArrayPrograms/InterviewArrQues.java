package ArrayPrograms;

public class InterviewArrQues{
    public static void main(String[] args){

    /* if array is like below ,one is small and other is big then we can use below ones
    *    int a[]={4,5,3,2,7,8};
        for(int i=0;i<a.length-1;i=i+2){
            if(a[i]<a[i+1] || a[i]>a[i+1] ){*/
        int arr[]={2,4,6,7,8,9};
for(int i=0;i<arr.length-1;i=i+2){
    int temp=arr[i+1];  
    arr[i+1]=arr[i];   
    arr[i]=temp;
}
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}

    }
}