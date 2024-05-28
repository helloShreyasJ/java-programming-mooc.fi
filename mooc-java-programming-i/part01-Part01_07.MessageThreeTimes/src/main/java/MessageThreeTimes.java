
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        
        System.out.println(msg);
        System.out.println(msg);
        System.out.println(msg);

    }
}
