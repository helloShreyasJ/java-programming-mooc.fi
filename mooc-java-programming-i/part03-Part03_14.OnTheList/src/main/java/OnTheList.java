
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<>();
        while(true){
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            } list.add(name);
        } System.out.print("Search for? ");
        String search = scanner.nextLine();
        if(list.contains(search)){
            System.out.println(search + " was found!");
        } else { 
            System.out.println(search + " was not found!");}
    }
}
