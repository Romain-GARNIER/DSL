package io.github.mosser.arduinoml.kernel.structural;

public abstract class Condition {
    protected Sensor sensor;
    protected SIGNAL value = SIGNAL.HIGH;

    public SIGNAL getValue() {
        return value;
    }

    public void setValue(SIGNAL value) {
        this.value = value;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

}
