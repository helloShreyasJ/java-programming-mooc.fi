
import java.util.Scanner;

public class PrintThrice {

     public static void main(String[] args) {
        System.out.print("Give a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for(int i =0; i<3; i++){
            System.out.print(word);
        }
    }
}
