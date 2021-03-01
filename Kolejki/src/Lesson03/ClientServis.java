package Lesson03;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ClientServis {
    public static void main(String[] args) {
//        wykorzystanie komperatora klasy anonimowej
        Queue<Client> clients = new PriorityQueue<>(new Comparator<Client>() {
            @Override
            public int compare(Client c1, Client c2) {
                return Integer.compare(c1.getOrdersNumber(), c2.getOrdersNumber());
            }
        });
        clients.add(new Client("Karol", 2));
        clients.add(new Client("Partycja", 1));
        clients.add(new Client("Andrzej", 4));
        clients.add(new Client("Mati", 3));

        System.out.println("\nKosnstuktor z przekazanym konstuktorem klasy anonimowej.");
        System.out.println(clients);
        while (!clients.isEmpty()) {
            System.out.println("Klient :" + clients.poll());
        }
    }
}
