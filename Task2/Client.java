package Task2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    String name;
    static List<Client> clients = new ArrayList<>();

    public Client(String name) {
        this.name = name;
    }
    public List<Client> getClients() {
        return clients;
    }
    public void addClient(Client client){
        clients.add(client);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
