
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int sum = 0;
        int count = 0;
        String name = "";
        String longestName = "";
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] parts = text.split(",");

            year = Integer.valueOf(parts[1]);
            name = parts[0];
           

            if(longestName.length() < name.length()){
                longestName = name;
            }

            for(int i =0; i < parts.length; i++){
                sum = sum + year;
                count++;
            }

        }System.out.println("Longest name: " + longestName);
            System.out.println("Average of the birth years: " + (double)sum/count);
    }
}
