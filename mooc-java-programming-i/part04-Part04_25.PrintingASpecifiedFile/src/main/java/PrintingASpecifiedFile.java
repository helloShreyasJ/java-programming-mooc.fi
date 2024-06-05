
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fileName;
        
        fileName = sc.nextLine();
        findFile(fileName);
    }
    public static void findFile(String fileName){
        try(Scanner fileFinder = new Scanner(Paths.get(fileName))){
            while(fileFinder.hasNextLine()){
                String row = fileFinder.nextLine();
                System.out.println(row);
            }
        } catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}
