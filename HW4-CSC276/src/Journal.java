
public class Journal extends LibraryItem{
    private int issueNumber;

    public Journal(String Title, String author, int issueNumber){
        super(Title, author);
        this.issueNumber = issueNumber;
    }

    // Default Constructor
    public Journal(){
        super();
        issueNumber = 0;
    }
    @Override
    public String toString(){
        return "Journal Title: " + title + " Author: " + author + " Issue Number: " + issueNumber;
    }
    @Override
    public void displayDetails(){
        System.out.println("Type of Item: Journal");
        System.out.println("Journal Title: " + title + " Author: " + author + " Issue Number: " + issueNumber);
    }
}
