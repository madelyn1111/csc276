public class Grocery {

    private Item[] items;

    public Grocery(Item[] items) {
        this.items = items;
    }

    public double calculateTotalCosts() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        Item milk = new Item("Milk", 3.69);
        Item bread = new Item("Bread", 2.79);
        Item Eggs = new Item("Eggs", 1.99);

        Item [] items = {milk, bread, Eggs};

        Grocery grocery = new Grocery(items);

        System.out.printf("Total cost: $%.2f", grocery.calculateTotalCosts());
    }
}