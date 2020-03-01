package main.java.dsl.rythmml.model;

public enum NoteValue {
    Do(10),
    AcousticBassDrum(35),
    BassDrum1(36),
    SideStick(37),
    AcousticSnare(38),
    HandClap(39),
    ElectricSnare(40),
    LowFloorTom(41),
    ClosedHiHat(42),
    HighFloorTom(43),
    OpenHiHat(46),
    CrashCymbal1(49);

    public int noteNumber;

    private NoteValue(int noteNumber) {
        this.noteNumber = noteNumber;
    }
}
