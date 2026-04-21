package stringPrograms;
import java.util.Scanner;
public class StringRotation {
    public static void main(String[] args){
        String input="abcdef";
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the 2nd string");
        String output=sc.nextLine();

        String doubleInput=input+input;
        System.out.println(doubleInput);
        if(doubleInput.contains(output)){
            System.out.println("output string is the rotation of input string");
        }
        else{
            System.out.println("Not a rotation of input string");
        }
    }
}
