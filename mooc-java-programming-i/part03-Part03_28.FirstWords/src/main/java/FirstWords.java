
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] pieces = text.split(" ");
        int index =0;
        while(index < text.length()){
            if(text.equals(" ")){
                break;
            }
            else{
                System.out.println(pieces[0]);
                index++;
            }index = 0;
            text = scanner.nextLine();
            pieces = text.split(" ");
        }
    }
}
