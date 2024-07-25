import constants.StadiumSector;

import java.time.Instant;
import java.util.ArrayList;

public class TicketService {
    public static void main(String[] args) {
        ArrayList<Ticket> soldTickets = new ArrayList<>();
        try {
            for (int i = 0; i < 10; i++) {
                StadiumSector sector = StadiumSector.values()[(int) (Math.random() * StadiumSector.values().length)];
                soldTickets.add(new Ticket("Wembley", 333, Instant.now().getEpochSecond(), false, sector, 5.0F));
            }

            System.out.println(getTicketBySector(StadiumSector.A, soldTickets));
            System.out.println(getTicketBySector(StadiumSector.B, soldTickets));
            System.out.println(getTicketBySector(StadiumSector.C, soldTickets));

        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static ArrayList<Ticket> getTicketBySector(StadiumSector sector, ArrayList<Ticket> soldTickets) {
        ArrayList<Ticket> ticketsBySector = new ArrayList<>();

        for (Ticket ticket : soldTickets) {
            if (ticket.getStadiumSector() == sector) {
                ticketsBySector.add(ticket);
            }
        }
        return ticketsBySector;
    }
}
