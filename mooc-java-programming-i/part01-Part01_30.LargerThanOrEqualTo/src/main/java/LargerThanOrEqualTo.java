
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number: ");
        String num1 = scan.nextLine();
        int valuenum1 = Integer.valueOf(num1);
        
        System.out.println("Give the second number: ");
        String num2 = scan.nextLine();
        int valuenum2 = Integer.valueOf(num2);
        
        if(valuenum1 > valuenum2){
            System.out.println("The greater number is " + valuenum1);
        } else if(valuenum1 < valuenum2){
            System.out.println("The greater number is " + valuenum2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
