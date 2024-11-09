
public class Main {
    public static void main(String[] args) {
                Library library = new Library();

                library.addItem(new LibraryItem("Java Programming", "Paul Deitel"));
                library.addItem(new LibraryItem("Effective Java", "Joshua Bloch"));
                System.out.println("---------------------");

                library.displayItems();

                System.out.println("---------------------");
                System.out.println("\nChecking out 'Java Programming':");
                library.checkOutItem("Java Programming");

                System.out.println("---------------------");
                System.out.println("\nAll Library Items after checking out 'Java Programming':");
                library.displayItems();


                System.out.println("---------------------");
                System.out.println("\nReturning 'Java Programming':");
                library.returnItem("Java Programming");

                System.out.println("---------------------");
                System.out.println("\nAll Library Items after returning 'Java Programming':");
                library.displayItems();
            }
        }




