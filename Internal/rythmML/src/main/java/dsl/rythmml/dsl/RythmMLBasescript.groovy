package main.java.dsl.rythmml.dsl

import main.java.dsl.rythmml.model.InstrumentDSL
import main.java.dsl.rythmml.model.Note

abstract class RythmMLBasescript extends Script {
	//song "name"
	def song(String name){
		((RythmMLBinding) this.getBinding()).getRythmMLModel().createSong(name)
	}

	//sequence "name" has nbBar bars of nbBeat beats
	def sequence(String name){
		[has: { int nbBar ->
			[ bars : { int nbBeat ->
				[ beats : { ((RythmMLBinding) this.getBinding()).getRythmMLModel().createSequence(name,nbBar,nbBeat)}]
			}]
		}]
	}

	//track "name" of instrument "instrumentName"
	def track(String name){
		[of: {
			[ instrument : { String instrumentName ->
				InstrumentDSL instrumentDSL = instrumentName instanceof String ? (InstrumentDSL)((RythmMLBinding)this.getBinding()).getVariable(instrumentName) : (InstrumentDSL)instrumentName
				((RythmMLBinding) this.getBinding()).getRythmMLModel().createTrack(name,instrumentDSL)
			}]
		}]
	}

	//assign sequence "sequenceName" to track "trackName"
	def assign(String name){
		[sequence: { String sequenceName ->
			[ to : {
				[ track : { String trackName ->
					((RythmMLBinding) this.getBinding()).getRythmMLModel().addSequenceDSLtoTrack(trackName, sequenceName)
				}]
			}]
		}]
	}

	//play "noteValue" on sequence "sequenceName" at bar a beats b of n times
	def play(String noteValue){
		[ on : {
			[sequence: { String sequenceName ->
				[ at : {
					[ bar : { int a ->
						[ beats : { int b ->
							[ of : { int n ->
								Note note = noteValue instanceof String ? (Note)((RythmMLBinding)this.getBinding()).getVariable(noteValue) : (Note) noteValue
								((RythmMLBinding) this.getBinding()).getRythmMLModel().createNote(sequenceName,a,b,note,100,n);
							}]
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
