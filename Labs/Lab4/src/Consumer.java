public class Consumer {
    static double money = 2000;
    static double backPackCapacity = 5;
    public static void main(String[] args) {
        Laptop laptop = new Laptop(1000, "Dell");
        Smartphone smartphone = new Smartphone(400, "Samsung");
        if (money > (laptop.getPrice() + smartphone.getPrice())) {
            backPackCapacity-= 1.5;
            money-=smartphone.getPrice()+laptop.getPrice();
        }

        System.out.println(Consumer.money + " money is left");
        System.out.println(Consumer.backPackCapacity + " space is left");
    }
}
