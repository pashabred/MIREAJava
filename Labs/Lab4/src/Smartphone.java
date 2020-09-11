public class Smartphone implements Priceable{
    private final double price;
    private final String brand;
    Smartphone(double price, String brand) {
        this.brand = brand;
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
