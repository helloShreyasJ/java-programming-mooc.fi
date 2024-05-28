
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        while(true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
            if(num !=0){
                sum = sum + num;
                numbers = numbers + 1;
            }
        } double average = (double) sum / numbers;
        System.out.println("Average of the numbers: " + average);
    }
}
