package main.java.dsl.rythmml.model;

import java.util.ArrayList;
import java.util.List;

public class SequenceDSL {
    private String name;
    private int nbBar;
    private int nbBeatPerBar;
    private int nbTicks;
    private List<BarDSL> bars;
    private List<Note> notes;

    //region Constructors
    public SequenceDSL(String name, int nbBar, int nbBeatPerBar) {
        this.name = name;
        this.nbBar = nbBar;
        this.nbBeatPerBar = nbBeatPerBar;
        notes = new ArrayList<>();
    }
    //endregion

    //region Accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbBeatPerBar() {
        return nbBeatPerBar;
    }

    public void setNbBeatPerBar(int nbBeatPerBar) {
        this.nbBeatPerBar = nbBeatPerBar;
    }

    public int getNbBar() {
        return nbBar;
    }

    public void setNbBar(int nbBar) {
        this.nbBar = nbBar;
    }

    public int getNbTicks() {
        return nbTicks;
    }

    public void setNbTicks(int nbTicks) {
        this.nbTicks = nbTicks;
    }

    public List<BarDSL> getBars() {
        return bars;
    }

    public void setBars(List<BarDSL> bars) {
        this.bars = bars;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    //endregion

    //region Methods
    public void addNote(Note note){
        this.notes.add(note);
    }

    public void addNote(NoteValue noteValue, int bar, int beat, int tick, int velocity, int duration){
        this.notes.add(new Note(noteValue,bar, beat, tick, velocity, duration));
    }

    public int getDuration(){
        return nbBar * nbBeatPerBar * 60000;
    }
    //endregion
}
