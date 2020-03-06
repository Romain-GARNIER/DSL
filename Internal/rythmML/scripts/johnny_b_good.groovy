song "Johnny Be Good" tempo 200

sequence "part1" bars 1 beats 4




play "rc1" sequence "part1" bar 1 beats 1 of 1
play "rc1" sequence "part1" bar 1 beats 2 of 1
play "rc1" sequence "part1" bar 1 beats 3 of 1
play "rc1" sequence "part1" bar 1 beats 4 of 1
play "abd" sequence "part1" bar 1 beats 1 of 1
//play "bd" sequence "part1" bar 1 beats 3 of 5
play "es" sequence "part1" bar 1 beats 3 of 1
//play "sd" sequence "part1" bar 1 beats 4 of 5

track "Drums"  instrument "drum"

assign 34 times "part1" to  "Drums"

export "Switch!"