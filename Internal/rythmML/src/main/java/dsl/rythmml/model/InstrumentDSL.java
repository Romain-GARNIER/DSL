package main.java.dsl.rythmml.model;

public enum InstrumentDSL {
    Drum(0),
    Piano(1),
    BrightPiano(2),
    ElectricPiano(3),
    ElectricGuitar(28);

    int value;

    private InstrumentDSL(int value){
        this.value = value;
    }
}
