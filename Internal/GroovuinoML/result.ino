// Wiring code generated from an ArduinoML model
// Application name: Switch!

void setup(){
  pinMode(12, INPUT);  // button_1 [Sensor]
  pinMode(10, INPUT);  // button_2 [Sensor]
  pinMode(8, OUTPUT); // led [Actuator]
}

long time = 0; long debounce = 200;

void state_on() {
  digitalWrite(8,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(12) == HIGH && digitalRead(10) == HIGH && guard ) {
    time = millis();
    state_error(4);
  }
  if( digitalRead(10) == HIGH && guard ) {
    time = millis();
    state_off();
  } else {
    state_on();
  }
}

void state_off() {
  digitalWrite(8,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(12) == HIGH && digitalRead(10) == HIGH && guard ) {
    time = millis();
    state_error(3);
  }
  if( digitalRead(12) == HIGH && guard ) {
    time = millis();
    state_on();
  } else {
    state_off();
  }
}

void loop() {
  state_off();
}
void state_error(int x) {
	for(int i = 0; i < x; i++){
		digitalWrite(13, HIGH);
		delay(800);
		digitalWrite(13, LOW);
		delay(800);
	}
	delay(1500);
	state_error(x);
}

