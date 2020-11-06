interface Order {
    int size = 0;
    Item[] items = new Item[size];


    public boolean add(Item insertedItem);

    public boolean remove(String itemName);

    public int removeAll(String itemName);

    public int itemQuantity(String itemName);

    public int itemQuantity();

    public Item[] getItems();

    public double getTotal();

    public String[] dishesNames();

    public Item[] sortedDishesByCostDesc();
}
