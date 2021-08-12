package Rahul.day03.Retail;

public class Main {


    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();
        inventorySystem.addProduct(new Product("Cloth", "Shirt", 230.4));
        inventorySystem.addProduct(new Product("Laptop", "Lenovo", 12230.4));
        inventorySystem.addProduct(new Product("Computer", "Dell", 230000.4));
        inventorySystem.addProduct(new Product("Cloth", "Pant", 230.4));
        inventorySystem.addProduct(new Product("Cloth", "t-shirt", 1230.4));
        inventorySystem.addProduct(new Product("Cloth", "Shirt2", 230.4));

        System.out.println(inventorySystem);

        inventorySystem.searchProduct("Cloth", "Shirt");
        System.out.println("Done");
    }
}
