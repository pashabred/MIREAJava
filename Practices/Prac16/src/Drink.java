final public class Drink implements Item{
    final private double price;
    final private String name;
    final private String description;

    public Drink(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }
    public Drink(String name, String description) {
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
