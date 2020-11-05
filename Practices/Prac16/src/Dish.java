final public class Dish implements Item{
    final private double price;
    final private String name;
    final private String description;

    public Dish(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }
    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.price = 0;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}