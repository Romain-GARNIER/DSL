package main.java.dsl.rythmml.dsl;

import groovy.lang.Binding;
import main.java.dsl.rythmml.model.*;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Track;
import java.util.HashMap;

import static main.java.dsl.rythmml.model.DrumerUtils.addDrumHit;
import static main.java.dsl.rythmml.model.DrumerUtils.toTick;

public class RythmMLModel {
	SongDSL song;
	int resolution = 200;

	public void createSong(String name) throws InvalidMidiDataException {
		song = new SongDSL(name, resolution);
	}

	public void createSequence(String name, int nbBar, int nbBeatPerBar){
		SequenceDSL newSequence = new SequenceDSL(name,nbBar, nbBeatPerBar);
		song.getSequenceDSLList().put(name,newSequence);
	}

	public void createNote(String sequenceName, int bar, int beat, int tick, NoteValue noteValue, int velocity){
		SequenceDSL sequenceDSL = song.getSequenceDSLList().get(sequenceName);
		Note note = new Note(NoteValue.Do,bar,beat,tick,velocity,1000);
		sequenceDSL.addNote(note);
	}

	public void createTrack(String name, InstrumentDSL instrumentDSL){
		TrackDSL trackDSL = new TrackDSL(name, instrumentDSL);
		song.getTrackDSLList().put(name,trackDSL);
	}

	public void addSequenceDSLtoTrack(String strackName, String sequenceName){
		TrackDSL trackDSL = song.getTrackDSLList().get(strackName);
		SequenceDSL sequenceDSL = song.getSequenceDSLList().get(sequenceName);
		trackDSL.addSequenceDSL(sequenceDSL);
	}

	private Binding binding;

	public RythmMLModel(Binding binding) {
		this.binding = binding;
	}
	
//	@SuppressWarnings("rawtypes")
//	public Object generateCode(String appName) {
//	}
}
