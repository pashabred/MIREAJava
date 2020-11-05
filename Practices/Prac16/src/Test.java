public class Test {
    public static void main(String[] args) {
        Item[] items = {new Dish("steak", "meat"), new Drink("coke", "soda")};
        Order order = new Order(items);
        order.add(new Drink("MilkShake","freezes yo brain"));
        order.add(new Drink("MilkShake","freezes yo brain"));
        order.add(new Drink("MilkShake","freezes yo brain"));

        Item[] a = order.getItems();
        for (Item item: a) {
            System.out.println(item.getName());
        }
        System.out.println("");

        System.out.println(order.itemQuantity("MilkShake"));
    }
}
