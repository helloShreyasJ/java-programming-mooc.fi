
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Give a string: ");
            String string = scan.nextLine();
            System.out.println("Give an integer: ");
            String integer = scan.nextLine();
            int valueint = Integer.valueOf(integer);
            System.out.println("Give a double: ");
            String doub = scan.nextLine();
            double valuedoub = Double.valueOf(doub);
            System.out.println("Give a boolean: ");
            String bool = scan.nextLine();
            boolean valuebool = Boolean.valueOf(bool);
            
            System.out.println("You gave the string " + string);
            System.out.println("You gave the integer " + valueint);
            System.out.println("You gave the double " + valuedoub);
            System.out.println("You gave the boolean " + valuebool);
            scan.close();
            
    }
}
