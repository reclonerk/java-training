package Rahul.day03.Retail;

public class Computer extends Product{
    String brand;
    String os;
    String CPU;


    public Computer(String name, String name1, double price, String brand, String os, String CPU) {
        super(name, name1, price);
        this.brand = brand;
        this.os = os;
        this.CPU = CPU;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                ", CPU='" + CPU + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
