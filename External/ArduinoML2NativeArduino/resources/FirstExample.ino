// Code generated by ArduinoML
// Structural concepts
void setup() {
	pinMode(12, OUTPUT);
	pinMode(8, INPUT);
}

//Behavioral concepts
long time=0; long debounce = 200;

void state_off() {
	digitalWrite(12, LOW);
	boolean guard = millis() - time > debounce;
	if (digitalRead(8) == HIGH && guard ) {
		time = millis(); state_on();
	} else { state_off(); }
} 
void state_on() {
	digitalWrite(12, HIGH);
	boolean guard = millis() - time > debounce;
	if (digitalRead(8) == HIGH && guard ) {
		time = millis(); state_off();
	} else { state_on(); }
} 

void loop() {state_on();} // Entering init state