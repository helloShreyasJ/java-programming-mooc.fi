
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Greetings! How are you doing? ");
        String response = sc.nextLine();
        System.out.println("Oh, how interesting. Tell me more! ");
        String response2 = sc.nextLine();
        System.out.println("Thanks for sharing! ");
        sc.close();
    }
}
