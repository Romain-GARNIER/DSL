package main.java.dsl.rythmml.model;

public enum DrumElement {
    AcousticBassDrum(35), BassDrum1(36), SideStick(37), AcousticSnare(38), HandClap(39), ElectricSnare(40),
    LowFloorTom(41), ClosedHiHat(42), OpenHiHat(46);

    public int noteNumber;

    private DrumElement(int noteNumber) {
        this.noteNumber = noteNumber;
    }
}