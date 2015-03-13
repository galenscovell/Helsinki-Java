
/**
 * Thermometer class implementing Sensor, begins off.
 * Measure returns random value between -30 and 30 when ON.
 * Measuring from OFF state results in a thrown exception.
 */

package application;

import java.util.Random;


public class Thermometer implements Sensor {
    private boolean active;

    public Thermometer() {
        this.active = false;
    }

    public boolean isOn() {
        return this.active;
    }

    public int measure() {
        Random gen = new Random();
        int temp;
        if (this.active) {
            temp = (gen.nextInt(60) - 30);
            return temp;
        } else {
            throw new IllegalStateException("The Thermometer must be ON in order to measure.");
        }
    }

    public void on() {
        if (this.active) {
            System.out.println("The Thermometer is already ON.");
        } else {
            this.active = true; 
        }
    }

    public void off() {
        if (this.active) {
            this.active = false;
        } else {
            System.out.println("The Thermometer is already OFF.");
        }
    }
}