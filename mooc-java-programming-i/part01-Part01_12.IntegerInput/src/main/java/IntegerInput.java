
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        String value = scanner.nextLine();
        int integer = Integer.valueOf(value);
        System.out.println("You gave the number " + integer);
        scanner.close();
    }
}
