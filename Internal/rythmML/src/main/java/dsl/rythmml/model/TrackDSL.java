package main.java.dsl.rythmml.model;

import java.util.ArrayList;
import java.util.List;

public class TrackDSL {
    private String name;
    private List<SequenceDSL> sequenceDSLList;
    private InstrumentDSL instrumentDSL;

    //region Constructors
    public TrackDSL(String name) {
        this.name = name;
        sequenceDSLList = new ArrayList<SequenceDSL>();
    }

    public TrackDSL(String name, InstrumentDSL instrumentDSL) {
        this.name = name;
        this.instrumentDSL = instrumentDSL;
        sequenceDSLList = new ArrayList<SequenceDSL>();
    }
    //endregion

    //region Accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SequenceDSL> getSequenceDSLList() {
        return sequenceDSLList;
    }

    public void setSequenceDSLList(List<SequenceDSL> sequenceDSLList) {
        this.sequenceDSLList = sequenceDSLList;
    }

    public void addSequenceDSL(SequenceDSL sequenceDSL){
        this.sequenceDSLList.add(sequenceDSL);
    }

    public InstrumentDSL getInstrumentDSL() {
        return instrumentDSL;
    }

    public void setInstrumentDSL(InstrumentDSL instrumentDSL) {
        this.instrumentDSL = instrumentDSL;
    }

    //endregion
}
