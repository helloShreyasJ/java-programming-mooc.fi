
import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int positiveNum = 0;
        double avg = 0;
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            if(number > 0){
                sum = sum + number;
                positiveNum = positiveNum + 1;
            }
        }
        if(positiveNum > 0){
            avg = (double) sum / positiveNum;
            System.out.println(avg);
        } else{
            System.out.println("Cannot calculate the average");
        }
    }
}
