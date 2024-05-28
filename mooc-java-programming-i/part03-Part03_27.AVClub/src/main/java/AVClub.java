
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] pieces = text.split(" ");
        int index = 0;
        while(!(text.equals("")) && index < pieces.length ){
            if(text.equals(" ")){
                break;
            }
            for(int i = 0; i < pieces.length; i++){
                if(pieces[i].contains("av")){
                    System.out.println(pieces[i]);
                } 
                
            }text = scanner.nextLine();
                pieces = text.split(" ");
                index = 0;
        }
    }
}
