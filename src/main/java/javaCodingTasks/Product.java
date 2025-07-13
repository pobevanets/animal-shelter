package javaCodingTasks;

public class Product {
    private String name;
    private double price;

    // constructor, getters, setters
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{name=" + name + ", price=" + price + "}";
    }
}
