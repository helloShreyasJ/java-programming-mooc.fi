
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How old are you? ");
        String string = scan.nextLine();
        int age = Integer.valueOf(string);
        
        if(age<0 || age>120){
            System.out.println("Impossible!");
        } else{
            System.out.println("OK");
        }
    }
}
