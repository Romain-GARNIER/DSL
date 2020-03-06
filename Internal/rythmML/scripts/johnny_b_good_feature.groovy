song "Johnny Be Good Feature" tempo 170

sequence "part1" bars 1 beats 4
sequence "introPiano" bars 5 beats 4
sequence "patternPiano1" bars 1 beats 4
sequence "patternPiano2" bars 1 beats 4

play "rc1" sequence "part1" bar 1 beats 1 of 5 velocity 100 octave 0
play "rc1" sequence "part1" bar 1 beats 2 of 5 velocity 100 octave 0
play "rc1" sequence "part1" bar 1 beats 3 of 5 velocity 100 octave 0
play "rc1" sequence "part1" bar 1 beats 4 of 5 velocity 100 octave 0
play "bd" sequence "part1" bar 1 beats 1 of 5 velocity 100 octave 0
play "bd" sequence "part1" bar 1 beats 3 of 5 velocity 100 octave 0
play "sd" sequence "part1" bar 1 beats 2 of 5 velocity 100 octave 0
play "sd" sequence "part1" bar 1 beats 4 of 5 velocity 100 octave 0

play "mi" sequence "introPiano" bar 4 beats 1 of 5 velocity 100 octave 4
play "la" sequence "introPiano" bar 4 beats 1 of 5 velocity 100 octave 4
play "re" sequence "introPiano" bar 4 beats 1 of 5 velocity 100 octave 4
play "sol" sequence "introPiano" bar 4 beats 1 of 5 velocity 100 octave 4
play "si" sequence "introPiano" bar 4 beats 1 of 5 velocity 100 octave 4
play "mi" sequence "introPiano" bar 4 beats 1 of 5 velocity 100 octave 4

play "re" sequence "patternPiano1" bar 1 beats 1 of 5 velocity 100 octave 4
play "la" sequence "patternPiano1" bar 1 beats 1 of 5 velocity 100 octave 4
play "re" sequence "patternPiano1" bar 1 beats 2 of 5 velocity 100 octave 4
play "la" sequence "patternPiano1" bar 1 beats 2 of 5 velocity 100 octave 4
play "re" sequence "patternPiano1" bar 1 beats 3 of 5 velocity 100 octave 4
play "la" sequence "patternPiano1" bar 1 beats 3 of 5 velocity 100 octave 4
play "re" sequence "patternPiano1" bar 1 beats 4 of 5 velocity 100 octave 4
play "la" sequence "patternPiano1" bar 1 beats 4 of 5 velocity 100 octave 4
play "re" sequence "patternPiano1" bar 1 beats 5 of 5 velocity 100 octave 4
play "la" sequence "patternPiano1" bar 1 beats 5 of 5 velocity 100 octave 4
play "re" sequence "patternPiano1" bar 1 beats 6 of 5 velocity 100 octave 4
play "la" sequence "patternPiano1" bar 1 beats 6 of 5 velocity 100 octave 4
play "re" sequence "patternPiano1" bar 1 beats 7 of 5 velocity 100 octave 4
play "la" sequence "patternPiano1" bar 1 beats 7 of 5 velocity 100 octave 4
play "re" sequence "patternPiano1" bar 1 beats 8 of 5 velocity 100 octave 4
play "la" sequence "patternPiano1" bar 1 beats 8 of 5 velocity 100 octave 4

play "mi" sequence "patternPiano2" bar 1 beats 1 of 5 velocity 100 octave 4
play "la" sequence "patternPiano2" bar 1 beats 1 of 5 velocity 100 octave 4
play "mi" sequence "patternPiano2" bar 1 beats 2 of 5 velocity 100 octave 4
play "la" sequence "patternPiano2" bar 1 beats 2 of 5 velocity 100 octave 4
play "mi" sequence "patternPiano2" bar 1 beats 3 of 5 velocity 100 octave 4
play "la" sequence "patternPiano2" bar 1 beats 3 of 5 velocity 100 octave 4
play "mi" sequence "patternPiano2" bar 1 beats 4 of 5 velocity 100 octave 4
play "la" sequence "patternPiano2" bar 1 beats 4 of 5 velocity 100 octave 4


track "Drums"  instrument "drum"
track "Piano" instrument "acoustic grand piano"

assign 1 times "introPiano" to "Piano"
assign 2 times "patternPiano1" to "Piano"
assign 2 times "patternPiano2" to "Piano"
assign 2 times "patternPiano1" to "Piano"
assign 1 times "patternPiano2" to "Piano"

assign 55 times "part1" to  "Drums"

export "Switch!"