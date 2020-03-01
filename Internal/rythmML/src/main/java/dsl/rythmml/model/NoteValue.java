package main.java.dsl.rythmml.model;

public enum NoteValue {
    Do(10);

    public int noteNumber;

    private NoteValue(int noteNumber) {
        this.noteNumber = noteNumber;
    }
}
