public interface Item {
    double price = 0;
    String name = null;
    String description = null;

    default double getPrice() {
        return price;
    }
    default String getName() {
        return name;
    }
    default String getDescription() {
        return description;
    }
}
