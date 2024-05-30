import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList <Book> booklist = new ArrayList<>();
        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            } else{
                System.out.print("Pages: ");
                int pages = Integer.valueOf(scanner.nextLine());
                System.out.print("Publication year");
                int year = Integer.valueOf(scanner.nextLine());
                booklist.add(new Book(title,pages,year));
            }
        } System.out.print("What information will be printed?"); 
        String info = scanner.nextLine();
        System.out.println();
        for(Book book:booklist){
            if(info.equals("everything")){
                System.out.println(book);
            } else if(info.equals("name")){
                System.out.println(book.getTitle());
            }
        }
    }
}
