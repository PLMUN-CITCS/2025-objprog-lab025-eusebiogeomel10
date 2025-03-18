// Define the Item class
class Item {
    // Static variable to count objects
    static int objectCount = 0;
    
    // Instance variable
    String itemName;
    
    // Constructor to initialize item name and increment object count
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;
    }
    
    // Static method to display object count
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }
    
    // Instance method to display item name
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }
}

// Main class to run the program
public class ItemDemo {
    public static void main(String[] args) {
        // Create Item objects
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");
        Item item4 = new Item("Speaker");
        // Display item details
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();
        
        // Display total object count
        Item.displayObjectCount();
    }
}
