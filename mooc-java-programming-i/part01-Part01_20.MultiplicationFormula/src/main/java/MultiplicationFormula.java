
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        String num1 = scanner.nextLine();
        int valuenum1 = Integer.valueOf(num1);
        System.out.println("Give the second number:");
        String num2 = scanner.nextLine();
        int valuenum2 = Integer.valueOf(num2);
        int formula = valuenum1 * valuenum2;
        System.out.println(valuenum1 + " * " + valuenum2 + " = " + formula);

    }
}
