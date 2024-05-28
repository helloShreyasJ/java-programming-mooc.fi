
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number: ");
        String num = scan.nextLine();
        int valuenum = Integer.valueOf(num);
        if(valuenum == 1984){
            System.out.println("Orwell");
        }
    }
}
