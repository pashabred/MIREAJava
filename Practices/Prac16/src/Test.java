public class Test {
    public static void main(String[] args) {
        Item[] items = {new Dish(20,"steak", "meat"), new Drink(1,"coke", "soda")};
        Order order = new RestaurantOrder(items);
        order.add(new Drink(5,"MilkShake","freezes yo brain"));
        order.add(new Drink(5,"MilkShake","freezes yo brain"));
        order.add(new Drink(5,"MilkShake","freezes yo brain"));
        order.add(new Drink(5,"coke","drink"));

    }
}
