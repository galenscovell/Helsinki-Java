
/**
 * Bird class for Ex103.
 */

public class Bird {

    private String commonName;
    private String latinName;
    private int observed;

    public Bird(String common, String latin) {
        this.commonName = common;
        this.latinName = latin;
        this.observed = 0;
    }

    public String getName() {
        return this.commonName;
    }

    public void addObservation() {
        this.observed += 1;
    }

    public String toString() {
        return commonName + " (" + latinName + "): " + observed + " observations.";
    }

}