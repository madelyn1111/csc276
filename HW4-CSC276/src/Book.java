
public class Book extends LibraryItem {
    private int pages;

    public Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    // Default Constructor
    public Book(){
        super();
        pages = 0;
    }

    @Override
    public String toString() {
        return "Book Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }
}
