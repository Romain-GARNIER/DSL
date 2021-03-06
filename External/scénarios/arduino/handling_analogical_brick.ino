// Code generated by ArduinoML
// Structural concepts
void setup() {
	pinMode(8, OUTPUT);
	pinMode(1, INPUT);
}

//Behavioral concepts
long time=0; long debounce = 300;

void state_off() {
	digitalWrite(8, LOW);
	boolean guard = millis() - time > debounce;
	if ((analogRead(1) >= 500) && guard ) {
		time = millis();
		state_on();
	}
	else { state_off(); }
}

void state_on() {
	digitalWrite(8, HIGH);
	boolean guard = millis() - time > debounce;
	if ((analogRead(1) <= 500) && guard ) {
		time = millis();
		state_off();
	}
	else { state_on(); }
}

void loop() {state_off();} // Entering init state