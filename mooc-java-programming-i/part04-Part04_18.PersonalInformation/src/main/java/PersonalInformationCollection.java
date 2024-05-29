
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            
            //the code will break if firstName is empty
            
            if(firstName.isEmpty()){
                break;
            } else {
                System.out.print("Last Name: ");
                String lastName = scanner.nextLine();
                
                System.out.print("Identification Number: ");
                String idNum = scanner.nextLine();
                
                //to add them to infoCollection
                
                infoCollection.add(new PersonalInformation(firstName,lastName,idNum));
            }
        }
        // to get their first and last names individually printed
        System.out.println();
        for(PersonalInformation info: infoCollection){
            String FirstandLast = info.getFirstName() + " " + info.getLastName();
            System.out.println(FirstandLast);
        }
    }
}
