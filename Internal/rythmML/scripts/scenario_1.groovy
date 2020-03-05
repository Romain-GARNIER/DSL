song "mySong"

sequence "intro" bars 4 beats 4
sequence "refrain" bars 4 beats 4

play "sol" sequence "intro" bar 1 beats 1 of 20
play "sol" sequence "intro" bar 1 beats 2 of 20
play "sol"  sequence "intro"  bar 1 beats 3 of 20
play "la"  sequence "intro"  bar 1 beats 4 of 20
play "si"  sequence "intro"  bar 2 beats 1 of 20
play "la"  sequence "intro"  bar 2 beats 3 of 20
play "sol"  sequence "intro"  bar 3 beats 1 of 20
play "si"  sequence "intro"  bar 3 beats 2 of 20
play "la"  sequence "intro"  bar 3 beats 3 of 20
play "la"  sequence "intro"  bar 3 beats 4 of 20
play "sol"  sequence "intro"  bar 4 beats 1 of 80

track "Piano"  instrument "piano"

assign "intro" to  "Piano"

export "Switch!"