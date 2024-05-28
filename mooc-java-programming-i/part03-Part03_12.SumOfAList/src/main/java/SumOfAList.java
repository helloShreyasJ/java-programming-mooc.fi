
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            } list.add(number);
        }  int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
            
        } System.out.println("Sum: " + sum);
    }
}
