
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        int numofEven = 0; int numofOdd = 0; int numofnumbers = 0; int sum = 0; double avg = 0;
        System.out.println("Give numbers:");
        Scanner sc = new Scanner(System.in);
        while(true){
            int number = Integer.valueOf(sc.nextLine());
            if(number == -1){
                System.out.println("Thx! Bye!");
                break;
            } else {
                sum += number;
                numofnumbers++;
            } 
            if (number%2 == 0){
                numofEven++;
            }
            if (number%2 !=0) {
                numofOdd++;
            }
        }System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numofnumbers);
        avg = (double) sum / numofnumbers;
        System.out.println("Average: " + avg);
        System.out.println("Even: " + numofEven);
        System.out.println("Odd: " + numofOdd);
    }
}
