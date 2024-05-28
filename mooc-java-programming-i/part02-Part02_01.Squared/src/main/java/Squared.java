
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int num = Integer.valueOf(string);
        
        int numsqr = num*num;
        
        System.out.println(numsqr);
    }
}
