import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items;

    // Default constructor
    public Library() {
        items = new ArrayList<>();
    }

    // Constructor
    public Library(ArrayList<LibraryItem> items) {
        this.items = items;
    }

    // Adds items to list
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // Displays items in a array
    public void displayItems() {
        System.out.println("Item list: ");
        for (LibraryItem item : items) {
            item.displayDetails();
        }
    }

    // Check out item in list
    public void checkOutItem(String title) {
        for (LibraryItem item : items) {
            if (item.title.equals(title) && item.isAvailable) {
                item.isAvailable = false;
                System.out.println(title + " has been checked out.");
                return;
            }
        }
    }

    // Returns items in list
    public void returnItem(String title) {
        for (LibraryItem item : items) {
            System.out.println("Checking item: " + item.title + ", Available: " + item.isAvailable); // Debugging line
            if (item.title.equals(title) && !item.isAvailable) {
                item.isAvailable = true;
                System.out.println(title + " has been returned.");
            }
        }
    }
}
