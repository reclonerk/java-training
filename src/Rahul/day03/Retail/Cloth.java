package Rahul.day03.Retail;

public class Cloth extends Category{
    String brand;
    String fabric;

    public Cloth(String name, String brand, String fabric) {
        super(name);
        this.brand = brand;
        this.fabric = fabric;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "brand='" + brand + '\'' +
                ", fabric='" + fabric + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
