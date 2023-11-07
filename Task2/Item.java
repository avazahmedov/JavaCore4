package Task2;

import java.util.ArrayList;
import java.util.List;

public class Item {
    String type;
    static List<Item> items = new ArrayList<>();

    public Item(String type) {
        this.type = type;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    @Override
    public String toString() {
        return "Item{" +
                "type='" + type + '\'' +
                '}';
    }
}
