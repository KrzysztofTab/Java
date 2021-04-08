package Cinema;

public class Ticket {
    private Customer customer;
    private Show show;
    private int ticket;

    public Ticket(Customer customer, Show show, int ticket) {
        this.customer = customer;
        this.show = show;
        this.ticket = ticket;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getInfo() {
        return getTicket() + " | " + customer.getFullName() + " | " + show.getMovieInfo();
    }
}