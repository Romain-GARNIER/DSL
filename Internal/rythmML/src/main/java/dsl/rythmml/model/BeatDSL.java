package main.java.dsl.rythmml.model;

import java.util.List;

public class BeatDSL {
    private int nbTicks;
    private List<TickDSL> ticks;

    public BeatDSL(int nbTicks) {
        this.nbTicks = nbTicks;

        for(int i=0;i<nbTicks;i++){
            ticks.add(new TickDSL());
        }
    }

    public int getNbTicks() {
        return nbTicks;
    }

    public void setNbTicks(int nbTicks) {
        this.nbTicks = nbTicks;
    }

    public List<TickDSL> getTicks() {
        return ticks;
    }

    public void setTicks(List<TickDSL> ticks) {
        this.ticks = ticks;
    }
}
