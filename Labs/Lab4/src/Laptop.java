public class Laptop implements Priceable {
    private final double price;
    private final String brand;
    Laptop(double price, String brand) {
        this.brand = brand;
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
