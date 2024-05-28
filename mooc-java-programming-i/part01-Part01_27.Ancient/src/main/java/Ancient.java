
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year: ");
        String year = scan.nextLine();
        int valueyear = Integer.valueOf(year);
        if(valueyear < 2015){
            System.out.println("Ancient history!");
        }
    }
}
