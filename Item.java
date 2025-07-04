public class Item {
    Integer id;
    Double cost;
    Boolean available;

    Item(Integer id, Double cost, Boolean available) {
        this.id = id;
        this.cost = cost;
        this.available = available;
        System.out.println("Item " + id + " created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Item " + id + " garbage collected");
        super.finalize();
    }
}

class ItemDemo {
    public static void main(String[] args) {
        Item item1 = new Item(1, 25.5, true);
        Item item2 = new Item(2, 15.0, false);
        item2 = item1;
        item1 = null;
        System.gc();
    }
}


/*  output
   Item 1 created
   Item 2 created 
   Item 2 garbage collected

 */