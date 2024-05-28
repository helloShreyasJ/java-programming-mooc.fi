
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("How many days would you like to convert to seconds? ");
            String days = scanner.nextLine();
            int value = Integer.valueOf(days);
            System.out.println(value * 24 * 60 * 60);
            scanner.close();
    }
}
