package ArrayPrograms;

public class InterviewArrQues{
    public static void main(String[] args){
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