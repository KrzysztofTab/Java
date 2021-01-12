package OnlineShop;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Order[] orders = createOrders();
        OrderStatus orderStatus = readStatus();
        Order[] filteredOrders = filterOrdersByStatus(orders, orderStatus);
        printOrders(filteredOrders, orderStatus);
    }

    private static void printOrders(Order[] filteredOrders, OrderStatus orderStatus) {
        System.out.println("Lista zamówień ze statusem " + orderStatus);
        for (Order order : filteredOrders) {
            System.out.println(order);
        }
    }

    //    Metoda createOrders() służy do zdefiniowania tablicy z danymi testowymi.
    private static Order[] createOrders() {
        Order[] orders = new Order[10];
        orders[0] = new Order("Komputer Apple MacBook Pro 2018", 4999, OrderStatus.PAID);
        orders[1] = new Order("Telefon Samsung Galaxy s10", 2499, OrderStatus.SHIPPED);
        orders[2] = new Order("Telefon Apple iPhone X", 2999, OrderStatus.PAID);
        orders[3] = new Order("Pralka Beko X2000", 1499, OrderStatus.DELIVERED);
        orders[4] = new Order("Lodówka Samsung AT200", 1199, OrderStatus.DELIVERED);
        orders[5] = new Order("Głośnik JBL z100", 199, OrderStatus.NEW);
        orders[6] = new Order("Kino Domowe Yamaha XBC900", 3499, OrderStatus.CANCELLED);
        orders[7] = new Order("Konsola Sony Playstation 4", 1499, OrderStatus.SHIPPED);
        orders[8] = new Order("Adapter USBC - HDMI", 149, OrderStatus.PAID);
        orders[9] = new Order("Żelazko Zelmer PRIMO", 99.99, OrderStatus.SHIPPED);
        return orders;
    }

    private static OrderStatus readStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj status zamówień do wyświetlenia (");
        for (OrderStatus os : OrderStatus.values()) {
            System.out.print(os.name() + " ");
        }
        System.out.println("):");
        String status = scanner.nextLine();
        return OrderStatus.valueOf(status);
    }

    //    filterOrdersByStatus() to metoda opisana w treści zadania. Służy ona do przefiltrowania listy zamówień
//    i wybraniu z nich tylko tych, które mają określony status. Ponieważ operujemy na tablicach,
//    które mają jasno określony rozmiar, to najpierw w pomocniczej metodzie countOrderByStatus()
//    zliczam ile zamówień z oryginalnej tablicy ma określony status.
    private static Order[] filterOrdersByStatus(Order[] orders, OrderStatus orderStatus) {
        int size = countOrderByStatus(orders, orderStatus);
        Order[] orderByStatus = new Order[size];
        int counter = 0;
        for (Order order : orders) {
            if (order.getStatus() == orderStatus) {
                orderByStatus[counter] = order;
                counter++;
            }
        }
        return orderByStatus;
    }

    private static int countOrderByStatus(Order[] orders, OrderStatus orderStatus) {
        int count = 0;
        for (Order order : orders) {
            if (order.getStatus() == orderStatus)
                count++;
        }
        return count;
    }
}
