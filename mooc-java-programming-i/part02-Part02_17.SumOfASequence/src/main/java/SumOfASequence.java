
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        System.out.print("Last number? ");
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int lastnum = Integer.valueOf(scan.nextLine());
        for(int i = 1; i<= lastnum; i++ ){
            sum = sum + i;
            
        }System.out.println("The sum is " + sum);
    }
}
