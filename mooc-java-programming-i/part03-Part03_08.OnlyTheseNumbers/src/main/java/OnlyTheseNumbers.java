
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        while(true){
            int num = Integer.valueOf(sc.nextLine());
            if(num == -1){
                break;
            } list.add(num);   
        } System.out.print("From where? " ); 
        int start = Integer.valueOf(sc.nextLine());
        System.out.print("To where? ");
        int end = Integer.valueOf(sc.nextLine());
        for(int i = start; i < end+1; i++){
            System.out.println(list.get(i));
        }
    }
}
