package Rahul.day02.catalogue;

public class Product extends Category{
    String nameProduct;
    String priceProduct;
    int quantityProduct = 20;

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", priceProduct='" + priceProduct + '\'' +
                ", quantityProduct=" + quantityProduct +
                ", nameCategory='" + nameCategory + '\'' +
                '}';
    }

    public Product(String nameCategory, String nameProduct, String priceProduct) {
        super(nameCategory);
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }


    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }
}
