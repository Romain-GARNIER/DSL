package main.java.dsl.rythmml;

import javax.sound.midi.*;
import java.io.*;
import java.util.Arrays;


public class DrumerUtils {

	public static void main(String[] args)
			throws InvalidMidiDataException, MidiUnavailableException, InterruptedException, IOException {
		Sequencer sequencer = MidiSystem.getSequencer();
		test1(sequencer);
		loadSoundbank(sequencer, "soundBank/Scratch_3_0.sf2");
		test1(sequencer);
		loadSoundbank(sequencer, "soundBank/Yamaha_RX7_Drums.sf2");
		test1(sequencer);
	}

	private static void test1(Sequencer sequencer)
			throws InvalidMidiDataException, MidiUnavailableException, InterruptedException {
		System.out.println("start");
		int tempo = 80;
		int nbBar = 2;
		int nbBeatPerBar = 4;
		int resolution = 200; // in slices per beat
		Sequence sequence = new Sequence(Sequence.PPQ, resolution);
		Track track = sequence.createTrack();

		// set kick drum
		for (int bar = 0; bar < nbBar; bar++) {
			for (int beat = 0; beat < nbBeatPerBar; beat += 2) {
				int pos = toTick(bar, beat, 0, nbBeatPerBar, resolution);
				addDrumHit(track, DrumElement.AcousticBassDrum, pos, 90);
			}
		}

		// add snare drum
		for (int bar = 0; bar < nbBar; bar++) {
			for (int beat = 1; beat < 4; beat += 2) {
				int pos = toTick(bar, beat, 0, nbBeatPerBar, resolution);
				addDrumHit(track, DrumElement.HandClap, pos, 100);
			}
		}

		// add hihat
		for (int bar = 0; bar < nbBar; bar++) {
			for (int beat = 0; beat < nbBeatPerBar; beat += 1) {
				for (int d = 0; d < 4; d++) {
					int pos = toTick(bar, beat, d / 4d, nbBeatPerBar, resolution);
					int velocity = 50 + (int) (Math.random() * 50);
					addDrumHit(track, DrumElement.ClosedHiHat, pos, velocity);
				}
			}
		}

		// add a variation on the kick
		for (int bar = 0; bar < nbBar; bar++) {
			int pos = toTick(bar, 1, 3 / 4d, nbBeatPerBar, resolution);
			addDrumHit(track, DrumElement.AcousticBassDrum, pos, 80);
		}

		sequencer.open();
		sequencer.setSequence(sequence);
		sequencer.setTempoInBPM(tempo);
		sequencer.start();
		int durationOfTheTrackMS = nbBar * nbBeatPerBar * 60000 / tempo;
		System.out.println("sleeping " + (durationOfTheTrackMS) + "ms");
		Thread.sleep(durationOfTheTrackMS);
		System.out.println("stop sleeping");
		sequencer.stop();
		sequencer.close();
	}

	/**
	 * load a new soundBank
	 * @param sequencer
	 * @param soundBankPath
	 * @throws FileNotFoundException
	 * @throws InvalidMidiDataException
	 * @throws IOException
	 * @throws MidiUnavailableException
	 */
	private static void loadSoundbank(Sequencer sequencer, String soundBankPath)
			throws FileNotFoundException, InvalidMidiDataException, IOException, MidiUnavailableException {
		FileInputStream fis = new FileInputStream(new File(soundBankPath));
		BufferedInputStream bis = new BufferedInputStream(fis);
		Soundbank soundfont = MidiSystem.getSoundbank(bis);
		Synthesizer synthesizer = MidiSystem.getSynthesizer();

		sequencer.open();
		synthesizer.open();

		System.out.println(Arrays.toString(synthesizer.getAvailableInstruments()));

		synthesizer.loadAllInstruments(soundfont);

		System.out.println("##############################################################");
		System.out.println(Arrays.toString(synthesizer.getAvailableInstruments()));

		for (Transmitter tm : sequencer.getTransmitters()) {
			tm.close();
		}
		sequencer.getTransmitter().setReceiver(synthesizer.getReceiver());
		return;
	}

	/**
	 * give the ``global'' tick position based on the relatives bar, beat and tick numbers; for a specific settings in term of numbers of beats per Bar and the chosen resolution
	 * @param bar
	 * @param beat
	 * @param division
	 * @param nbBeatPerBar
	 * @param resolution
	 * @return
	 */
	public static int toTick(int bar, int beat, double division, int nbBeatPerBar, int resolution) {
		int pos = bar * nbBeatPerBar * resolution;
		pos += beat * resolution;
		pos += division * resolution;
		return pos;
	}

	/**
	 * add a note on a drum element at a specific beat(tick)
	 *
	 * @param note the {@link DrumElement} id
	 * @param tick the beat where the kick appends
	 */
	public static void addDrumHit(Track track, DrumElement de, long tick, int velocity) {
		final int NOTEON = 144;
		final int NOTEOFF = 128;

		createEvent(track, NOTEON, 9, de, tick, velocity);
		createEvent(track, NOTEOFF, 9, de, tick + 1, velocity);
	}

	/**
	 * create a MIDI message in the current Track
	 * @param track
	 * @param type
	 * @param chan
	 * @param de
	 * @param tick
	 * @param velocity
	 */
	private static void createEvent(Track track, int type, int chan, DrumElement de, long tick, int velocity) {
		ShortMessage message = new ShortMessage();

		try {
			message.setMessage(type, chan, de.noteNumber, velocity);
			MidiEvent event = new MidiEvent(message, tick);
			track.add(event);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Partial list of Drum elements to ease the reading
	 */
	public enum DrumElement {
		AcousticBassDrum(35), BassDrum1(36), SideStick(37), AcousticSnare(38), HandClap(39), ElectricSnare(40),
		LowFloorTom(41), ClosedHiHat(42), OpenHiHat(46);

		/*
		 * "High floor tom", "Pedal hi-hat", "Low tom", "Open hi-hat", "Low-mid tom",
		 * "Hi-mid tom", "Crash cymbal 1", "High tom", "Ride cymbal 1",
		 * "Chinese cymbal", "Ride bell", "Tambourine", "Splash cymbal", "Cowbell",
		 * "Crash cymbal 2", "Vibraslap", "Ride cymbal 2", "Hi bongo", "Low bongo",
		 * "Mute hi conga", "Open hi conga", "Low conga", "High timbale", "Low timbale",
		 * "High agogo", "Low agogo", "Cabasa", "Maracas", "Short whistle",
		 * "Long whistle", "Short guiro", "Long guiro", "Claves", "Hi wood block",
		 * "Low wood block", "Mute cuica", "Open cuica", "Mute triangle",
		 * "Open triangle" };
		 */
		public int noteNumber;

		private DrumElement(int noteNumber) {
			this.noteNumber = noteNumber;
		}
	}
}
