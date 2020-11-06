public class InternetOrder implements Order  {
    private int size;
    private Item[] items = new Item[size];

    public InternetOrder() {
        items[0] = new Dish("head", "firstItem");
    }

    public InternetOrder(Item[] items) {
        this.items = items;
        this.size = items.length;
    }

    public boolean add(Item insertedItem) {
        Item[] newItems = new Item[items.length+1];
        System.arraycopy(items, 0, newItems, 0, items.length);
        try {
            newItems[items.length] = insertedItem;
            items = newItems;
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public boolean remove(String itemName) {
        Item[] newItems = new Item[items.length-1];
        int j = 0;
        boolean flag = false;
        for (int i = items.length-1; i>-1;i--) {
            if (!(items[i].getName().equals(itemName)) | !flag) {
                newItems[j] = items[i];
                j++;
                flag = true;
            }
        }
        for (int i = 0; i <  newItems.length / 2; i++) {
            Item temp = newItems[i];
            newItems[i] = newItems[newItems.length - 1 - i];
            newItems[newItems.length - 1 - i] = temp;
        }
        items = newItems;
        return true;
    }

    public int removeAll(String itemName) {
        int j = 0, count = 0;

        for (Item item : items) {
            if (!(item.getName().equals(itemName))) {
                count++;
            }
        }
        Item[] newItems = new Item[count];
        for (Item item : items) {
            if (!(item.getName().equals(itemName))) {
                newItems[j] = item;
                j++;
            }
        }
        items = newItems;
        return count;
    }

    public int itemQuantity(String itemName) {
        int quantity = 0;
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                quantity++;
            }
        }
        return quantity;
    }

    public int itemQuantity() {
        return items.length;
    }

    public Item[] getItems() {
        return items;
    }

    public double getTotal() {
        double total = 0;
        for (Item item: items) {
            total+=item.getPrice();
        }
        return total;
    }

    public String[] dishesNames() {
        String[] temp = new String[items.length];
        int i = 0;
        int count = 0;
        for (Item item: items) {
            if ( !ExtraMethods.checkIfContains(temp, item.getName()) ) {
                temp[i] = item.getName();
                if (temp[i]!=null) {
                    count++;
                }
                i++;
            }
        }


        String[] names = new String[count];
        for (i = 0; i<names.length; i++) {
            names[i] = temp[i];
        }

        return names;
    }

    public Item[] sortedDishesByCostDesc() {
        Item[] sortedItems = items;
        for (int i = 0; i < items.length-1; i++)
            for (int j = 0; j < items.length-i-1; j++)
                if (sortedItems[j].getPrice() < sortedItems[j+1].getPrice())
                {
                    Item temp = sortedItems[j];
                    sortedItems[j] = sortedItems[j+1];
                    sortedItems[j+1] = temp;
                }
        return sortedItems;
    }
}
