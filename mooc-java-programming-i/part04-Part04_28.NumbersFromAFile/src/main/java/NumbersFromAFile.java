
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList <Integer> list = new ArrayList <>();
        try(Scanner searchFile = new Scanner(Paths.get(file))){
            while(searchFile.hasNextLine()){
                int num = Integer.valueOf(searchFile.nextLine());
                if(num >= lowerBound && num <= upperBound){
                    list.add(num);
                }
            }
        } catch(Exception e){
            System.out.println("Error: " + e);
        }
        System.out.println("Numbers: " + list.size());
    }

}
