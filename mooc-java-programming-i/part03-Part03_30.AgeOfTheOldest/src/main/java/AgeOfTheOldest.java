
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        int greatest = 0;
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] parts = text.split(",");
            age = Integer.valueOf(parts[1]);
            if(greatest<age){
                greatest = age;
            }
        } System.out.println("The age of the oldest: " + greatest);
    }
}
