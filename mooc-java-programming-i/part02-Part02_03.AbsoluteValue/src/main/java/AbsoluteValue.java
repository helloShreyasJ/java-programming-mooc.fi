
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int num = Integer.valueOf(string);
        
        if(num<0){
            System.out.println(num*-1);
        } else {
            System.out.println(num);
        }
    }
}
