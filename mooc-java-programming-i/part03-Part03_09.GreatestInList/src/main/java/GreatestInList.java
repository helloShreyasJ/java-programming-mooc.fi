
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();

        while(true){
            int number = Integer.valueOf(sc.nextLine());
            if(number == -1){
                break;
            } list.add(number);
        } System.out.print("Search for? ");
        int search = Integer.valueOf(sc.nextLine());
        System.out.println(search + " is at index " + list.indexOf(search) );
    }
}
