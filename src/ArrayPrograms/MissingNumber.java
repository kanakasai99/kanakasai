package ArrayPrograms;

public class MissingNumber {
    public static void main(String[] args) {
       int a[]={6,7,9,10,11};
       int start=6;
       int end=11;
       int expectedSum=0;
      for(int i=start;i<=end;i++){
          expectedSum=expectedSum+i;
      }
      int actualSum=0;
      for(int num:a){
          actualSum=actualSum+num;
      }
      int missingNum=expectedSum-actualSum;
      System.out.println("Missing number: "+missingNum);
    }
    

}
