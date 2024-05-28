
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]");
        String num = scan.nextLine();
        int marks = Integer.valueOf(num);
        if(marks<0){
            System.out.println("Grade: impossible!");
        } else if(marks<50){
            System.out.println("Grade: failed");
        } else if(marks<60){
            System.out.println("Grade: 1");
        } else if(marks<70){
            System.out.println("Grade: 2");
        } else if(marks<80){
            System.out.println("Grade: 3");
        } else if(marks<90){
            System.out.println("Grade: 4");
        } else if(marks<=100){
            System.out.println("Grade: 5");
        } else{
            System.out.println("Grade: incredible");
        }
    }
}
