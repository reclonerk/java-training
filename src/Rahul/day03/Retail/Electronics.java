package Rahul.day03.Retail;

public class Electronics extends Category{
    String type = "Laptop";

    public Electronics(String type, String name) {
        super(name);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "type='" + type + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
