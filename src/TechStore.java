//import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TechStore {
    private List<Technology> inventory;
    private String storeName;
    private String location;
    private double revenue;

    public TechStore(String storeName, String location) {
        this.storeName = storeName;
        this.location = location;
        this.inventory = new ArrayList<>();
        this.revenue = 0.0;
    }

    public void addProduct(Technology product) {
        inventory.add(product);
    }

    public void displayInventory() {
        System.out.println("Inventory at " + storeName + ":");
        for (Technology item : inventory) {
            item.displaySpecs();
            System.out.println("Price: $" + item.Price());
            System.out.println("---------------------");
        }
    }

    public void sellProduct(Technology product) {
        if (inventory.remove(product)) {
            revenue += product.Price();
            System.out.println("Sold: " + product.getClass().getSimpleName());
        }
    }

    // Additional store management methods
    public double getTotalInventoryValue() {
        return inventory.stream().mapToDouble(Technology::Price).sum();
    }

    public void displayWarrantyInfoForAll() {
        inventory.forEach(item -> {
            System.out.println(item.getClass().getSimpleName() + " warranty: " + item.getWarrantyInfo());
        });
    }
}