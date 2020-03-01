package main.java.dsl.rythmml.model;

import java.util.ArrayList;
import java.util.List;

public class BarDSL {
    int nbBeat;
    int nbTicksPerBeat;
    List<BeatDSL> beats;

    //region Constructors
    public BarDSL(int nbBeat, int nbTicksPerBeat){
        this.nbTicksPerBeat = nbTicksPerBeat;
        this.nbBeat = nbBeat;
        beats = new ArrayList<BeatDSL>();

        for(int i=0;i<nbBeat;i++){
            beats.add(new BeatDSL(nbTicksPerBeat));
        }
    }
    //endregion

    //region Accessors
    public int getNbBeat() {
        return nbBeat;
    }

    public void setNbBeat(int nbBeat) {
        this.nbBeat = nbBeat;
    }

    public int getNbTicksPerBeat() {
        return nbTicksPerBeat;
    }

    public void setNbTicksPerBeat(int nbTicksPerBeat) {
        this.nbTicksPerBeat = nbTicksPerBeat;
    }

    public List<BeatDSL> getBeats() {
        return beats;
    }

    public void setBeats(List<BeatDSL> beats) {
        this.beats = beats;
    }
    //endregion
}
