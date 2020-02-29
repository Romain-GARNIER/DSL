package main.java.dsl.rythmml;

import javax.sound.midi.Track;

public class SequenceDSL {
    String name;
    Track track;
    int nbBar;
    int nbBeatPerBar;

    public SequenceDSL(String name, Track track, int nbBar, int nbBeatPerBar) {
        this.name = name;
        this.track = track;
        this.nbBar = nbBar;
        this.nbBeatPerBar = nbBeatPerBar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public int getNbBeatPerBar() {
        return nbBeatPerBar;
    }

    public void setNbBeatPerBar(int nbBeatPerBar) {
        this.nbBeatPerBar = nbBeatPerBar;
    }
}
