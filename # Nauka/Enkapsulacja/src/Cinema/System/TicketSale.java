package Cinema.System;

import Cinema.Customer;
import Cinema.Show;
import Cinema.Ticket;

public class TicketSale {
    public static void main(String[] args) {
        Show show = new Show("Omen", "Horror", 130, 16, 72, 72);

        Customer cas01 = new Customer("Jan", "Kowalski", 19);
        Customer cas02 = new Customer("Anna", "Zaleska", 17);

        TicketSytem ticketSytem = new TicketSytem();
        Ticket ticket01 = ticketSytem.createTicket(show,cas01);
        Ticket ticket02 = ticketSytem.createTicket(show,cas02);

        System.out.println("Sprzedane bilety:");
        if (ticket01 != null) {
            System.out.println(ticket01.getInfo());
        }
        if (ticket02 != null) {
            System.out.println(ticket02.getInfo());
        }

        System.out.println();
        System.out.println("Liczba pozostałych miejsc: " + show.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (show.getMaxSeats() - show.getFreeSeats()));
    }

}
