
/**
 * CD class implementing ToBeStored interface for Ex118
 */

public class CD implements ToBeStored {
    private String artist;
    private String album;
    private int publishingYear;
    private double weight;

    public CD(String artist, String album, int year) {
        this.artist = artist;
        this.album = album;
        this.publishingYear = year;
        this.weight = 0.1;
    }

    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.album + " (" + this.publishingYear + ")";
    }
}