package main.java.dsl.rythmml.model;

public enum NoteValue {
    Do(0),
    DoX(1),
    Re(2),
    ReX(3),
    Mi(4),
    Fa(5),
    FaX(6),
    Sol(7),
    SolX(8),
    La(9),
    LaX(10),
    Si(11),



    AcousticBassDrum(35),
    BassDrum1(36),
    SideStick(37),
    AcousticSnare(38),
    ElectricSnare(40),
    HandClap(39),
    LowFloorTom(41),
    ClosedHiHat(42),
    HighFloorTom(43),
    OpenHiHat(46),
    CrashCymbal1(49),
    RideCymbal1(51),
    RideCymbal2(59);

    public int noteNumber;

    private NoteValue(int noteNumber) {
        this.noteNumber = noteNumber;
    }
}
