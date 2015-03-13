
/**
 * Main class for Ex127, working with exceptions, packages and interfaces 
 * through the creation of various sensors.
 */

import application.AverageSensor;
import application.ConstantSensor;
import application.Sensor;
import application.Thermometer;


public class Main {

    public static void main(String[] args) {
        Thermometer thermo1 = new Thermometer();
        Thermometer thermo2 = new Thermometer();
        Thermometer thermo3 = new Thermometer();
        ConstantSensor ten = new ConstantSensor(10);
        
        AverageSensor avgSensor = new AverageSensor();
        avgSensor.add(thermo1);
        avgSensor.add(thermo2);
        avgSensor.add(thermo3);
        avgSensor.add(ten);

        avgSensor.on();
        System.out.println("\nAverage temperature of the sensors: " + avgSensor.measure());
        System.out.println("\nReadings: " + avgSensor.readings());
        avgSensor.off();
    }
}