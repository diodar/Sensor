package app.sensors;

import app.utils.Substance;

public abstract class Sensor {

    protected Substance substance;
    public abstract void update();

}
