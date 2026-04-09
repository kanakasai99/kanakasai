package ArrayPrograms;

public class MissingMultipleNumbers {
    public static void main(String[] args) {

        int a[] = {4,3,2,7,8,2,3,1};

        int max=0;
        for(int c: a){
            if(c>max){
                max=c;
            }
        }
        boolean present[] = new boolean[max+1];
        // Mark numbers present
        for(int num : a){
            present[num] = true;
        }
        // Find missing numbers
        for(int i = 0; i <= max; i++){
            if(!present[i]){
                System.out.println("Missing: " + i);
            }
        }
    }
}
