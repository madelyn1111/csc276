
public class LibraryItem {
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Default constructor
    public LibraryItem() {
        title = "n/a";
        author = "n/a";
        isAvailable = true;
    }
    public void checkOut(){
        if(isAvailable){
            isAvailable = false;
        }
    }
    public void returnItem(){
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "Title:" + title + "Author: " + author;
    }

    public void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

}
