import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            } else{
                System.out.print("Enter duration: ");
                int duration = Integer.valueOf(scanner.nextLine());
                programs.add(new TelevisionProgram(name,duration));
            }
        } System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        System.out.println();
        
        for(TelevisionProgram program: programs){
            if(program.getDuration() <= maxDuration){
                System.out.println(program);
            }
        }
    }
}
