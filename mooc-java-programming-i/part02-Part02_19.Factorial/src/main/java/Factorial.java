
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        if(number == 0){
            System.out.print("Factorial: " + 0);
        }else{
            int factorial = 1;
            for(int i = 1; i <= number; i++){
                
                factorial = factorial * i; 
                
            } System.out.println("Factorial: " + factorial);
        }
    }
}
