
/**
 * Clock class for Ex89
 */

public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBegin, int minutesAtBegin, int secondsAtBegin) {
        this.hours = new BoundedCounter(24);
        this.hours.setValue(hoursAtBegin);
        this.minutes = new BoundedCounter(60);
        this.minutes.setValue(minutesAtBegin);
        this.seconds = new BoundedCounter(60);
        this.seconds.setValue(secondsAtBegin);
    }

    public void tick() {
        this.seconds.next();
        if (this.seconds.getValue() == 0) {
            this.minutes.next();
            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}