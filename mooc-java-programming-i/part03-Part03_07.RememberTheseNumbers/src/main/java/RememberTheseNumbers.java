
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        while(true){
            int num = Integer.valueOf(sc.nextLine());
            if(num == -1){
                break;
            } list.add(num);
        } int stop = list.size();
        for(int i = 0; i < stop ; i++){
            System.out.println(list.get(i));
        }
    }
}
