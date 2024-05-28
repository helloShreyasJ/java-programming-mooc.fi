
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Give speed: ");
        String sp = scan.nextLine();
        int spval = Integer.valueOf(sp);
        if(spval>120){
            System.out.println("Speeding ticket!");
        }
    }
}
