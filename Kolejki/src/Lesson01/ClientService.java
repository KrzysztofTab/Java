package Lesson01;

import java.util.LinkedList;
import java.util.Queue;

public class ClientService {
    public static void main(String[] args) {
        Queue<Client> clientQueue = new LinkedList<>();
//        offer(E e) - dodaje do kolejki element zgodny z zadeklarowanym typem generycznym (można też wywołać metodę add()),
        clientQueue.offer(new Client("Kasia"));
        clientQueue.offer(new Client("Janek"));
        clientQueue.add(new Client("Paula"));
        clientQueue.add(new Client("Mati"));

//        peek() - pobiera element z kolejki, ale go nie usuwa,
        System.out.println("Metoda peek() (1): " + clientQueue.peek());
        System.out.println("Metoda peek() (2): " + clientQueue.peek());
//        poll() - pobiera element z kolejki i go z niej usuwa. Zwraca null, gdy kolejka jest pusta.
        System.out.println("Metoda poll() (1): " + clientQueue.poll());
        System.out.println("Metoda poll() (2): " + clientQueue.poll() + "\n");
//        Oprócz tego mamy też metody wynikające z interfejsu Collection takie jak
//        size(), contains(), remove(), czy clear().

        System.out.println("Stan kolejki: " + clientQueue);
        System.out.println("Peek " + clientQueue.peek());
        System.out.println("Stan kolejki: " + clientQueue);
        System.out.println("Poll " + clientQueue.poll());
        System.out.println("Stan kolejki: " + clientQueue);
    }
}
