package Rahul.day02.catalogue;

public class TestCatalogue {



    public static void main(String[] args) {
        CatalogueProduct cp = new CatalogueProduct();

        Category a = new Category("Cloth");
        cp.addCategory(a);
        Category b = new Category("Smart Phone");
        cp.addCategory(b);
        Category c = new Category("Shoes");
        cp.addCategory(c);

        Product p1 = new Product("Cloth", "Product1", "200.3");
        cp.addProduct(p1);
        Product p2 = new Product("Cloth", "Product2", "20.3");
        cp.addProduct(p2);
        Product p3 = new Product("Smart Phone", "Product3", "260.3");
        cp.addProduct(p3);
        Product p4 = new Product("Shoes", "Product4", "1200.3");
        cp.addProduct(p4);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        cp.searchProduct("Shoes", "Product4");


    }
}
