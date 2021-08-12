package Rahul.day02.catalogue;

import java.util.ArrayList;

public class CatalogueProduct {
    ArrayList<Category> categories = new ArrayList<Category>();
    ArrayList<Product> products = new ArrayList<Product>();

    public void addCategory(Category category){
        categories.add(category);
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public Boolean searchProduct(String categoryName, String productName){
        int flag = 0;
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).nameCategory == categoryName && products.get(i).nameProduct == productName && products.get(i).quantityProduct > 0){
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.println("It is available");
            return true;
        }
        else {
            System.out.println("There is no such product with these details!");
            return false;
        }
    }

}
