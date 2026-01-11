package numberPrograms;

public class NumberPattern {

    public static void main (String[] args){
        /*1
        * 12
        * 123
        * 1234
        * 12345
        * */
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
