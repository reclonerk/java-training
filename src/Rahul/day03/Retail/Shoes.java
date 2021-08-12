package Rahul.day03.Retail;

public class Shoes extends Product{
    String brand;
    String colour;

    public Shoes(String name, String name1, double price, String brand, String colour) {
        super(name, name1, price);
        this.brand = brand;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
