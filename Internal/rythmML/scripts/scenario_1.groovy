song "mySong"

sequence "intro" has 4 bars 4 beats
sequence "refrain" has 4 bars 4 beats

play "sol" on sequence "intro" at bar 1 beats 1 of 20 times
play "sol" on sequence "intro" at bar 1 beats 2 of 20 times
play "sol" on sequence "intro" at bar 1 beats 3 of 20 times
play "la" on sequence "intro" at bar 1 beats 4 of 20 times
play "si" on sequence "intro" at bar 2 beats 1 of 20 times
play "la" on sequence "intro" at bar 2 beats 3 of 20 times
play "sol" on sequence "intro" at bar 3 beats 1 of 20 times
play "si" on sequence "intro" at bar 3 beats 2 of 20 times
play "la" on sequence "intro" at bar 3 beats 3 of 20 times
play "la" on sequence "intro" at bar 3 beats 4 of 20 times
play "sol" on sequence "intro" at bar 4 beats 1 of 80 times

track "Piano" of instrument "piano"

assign sequence "intro" to track "Piano"

export "Switch!"