package main.java.dsl.rythmml.model;

import javax.sound.midi.InvalidMidiDataException;

public class ModelMain {

    public static void main(String[] args){
        SongDSL songDSL;

        try {
            songDSL = new SongDSL("MySong",200, 80);

            SequenceDSL sequenceDSL = new SequenceDSL("Seq1",3,2);
            songDSL.addSequenceDSL(sequenceDSL);

            Note note1 = new Note(NoteValue.Do,1,1,1,100,1000);
            Note note2 = new Note(NoteValue.Do,1,2,1,100,1000);

            sequenceDSL.addNote(note1);
            sequenceDSL.addNote(note2);

            TrackDSL trackDSL = new TrackDSL("Track 1",InstrumentDSL.Piano);

            MidiGeneratorDSL generatorDSL = new MidiGeneratorDSL(songDSL);

            generatorDSL.generateMidiSound();
            generatorDSL.play();

        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
