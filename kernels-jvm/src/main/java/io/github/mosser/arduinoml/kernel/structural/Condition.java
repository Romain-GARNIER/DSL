package io.github.mosser.arduinoml.kernel.structural;

public abstract class Condition {
    protected Sensor sensor;
    protected SIGNAL value = SIGNAL.HIGH;
    protected int analogValue;
    protected Comparator comparator;

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

    public int getAnalogValue() {
        return analogValue;
    }

    public Comparator getComparator() {
        return comparator;
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    public void setAnalogValue(int analogValue) {
        this.analogValue = analogValue;
    }
}
