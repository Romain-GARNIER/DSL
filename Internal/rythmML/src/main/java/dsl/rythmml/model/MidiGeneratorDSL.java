package main.java.dsl.rythmml.model;

import javax.sound.midi.*;
import java.util.Collection;

public class MidiGeneratorDSL {
    private SongDSL songDSL;
    private Sequence sequence;
    private int CHANNEL = 1;

    public SongDSL getSongDSL() {
        return songDSL;
    }

    public void setSongDSL(SongDSL songDSL) {
        this.songDSL = songDSL;
    }

    public Sequence getSequence() {
        return sequence;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    public MidiGeneratorDSL(SongDSL songDSL) {
        this.songDSL = songDSL;
    }

    public void generateMidiSound() throws InvalidMidiDataException {
        sequence = new Sequence(Sequence.PPQ, songDSL.getResolution());
        int resolution = songDSL.getResolution();

        Collection<TrackDSL> trackDSLList = songDSL.getTrackDSLList().values();
        for(TrackDSL trackDSL : trackDSLList){
            InstrumentDSL instrumentDSL = trackDSL.getInstrumentDSL();
            Track track = sequence.createTrack();

            if(instrumentDSL.equals(InstrumentDSL.Drum)){
                CHANNEL = 9;
            }else {
                CHANNEL = 1;
            }

            int generalPos = 0;
            for(SequenceDSL sequenceDSL : trackDSL.getSequenceDSLList()){
                int nbBeatPerBar = sequenceDSL.getNbBeatPerBar();
                for(Note note : sequenceDSL.getNotes()){
                    int bar = note.getBar();
                    int beat = note.getBeat();

                    int pos = toTick(generalPos+bar,beat,0,nbBeatPerBar,resolution);
                    if(!instrumentDSL.equals(InstrumentDSL.Drum))
                        setInstrumentToTick(track,instrumentDSL.value, pos);
                    addNote(track,note,pos,note.getVelocity());
                }
                generalPos += sequenceDSL.getNbBar();
            }
        }
    }

    private int toTick(int bar, int beat, double division, int nbBeatPerBar, int resolution) {
        int pos = bar * nbBeatPerBar * resolution;
        pos += beat * resolution;
        pos += division * resolution;
        return pos;
    }

    private void setInstrument(Track track, int instrumentValue){
        ShortMessage message = new ShortMessage();

        try {
            message.setMessage(ShortMessage.PROGRAM_CHANGE, CHANNEL, instrumentValue, 0);
            MidiEvent event = new MidiEvent(message, 0);
            track.add(event);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setInstrumentToTick(Track track, int instrumentValue, int tick){
        ShortMessage message = new ShortMessage();

        try {
            message.setMessage(ShortMessage.PROGRAM_CHANGE, CHANNEL, instrumentValue, 0);
            MidiEvent event = new MidiEvent(message, tick);
            track.add(event);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void addNote(Track track, Note note, long tick, int velocity) {
        final int NOTEON = 144;
        final int NOTEOFF = 128;

        for(int i=0;i<note.getDuration();i++){
            createEvent(track, NOTEON, CHANNEL, note, tick, velocity);
        }
        createEvent(track, NOTEOFF, CHANNEL, note, tick + note.getDuration(), velocity);
    }

    private void createEvent(Track track, int type, int chan, Note note, long tick, int velocity) {
        ShortMessage message = new ShortMessage();

        int noteNumber = note.getNoteValue().noteNumber + (12*note.getOctave());

        try {
            message.setMessage(type, chan, noteNumber, velocity);
            MidiEvent event = new MidiEvent(message, tick);
            track.add(event);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void play() throws Exception {
        if(sequence == null)
            throw new Exception("seqeuence not initialize");

        Sequencer sequencer = MidiSystem.getSequencer();
        sequencer.open();
        sequencer.setSequence(sequence);
        sequencer.setTempoInBPM(songDSL.getTempo());
        sequencer.start();
        int durationOfTheTrackMS = songDSL.getDuration();
        System.out.println("Run Song");
        while (sequencer.isRunning()){

        }
        sequencer.stop();
        System.out.println("Stop Song");
//        int durationOfTheTrackMS = nbBar * nbBeatPerBar * 60000 / tempo;
//        System.out.println("sleeping " + (durationOfTheTrackMS) + "ms");
        Thread.sleep(2000);
//        System.out.println("stop sleeping");
        sequencer.close();
    }
}
