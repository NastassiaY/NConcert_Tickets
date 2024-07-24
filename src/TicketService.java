import java.time.Instant;

import static java.time.Instant.*;

public class TicketService {
    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[10];
        for(int i = 0; i < 10; i++) {
            tickets[i] = new Ticket();
        }

    }

    public Ticket getTicket(String ticketID, Ticket[] tickets) {
        Ticket ticket = null;
        for(Ticket t : tickets) {
            if(ticketID.equals(t.getTicketID())) ticket = t;
        }
        return ticket;
    }
}
