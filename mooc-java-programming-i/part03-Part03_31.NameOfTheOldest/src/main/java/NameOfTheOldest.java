
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age=0;
        int oldest =0;
        String name = "";
        String oldestName = "";
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] parts = text.split(",");
            age = Integer.valueOf(parts[1]);
            name = parts[0];
            if(oldest< age){
                oldest = age;
                oldestName = name;
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
