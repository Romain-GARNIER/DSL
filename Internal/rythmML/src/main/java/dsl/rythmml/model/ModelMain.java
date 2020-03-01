package main.java.dsl.rythmml.model;

import javax.sound.midi.InvalidMidiDataException;

public class ModelMain {

    public static void main(String[] args){
        SongDSL songDSL;

        try {
            songDSL = new SongDSL("MySong",200, 240);

            SequenceDSL sequenceDSL = new SequenceDSL("Seq1",4,4);
            SequenceDSL sequenceDSL2 = new SequenceDSL("Seq1",4,4);

            Note note1 = new Note(NoteValue.Do,1,1,1,100,1000);



            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,1,1,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,1,2,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,1,3,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,1,4,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,2,1,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,2,2,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,2,3,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,2,4,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,3,1,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,3,2,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,3,3,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,3,4,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,4,1,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,4,2,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,4,3,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ClosedHiHat,4,4,1,100,1000));

            sequenceDSL.addNote(new Note(NoteValue.AcousticBassDrum,1,1,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.AcousticBassDrum,2,1,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.AcousticBassDrum,3,1,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.AcousticBassDrum,4,1,1,100,1000));

            sequenceDSL.addNote(new Note(NoteValue.ElectricSnare,1,3,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ElectricSnare,2,3,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ElectricSnare,3,3,1,100,1000));
            sequenceDSL.addNote(new Note(NoteValue.ElectricSnare,4,3,1,100,1000));

            sequenceDSL2.addNote(new Note(NoteValue.ElectricSnare,1,1,1,100,1000));
            sequenceDSL2.addNote(new Note(NoteValue.ElectricSnare,1,4,1,100,1000));
            sequenceDSL2.addNote(new Note(NoteValue.ElectricSnare,4,1,1,100,1000));
            sequenceDSL2.addNote(new Note(NoteValue.ElectricSnare,4,4,4,100,1000));


            songDSL.addSequenceDSL(sequenceDSL);

            TrackDSL trackDSL1 = new TrackDSL("Track 1",InstrumentDSL.Piano);
            TrackDSL trackDSL2 = new TrackDSL("Track 2",InstrumentDSL.Drum);


            trackDSL1.addSequenceDSL(sequenceDSL2);
            trackDSL2.addSequenceDSL(sequenceDSL);

            songDSL.addTrackDSL(trackDSL1);
            songDSL.addTrackDSL(trackDSL2);

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
