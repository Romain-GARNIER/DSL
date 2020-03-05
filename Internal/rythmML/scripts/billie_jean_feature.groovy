song "Billie Jean" bpm 220

sequence "partNull" bars 1 beats 4
sequence "part1" bars 1 beats 4
sequence "part2" bars 2 beats 4
sequence "part3" bars 2 beats 4


play "ch" sequence "part1" bar 1 beats 1 of 3
play "ch" sequence "part1" bar 1 beats 2 of 3
play "ch" sequence "part1" bar 1 beats 3 of 3
play "ch" sequence "part1" bar 1 beats 4 of 3
play "abd" sequence "part1" bar 1 beats 1 of 3
play "sd" sequence "part1" bar 1 beats 3 of 3

play "la" sequence "part2" bar 1 beats 1 of 3 octave 4
play "do#" sequence "part2" bar 1 beats 1 of 3 octave 5
play "fa#" sequence "part2" bar 1 beats 1 of 3 octave 5
play "si" sequence "part2" bar 1 beats 4 of 3 octave 4
play "re#" sequence "part2" bar 1 beats 4 of 3 octave 5
play "sol#" sequence "part2" bar 1 beats 4 of 3 octave 5

play "mi" sequence "part3" bar 1 beats 1 of 3 octave 5
play "la" sequence "part3" bar 1 beats 1 of 3 octave 5
play "do#" sequence "part3" bar 1 beats 1 of 3 octave 5
play "si" sequence "part3" bar 1 beats 4 of 3 octave 4
play "re#" sequence "part3" bar 1 beats 4 of 3 octave 5
play "sol#" sequence "part3" bar 1 beats 4 of 3 octave 5

track "Drums"  instrument "drum"
track "Piano"  instrument "piano"

assign 12 times "part1" to  "Drums"
assign 4 times "partNull" to  "Piano"
assign 1 times "part2" to  "Piano"
assign 1 times "part3" to  "Piano"
assign 1 times "part2" to  "Piano"
assign 1 times "part3" to  "Piano"


export "Switch!"