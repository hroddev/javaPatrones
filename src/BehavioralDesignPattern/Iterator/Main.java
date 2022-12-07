package BehavioralDesignPattern.Iterator;

public class Main {

    public static void main(String[] args) {

        Clients clients = new Clients();

        clients.create(new Client("Hector", 42));
        clients.create(new Client("Lia", 14));
        clients.create(new Client("Karo", 41));

        while (clients.hasMore()) {
            Client client = clients.next();
            System.out.println("Client is: " + client.getName());
        }

        clients.create(new Client("Lucas", 9));
        Client client = clients.next();
        System.out.println("Client is: " + client.getName());

        clients.reset();
        System.out.println(" ");

        while (clients.hasMore()) {
            client = clients.next();
            System.out.println("Client is: " + client.getName());
        }


    }
}
