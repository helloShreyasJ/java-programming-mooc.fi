
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something: ");
        String string = scanner.nextLine();
        boolean value = Boolean.valueOf(string);
        System.out.println("True or false? " + value);
        scanner.close();
    }
}
