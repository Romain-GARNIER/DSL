package main.java.dsl.rythmml.dsl

import main.java.dsl.rythmml.model.InstrumentDSL
import main.java.dsl.rythmml.model.Note
import main.java.dsl.rythmml.model.NoteValue
import main.java.dsl.rythmml.model.SequenceDSL
import main.java.dsl.rythmml.model.TrackDSL

import javax.sound.midi.Track

abstract class RythmMLBasescript extends Script {
	//song "name"
	def song(String name){
		((RythmMLBinding) this.getBinding()).getRythmMLModel().createSong(name)
		[tempo : { int tempo ->
			 ((RythmMLBinding) this.getBinding()).getRythmMLModel().createSong(name,tempo)
			[resolution : { int resolution ->
				((RythmMLBinding) this.getBinding()).getRythmMLModel().createSong(name,tempo, resolution)
			}]
		 },
		resolution : { int resolution ->
			((RythmMLBinding) this.getBinding()).getRythmMLModel().createSong(name, resolution)
		}]
	}

	//sequence "name" bars nbBar beats nbBeat
	def sequence(String name){
		[bars: { int nbBar ->
			[ beats : { int nbBeat ->
				((RythmMLBinding) this.getBinding()).getRythmMLModel().createSequence(name,nbBar,nbBeat)
			}]
		}]
	}

	//track "name" of instrument "instrumentName"
	def track(String name){
			[ instrument : { String instrumentName ->
				InstrumentDSL instrumentDSL = instrumentName instanceof String ? (InstrumentDSL)((RythmMLBinding)this.getBinding()).getVariable(instrumentName) : (InstrumentDSL)instrumentName
				((RythmMLBinding) this.getBinding()).getRythmMLModel().createTrack(name,instrumentDSL)
			}]
	}

	//assign sequence "sequenceName" to track "trackName"
	def assign(int nbTimes){
			[times : { String sequenceName ->
				[ to : {
				 	String trackName ->
						//SequenceDSL sequenceDSL = sequenceName instanceof String ? (SequenceDSL)((RythmMLBinding)this.getBinding()).getVariable(sequenceName) : (SequenceDSL) sequenceName
						//TrackDSL trackDSL = trackName instanceof String ? (TrackDSL)((RythmMLBinding)this.getBinding()).getVariable(trackName) : (TrackDSL) trackName
						//trackDSL.addSequenceDSL(sequenceDSL)
						((RythmMLBinding) this.getBinding()).getRythmMLModel().addSequenceDSLtoTrack(trackName, sequenceName, nbTimes)
					}]
			}]
	}

	//play "noteValue" on sequence "sequenceName" at bar a beats b of n times
	def play(String noteValue){
			[sequence : { String sequenceName ->
					[ bar : { int a ->
						[ beats : { int b ->
							[ of : { int n ->
								NoteValue note = noteValue instanceof String ? (NoteValue)((RythmMLBinding)this.getBinding()).getVariable(noteValue) : (NoteValue) noteValue
								((RythmMLBinding) this.getBinding()).getRythmMLModel().createNote(sequenceName,a,b,note,100,n);
							},
							of : { int n->
								[octave: { int octave ->
									[velocity : {int velocity ->
										NoteValue note = noteValue instanceof String ? (NoteValue)((RythmMLBinding)this.getBinding()).getVariable(noteValue) : (NoteValue) noteValue
										((RythmMLBinding) this.getBinding()).getRythmMLModel().createNote(sequenceName,a,b,note,velocity,n,octave);
									}]
								},octave : {int octave ->
									NoteValue note = noteValue instanceof String ? (NoteValue)((RythmMLBinding)this.getBinding()).getVariable(noteValue) : (NoteValue) noteValue
									((RythmMLBinding) this.getBinding()).getRythmMLModel().createNote(sequenceName,a,b,note,100,n,octave);
								},
								 velocity : {int velocity ->
									 NoteValue note = noteValue instanceof String ? (NoteValue)((RythmMLBinding)this.getBinding()).getVariable(noteValue) : (NoteValue) noteValue
									 ((RythmMLBinding) this.getBinding()).getRythmMLModel().createNote(sequenceName,a,b,note,velocity,n);
								 }]
							}]
						}]
					}]
				}]
	}
	
	// export name
	def export(String name) {
		((RythmMLBinding) this.getBinding()).getRythmMLModel().generateMidiFile()
		((RythmMLBinding) this.getBinding()).getRythmMLModel().playSong()
	}
	
	// disable run method while running
	int count = 0
	abstract void scriptBody()
	def run() {
		if(count == 0) {
			count++
			scriptBody()
		} else {
			println "Run method is disabled"
		}
	}
}
