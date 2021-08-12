package Rahul.day03.Retail;

import java.util.ArrayList;
import java.util.HashMap;

public class InventorySystem {
    ArrayList<Category> categories = new ArrayList<>();
    ArrayList<Product> products = new ArrayList<>();

    void addCategory(Category c){
        categories.add(c);
    }

    void addProduct(Product p){
        products.add(p);
    }

    Boolean searchProduct(String name, String category){
        int flag = 0;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getNameProduct() == name && products.get(i).getCategoryName() == category &&
            products.get(i).getQuantity() > 0
            ){
                System.out.println("Product available in catalogue!");
                flag = 1;
                return true;
            }
        }
        System.out.println("Product Not available");
        return false;
    }

    Boolean buyProduct(String name, String category, int qunatity){
        int flag = 0;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getNameProduct() == name && products.get(i).getCategoryName() == category &&
                    products.get(i).getQuantity() > qunatity
            ){
                System.out.println("Purchase Successful");
                flag = 1;
                return true;
            }
        }
        System.out.println("Product Not available");
        return false;
    }

    @Override
    public String toString() {
        return "InventorySystem{" +
                "products=" + products +
                '}';
    }
}
