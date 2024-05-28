import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a year: ");
        String string = scan.nextLine();
        int year = Integer.valueOf(string);
        if(year%4 != 0){
            System.out.println("It is not a leap year");
        } else if(year%100 == 0 && year%400 != 0){
            System.out.println("It is not a leap year");
        } else{
            System.out.println("It is a leap year");
        }
    }
}
