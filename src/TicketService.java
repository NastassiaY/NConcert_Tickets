import constants.StadiumSector;

import java.time.Instant;

public class TicketService {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                StadiumSector sector = StadiumSector.values()[(int) (Math.random() * StadiumSector.values().length)];
                new Ticket("Wembley", 333, Instant.now().getEpochSecond(), false, sector, 5.0F);
            }
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
