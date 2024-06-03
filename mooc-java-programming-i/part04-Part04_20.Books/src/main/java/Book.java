public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book(String initialTitle, int initialPages, int initialYear){
        title = initialTitle;
        pages = initialPages;
        year = initialYear;
    }
    public String getTitle(){
        return title;
    }
    public int getPages(){
        return pages;
    }
    public int getYear(){
        return year;
    }
    
    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + year;
    }
}
