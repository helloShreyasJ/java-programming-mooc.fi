
/**
 *
 * @author shreyas
 */
public class Book {
    private String author;
    private String title;
    private int page;
    
    public Book(String author, String title, int page){
        this.author = author;
        this.title = title;
        this.page = page;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.title;
    }
    
    public int getPages(){
        return this.page;
    }
    
    public String toString(){
        return this.author + ", " + this.title + ", " + this.page + " pages";
    }
}
