package main.java.dsl.rythmml.dsl

import main.java.dsl.rythmml.model.InstrumentDSL
import main.java.dsl.rythmml.model.Note
import main.java.dsl.rythmml.model.NoteValue

abstract class RythmMLBasescript extends Script {
	//song "name"
	def song(String name){
		[bpm : { int tempo ->
			 ((RythmMLBinding) this.getBinding()).getRythmMLModel().createSong(name,tempo)
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
								[octave: { int octave ->
									 ((RythmMLBinding) this.getBinding()).getRythmMLModel().createNote(sequenceName,a,b,note,100,n,octave);
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
