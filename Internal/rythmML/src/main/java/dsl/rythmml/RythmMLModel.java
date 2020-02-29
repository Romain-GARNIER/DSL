package main.java.dsl.rythmml;

import groovy.lang.Binding;
import org.graalvm.compiler.core.common.alloc.Trace;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static main.java.dsl.rythmml.DrumerUtils.addDrumHit;
import static main.java.dsl.rythmml.DrumerUtils.toTick;

public class RythmMLModel {
	String songName;
	Sequence sequence;
	HashMap<String, SequenceDSL> tracks;
	int resolution = 200;

	public void createSong(String name) throws InvalidMidiDataException {
		sequence = new Sequence(Sequence.PPQ, resolution);
		songName = name;
	}

	public void createSequence(String name, int nbBar, int nbBeatPerBar){
		Track track = sequence.createTrack();
		SequenceDSL newSequence = new SequenceDSL(name, track,nbBar, nbBeatPerBar);
		tracks.put(name, newSequence);
	}

	public void createNote(String sequenceName, int bar, int beat){
		SequenceDSL sequenceDSL = tracks.get(sequenceName);
		int pos = toTick(bar, beat, 0, sequenceDSL.getNbBeatPerBar(), resolution);
		addDrumHit(tracks.get(sequenceDSL), DrumerUtils.DrumElement.AcousticBassDrum, pos, 90);
	}

	private Binding binding;

	public RythmMLModel(Binding binding) {
		this.binding = binding;
	}
	
//	@SuppressWarnings("rawtypes")
//	public Object generateCode(String appName) {
//	}
}
