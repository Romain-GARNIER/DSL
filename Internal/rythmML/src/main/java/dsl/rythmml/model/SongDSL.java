package main.java.dsl.rythmml.model;

import javax.sound.midi.InvalidMidiDataException;
import java.util.HashMap;
import java.util.Map;

public class SongDSL {
    private String name;
    private int resolution;
    private int tempo;
    Map<String, SequenceDSL> sequenceDSLList;
    Map<String, TrackDSL> trackDSLList;


    //region Constructors
    public SongDSL(String name, int resolution) throws InvalidMidiDataException {
        this.name = name;
        this.resolution = resolution;
        sequenceDSLList = new HashMap<String, SequenceDSL>();
        trackDSLList = new HashMap<String, TrackDSL>();

        this.tempo = 100;
    }

    public SongDSL(String name, int resolution, int tempo) throws InvalidMidiDataException {
        this.name = name;
        this.resolution = resolution;
        this.tempo = tempo;
        sequenceDSLList = new HashMap<String, SequenceDSL>();
        trackDSLList = new HashMap<String, TrackDSL>();
    }

    public SongDSL(String name, int resolution, Map<String, SequenceDSL> sequences) {
        this.name = name;
        this.resolution = resolution;
        this.sequenceDSLList = sequences;
    }
    //endregion

    //region Accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public Map<String, SequenceDSL> getSequenceDSLList() {
        return sequenceDSLList;
    }

    public void setSequenceDSLList(Map<String, SequenceDSL> sequenceDSLList) {
        this.sequenceDSLList = sequenceDSLList;
    }

    public Map<String, TrackDSL> getTrackDSLList() {
        return trackDSLList;
    }

    public void setTrackDSLList(Map<String, TrackDSL> trackDSLList) {
        this.trackDSLList = trackDSLList;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    //endregion

    //region Methods
    public void addSequenceDSL(SequenceDSL sequenceDSL){
        this.sequenceDSLList.put(sequenceDSL.getName(),sequenceDSL);
    }

    public void addTrackDSL(TrackDSL trackDSL){
        this.trackDSLList.put(trackDSL.getName(),trackDSL);
    }

    public int getDuration(){
        int duration = 0;

        for(SequenceDSL sequenceDSL : sequenceDSLList.values()){
            duration += sequenceDSL.getDuration();
        }

        return duration/tempo;
    }
    //enregion
}
