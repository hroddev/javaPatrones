package BehavioralDesignPattern.Iterator;

import java.util.ArrayList;

public class Clients implements ClientIterator {

    private ArrayList<Client> clients = new ArrayList<>();
    private int index = 0;

    public void create(Client client){
        clients.add(client);
    }

    @Override
    public boolean hasMore() {
        return index < clients.size();
    }

    @Override
    public void reset() {
        index = 0;
    }

    @Override
    public Client next() {
        Client client = clients.get(index);
        index ++;
        return client;
    }
}
