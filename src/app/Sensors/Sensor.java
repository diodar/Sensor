package app.Sensors;

import app.Utils.Substance;

public abstract class Sensor {

    protected Substance substance;
    public abstract void update();

}
