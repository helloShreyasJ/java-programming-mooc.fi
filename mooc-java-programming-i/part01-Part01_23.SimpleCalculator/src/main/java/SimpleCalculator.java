
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        String num1 = scanner.nextLine();
        int valuenum1 = Integer.valueOf(num1);
        
        System.out.println("Give the second number:");
        String num2 = scanner.nextLine();
        int valuenum2 = Integer.valueOf(num2);
        
        int add = (int) (valuenum1 + valuenum2);
        int sub = (int) (valuenum1 - valuenum2);
        int mul = (int)(valuenum1 * valuenum2);
        double div =  valuenum1 / (double) valuenum2;
        
        System.out.println(valuenum1 + " + " + valuenum2 + " = " + add);
        System.out.println(valuenum1 + " - " + valuenum2 + " = " + sub);
        System.out.println(valuenum1 + " * " + valuenum2 + " = " + mul);
        System.out.println(valuenum1 + " / " + valuenum2 + " = " + div);
        
            scanner.close();
    }
}
