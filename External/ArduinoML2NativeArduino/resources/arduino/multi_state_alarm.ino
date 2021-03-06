// Code generated by ArduinoML
// Structural concepts
void setup() {
	pinMode(13, OUTPUT);
	pinMode(8, OUTPUT);
	pinMode(10, INPUT);
}

//Behavioral concepts
long time=0; long debounce = 300;

void state_off() {
	digitalWrite(13, LOW);
	digitalWrite(8, LOW);
	boolean guard = millis() - time > debounce;
	if ((digitalRead(10) == HIGH) && guard ) {
		time = millis();
		state_buzz_on();
	}
	else { state_off(); }
}

void state_buzz_on() {
	digitalWrite(13, LOW);
	digitalWrite(8, HIGH);
	boolean guard = millis() - time > debounce;
	if ((digitalRead(10) == HIGH) && guard ) {
		time = millis();
		state_led_on();
	}
	else { state_buzz_on(); }
}

void state_led_on() {
	digitalWrite(13, HIGH);
	digitalWrite(8, LOW);
	boolean guard = millis() - time > debounce;
	if ((digitalRead(10) == HIGH) && guard ) {
		time = millis();
		state_off();
	}
	else { state_led_on(); }
}

void loop() {state_off();} // Entering init state