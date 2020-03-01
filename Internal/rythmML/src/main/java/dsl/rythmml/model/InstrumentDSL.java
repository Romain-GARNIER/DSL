package main.java.dsl.rythmml.model;

public enum InstrumentDSL {
    Piano(1),
    Drum(9);

    int value;

    private InstrumentDSL(int value){
        this.value = value;
    }
}
