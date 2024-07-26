import constants.StadiumSector;
import java.time.Instant;
import java.util.UUID;

public class Ticket {
    private final String ticketID;
    private String concertHallName;
    private int eventCode;
    private final long time;
    private boolean isPromo;
    private StadiumSector stadiumSector;
    private float bagWeightMAX;

    public Ticket() {
        this.ticketID = UUID.randomUUID().toString().substring(0,3);
        this.time = Instant.now().getEpochSecond();
    }

    public Ticket(String concertHallName, int eventCode, long time) {
        this.ticketID = UUID.randomUUID().toString().substring(0,3);
        if (concertHallName.length() > 10) {
            throw new IllegalArgumentException("ConcertHallName shouldn't be longer than 10 chars");
        }
        this.concertHallName = concertHallName;
        if(((int) (Math.log10(eventCode) + 1)) != 3 ) {
            throw new IllegalArgumentException("EventCode should contain 3 digits");
        }
        this.eventCode = eventCode;
        this.time = time;
    }

    private Ticket(String concertHallName, int eventCode,
                  long time, boolean isPromo, StadiumSector stadiumSector, float bagWeightMAX) {
        this.ticketID = UUID.randomUUID().toString().substring(0,3);
        if (concertHallName.length() > 10) {
            throw new IllegalArgumentException("ConcertHallName shouldn't be longer than 10 chars");
        }
        this.concertHallName = concertHallName;
        if(((int) (Math.log10(eventCode) + 1)) != 3 ) {
            throw new IllegalArgumentException("EventCode should contain 3 digits");
        }
        this.eventCode = eventCode;

        this.time = time;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        if (bagWeightMAX <= 0) {
            throw new IllegalArgumentException("BagWeightMAX should be above 0");
        }
        this.bagWeightMAX = bagWeightMAX;
    }

    public static Ticket createFullTicket(String concertHallName, int eventCode, long time, boolean isPromo,
                                          StadiumSector stadiumSector, float bagWeightMAX) {
        return new Ticket(concertHallName, eventCode, time, isPromo, stadiumSector, bagWeightMAX);
    }

    public void setConcertHallName(String concertHallName) {
        if (concertHallName.length() > 10) {
            throw new IllegalArgumentException("ConcertHallName shouldn't be longer than 10 chars");
        }
        this.concertHallName = concertHallName;
    }

    public void setEventCode(int eventCode) {
        if(((int) (Math.log10(eventCode) + 1)) != 3 ) {
            throw new IllegalArgumentException("EventCode should contain 3 digits");
        }
        this.eventCode = eventCode;
    }

    public void setPromo(boolean promo) {
        isPromo = promo;
    }

    public void setStadiumSector(StadiumSector stadiumSector) {
        this.stadiumSector = stadiumSector;
    }

    public void setBagWeightMAX(float bagWeightMAX) {
        if (bagWeightMAX <= 0) {
            throw new IllegalArgumentException("BagWeightMAX should be above 0");
        }
        this.bagWeightMAX = bagWeightMAX;
    }

    public String getTicketID() {
        return ticketID;
    }

    public StadiumSector getStadiumSector() {
        return stadiumSector;
    }
}
