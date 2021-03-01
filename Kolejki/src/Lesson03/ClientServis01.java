package Lesson03;

import java.util.PriorityQueue;
import java.util.Queue;

public class ClientServis01 {
    public static void main(String[] args) {
        Queue<Client> clientQueue = new PriorityQueue<>();

        clientQueue.add(new Client("Karol", 2));
        clientQueue.add(new Client("Partycja", 1));
        clientQueue.add(new Client("Andrzej", 4));
        clientQueue.add(new Client("Mati", 3));

        System.out.println("\nKosnstuktor z przekazanym konstuktorem w klasie Client.");
        System.out.println(clientQueue);
        while (!clientQueue.isEmpty()) {
            System.out.println("Klient :" + clientQueue.poll());
        }
    }
}
