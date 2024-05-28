
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int finish = Integer.valueOf(scanner.nextLine());
        for(int i = 0; i < finish + 1;i++){
            System.out.println(i);
        }
    }
}
