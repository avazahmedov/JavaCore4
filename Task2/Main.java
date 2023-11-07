package Task2;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ClientNotFoundException, WrongCountException, ItemNotFoundException {
        Client client = new Client("avaz");
        Client client1 = new Client("karima");
        Client client2 = new Client("yuriy");
        Client client3 = new Client("segey");
        Client client4 = new Client("testException");
        Client.clients.add(client);
        Client.clients.add(client1);
        Client.clients.add(client2);
        Client.clients.add(client3);
        List<Client> clients = client.getClients();
        System.out.println(clients);

        Item item = new Item("apple");
        Item item1 = new Item("table");
        Item item2 = new Item("vodka");
        Item item3 = new Item("toy");
        Item item4 = new Item("tv");
        Item item5 = new Item("watch");
        Item item6 = new Item("testException");
        Item.items.add(item);
        Item.items.add(item1);
        Item.items.add(item2);
        Item.items.add(item3);
        Item.items.add(item4);
        Item.items.add(item5);
        List<Item> items = item.getItems();
        System.out.println(items);

        Order order = Order.buy(client, item, -5);
        System.out.println(order);
//        Order order1 = Order.buy(client4, item, 5);
//        System.out.println(order1);
//        Order order2 = Order.buy(client2, item6, 2);
//        System.out.println(order2);
    }


}
