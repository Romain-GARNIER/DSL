song "Billie Jean" tempo 200

sequence "part1" bars 1 beats 4


play "ch" sequence "part1" bar 1 beats 1 of 5 velocity 100 octave 0
play "ch" sequence "part1" bar 1 beats 2 of 5 velocity 100 octave 0
play "ch" sequence "part1" bar 1 beats 3 of 5 velocity 100 octave 0
play "ch" sequence "part1" bar 1 beats 4 of 5 velocity 100 octave 0
play "abd" sequence "part1" bar 1 beats 1 of 5 velocity 100 octave 0
play "sd" sequence "part1" bar 1 beats 3 of 5 velocity 100 octave 0

track "Drums"  instrument "drum"

assign 55 times "part1" to  "Drums"


export "Switch!"