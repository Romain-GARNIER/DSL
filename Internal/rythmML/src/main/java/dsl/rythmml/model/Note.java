package main.java.dsl.rythmml.model;

public class Note {
    private NoteValue noteValue;
    private int bar;
    private int beat;
    private int tick;
    private int velocity;
    private int duration;
    private int octave;

    public Note(NoteValue noteValue, int bar, int beat, int velocity, int duration) {
        this.noteValue = noteValue;
        this.bar = bar;
        this.beat = beat;
        this.velocity = velocity;
        this.duration = duration;
        this.octave = 0;
    }

    public Note(NoteValue noteValue, int bar, int beat, int velocity, int duration, int octave) {
        this.noteValue = noteValue;
        this.bar = bar;
        this.beat = beat;
        this.velocity = velocity;
        this.duration = duration;
        this.octave = octave;
    }

    public NoteValue getNoteValue() {
        return noteValue;
    }

    public void setNoteValue(NoteValue noteValue) {
        this.noteValue = noteValue;
    }

    public int getBar() {
        return bar;
    }

    public void setBar(int bar) {
        this.bar = bar;
    }

    public int getBeat() {
        return beat;
    }

    public void setBeat(int beat) {
        this.beat = beat;
    }

    public int getTick() {
        return tick;
    }

    public void setTick(int tick) {
        this.tick = tick;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getOctave() {
        return octave;
    }

    public void setOctave(int octave) {
        this.octave = octave;
    }
}
