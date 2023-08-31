package app;

import app.Sensors.ColorSensor;
import app.Sensors.WeightSensor;
import app.Utils.Substance;

public class Main {

    public static void main(String[] args) {

        Substance substance = new Substance();

        new WeightSensor(substance);
        new ColorSensor(substance);

        System.out.println("Substance temperature +25 ");
        substance.setState(25);

        System.out.println("Substance temperature -5 ");
        substance.setState(-5);
    }
}
