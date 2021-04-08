import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrBlockingQueue {
    public static void main(String[] args) {
//        waznym elementem w ArrayBlockingQueue ze podajemy wielosć naszej kolejki "3"
        Queue<String> clients  = new ArrayBlockingQueue<>(3);
//        przy ArrayBlockingQueue nie mozemy użyć add tylko offer
        clients.offer("Karolnia");
        clients.offer("Anna");
        clients.offer("Jakub");
        clients.offer("Mariusz");

        System.out.println("Klient " + clients.poll());
        System.out.println("Klient " + clients.poll());
        System.out.println("Klient " + clients.poll());
        System.out.println("Klient " + clients.poll());
        System.out.println(clients);
    }
}
