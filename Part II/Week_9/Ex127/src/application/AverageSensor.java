
/**
 * Average sensor implementing Sensor, contains many sensors and is only ON
 * when all of its sensors are also ON.
 * When it is switched ON, all of its sensors are also switched ON.
 * Measure returns average of all of its sensor's readings.
 * Measuring from OFF state results in a thrown exception.
 */

package application;

import java.util.ArrayList;
import java.util.List;


public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void add(Sensor sensor) {
        this.sensors.add(sensor);
    }
    
    public boolean isOn() {
        boolean allTrue = true;
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                allTrue = false;
            }
        }
        return allTrue;
    }

    public void on() {
        for (Sensor sensor : this.sensors) {
            sensor.on();
        }
    }

    public void off() {
        for (Sensor sensor : this.sensors) {
            sensor.off();
        }
    }

    public int measure() {
        int total = 0;
        if (this.isOn()) {
            for (Sensor sensor : this.sensors) {
                int sensorVal = sensor.measure();
                this.readings.add(sensorVal);
                total += sensorVal;
            }
            int average = total / this.sensors.size();
            return average;
        } else {
            throw new IllegalStateException("Sensor's must all be ON in order to get a reading.");
        }
    }

    public List<Integer> readings() {
        return this.readings;
    }
}