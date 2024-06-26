
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        System.out.println("Enter numbers: ");
        Statistics statistics = new Statistics();
        Statistics evenNumber = new Statistics();
        Statistics oddNumber = new Statistics();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            } else{
                statistics.addNumber(input);
            }
            if(input % 2 == 0){
                evenNumber.addNumber(input);
            } else{
                oddNumber.addNumber(input);
            }
        }
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenNumber.sum());
        System.out.println("Sum of odd numbers: " + oddNumber.sum());
        System.out.println("Average: " + statistics.average());
    }
}
