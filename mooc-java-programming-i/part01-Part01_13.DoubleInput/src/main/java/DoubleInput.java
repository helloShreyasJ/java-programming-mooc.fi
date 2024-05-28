
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        String string = scanner.nextLine();
        double value = Double.valueOf(string);
        System.out.println("You gave the number " + value);
        scanner.close();
    }
}
