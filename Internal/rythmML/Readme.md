# RythmML DSL uising Groovy
## Requirements
* Java
* maven 4 artefact

## Use DSL
### Syntax

```
song "Au clair de la lune" tempo 200

sequence "intro" bars 4 beats 4
sequence "refrain" bars 4 beats 4

play "sol" sequence "intro" bar 1 beats 1 of 20 octave 5
play "sol" sequence "intro" bar 1 beats 2 of 20 octave 5
play "sol"  sequence "intro"  bar 1 beats 3 of 20 octave 5
play "la"  sequence "intro"  bar 1 beats 4 of 20 octave 5
play "si"  sequence "intro"  bar 2 beats 1 of 20 octave 5
play "la"  sequence "intro"  bar 2 beats 3 of 20 octave 5
play "sol"  sequence "intro"  bar 3 beats 1 of 20 octave 5
play "si"  sequence "intro"  bar 3 beats 2 of 20 octave 5
play "la"  sequence "intro"  bar 3 beats 3 of 20 octave 5
play "la"  sequence "intro"  bar 3 beats 4 of 20 octave 5
play "sol"  sequence "intro" bar 4 beats 1 of 40 octave 5

play "la" sequence "refrain" bar 1 beats 1 of 20 octave 4
play "la" sequence "refrain" bar 1 beats 2 of 20 octave 4
play "la" sequence "refrain" bar 1 beats 3 of 20 octave 4
play "la" sequence "refrain" bar 1 beats 4 of 20 octave 4
play "mi" sequence "refrain" bar 2 beats 1 of 40 octave 4
play "mi" sequence "refrain" bar 2 beats 3 of 40 octave 4
play "la" sequence "refrain" bar 3 beats 1 of 20 octave 4
play "sol" sequence "refrain" bar 3 beats 2 of 20 octave 4
play "fa" sequence "refrain" bar 3 beats 3 of 20 octave 4
play "mi" sequence "refrain" bar 3 beats 4 of 20 octave 4
play "re" sequence "refrain" bar 4 beats 1 of 40 octave 4

track "Piano" instrument "piano"

assign 2 times "intro" to  "Piano"
assign 1 times "refrain" to  "Piano"
assign 1 times "intro" to  "Piano"

export "Switch!"
```

### Commands
* compile : `mvn clean compile assembly:single`
* run example : `java -jar target\rythmML-1.0-SNAPSHOT-jar-with-dependencies.jar scripts\example.groovy`
