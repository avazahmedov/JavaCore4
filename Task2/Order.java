package Task2;

import java.util.ArrayList;
import java.util.List;

public class Order {
    Client client;
    Item item;
    int count;

    static List<Order> orders = new ArrayList<>();

    public static Order buy(Client client, Item item, int count) throws ClientNotFoundException, ItemNotFoundException, WrongCountException {
        if(!client.clients.contains(client)){
            throw new ClientNotFoundException("Client not found!");
        } else if (!item.items.contains(item)){
            throw new ItemNotFoundException("Item not found!");
        } else if (count < 0) {
            throw new WrongCountException("Count must be above zero!");
        }
        Order order = new Order();
        order.client = client;
        order.item = item;
        order.count = count;
        return order;
    }
    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    @Override
    public String toString() {
        return "Order{" +
                "client=" + client +
                ", item=" + item +
                ", count=" + count +
                '}';
    }
}
