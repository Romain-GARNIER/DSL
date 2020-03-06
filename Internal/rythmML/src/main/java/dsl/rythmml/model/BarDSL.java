package main.java.dsl.rythmml.model;

import java.util.ArrayList;
import java.util.List;

public class BarDSL {
    int nbBeat;
    int nbTicksPerBeat;


    //region Constructors
    public BarDSL(int nbBeat, int nbTicksPerBeat){
        this.nbTicksPerBeat = nbTicksPerBeat;
        this.nbBeat = nbBeat;

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

    //endregion
}
