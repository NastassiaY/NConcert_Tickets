package constants;

public enum StadiumSector {
    A('A'),
    B('B'),
    C('C');

    private final char sector;

    StadiumSector(char sector) {
        this.sector = sector;
    }
}