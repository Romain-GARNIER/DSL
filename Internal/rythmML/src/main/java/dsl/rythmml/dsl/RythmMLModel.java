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

	public void createSong(String name, int bpm) throws InvalidMidiDataException {
		song = new SongDSL(name, resolution, bpm);
	}
	public void createSequence(String name, int nbBar, int nbBeatPerBar){
		SequenceDSL newSequence = new SequenceDSL(name,nbBar, nbBeatPerBar);
		song.addSequenceDSL(newSequence);
		this.binding.setVariable(name, newSequence);
	}

	public void createNote(String sequenceName, int bar, int beat, NoteValue noteValue, int velocity, int duration){
		SequenceDSL sequenceDSL = song.getSequenceDSLList().get(sequenceName);
		Note note = new Note(noteValue,bar,beat,velocity,duration);
		sequenceDSL.addNote(note);
	}

	public void createNote(String sequenceName, int bar, int beat, NoteValue noteValue, int velocity, int duration, int octave){
		SequenceDSL sequenceDSL = song.getSequenceDSLList().get(sequenceName);
		Note note = new Note(noteValue,bar,beat,velocity,duration,octave);
		sequenceDSL.addNote(note);
	}

	public void createTrack(String name, InstrumentDSL instrumentDSL){
		TrackDSL trackDSL = new TrackDSL(name, instrumentDSL);
		song.addTrackDSL(trackDSL);
		this.binding.setVariable(name, trackDSL);
	}

	public void addSequenceDSLtoTrack(String strackName, String sequenceName){
		TrackDSL trackDSL = song.getTrackDSLList().get(strackName);
		SequenceDSL sequenceDSL = song.getSequenceDSLList().get(sequenceName);
		trackDSL.addSequenceDSL(sequenceDSL);
	}

	public void addSequenceDSLtoTrack(String strackName, String sequenceName, int nbTime){
		TrackDSL trackDSL = song.getTrackDSLList().get(strackName);
		SequenceDSL sequenceDSL = song.getSequenceDSLList().get(sequenceName);
		for(int i = 0; i < nbTime; i++){
			trackDSL.addSequenceDSL(sequenceDSL);
		}
	}

	public void playSong(){
		MidiGeneratorDSL generatorDSL = new MidiGeneratorDSL(song);
		try {
			generatorDSL.generateMidiSound();
			generatorDSL.play();
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void generateMidiFile(){

	}

	private Binding binding;

	public RythmMLModel(Binding binding) {
		this.binding = binding;
	}
	
//	@SuppressWarnings("rawtypes")
//	public Object generateCode(String appName) {
//	}
}
