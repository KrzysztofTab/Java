package Cinema.System;

import Cinema.Customer;
import Cinema.Show;
import Cinema.Ticket;

public class TicketSytem {
    Ticket createTicket(Show show, Customer customer) {
        if (!show.hasFreeSeats()) {
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (customer.getAge() < show.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + show.getAgeRequired() + " lat");
            return null;
        } else {
            int tickedId = show.getMaxSeats() - show.getFreeSeats() + 1;
            return new Ticket(customer, show, tickedId);
        }
    }
}
