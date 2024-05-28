
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        int num1 = Integer.valueOf(string1);
        
        String string2 = scanner.nextLine();
        int num2 = Integer.valueOf(string2);
        
        int sum = num1 + num2;
        double sqrtsum = (int) Math.sqrt(sum);
        System.out.println(sqrtsum);
    }
}
