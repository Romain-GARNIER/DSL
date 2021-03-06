package main.java.dsl.rythmml.model;

import javax.sound.midi.InvalidMidiDataException;

public class ModelMain {

    public static void main(String[] args){
        SongDSL songDSL;

        try {
            songDSL = new SongDSL("MySong",200, 150);

            SequenceDSL sequenceDSL = new SequenceDSL("Seq",1,4);
            SequenceDSL sequenceDSL1 = new SequenceDSL("Seq1",1,4);
            SequenceDSL sequenceDSL2 = new SequenceDSL("Seq5",1,4);
            SequenceDSL sequenceDSL3 = new SequenceDSL("Seq3",1,4);
            SequenceDSL sequenceDSL4 = new SequenceDSL("Seq4",1,4);
            SequenceDSL sequenceDSL5 = new SequenceDSL("Seq5",1,4);
            SequenceDSL sequenceDSL6 = new SequenceDSL("Seq6",1,4);
            SequenceDSL sequenceDSL7 = new SequenceDSL("Seq7",1,4);
            SequenceDSL sequenceDSL8 = new SequenceDSL("Seq8",1,4);

//            Note note1 = new Note(NoteValue.Do,1,1,1,100,1000);
//
//            sequenceDSL1.addNote(new Note(NoteValue.ClosedHiHat,1,1,1,100,1000));
//            sequenceDSL1.addNote(new Note(NoteValue.ClosedHiHat,1,2,1,100,1000));
//            sequenceDSL1.addNote(new Note(NoteValue.ClosedHiHat,1,3,1,100,1000));
//            sequenceDSL1.addNote(new Note(NoteValue.ClosedHiHat,1,4,1,100,1000));
//
//            sequenceDSL1.addNote(new Note(NoteValue.AcousticBassDrum,1,1,1,100,1000));
//
//            sequenceDSL1.addNote(new Note(NoteValue.ElectricSnare,1,3,1,100,1000));
//
//            sequenceDSL2.addNote(new Note(NoteValue.ElectricSnare,1,1,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.ElectricSnare,1,4,1,100,1000));

//            sequenceDSL2.addNote(new Note(NoteValue.Sol,1,1,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.Sol,1,2,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.Sol,1,3,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.La,1,4,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.Si,2,1,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.La,2,2,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.Sol,2,3,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.Si,2,4,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.La,3,1,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.La,3,2,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.Sol,3,3,1,100,1000));
//            //---------------
//            sequenceDSL2.addNote(new Note(NoteValue.Sol,3,4,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.Sol,4,1,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.Sol,4,2,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.La,4,3,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.Si,4,4,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.La,5,1,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.Sol,5,2,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.Si,5,3,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.La,5,4,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.La,6,1,1,100,1000));
//            sequenceDSL2.addNote(new Note(NoteValue.Sol,6,2,1,100,1000));

            int octave = 4;
            sequenceDSL1.addNote(new Note(NoteValue.Sol,1,1,100,20,octave));
            sequenceDSL1.addNote(new Note(NoteValue.Sol,1,2,100,20,octave));
            sequenceDSL1.addNote(new Note(NoteValue.Sol,1,3,100,20,octave));
            sequenceDSL1.addNote(new Note(NoteValue.La,1,4,100,20,octave));

            sequenceDSL2.addNote(new Note(NoteValue.Si,1,1,100,20,octave));
            sequenceDSL2.addNote(new Note(NoteValue.La,1,3,100,20,octave));

            sequenceDSL3.addNote(new Note(NoteValue.Sol,1,1,100,20,octave));
            sequenceDSL3.addNote(new Note(NoteValue.Si,1,2,100,20,octave));
            sequenceDSL3.addNote(new Note(NoteValue.La,1,3,100,20,octave));
            sequenceDSL3.addNote(new Note(NoteValue.La,1,4,100,20,octave));

            sequenceDSL4.addNote(new Note(NoteValue.Sol,1,1,100,80,octave));

            sequenceDSL5.addNote(new Note(NoteValue.La,1,1,100,20,octave));
            sequenceDSL5.addNote(new Note(NoteValue.La,1,2,100,20,octave));
            sequenceDSL5.addNote(new Note(NoteValue.La,1,3,100,20,octave));
            sequenceDSL5.addNote(new Note(NoteValue.La,1,4,100,20,octave));

            sequenceDSL6.addNote(new Note(NoteValue.Mi,1,1,100,40,octave));
            sequenceDSL6.addNote(new Note(NoteValue.Mi,1,3,100,40,octave));

            sequenceDSL7.addNote(new Note(NoteValue.La,1,1,100,20,octave));
            sequenceDSL7.addNote(new Note(NoteValue.Sol,1,2,100,20,octave));
            sequenceDSL7.addNote(new Note(NoteValue.Fa,1,3,100,20,octave));
            sequenceDSL7.addNote(new Note(NoteValue.Mi,1,4,100,20,octave));

            sequenceDSL8.addNote(new Note(NoteValue.Re,1,1,100,80,octave));

            songDSL.addSequenceDSL(sequenceDSL);
            songDSL.addSequenceDSL(sequenceDSL1);
            songDSL.addSequenceDSL(sequenceDSL2);
            songDSL.addSequenceDSL(sequenceDSL3);
            songDSL.addSequenceDSL(sequenceDSL4);
            songDSL.addSequenceDSL(sequenceDSL5);
            songDSL.addSequenceDSL(sequenceDSL6);
            songDSL.addSequenceDSL(sequenceDSL7);
            songDSL.addSequenceDSL(sequenceDSL8);

            TrackDSL trackDSL1 = new TrackDSL("Track Drum",InstrumentDSL.Drum);
            TrackDSL trackDSL2 = new TrackDSL("Track Piano",InstrumentDSL.Piano);

//            trackDSL1.addSequenceDSL(sequenceDSL1);
//            trackDSL1.addSequenceDSL(sequenceDSL1);
//            trackDSL1.addSequenceDSL(sequenceDSL1);
//            trackDSL1.addSequenceDSL(sequenceDSL1);
//            trackDSL1.addSequenceDSL(sequenceDSL1);
//            trackDSL1.addSequenceDSL(sequenceDSL1);

            trackDSL2.addSequenceDSL(sequenceDSL1);
            trackDSL2.addSequenceDSL(sequenceDSL2);
            trackDSL2.addSequenceDSL(sequenceDSL3);
            trackDSL2.addSequenceDSL(sequenceDSL4);

            trackDSL2.addSequenceDSL(sequenceDSL1);
            trackDSL2.addSequenceDSL(sequenceDSL2);
            trackDSL2.addSequenceDSL(sequenceDSL3);
            trackDSL2.addSequenceDSL(sequenceDSL4);

            trackDSL2.addSequenceDSL(sequenceDSL5);
            trackDSL2.addSequenceDSL(sequenceDSL6);
            trackDSL2.addSequenceDSL(sequenceDSL7);
            trackDSL2.addSequenceDSL(sequenceDSL8);

            trackDSL2.addSequenceDSL(sequenceDSL1);
            trackDSL2.addSequenceDSL(sequenceDSL2);
            trackDSL2.addSequenceDSL(sequenceDSL3);
            trackDSL2.addSequenceDSL(sequenceDSL4);
            trackDSL2.addSequenceDSL(sequenceDSL1);
            trackDSL2.addSequenceDSL(sequenceDSL2);
            trackDSL2.addSequenceDSL(sequenceDSL3);
            trackDSL2.addSequenceDSL(sequenceDSL4);

            trackDSL2.addSequenceDSL(sequenceDSL1);
            trackDSL2.addSequenceDSL(sequenceDSL2);
            trackDSL2.addSequenceDSL(sequenceDSL3);
            trackDSL2.addSequenceDSL(sequenceDSL4);

            trackDSL2.addSequenceDSL(sequenceDSL5);
            trackDSL2.addSequenceDSL(sequenceDSL6);
            trackDSL2.addSequenceDSL(sequenceDSL7);
            trackDSL2.addSequenceDSL(sequenceDSL8);

            trackDSL2.addSequenceDSL(sequenceDSL1);
            trackDSL2.addSequenceDSL(sequenceDSL2);
            trackDSL2.addSequenceDSL(sequenceDSL3);
            trackDSL2.addSequenceDSL(sequenceDSL4);

//            songDSL.addTrackDSL(trackDSL1);
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
