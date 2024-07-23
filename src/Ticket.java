import java.time.Instant;

public class Ticket {
    private String ticketID;
    private String concertHallName;
    private int eventCode;
    private long time;
    private boolean isPromo;
    private char stadiumSector;
    private float bagWeightMAX;

    public Ticket() {
        this.time = Instant.now().getEpochSecond();
    }

    public Ticket(String concertHallName, int eventCode, long time) {
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

    public Ticket(String ticketID, String concertHallName, int eventCode,
                  long time, boolean isPromo, char stadiumSector, float bagWeightMAX) {
        if (ticketID.length() > 4) {
            throw new IllegalArgumentException("TicketID shouldn't contain more than 4 digits and/or chars");
        }
        this.ticketID = ticketID;
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
        if(stadiumSector == 'A' || stadiumSector == 'B' || stadiumSector == 'C') {
        this.stadiumSector = stadiumSector;
        } else throw new IllegalArgumentException("StadiumSector should be A,B or C");
        if (bagWeightMAX <= 0) {
            throw new IllegalArgumentException("BagWeightMAX should be above 0");
        }
        this.bagWeightMAX = bagWeightMAX;
    }

    public void setTicketID(String ticketID) {
        if (ticketID.length() > 4) {
            throw new IllegalArgumentException("TicketID shouldn't contain more than 4 digits and/or chars");
        }
        this.ticketID = ticketID;
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

    public void setTime(long time) {
        this.time = time;
    }

    public void setPromo(boolean promo) {
        isPromo = promo;
    }

    public void setStadiumSector(char stadiumSector) {
        if(stadiumSector == 'A' || stadiumSector == 'B' || stadiumSector == 'C') {
            this.stadiumSector = stadiumSector;
        } else throw new IllegalArgumentException("StadiumSector should be A,B or C");
    }

    public void setBagWeightMAX(float bagWeightMAX) {
        if (bagWeightMAX <= 0) {
            throw new IllegalArgumentException("BagWeightMAX should be above 0");
        }
        this.bagWeightMAX = bagWeightMAX;
    }

}
