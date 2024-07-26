import java.time.Instant;

public class TicketService {
    public static void main(String[] args) {
        try {
            Ticket ticketFull = Ticket.createFullTicket("4321", "Wembley", 333, Instant.now().getEpochSecond(), false, 'A', 5.0F);

        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            Ticket ticketLimited = new Ticket("Wembley", 333, Instant.now().getEpochSecond());
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        Ticket ticketEmpty = new Ticket();

    }
}
